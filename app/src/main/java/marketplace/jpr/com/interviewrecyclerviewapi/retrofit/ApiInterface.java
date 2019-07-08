package marketplace.jpr.com.interviewrecyclerviewapi.retrofit;



import marketplace.jpr.com.interviewrecyclerviewapi.model.CategoryResponse;
import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {
/*
    //login
    @Multipart
    @POST("cat_api/test_api.php?action=login")
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<LoginResponse>  login(@Part("u_email") RequestBody u_email,
                               @Part("u_password") RequestBody u_password);*/

  /*  //Registration
    @Multipart
    @POST("cat_api/test_api.php?action=reg")
   //@Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<RegistrationResponse> register(@Part("u_name") RequestBody name,
                                        @Part("u_email") RequestBody email,
                                        @Part("u_mobile") RequestBody mobile,
                                        @Part("u_country") RequestBody country,
                                        @Part("u_password") RequestBody password);*/

/*
    //Catagory

    @POST("cat_api/test_api.php?action=fetch_all")
    Call <List<CatagoryResponse>> getCourse();*/


   // @POST("http://vrok.in/grofer_api/list")
   // Call<CategoryResponse> getAllItem();

    @POST("http://vrok.in/grofer_api/list")
    Call <CategoryResponse> getAllItem();





}
