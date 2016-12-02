package com.example.thanhhang.mnsfimo.FragmentMain;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.thanhhang.mnsfimo.Adapters.ListLoveAdapter;
import com.example.thanhhang.mnsfimo.Love;
import com.example.thanhhang.mnsfimo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListmainFragment extends Fragment {
    ListView list;
    ListLoveAdapter adapter;
    ArrayList<Love> listLove= new ArrayList<>();




    public ListmainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_listmain, container, false);
        listLove.add(new Love("Công viên cầu giấy",90,60,27));
        list = (ListView) view.findViewById(R.id.listLove);
        adapter = new ListLoveAdapter(listLove,getActivity());
        list.setAdapter(adapter);

        return view;
    }

}
