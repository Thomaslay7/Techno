package techno.com.technoprenership.Adapter;


/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class CustomAdapter  {
/*
    List<APIReview.ResponBean.DataBean> listRevie;
    private Context context;
    private String notlp1,email,tgllahir,tempatlahir,jeniskelamin,namabelakang;


    public CustomAdapter(Context context, List<APIReview.ResponBean.DataBean> listReview) {
        this.context = context;
        this.listRevie = listReview;

    }

    @Override
    public int getItemCount() {
        return (null != listRevie ? listRevie.size() : 0);

    }

    @Override
    public void onBindViewHolder(ReviewHolder holder, int position) {
        final APIReview.ResponBean.DataBean review = listRevie.get(position);
        final ReviewHolder mainHolder = holder;

   super(view);
        this.tvidrev = (TextView) view.findViewById(R.id.tv_idreview);
        this.tvsub = (TextView) view.findViewById(R.id.tv_subtitle);
        this.tvidkat = (TextView) view.findViewById(R.id.tv_idkategori);
        this.tvidusr=(TextView) view.findViewById(R.id.tv_iduser);
        this.tv_creatat=(TextView)view.findViewById(R.id.createat);
        this.foto = (ImageView) view.findViewById(R.id.icon);
        this.foto2 = (TextView) view.findViewById(R.id.tv_temp);

        mainHolder.tv.setText(String.valueOf(review.getId_review()));
        mainHolder.tvtit.setText(review.getJudul_review());
        mainHolder.tvsub.setText(review.getId_kategori());
        mainHolder.tvStatus.setText(review.getId_user());
        mainHolder.tv_telpon.setText(review.getIsi_review());
        mainHolder.tv_telpon.setText(review.getCreated_at());
        mainHolder.foto2.setText(review.getGambar_review());
        Picasso.with(context).load(review.getGambar_review()).into(mainHolder.foto);

        //   namabelakang=guru.getNama_belakang();

        mainHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = new Bundle();
                extras.putInt("id_review",Integer.parseInt(mainHolder.tv.getText().toString()));
                extras.putString("judul_review",mainHolder.tvtit.getText().toString());
                extras.putString("id_kategori", mainHolder.tvsub.getText().toString());
                extras.putString("id_user", mainHolder.tvStatus.getText().toString());
                extras.putString("isi_review", mainHolder.tv_telpon.getText().toString());
                extras.putString("created_at", mainHolder.tv_harga.getText().toString());
                extras.putString("gambar_review",mainHolder.foto2.getText().toString());
//                extras.putString("profil",mainHolder.foto.toString());

                Log.d("Login", "response >>>= " + mainHolder.foto2.toString());
                Intent intent = new Intent(context, DetilReviewActivity.class);
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public ReviewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // This method will inflate the custom layout and return as viewholder
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.list_view, viewGroup, false);
        ReviewHolder listHolder = new ReviewHolder(mainGroup);
        return listHolder;
    }*/
}
