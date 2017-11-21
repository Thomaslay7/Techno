package techno.com.technoprenership.Model;

/**
 * Created by mery on 11/21/2017.
 */
public class Review {

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
