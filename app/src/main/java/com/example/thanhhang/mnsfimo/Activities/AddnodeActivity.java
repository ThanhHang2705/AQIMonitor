package com.example.thanhhang.mnsfimo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.thanhhang.mnsfimo.Adapters.AddNodeAdapter;
import com.example.thanhhang.mnsfimo.R;

import java.util.ArrayList;

public class AddnodeActivity extends AppCompatActivity {
    private ListView lv_NewNode;
    private  ArrayList<String> listNewNode = new ArrayList<>();
    private AddNodeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnode);
        lv_NewNode = (ListView) findViewById(R.id.lv_NewNode);
        getList(listNewNode);
        adapter = new AddNodeAdapter(listNewNode,this);
        lv_NewNode.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    public void getList(ArrayList<String> a){
        a.add("FIMO 408");
        a.add("Hoàng Sa");
        a.add("Lương Yên");

    }
}
