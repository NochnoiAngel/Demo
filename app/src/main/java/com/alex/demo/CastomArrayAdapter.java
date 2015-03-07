package com.alex.demo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.alex.demo.dummy.DummyContent;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by marat on 23.02.15.
 */
public class CastomArrayAdapter extends ArrayAdapter<CustomDummyItem> {

    private final List<CustomDummyItem> list;
    LayoutInflater layoutInflater;
    int resource;
    public CastomArrayAdapter(Context context, int resource,List<CustomDummyItem> list) {
        super(context, resource);
        this.list=list;
        layoutInflater= LayoutInflater.from(context);
        this.resource=resource;
    }

    @Override
    public CustomDummyItem getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=layoutInflater.inflate(resource,null);
        CustomDummyItem item=getItem(position);
        TextView textView= (TextView) view.findViewById(R.id.textView1);
        textView.setText(item.getText());
        ImageView imageView= (ImageView) view.findViewById(R.id.image);
        ImageLoader.getInstance().displayImage(item.getImageUrl(), imageView);

        return view;
    }
}
