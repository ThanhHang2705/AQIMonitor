package com.example.thanhhang.mnsfimo.FragmentMain;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.thanhhang.mnsfimo.Activities.ResultActivity;
import com.example.thanhhang.mnsfimo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {
    Button btx_timNangCao;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        btx_timNangCao = (Button) view.findViewById(R.id.btx_timNangCao);
        btx_timNangCao.setOnClickListener(On_Click_nangcao);
        return view;
    }

    public View.OnClickListener On_Click_nangcao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(), ResultActivity.class));
        }
    };

}
