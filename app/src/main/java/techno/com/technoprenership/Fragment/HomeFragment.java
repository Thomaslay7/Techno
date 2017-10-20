package techno.com.technoprenership.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import techno.com.technoprenership.Adapter.GridAdapter;
import techno.com.technoprenership.R;


public class HomeFragment extends Fragment {

    RecyclerView mrecyclerView;
    RecyclerView.LayoutManager mlayoutmanager;
    RecyclerView.Adapter mAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_home, container, false);
        mrecyclerView=(RecyclerView) view.findViewById(R.id.recycleview);
        mrecyclerView.setHasFixedSize(true);

        mlayoutmanager = new GridLayoutManager(getActivity(),2);
        mrecyclerView.setLayoutManager(mlayoutmanager);
        mAdapter= new GridAdapter();
        mrecyclerView.setAdapter(mAdapter);
        return  view;
    }

}
