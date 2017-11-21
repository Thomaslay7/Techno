package techno.com.technoprenership.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import techno.com.technoprenership.Fragment.HomeFragment;
import techno.com.technoprenership.Fragment.UserFragment;
import techno.com.technoprenership.Model.APIReview;
import techno.com.technoprenership.Model.APIUser;
import techno.com.technoprenership.Prefs.SessionManager;
import techno.com.technoprenership.R;
import techno.com.technoprenership.REST.RestClient;

/**
 * Created by mery on 11/21/2017.
 */
public class TambahReview extends AppCompatActivity {
    private String txtjudul,txtisi,txtiduser,txtidkate;
    private TextView signUp;
    Bundle extras;
    private RestClient.GitApiInterface service;
    private Call<APIReview> callReview;
    SessionManager sessions;
    Intent intent;
    private static final String TAG = "TambahReview";
    private Button tambah;
    private TextView iduser,idkate,judul,isi;
    ImageView profil;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_review);

        iduser = (TextView) findViewById(R.id.txtiduser);
        idkate = (TextView) findViewById(R.id.txtkategori);
        judul  = (TextView) findViewById(R.id.txtJudul);
        isi =(TextView) findViewById(R.id.txtIsi);
        tambah=(Button) findViewById(R.id.btnReview);
        profil=(ImageView) findViewById(R.id.imgAttach);


        tambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                doAdd();

            }

        });
      /*  BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:

                                intent = new Intent(TambahReview.this, HomeFragment.class);

                                startActivity(intent);
                                break;

                            case R.id.action_schedules:
                                break;

                            case R.id.action_music:
                                extras = new Bundle();
                                intent = new Intent(TambahReview.this, UserFragment.class);
                                intent.putExtras(extras);
                                startActivity(intent);
                                break;

                        }
                        return true;
                    }
                });*/

    }
    public void doAdd() {
        String ID=sessions.getUserDetails().get(SessionManager.KEY_USERID);
        Log.d(TAG, "TambahReview");
        final ProgressDialog progressDialog = new ProgressDialog(TambahReview.this,
                R.style.ProgressDialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Mencoba Login...");
        progressDialog.show();
        txtjudul= judul.getText().toString();
        txtidkate = idkate.getText().toString();
        txtiduser= iduser.getText().toString();
        txtisi = isi.getText().toString();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((BitmapDrawable) profil.getDrawable()).getBitmap().compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        String encodedImage = Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.DEFAULT);

        // TODO: Implement your own authentication logic here.

        //  private RestClient.GitApiInterface service;
        // private Call<APIMuridData> callLogin;

        service = RestClient.getClient();
        callReview = service.posting(txtjudul, txtidkate,txtiduser,encodedImage,txtisi);

        callReview.enqueue(new Callback<APIReview>() {
            @Override
            public void onResponse(Response<APIReview> response) {
                Log.d("Review", "Status Code = " + response.code());
                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    APIReview result = response.body();
                    Log.d("Register Berhasil", "response = " + new Gson().toJson(result));
                    if (result != null) {
                        Toast.makeText(getBaseContext(), "Berhasil Mendaftar", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                        finishAffinity();
                        Intent intent = new Intent(TambahReview.this ,HomeFragment.class);
                        startActivity(intent);
                    }

                } else {
                    // response received but request not successful (like 400,401,403 etc)
                    //Handle errors
                    Toast.makeText(getBaseContext(), "Gagal Mendaftar", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(getBaseContext(), "Gagal Mendaftar", Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });


    }
}
