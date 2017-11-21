package techno.com.technoprenership.REST;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import techno.com.technoprenership.Helper.ToStringConverter;
import techno.com.technoprenership.Model.APIBaseResponse;
import techno.com.technoprenership.Model.APIReview;
import techno.com.technoprenership.Model.APIUser;


public class RestClient {
    private static GitApiInterface gitApiInterface;
    private static String baseUrl = "http://reyhand.blues-host.com" ;


    public static GitApiInterface getClient(){
        if(gitApiInterface==null){

            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();


            OkHttpClient okClient = new OkHttpClient();

            okClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    return response;
                }
            });

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverter(String.class, new ToStringConverter())
                    .client(okClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            gitApiInterface = client.create(GitApiInterface.class);

        }
        return gitApiInterface;
    }
    public interface GitApiInterface {
        @FormUrlEncoded
        @POST("/public/login")
        Call<APIUser> login(@Field("email") String email, @Field("password") String password);

        @FormUrlEncoded
        @POST("/public/register")
        Call<APIBaseResponse> register(@Field("name") String name, @Field("email") String email, @Field("password") String password);

        //@Headers("Cache-Control: no-cache")

        @GET("/public/listreview")
        Call<APIReview> showreview();
        @FormUrlEncoded
        @POST("/public/posting")
        Call<APIReview> posting(@Field("judul_review") String judul, @Field("id_kategori") String idkate, @Field("id_user") String iduser, @Field("gambar_review") String gambar, @Field("isi_review") String isi);

/*
        @FormUrlEncoded
        @POST("/api/index.php/Murid/order")
        Call<APIOrderData> order(@Field("id_pengajar") int idpengajar, @Field("id_murid") int idmurid);

*/
    }
}
