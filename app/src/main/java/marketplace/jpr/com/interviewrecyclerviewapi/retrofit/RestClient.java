package marketplace.jpr.com.interviewrecyclerviewapi.retrofit;



import marketplace.jpr.com.interviewrecyclerviewapi.model.CategoryResponse;
import retrofit2.Callback;

public class RestClient {
    private static final String TAG = "RestClient";

  /*  //Login
    public static void loginUser(RequestBody email, RequestBody password, Callback<LoginResponse> callback){
        RetrofitClient.getClient().login(email,password).enqueue(callback);
    }*/

  /*  //Registration
   public static void registerUser(RequestBody u_name , RequestBody u_email , RequestBody u_mobile, RequestBody u_country , RequestBody u_password, Callback<RegistrationResponse> callback){
        RetrofitClient.getClient().register(u_name,u_email,u_mobile,u_country,u_password).enqueue(callback);
   }*/

  /*  //Category
    public static void getCourses(Callback <List<CatagoryResponse>> callback) {
        RetrofitClient.getClient().getCourse().enqueue(callback);
    }*/

   //Dash board
    //public static void allItems(Callback<CategoryResponse> callback) {
      //  RetrofitClient.getClient().getAllItem().enqueue(callback);
    //}

    //Dash board
    public static void allItems(Callback<CategoryResponse> callback) {
        RetrofitClient.getClient().getAllItem().enqueue(callback);
    }

}


