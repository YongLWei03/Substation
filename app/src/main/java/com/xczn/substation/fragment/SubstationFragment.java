package com.xczn.substation.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.xczn.substation.R;
import com.xczn.substation.base.BaseBackFragment;

/**
 * Created by zhangxiao
 * Date on 2018/5/21.
 */
public class SubstationFragment extends BaseBackFragment {

    public static SubstationFragment newInstance() {
        return new SubstationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_substation, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        toolbar.setTitle("变电站");
        initToolbarNav(toolbar);
    }
}