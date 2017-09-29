package com.example.dineshbalajivenkataraman.kansastour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Shopping_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        List<Card> list=new ArrayList<>();
       Shop.initArtsList(list,getContext());
        CardAdapter adapter = new CardAdapter(getActivity(), -1, list);

        View view = inflater.inflate(R.layout.listview_layout,container,false);
        ListView listView = (ListView)view.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return view;
    }
}
