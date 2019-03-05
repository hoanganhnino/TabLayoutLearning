package com.example.hoanganh.tablayoutlearning.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoanganh.tablayoutlearning.R;

/**
 * Created by hoanganh on 3/5/2019.
 */

public class FragmentC extends Fragment
{
    public FragmentC()
    {}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

}
