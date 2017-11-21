package techno.com.technoprenership.Activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import techno.com.technoprenership.R;

/**
 * Created by mery on 11/21/2017.
 */
public class ReviewHolder extends RecyclerView.ViewHolder {
    TextView tvsub,tvidrev;
    TextView tvidkat ;
    TextView tvidusr;
    TextView tv_creatat;
    RelativeLayout item;
   public ImageView gambar;
    public TextView judul;


    public ReviewHolder(View view)
    {
        super(view);
        //this.judul = (TextView) view.findViewById(R.id.tv_idreview);
        //this.tvsub = (TextView) view.findViewById(R.id.tv_subtitle);
       // this.tvidkat = (TextView) view.findViewById(R.id.tv_idkategori);
      //  this.tvidusr=(TextView) view.findViewById(R.id.tv_iduser);
     //   this.tv_creatat=(TextView)view.findViewById(R.id.createat);
        this.gambar= (ImageView) view.findViewById(R.id.gambarreview);
        this.judul=(TextView)view.findViewById(R.id.txtjudul);
        this.item = (RelativeLayout) view.findViewById(R.id.itemReview);
    }
}
