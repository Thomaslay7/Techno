package techno.com.technoprenership.Prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.HashMap;

/**
 * Created by mery on 7/13/2017.
 */
public class UserInfo {
    private static final String TAG = UserInfo.class.getSimpleName();
    private static final String PREF_NAME = "userinfo";
    private static final String KEY_IS_LOGGED_IN = "IsLoggedIn";
    //untuk USER
    private static final String KEY_ID = "ID";
    private static final String KEY_USERNAME = "Username";
    private static final String KEY_NAMA_DEPAN = "NamaDepan";
    private static final String KEY_NAMA_BELAKANG = "NamaBelakang";
    private static final String KEY_EMAIL = "Email";

    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context ctx;
    public String getKeyIdPelanggan() {
        return prefs.getString(KEY_ID,"");
    }


    public  String getKeyEmail() {
        return prefs.getString(KEY_EMAIL,"");
    }




    public void setLoggin(boolean isLoggedin){
        editor.putBoolean(KEY_IS_LOGGED_IN, isLoggedin);

        // commit changes
        editor.commit();

        Log.d(TAG, "User login session modified!");
    }

    public boolean isLoggedin(){return prefs.getBoolean(KEY_IS_LOGGED_IN, false);}
    public UserInfo(Context ctx) {
        this.ctx = ctx;
        prefs = ctx.getSharedPreferences(PREF_NAME, 0);
        editor = prefs.edit();
    }

    public void setId(String id){
        editor.putString(KEY_ID, id);
        editor.commit();
    }

    public void setUsername(String username){
        editor.putString(KEY_USERNAME, username);
        editor.commit();
    }

    public void setNamadepan(String namadepan){
        editor.putString(KEY_NAMA_DEPAN, namadepan);
        editor.commit();
    }

    public void setNamaBelakang(String namabelakang){
        editor.putString(KEY_NAMA_BELAKANG, namabelakang);
        editor.commit();
    }

    public void setJabatan(String jabatan){
        editor.putString(KEY_EMAIL, jabatan);
        editor.commit();
    }

    public void clearUserInfo(){
        editor.clear();
        editor.commit();
    }

    public String getKeyID(){return prefs.getString(KEY_ID,"");}

    public String getKeyUsername(){return prefs.getString(KEY_USERNAME, "");}

    public String getKeyNamaDepan(){return prefs.getString(KEY_NAMA_DEPAN, "");}

    public String getKeyNamaBelakang(){return prefs.getString(KEY_NAMA_BELAKANG, "");}

    public String getKeyJabatan(){return prefs.getString(KEY_EMAIL, "");}


    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> user = new HashMap<String, String>();

        // user data
        user.put(KEY_ID, prefs.getString(KEY_ID, null));
        user.put(KEY_NAMA_DEPAN, prefs.getString(KEY_NAMA_DEPAN, null));
        user.put(KEY_NAMA_BELAKANG, prefs.getString(KEY_NAMA_BELAKANG, null));
        user.put(KEY_EMAIL, prefs.getString(KEY_EMAIL, null));
        // return user
        return user;
    }

}
