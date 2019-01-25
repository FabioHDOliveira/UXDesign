package com.example.a300275262.fragdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomerAdapter extends BaseAdapter {
    ArrayList<String> itemList;

    public MyCustomerAdapter(ArrayList<String> anyItemList){
        itemList = anyItemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater myLayoutInflator = LayoutInflater.from(parent.getContext());
            convertView = myLayoutInflator.inflate(R.layout.layout_item, parent, false);
        }
        TextView myTextView = (TextView)convertView.findViewById(R.id.textViewItem);
        myTextView.setText(itemList.get(position));
        return convertView;
    }
}
