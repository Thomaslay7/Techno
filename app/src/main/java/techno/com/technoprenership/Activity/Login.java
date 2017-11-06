package techno.com.technoprenership.Activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import techno.com.technoprenership.Model.APIUser;
import techno.com.technoprenership.Preferences.SessionManager;
import techno.com.technoprenership.Prefs.UserInfo;
import techno.com.technoprenership.R;
import techno.com.technoprenership.REST.RestClient;

public class Login extends AppCompatActivity {

    private RestClient.GitApiInterface service;
    private Call<APIUser> callLogin;
    private String username;
    private String password;
    EditText txtusername;
    EditText txtpassword;
    Intent intent;
    SessionManager sessions;
    private static final String TAG = "Login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnRegister = (Button) findViewById(R.id.btn_register);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
        txtusername=(EditText) findViewById(R.id.txt_username);
        txtpassword=(EditText) findViewById(R.id.txt_password);

        sessions = new SessionManager(this);
        btnRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);

            }

        });

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                doLogin();

            }

        });
    }
    @Override
    public void onBackPressed()
    {
        this.finishAffinity();
        super.onBackPressed();
    }
    public void doLogin() {
        Log.d(TAG, "Login");
        final ProgressDialog progressDialog = new ProgressDialog(Login.this,
                R.style.ProgressDialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Mencoba Login...");
        progressDialog.show();

        username= txtusername.getText().toString();
        password = txtpassword.getText().toString();

        // TODO: Implement your own authentication logic here.

        service = RestClient.getClient();
        callLogin = service.login(username, password);
        callLogin.enqueue(new Callback<APIUser>() {
            @Override
            public void onResponse(Response<APIUser> response) {

                Log.d("Login", "Status Code = " + response.code());

                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    APIUser result = response.body();
                    String returnresponse=result.getMessage();

                    //Format Date Database  YYYY-MM-DD
                    Log.d("Login", "response = " + new Gson().toJson(result));

                    if (returnresponse.equalsIgnoreCase("Login Berhasil")) {
                        Integer idUser = result.getRespon().getId();
                        String namaUser = result.getRespon().getName();
                        Log.d("Login", "response = " + new Gson().toJson(idUser));


                        Toast.makeText(getBaseContext(),idUser+" Login Berhasil sebagai "+namaUser + "Email :"+username , Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        txtusername.setText("");
                        txtpassword.setText("");
                        txtpassword.clearFocus();
                        txtusername.clearFocus();
                        progressDialog.dismiss();


                        Log.d("Login", "response = " + new Gson().toJson(result));
                        sessions.createLoginSession(result);

                        Toast.makeText(getBaseContext(),result.getRespon().getId()+" Login Berhasil sebagai "+username, Toast.LENGTH_LONG).show();
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        progressDialog.dismiss();
                    }
                    else {
                        // response received but request not successful (like 400,401,403 etc)
                        //Handle errors
                        finish();
                        intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                        Toast.makeText(getBaseContext(), "Login Gagal", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                    }

                } else {
                    // response received but request not successful (like 400,401,403 etc)
                    //Handle errors
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(), "Login Gagal", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(getBaseContext(), "Login Gagal!", Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });
    }

}
