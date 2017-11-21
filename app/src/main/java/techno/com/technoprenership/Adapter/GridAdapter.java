package techno.com.technoprenership.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import techno.com.technoprenership.Activity.ReviewHolder;
import techno.com.technoprenership.Model.APIReview;
import techno.com.technoprenership.Model.APIUser;
import techno.com.technoprenership.Model.Review;
import techno.com.technoprenership.Model.User;
import techno.com.technoprenership.R;


public class GridAdapter extends RecyclerView.Adapter<ReviewHolder>
{
    List<APIReview.ResponBean.DataBean> listReview;
    private Context context;


    public GridAdapter(Context context, List<APIReview.ResponBean.DataBean> listReview) {
        this.context = context;
        this.listReview = listReview;

    }

    @Override
    public int getItemCount() {
        return (null != listReview ? listReview.size() : 0);

    }

    @Override
    public void onBindViewHolder(ReviewHolder holder, int position) {
        final APIReview.ResponBean.DataBean rev = listReview.get(position);
        final ReviewHolder mainHolder = holder;

       // mainHolder.gambar.setText(String.valueOf(rev.getGambar_review()));
        mainHolder.judul.setText(rev.getJudul_review());
       // mainHolder.tvsub.setText(guru.getAlamat());
        /*
        mainHolder.tvStatus.setText(guru.getMata_pelajaran());
        mainHolder.tv_telpon.setText(guru.getTelepon());
        mainHolder.tv_email.setText(guru.getEmail());
        mainHolder.tv_tanggallahir.setText(guru.getTanggal_lahir());
        mainHolder.tv_tempatlahir.setText(guru.getTempat_lahir());
        mainHolder.tv_jeniskelamin.setText(guru.getKelamin());
        mainHolder.tv_namabelakang.setText(guru.getNama_belakang());
        mainHolder.tv_harga.setText(guru.getHarga());
        mainHolder.foto2.setText(guru.getProfil());*/
        Picasso.with(context).load(rev.getGambar_review()).into(mainHolder.gambar);

        //   namabelakang=guru.getNama_belakang();

       /* mainHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = new Bundle();
                extras.putInt("id",Integer.parseInt(mainHolder.tvid.getText().toString()));
                extras.putString("nama",mainHolder.tvtit.getText().toString());
                extras.putString("alamat", mainHolder.tvsub.getText().toString());
                extras.putString("status", mainHolder.tvStatus.getText().toString());
                extras.putString("nomortlp", mainHolder.tv_telpon.getText().toString());
                extras.putString("harga", mainHolder.tv_harga.getText().toString());
                // extras.putString("nomortlp",notlp1);
                extras.putString("email",mainHolder.tv_email.getText().toString());
                extras.putString("tanggallahir",mainHolder.tv_tanggallahir.getText().toString());
                extras.putString("tempatlahir",mainHolder.tv_tempatlahir.getText().toString());
                extras.putString("jeniskelamin",mainHolder.tv_jeniskelamin.getText().toString());
                extras.putString("namabelakang",mainHolder.tv_namabelakang.getText().toString());
                extras.putString("profil",mainHolder.foto2.getText().toString());
              extras.putString("profil",mainHolder.foto.toString());

                Log.d("LoginActivity", "response >>>= " + mainHolder.foto2.toString());
                Intent intent = new Intent(context, DetilGuruActivity.class);
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });
        */
    }

    @Override
    public ReviewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // This method will inflate the custom layout and return as viewholder
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.grid_view, viewGroup, false);
        ReviewHolder listHolder = new ReviewHolder(mainGroup);
        return listHolder;

    }


  /*  List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
       // set data item review

        EndangeredItem nama = new EndangeredItem();
        nama.setName("Review 1");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 2");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 3");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 4");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 5");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 6");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 7");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 8");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 9");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 11");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 12");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 12");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 13");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 14");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 14");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 15");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 16");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 17");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 18");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 19");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Review 20");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }*/
}
