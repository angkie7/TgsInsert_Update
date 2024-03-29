package com.example.tugaskrs.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaskrs.Admin.Adapter.MahasiswaAdapter;
import com.example.tugaskrs.Admin.Model.Mahasiswa;
import com.example.tugaskrs.R;

import java.util.ArrayList;

public class RecyclerViewDaftarMahasiswa extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(
                    RecyclerViewDaftarMahasiswa.this,CreateMahasiswaActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    private RecyclerView recyclerView;
    private MahasiswaAdapter mhsAdapter;
    private ArrayList<Mahasiswa> mhsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_daftar_mahasiswa);
        this.setTitle("SI KRS - Hai");
        tambahData();

        recyclerView = findViewById(R.id.rvMhs);
        mhsAdapter = new MahasiswaAdapter(mhsList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                RecyclerViewDaftarMahasiswa.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsAdapter);
    }

    private void tambahData(){
        mhsList = new ArrayList<>();
        mhsList.add(new Mahasiswa("72170146","Angkie","angkie.octovaldo@si.ukdw.ac.id",
                "Balikpapan",R.drawable.orang));
        mhsList.add(new Mahasiswa("72170148","Dorra","christain.dorra@si.ukdw.ac.id",
                "Sangauledo",R.drawable.orang));
        mhsList.add(new Mahasiswa("72170172","Abdi","putu.abdi@si.ukdw.ac.id",
                "Bali",R.drawable.orang));
    }
}
