package marketplace.jpr.com.interviewrecyclerviewapi.retrofit;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import marketplace.jpr.com.interviewrecyclerviewapi.BuildConfig;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static ApiInterface sRetrofitClient;
    private static ApiInterface sRetrofitRxClient;

    static {
        sRetrofitClient = getRetrofit(false).create(ApiInterface.class);
        sRetrofitRxClient = getRetrofit(true).create(ApiInterface.class);
    }

    public static ApiInterface getClient() {
        synchronized (RetrofitClient.class) {
            if (sRetrofitClient == null) {
                sRetrofitClient = getRetrofit(false).create(ApiInterface.class);
            }
        }
        return sRetrofitClient;
    }

    public static ApiInterface getRxClient() {
        synchronized (RetrofitClient.class) {
            if (sRetrofitRxClient == null) {
                sRetrofitRxClient = getRetrofit(true).create(ApiInterface.class);
            }
        }
        return sRetrofitRxClient;
    }

    private static OkHttpClient okHttp() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(60, TimeUnit.SECONDS);
        builder.readTimeout(60, TimeUnit.SECONDS);
        builder.writeTimeout(60, TimeUnit.SECONDS);


        return builder.build();
    }

    private static Retrofit getRetrofit(boolean withRxJavaSupport) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(okHttp());
        builder.baseUrl(BuildConfig.API_SERVER_IP);
        builder.addConverterFactory(GsonConverterFactory.create(gson()));

        return builder.build();
    }
    public static Gson gson() {
        return new GsonBuilder().setDateFormat("yyyy-M  M-dd'T'HH:mm:ssZ").create();
    }

}