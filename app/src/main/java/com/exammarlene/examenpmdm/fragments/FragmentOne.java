package com.exammarlene.examenpmdm.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.exammarlene.examenpmdm.R;

public class FragmentOne extends Fragment {

    private int contador = 0;
    private Button button0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_fragment_one, container, false);

        button0 = rootView.findViewById(R.id.buttonIncrease);
        button0.setOnClickListener(v -> aumentarContador());
        return rootView;
    }

    private void aumentarContador() {
        contador++;
        Log.d("FragmentOne", "Contador: " + contador);

    }


}
