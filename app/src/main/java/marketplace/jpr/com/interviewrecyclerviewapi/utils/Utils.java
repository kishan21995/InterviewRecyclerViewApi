package marketplace.jpr.com.interviewrecyclerviewapi.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {


    public static boolean hideKeyBoard(Activity activity) {
        try {

            InputMethodManager inputMethodManager = ((InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE));
            return inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    private static ProgressDialog pDialog;

    public static void showProgressDialog(Context context, String s) {
        if (pDialog != null) {
            pDialog.dismiss();
        }
        try {
            pDialog = new ProgressDialog((Context) context);
            pDialog.setMessage("Please wait");
            pDialog.setIndeterminate(true);
            pDialog.setCancelable(false);
            pDialog.setCanceledOnTouchOutside(false);
            pDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void dismissProgressDialog() {
        try {
            if (pDialog != null && pDialog.isShowing()) {
                pDialog.dismiss();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    /**
     * @param context Application Context
     * @return true if connected with active internet else false
     */
    public static boolean isInternetConnected(Context context) {
        try {
            if (context != null) {
                ConnectivityManager connectivityManager =
                        (ConnectivityManager) context
                                .getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                return networkInfo != null && networkInfo.isConnected();
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static void displayToast(Context applicationContext, String s) {
        Toast.makeText(applicationContext, s, Toast.LENGTH_LONG).show();

    }

//    public static String tripDateFormat(String testDate) {
//        String myDate = "2014/10/29 18:10:45";
//        LocalDateTime localDateTime = LocalDateTime.parse(myDate,
//                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss") );
///*
//  With this new Date/Time API, when using a date, you need to
//  specify the Zone where the date/time will be used. For your case,
//  seems that you want/need to use the default zone of your system.
//  Check which zone you need to use for specific behaviour e.g.
//  CET or America/Lima
//*/
//        long millis = localDateTime
//                .atZone(ZoneId.systemDefault())
//                .toInstant().toEpochMilli();
//
//
//        long testTime = getTime(testDate);
//        Log.d("Time:",""+testTime);
//        return dateFormat(testTime);
//    }


    private static long getTime(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date myDate = sdf.parse(date);
            return myDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }


    public static String dateFormat(long timeStamp) {
        if (timeStamp <= 0) {
            return null;
        }
        SimpleDateFormat tripDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy");
        Date dNow = new Date(timeStamp);
        return tripDateFormat.format(dNow);
    }

}
