package com.myread.ProjectMyRead;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ComedyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Comedy> comedys = new ArrayList<>();

    public void setContext(Context context) {
        this.context = context;
    }

    public void setComedy(ArrayList<Comedy> comedys) {
        this.comedys = comedys;
    }

    public ComedyAdapter(Context context, ArrayList<Comedy> comedy) {
        this.context = context;
        this.comedys = comedys;
    }

    public ComedyAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return comedys.size();
    }

    @Override
    public Object getItem(int i) {
        return comedys.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_comedy, viewGroup, false);
        }
        com.myread.ProjectMyRead.ComedyAdapter.ViewHolder viewHolder = new com.myread.ProjectMyRead.ComedyAdapter.ViewHolder(itemView);
        Comedy comedy = (Comedy) getItem(i);
        viewHolder.bind(comedy);
        return itemView;
    }

    private class ViewHolder {
        private TextView txtNamec;
        private TextView txtDescriptionc;
        private ImageView imgPhotoc;
        ViewHolder(View view) {
            txtNamec = view.findViewById(R.id.txt_namec);
            txtDescriptionc = view.findViewById(R.id.txt_descriptionc);
            imgPhotoc = view.findViewById(R.id.img_photoc);
        }
        void bind(Comedy comedy) {
            txtNamec.setText(comedy.getNamec());
            txtDescriptionc.setText(comedy.getDescriptionc());
            imgPhotoc.setImageResource(comedy.getPhotoc());
        }

    }

}
