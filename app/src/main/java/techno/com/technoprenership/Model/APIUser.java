package techno.com.technoprenership.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mery on 10/30/2017.
 */
public class APIUser implements Serializable {
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
         * id : 1
         * nama_depan : babar
         * nama_belakang : sar
         * tempat_lahir : rumah sakit
         * alamat : babarsari yogya
         * telepon : 1253456
         * kelamin : cowok sejati
         * tanggal_lahir : 0000-00-00
         * email : dfgh@dfgh.com
         * longitude : 80854
         * latitude : 85543
         * profil : http://www.bisma.bluecrawler.com/public/image/murid/deletepost.png
         */

        private int id;
        private String name;
        private String nama_belakang;
        private String tempat_lahir;
        private String alamat;
        private String telepon;
        private String kelamin;
        private String tanggal_lahir;
        private String email;
        private String longitude;
        private String latitude;
        private String profil;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNama_belakang() {
            return nama_belakang;
        }

        public void setNama_belakang(String nama_belakang) {
            this.nama_belakang = nama_belakang;
        }

        public String getTempat_lahir() {
            return tempat_lahir;
        }

        public void setTempat_lahir(String tempat_lahir) {
            this.tempat_lahir = tempat_lahir;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getTelepon() {
            return telepon;
        }

        public void setTelepon(String telepon) {
            this.telepon = telepon;
        }

        public String getKelamin() {
            return kelamin;
        }

        public void setKelamin(String kelamin) {
            this.kelamin = kelamin;
        }

        public String getTanggal_lahir() {
            return tanggal_lahir;
        }

        public void setTanggal_lahir(String tanggal_lahir) {
            this.tanggal_lahir = tanggal_lahir;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getProfil() {
            return profil;
        }

        public void setProfil(String profil) {
            this.profil = profil;
        }
    }

    /**
     * status_code : 200
     * respon : {"current_page":1,"data":[{"id":1,"name":"siswono","email":"asan@gmail.com","password":"siswono","remember_token":null,"created_at":null,"updated_at":null},{"id":2,"name":"blue","email":"asd@gmail.com","password":"asdasd","remember_token":null,"created_at":null,"updated_at":null},{"id":3,"name":"asann@gmail.com","email":"asasan@gmail.com","password":"$2y$10$65guJOEHDOAkMSuEUi6E5OqexVzdjp5A5W5HD8K0GvVCnwXrB5Fuq","remember_token":null,"created_at":"2017-10-29 08:06:46","updated_at":"2017-10-29 08:06:46"},{"id":4,"name":"susan","email":"susan@gmail.com","password":"$2y$10$FMz.6RzCRKVQjMXwQC2P.OZOJvgDBVMDhlgX6toyZfs3f8R8l5cUq","remember_token":null,"created_at":"2017-10-29 08:12:12","updated_at":"2017-10-29 08:12:12"},{"id":5,"name":"diki","email":"mery@gmail.com","password":"$2y$10$gR4HaU8eeWGODCezMrOAPOYVSZnmLYRaIL1sMyzVayEawocuXGY6e","remember_token":null,"created_at":"2017-10-30 11:07:22","updated_at":"2017-10-30 11:07:22"},{"id":6,"name":"diky","email":"merrydicky83@yahoo.co.id","password":"$2y$10$zMvKuQ9yZKj52Ars4bQmLezFP657TcY8CrT7HWqfUuZMsaj7z89jC","remember_token":null,"created_at":"2017-11-05 07:13:16","updated_at":"2017-11-05 07:13:16"}],"first_page_url":"http://192.168.221.1:8080/webservice/public/listUser?page=1","from":1,"last_page":1,"last_page_url":"http://192.168.221.1:8080/webservice/public/listUser?page=1","next_page_url":null,"path":"http://192.168.221.1:8080/webservice/public/listUser","per_page":10,"prev_page_url":null,"to":6,"total":6}
     */
/*
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
             * id : 1
             * name : siswono
             * email : asan@gmail.com
             * password : siswono
             * remember_token : null
             * created_at : null
             * updated_at : null
             */

      /*      private int id;
            private String name;
            private String email;
            private String password;
            private Object remember_token;
            private Object created_at;
            private Object updated_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
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

            public Object getRemember_token() {
                return remember_token;
            }

            public void setRemember_token(Object remember_token) {
                this.remember_token = remember_token;
            }

            public Object getCreated_at() {
                return created_at;
            }

            public void setCreated_at(Object created_at) {
                this.created_at = created_at;
            }

            public Object getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(Object updated_at) {
                this.updated_at = updated_at;

        }
    }*/
}

