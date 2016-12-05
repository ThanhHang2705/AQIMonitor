package com.example.thanhhang.mnsfimo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.thanhhang.mnsfimo.R;

import java.util.ArrayList;

/**
 * Created by ThanhHang on 12/5/2016.
 */

public class AddNodeAdapter extends BaseAdapter {
    TextView txt_newNode;
    ArrayList<String> list = new ArrayList<>();
    LayoutInflater inflater;

    public AddNodeAdapter(ArrayList<String> list, Context context ){
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView== null){
            convertView = inflater.inflate(R.layout.item_list_addnote,null);
        }
        txt_newNode = (TextView) convertView.findViewById(R.id.txt_NewNode);
        txt_newNode.setText(list.get(position));
        return convertView;
    }
}
