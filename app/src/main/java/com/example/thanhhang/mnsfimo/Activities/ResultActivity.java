package com.example.thanhhang.mnsfimo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.thanhhang.mnsfimo.Adapters.KQuaAdapter;
import com.example.thanhhang.mnsfimo.KQNode;
import com.example.thanhhang.mnsfimo.R;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    ListView lv_KQ;
    ArrayList<KQNode> listKQ= new ArrayList<>();
    KQuaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        lv_KQ = (ListView) findViewById(R.id.lv_Kq);
        getListKQ(listKQ);
        adapter = new KQuaAdapter(listKQ,this);
        lv_KQ.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void getListKQ(ArrayList<KQNode> a){
        a.add(new KQNode(1,"ĐHQGHN","Xuân Thủy","2.5"));
        a.add(new KQNode(2,"CV Cầu Giấy","Cầu giấy","2"));
        a.add(new KQNode(3,"CV Nghĩa đô","Xuân Thủy","1"));
        a.add(new KQNode(5,"ĐHBK","Hai Bà Trưng","6"));
        a.add(new KQNode(5,"ĐHCN","Nhổn","8"));


    }
}
