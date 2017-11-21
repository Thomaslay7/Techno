package techno.com.technoprenership.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mery on 11/21/2017.
 */
public class APIReview implements Serializable {

    /**
     * status : true
     * status_code : 200
     * message : Data Ditemukan
     * respon : {"current_page":1,"data":[{"id_review":1,"judul_review":"Samsung VS IPhone","id_kategori":"1","id_user":"4","gambar_review":"","isi_review":"Dengan kecanggihan HP pada zaman sekarang ...","created_at":"2017-11-13 12:05:02","updated_at":"2017-11-13 12:05:02"},{"id_review":2,"judul_review":"IPhone X","id_kategori":"1","id_user":"2","gambar_review":"","isi_review":"Harga IPhone X yang mencapai 20 juta ini ternyata","created_at":"2017-11-13 12:34:59","updated_at":"2017-11-13 12:34:59"},{"id_review":3,"judul_review":"HP Oppo Samsung","id_kategori":"1","id_user":"2","gambar_review":"","isi_review":"HP oppo menyaingi samsung dan iphone","created_at":"2017-11-14 05:49:20","updated_at":"2017-11-14 05:50:08"},{"id_review":4,"judul_review":"IPHONE X BARU","id_kategori":"1","id_user":"2","gambar_review":"","isi_review":"IPHONE PALING MAHAL. HAL HAL HAL HALAL","created_at":"2017-11-14 06:53:14","updated_at":"2017-11-14 06:53:14"}],"first_page_url":"http://reyhand.blues-host.com/public/listreview?page=1","from":1,"last_page":1,"last_page_url":"http://reyhand.blues-host.com/public/listreview?page=1","next_page_url":null,"path":"http://reyhand.blues-host.com/public/listreview","per_page":10,"prev_page_url":null,"to":4,"total":4}
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
         * data : [{"id_review":1,"judul_review":"Samsung VS IPhone","id_kategori":"1","id_user":"4","gambar_review":"","isi_review":"Dengan kecanggihan HP pada zaman sekarang ...","created_at":"2017-11-13 12:05:02","updated_at":"2017-11-13 12:05:02"},{"id_review":2,"judul_review":"IPhone X","id_kategori":"1","id_user":"2","gambar_review":"","isi_review":"Harga IPhone X yang mencapai 20 juta ini ternyata","created_at":"2017-11-13 12:34:59","updated_at":"2017-11-13 12:34:59"},{"id_review":3,"judul_review":"HP Oppo Samsung","id_kategori":"1","id_user":"2","gambar_review":"","isi_review":"HP oppo menyaingi samsung dan iphone","created_at":"2017-11-14 05:49:20","updated_at":"2017-11-14 05:50:08"},{"id_review":4,"judul_review":"IPHONE X BARU","id_kategori":"1","id_user":"2","gambar_review":"","isi_review":"IPHONE PALING MAHAL. HAL HAL HAL HALAL","created_at":"2017-11-14 06:53:14","updated_at":"2017-11-14 06:53:14"}]
         * first_page_url : http://reyhand.blues-host.com/public/listreview?page=1
         * from : 1
         * last_page : 1
         * last_page_url : http://reyhand.blues-host.com/public/listreview?page=1
         * next_page_url : null
         * path : http://reyhand.blues-host.com/public/listreview
         * per_page : 10
         * prev_page_url : null
         * to : 4
         * total : 4
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
             * id_review : 1
             * judul_review : Samsung VS IPhone
             * id_kategori : 1
             * id_user : 4
             * gambar_review :
             * isi_review : Dengan kecanggihan HP pada zaman sekarang ...
             * created_at : 2017-11-13 12:05:02
             * updated_at : 2017-11-13 12:05:02
             */

            private int id_review;
            private String judul_review;
            private String id_kategori;
            private String id_user;
            private String gambar_review;
            private String isi_review;
            private String created_at;
            private String updated_at;

            public int getId_review() {
                return id_review;
            }

            public void setId_review(int id_review) {
                this.id_review = id_review;
            }

            public String getJudul_review() {
                return judul_review;
            }

            public void setJudul_review(String judul_review) {
                this.judul_review = judul_review;
            }

            public String getId_kategori() {
                return id_kategori;
            }

            public void setId_kategori(String id_kategori) {
                this.id_kategori = id_kategori;
            }

            public String getId_user() {
                return id_user;
            }

            public void setId_user(String id_user) {
                this.id_user = id_user;
            }

            public String getGambar_review() {
                return gambar_review;
            }

            public void setGambar_review(String gambar_review) {
                this.gambar_review = gambar_review;
            }

            public String getIsi_review() {
                return isi_review;
            }

            public void setIsi_review(String isi_review) {
                this.isi_review = isi_review;
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
