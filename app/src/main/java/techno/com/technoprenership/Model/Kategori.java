package techno.com.technoprenership.Model;

import java.util.List;

/**
 * Created by mery on 11/21/2017.
 */
public class Kategori {

    /**
     * status : true
     * status_code : 200
     * message : Data Ditemukan
     * respon : {"current_page":1,"data":[{"id_kategori":1,"nama_kategori":"Elektronik"},{"id_kategori":2,"nama_kategori":"Film"},{"id_kategori":3,"nama_kategori":"Automotif"}],"first_page_url":"http://reyhand.blues-host.com/public/listkategori?page=1","from":1,"last_page":1,"last_page_url":"http://reyhand.blues-host.com/public/listkategori?page=1","next_page_url":null,"path":"http://reyhand.blues-host.com/public/listkategori","per_page":10,"prev_page_url":null,"to":3,"total":3}
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
         * data : [{"id_kategori":1,"nama_kategori":"Elektronik"},{"id_kategori":2,"nama_kategori":"Film"},{"id_kategori":3,"nama_kategori":"Automotif"}]
         * first_page_url : http://reyhand.blues-host.com/public/listkategori?page=1
         * from : 1
         * last_page : 1
         * last_page_url : http://reyhand.blues-host.com/public/listkategori?page=1
         * next_page_url : null
         * path : http://reyhand.blues-host.com/public/listkategori
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
             * id_kategori : 1
             * nama_kategori : Elektronik
             */

            private int id_kategori;
            private String nama_kategori;

            public int getId_kategori() {
                return id_kategori;
            }

            public void setId_kategori(int id_kategori) {
                this.id_kategori = id_kategori;
            }

            public String getNama_kategori() {
                return nama_kategori;
            }

            public void setNama_kategori(String nama_kategori) {
                this.nama_kategori = nama_kategori;
            }
        }
    }
}
