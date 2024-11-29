package com.exammarlene.examenpmdm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import com.exammarlene.examenpmdm.ui.fr.manager.Paginador;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.exammarlene.examenpmdm.databinding.ActivityMain2Binding;

import java.util.HashSet;
import java.util.Set;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador paginador = new Paginador(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

//        setSupportActionBar(binding.toolbar);
//        getSupportActionBar().setTitle("");


    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Infla el archivo de menú (menu_desplegable.xml)
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_desplegable, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.favStarButton) {
//            Intent intent = new Intent(Aficiones.this, DetalleFragmentActivity.class);
//            startActivity(intent);
//            return true;
//        } else if (id == R.id.homeButton) {
//            return false;
//        } else if (id == R.id.aboutMeButton) {
//            Intent intent = new Intent(Aficiones.this, SobreMi.class);
//            startActivity(intent);
//            return true;
//        } else if (id == R.id.myWebpage) {
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("https://marlenepaper.com/"));
//            startActivity(intent);
//            return true;
//        } else {
//            return super.onOptionsItemSelected(item);
//        }
//    }
}