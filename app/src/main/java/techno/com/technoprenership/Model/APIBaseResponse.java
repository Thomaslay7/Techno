package techno.com.technoprenership.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mery on 10/30/2017.
 */
public class APIBaseResponse implements Serializable {


    /**
     * status : true
     * status_code : 200
     * message : Register Berhasil
     * respon : {"nama_depan":"moprh","nama_belakang":"morph","tempat_lahir":"semarang","telepon":"0889362673","kelamin":"Pria","tanggal_lahir":"1996-10-8","email":"ryan2009@yahoo.co.id","alamat":"jln ambar123","longitude":null,"latitude":null,"username":"morph","password":"$2y$10$TkhWguzduBZ7G8a4Por8HeOBKliE71tFZn3rN6VNZdkwLov3bX3i6","profil":"http://bismaapi.bismaoperation.id/public/image/murid/Foto Ryan.jpg","updated_at":"2017-06-01 09:46:38","created_at":"2017-06-01 09:46:38","id":5}
     */

    private boolean status;
    private int status_code;
    private String message;
    private ResponBean respon;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponBean getRespon() {
        return respon;
    }

    public void setRespon(ResponBean respon) {
        this.respon = respon;
    }

    public static class ResponBean {
        /**
         * nama_depan : moprh
         * nama_belakang : morph
         * tempat_lahir : semarang
         * telepon : 0889362673
         * kelamin : Pria
         * tanggal_lahir : 1996-10-8
         * email : ryan2009@yahoo.co.id
         * alamat : jln ambar123
         * longitude : null
         * latitude : null
         * username : morph
         * password : $2y$10$TkhWguzduBZ7G8a4Por8HeOBKliE71tFZn3rN6VNZdkwLov3bX3i6
         * profil : http://bismaapi.bismaoperation.id/public/image/murid/Foto Ryan.jpg
         * updated_at : 2017-06-01 09:46:38
         * created_at : 2017-06-01 09:46:38
         * id : 5
         */

        private String name;
        private String nama_belakang;
        private String tempat_lahir;
        private String telepon;
        private String kelamin;
        private String tanggal_lahir;
        private String email;
        private String alamat;
        private Object longitude;
        private Object latitude;
        private String username;
        private String password;
        private String profil;
        private String updated_at;
        private String created_at;
        private int id;

        public String getNamE() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
