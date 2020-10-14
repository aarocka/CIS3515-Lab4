package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;

    String[] colors;

    public ColorAdapter(Context context, String[] colors){
        this.context=context;
        this.colors=colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if(convertView!=null){
            textView=(TextView) convertView;
        } else {
            textView=new TextView(context);
        }

        textView.setText(colors[position]);
        textView.setPadding(50,50,5,50);
        textView.setBackgroundColor(Color.parseColor(colors[position]));

        return textView;
    }
}
