package techno.com.technoprenership.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import techno.com.technoprenership.R;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
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
    }
}
