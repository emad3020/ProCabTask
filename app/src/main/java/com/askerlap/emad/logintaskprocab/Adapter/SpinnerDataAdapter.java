package com.askerlap.emad.logintaskprocab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.askerlap.emad.logintaskprocab.R;

/**
 * Created by emad on 11/15/17.
 */

public class SpinnerDataAdapter extends BaseAdapter {
    private String[] source;
    LayoutInflater inflater;
    Context context;
    public SpinnerDataAdapter(Context context, String[] source) {
        this.source = source;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return source.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        return getCustomView(i,view,viewGroup);
    }

    private View getCustomView(int position ,View convertView,ViewGroup parent) {
        TextView tvSpinnerData;
        View layout = inflater.inflate(R.layout.spinner_row_item,parent,false);
        tvSpinnerData = layout.findViewById(R.id.tvSpinnerData);
        tvSpinnerData.setText(source[position]);
        layout.setTag(position);
        return layout;
    }
}
