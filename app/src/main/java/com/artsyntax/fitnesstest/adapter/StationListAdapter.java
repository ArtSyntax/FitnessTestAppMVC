package com.artsyntax.fitnesstest.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.artsyntax.fitnesstest.view.StationList;
import com.artsyntax.fitnesstest.view.TestList;

/**
 * Created by ArtSyntax on 17/2/2559.
 */
public class StationListAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return 1000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        StationList item;
        if (convertView != null)
            item = (StationList) convertView;
        else
            item = new StationList(parent.getContext());
        return item;
    }
}
