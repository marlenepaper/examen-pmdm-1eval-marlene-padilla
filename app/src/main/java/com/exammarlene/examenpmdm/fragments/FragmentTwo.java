package com.exammarlene.examenpmdm.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.exammarlene.examenpmdm.R;

public class FragmentTwo extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_two, container, false);
    }


    Button callDialogButton = findViewById(R.id.callDialogButton);
        callDialogButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MainActivity.this);
            dialogBuilder.setTitle("Alerta");
            dialogBuilder.setMessage("Es " + name + ", tu nombre?");
            dialogBuilder.setCancelable(true);
            dialogBuilder.setPositiveButton("Sí, correcto", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    Toast.makeText(getApplicationContext(), "Continuamos contigo "+name, Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                }
            });
            dialogBuilder.setNegativeButton("No, incorrecto", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "Para cambiar tus datos, da click en Abril Material Dialog", Toast.LENGTH_SHORT).show();
                }
            });
            AlertDialog alertDialog = dialogBuilder.create();
            alertDialog.show();
        }
}

