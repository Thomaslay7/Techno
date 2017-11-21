package techno.com.technoprenership.Model;

import java.util.List;

/**
 * Created by mery on 10/29/2017.
 */
public class User {

    /**
     * status : true
     * status_code : 200
     * message : Data Ditemukan
     * respon : {"current_page":1,"data":[{"id":1,"nama_depan":"Asan","nama_belakang":"Siswono","jenis_kelamin":"Laki-Laki","tanggal_lahir":"1996-07-30","email":"asannn30@gmail.com","password":"doraemon","profil":null,"remember_token":null,"created_at":null,"updated_at":null},{"id":2,"nama_depan":"Mery","nama_belakang":"Thomas","jenis_kelamin":"Laki-Laki","tanggal_lahir":"1996-11-11","email":"merythomas@gmail.com","password":"$2y$10$cNfMTORRSGm3olAnX69MfOBgr58D/oHttELTUopM/Vryba1wGWUui","profil":null,"remember_token":null,"created_at":"2017-11-13 12:01:32","updated_at":"2017-11-13 12:02:11"},{"id":3,"nama_depan":"sidarta","nama_belakang":"chandra","jenis_kelamin":"Laki - laki","tanggal_lahir":"1996-12-11","email":"sidarta121@gmail.com","password":"$2y$10$TmWY/d5kEOdbg.Khp9lupOEPifA4/fEDReAaO/ySzxN6BwDXEIL9K","profil":null,"remember_token":null,"created_at":"2017-11-14 06:51:47","updated_at":"2017-11-14 06:51:47"}],"first_page_url":"http://reyhand.blues-host.com/public/listuser?page=1","from":1,"last_page":1,"last_page_url":"http://reyhand.blues-host.com/public/listuser?page=1","next_page_url":null,"path":"http://reyhand.blues-host.com/public/listuser","per_page":10,"prev_page_url":null,"to":3,"total":3}
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
         * current_page : 1
         * data : [{"id":1,"nama_depan":"Asan","nama_belakang":"Siswono","jenis_kelamin":"Laki-Laki","tanggal_lahir":"1996-07-30","email":"asannn30@gmail.com","password":"doraemon","profil":null,"remember_token":null,"created_at":null,"updated_at":null},{"id":2,"nama_depan":"Mery","nama_belakang":"Thomas","jenis_kelamin":"Laki-Laki","tanggal_lahir":"1996-11-11","email":"merythomas@gmail.com","password":"$2y$10$cNfMTORRSGm3olAnX69MfOBgr58D/oHttELTUopM/Vryba1wGWUui","profil":null,"remember_token":null,"created_at":"2017-11-13 12:01:32","updated_at":"2017-11-13 12:02:11"},{"id":3,"nama_depan":"sidarta","nama_belakang":"chandra","jenis_kelamin":"Laki - laki","tanggal_lahir":"1996-12-11","email":"sidarta121@gmail.com","password":"$2y$10$TmWY/d5kEOdbg.Khp9lupOEPifA4/fEDReAaO/ySzxN6BwDXEIL9K","profil":null,"remember_token":null,"created_at":"2017-11-14 06:51:47","updated_at":"2017-11-14 06:51:47"}]
         * first_page_url : http://reyhand.blues-host.com/public/listuser?page=1
         * from : 1
         * last_page : 1
         * last_page_url : http://reyhand.blues-host.com/public/listuser?page=1
         * next_page_url : null
         * path : http://reyhand.blues-host.com/public/listuser
         * per_page : 10
         * prev_page_url : null
         * to : 3
         * total : 3
         */

        private int current_page;
        private String first_page_url;
        private int from;
        private int last_page;
        private String last_page_url;
        private Object next_page_url;
        private String path;
        private int per_page;
        private Object prev_page_url;
        private int to;
        private int total;
        private List<DataBean> data;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public String getFirst_page_url() {
            return first_page_url;
        }

        public void setFirst_page_url(String first_page_url) {
            this.first_page_url = first_page_url;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public String getLast_page_url() {
            return last_page_url;
        }

        public void setLast_page_url(String last_page_url) {
            this.last_page_url = last_page_url;
        }

        public Object getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(Object next_page_url) {
            this.next_page_url = next_page_url;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public Object getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(Object prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 1
             * nama_depan : Asan
             * nama_belakang : Siswono
             * jenis_kelamin : Laki-Laki
             * tanggal_lahir : 1996-07-30
             * email : asannn30@gmail.com
             * password : doraemon
             * profil : null
             * remember_token : null
             * created_at : null
             * updated_at : null
             */

            private int id;
            private String nama_depan;
            private String nama_belakang;
            private String jenis_kelamin;
            private String tanggal_lahir;
            private String email;
            private String password;
            private String profil;
            private String remember_token;
            private String created_at;
            private String updated_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNama_depan() {
                return nama_depan;
            }

            public void setNama_depan(String nama_depan) {
                this.nama_depan = nama_depan;
            }

            public String getNama_belakang() {
                return nama_belakang;
            }

            public void setNama_belakang(String nama_belakang) {
                this.nama_belakang = nama_belakang;
            }

            public String getJenis_kelamin() {
                return jenis_kelamin;
            }

            public void setJenis_kelamin(String jenis_kelamin) {
                this.jenis_kelamin = jenis_kelamin;
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

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public Object getProfil() {
                return profil;
            }

            public void setProfil(String profil) {
                this.profil = profil;
            }

            public String getRemember_token() {
                return remember_token;
            }

            public void setRemember_token(String remember_token) {
                this.remember_token = remember_token;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }
        }
    }
}
