package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstance){
        View root = inflater.inflate(R.layout.fragment_body_part, group, false);
        ImageView imageView = (ImageView)root.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return root;
    }
}
