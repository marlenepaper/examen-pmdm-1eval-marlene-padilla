package com.exammarlene.examenpmdm.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.exammarlene.examenpmdm.R;
import com.exammarlene.examenpmdm.databinding.FragmentFragmentOneBinding;

import java.lang.reflect.Array;

public class FragmentOne extends Fragment {

    private FragmentFragmentOneBinding binding;
    private int contador = 0;
    private String[] nombres = {"macarena", "sierra", "leon"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFragmentOneBinding.inflate(inflater, container, false);
        View rootView = binding.getRoot();

        TextView contadorTextView=rootView.findViewById(R.id.fragmentUnoContador);
        TextView nombreTextView=rootView.findViewById(R.id.fragmentUnoNombreAleatorio);

        Button button0 = rootView.findViewById(R.id.buttonIncrease);
        button0.setOnClickListener(v -> {aumentarContador(contadorTextView);nombreAleatorio(nombreTextView);} );

        return rootView;
    }

    private void aumentarContador(TextView contadorTextView) {
        contador++;
        contadorTextView.setText("Contador: " +contador);
    }


    private void nombreAleatorio(TextView nombreTextView) {
        int indiceAleatorio = (int) (Math.random() * nombres.length);
        String nombreSeleccionado = nombres[indiceAleatorio];

        nombreTextView.setText(nombreSeleccionado);
    }

}
