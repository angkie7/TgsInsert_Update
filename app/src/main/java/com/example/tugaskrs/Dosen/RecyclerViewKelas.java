package com.example.tugaskrs.Dosen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaskrs.Dosen.Adapter.KelasAdapter;
import com.example.tugaskrs.Dosen.Model.Kelas;
import com.example.tugaskrs.R;

import java.util.ArrayList;

public class RecyclerViewKelas extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KelasAdapter kelasAdapter;
    private ArrayList<Kelas> kelasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_kelas);

        this.setTitle("SI KRS - Hai");

        tambahData();

        recyclerView = findViewById(R.id.rvKelas);
        kelasAdapter = new KelasAdapter(kelasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKelas.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kelasAdapter);
    }

    public void tambahData(){
        kelasList = new ArrayList<>();
        kelasList.add(new Kelas("SI1","Ddp","3","Senin",
                "Katon","100"));

        kelasList.add(new Kelas("SI2","Alpro Strukdat","3","Selasa",
                "Katon","200"));

        kelasList.add(new Kelas("SI3","Progweb","3","Rabu",
                "Erick","300"));

        kelasList.add(new Kelas("SI4","Progmob","3","Kamis",
                "Kadek","400"));
    }
}
