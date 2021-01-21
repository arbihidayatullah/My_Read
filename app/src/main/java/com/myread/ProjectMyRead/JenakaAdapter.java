package com.myread.ProjectMyRead;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class JenakaAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Jenaka> jenakas = new ArrayList<>();

    public void setContext(Context context) {
        this.context = context;
    }

    public void setJenakas(ArrayList<Jenaka> jenakas) {
        this.jenakas = jenakas;
    }

    public JenakaAdapter(Context context, ArrayList<Jenaka> jenakas) {
        this.context = context;
        this.jenakas = jenakas;
    }

    public JenakaAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return jenakas.size();
    }

    @Override
    public Object getItem(int i) {
        return jenakas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_jenaka, viewGroup, false);
        }
        JenakaAdapter.ViewHolder viewHolder = new JenakaAdapter.ViewHolder(itemView);
        Jenaka jenaka = (Jenaka) getItem(i);
        viewHolder.bind(jenaka);
        return itemView;
    }

    private class ViewHolder {
        private TextView txtNamej;
        private TextView txtDescriptionj;
        private ImageView imgPhotoj;
        ViewHolder(View view) {
            txtNamej = view.findViewById(R.id.txt_namej);
            txtDescriptionj = view.findViewById(R.id.txt_descriptionj);
            imgPhotoj = view.findViewById(R.id.img_photoj);
        }
        void bind(Jenaka jenaka) {
            txtNamej.setText(jenaka.getNamej());
            txtDescriptionj.setText(jenaka.getDescriptionj());
            imgPhotoj.setImageResource(jenaka.getPhotoj());
        }

    }
}
