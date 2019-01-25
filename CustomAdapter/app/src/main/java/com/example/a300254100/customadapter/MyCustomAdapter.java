package com.example.a300254100.customadapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.ViewHolder>{

    List<String> itemList;
    List<Integer> picList;
    List<String> dirList;
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtViewName;
        TextView txtViewDir;
        ImageView imgView;
        View itemView;

        private void changeColors(){
            if(txtViewName.getCurrentTextColor()!= Color.RED){
                txtViewName.setTextColor(Color.RED);
                txtViewDir.setTextColor(Color.RED);
                itemView.setBackgroundColor(Color.parseColor("#FDBCB4"));
            }else{
                txtViewName.setTextColor(Color.BLUE);
                txtViewDir.setTextColor(Color.BLUE);
                itemView.setBackgroundColor(Color.WHITE);
            }
        }

        public ViewHolder(View itemView) {
            super(itemView);
            txtViewName = (TextView) itemView.findViewById(R.id.txtViewItemName);
            txtViewDir = (TextView) itemView.findViewById(R.id.txtViewDir);
            imgView = (ImageView) itemView.findViewById(R.id.imgView);
            this.itemView = itemView;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //change the colors
                    //get current colors, change color to red
                    changeColors();
                }
            });

        }

    }


    public MyCustomAdapter(List<String> anyList,
                           List<Integer> anyPicList,
                           List<String> anyDirList){ // constructor
            itemList = anyList;
            picList = anyPicList;
            dirList = anyDirList;
    }
    public void changeItemList(List<String> anyList,
                               List<Integer> anyPicList,
                               List<String> anyDirList){
            itemList = anyList;
            picList = anyPicList;
            dirList = anyDirList;
            //notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.layout_item, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.txtViewName.setText(itemList.get(position));
        viewHolder.txtViewDir.setText(dirList.get(position));
        viewHolder.imgView.setImageResource(picList.get(position));
        viewHolder.txtViewName.setTextColor(Color.BLUE);
        viewHolder.txtViewDir.setTextColor(Color.BLUE);
        viewHolder.itemView.setBackgroundColor(Color.WHITE);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

}
