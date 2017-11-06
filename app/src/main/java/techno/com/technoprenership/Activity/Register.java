package techno.com.technoprenership.Activity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.Calendar;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import techno.com.technoprenership.Model.APIBaseResponse;
import techno.com.technoprenership.R;
import techno.com.technoprenership.REST.RestClient;

public class Register extends AppCompatActivity {

    private EditText nama,email,password,konfirmasipassword;
    private techno.com.technoprenership.REST.RestClient.GitApiInterface service;
    Button btnRegister2;
    private Call<APIBaseResponse> callSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nama=(EditText)findViewById(R.id.input_nama);
        email=(EditText)findViewById(R.id.input_email);
        password=(EditText)findViewById(R.id.input_passwordReg);
        //konfirmasipassword=(EditText)findViewById(R.id.input_konfirmasipasswordReg);
        btnRegister2=(Button)findViewById(R.id.btnRegister);
        btnRegister2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                doRegister();

            }

        });

    }


    public void doRegister() {

                final ProgressDialog progressDialog = new ProgressDialog(Register.this, R.style.ProgressDialog);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Membuat Akun...");
                progressDialog.show();

                // TODO: Implement your own signup logic here.
                String name=nama.getText().toString();
                String emai=email.getText().toString();
                String pass=password.getText().toString();
                // String konfpassword=konfirmasipassword.getText().toString();




                service = RestClient.getClient();


                callSignup = service.register(name,emai,pass);
                callSignup.enqueue(new Callback<APIBaseResponse>() {
                    @Override
                    public void onResponse(Response<APIBaseResponse> response) {
                        Log.d("Register2", "Status Code = " + response.code());
                        if (response.isSuccess()) {
                            // request successful (status code 200, 201)
                            APIBaseResponse result = response.body();
                            Log.d("Register2", "response = " + new Gson().toJson(result));
                            if (result != null) {
                                Toast.makeText(getBaseContext(), "Berhasil Mendaftar", Toast.LENGTH_LONG).show();
                                progressDialog.dismiss();
                                finishAffinity();
                                Intent intent = new Intent(Register.this ,Login.class);
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








   /* public boolean validate() {
        boolean valid = true;

        String email2 = email.getText().toString();
        // String username=txtinputUsername.getText().toString();
        String password2=password.getText().toString();
        String name=nama.getText().toString();
        if (password2.isEmpty()) {
            password.setError("Password tidak boleh kosong");
            valid = false;
        } else {
            password.setError(null);
        }

        if (email2.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email2).matches()) {
            email.setError("Email tidak sesuai dengan format");
            valid = false;
        } else {
            email.setError(null);
        }



        if (name.isEmpty()) {
            nama.setError("Nama tidak boleh kosong");
            valid = false;
        } else {
            nama.setError(null);
        }


        return valid;
    }
*/

}
