package com.exammarlene.examenpmdm.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.exammarlene.examenpmdm.R;

public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup containter, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_fragment_one,containter,false);
    }
}