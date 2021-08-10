package com.example.listtugas;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listtugas;
    private String[] Tugas = new String[]{
            "Tugas 1","Tugas 2","Tugas 3","Tugas 4","Tugas 5",
            "Tugas 6","Tugas 7","Tugas 8","Tugas 9","Tugas 10",
            "Tugas 11","Tugas 12","Tugas 13","Tugas 14","Tugas 15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List Tugas");

        listtugas = (ListView) findViewById(R.id.listtgs);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,android.R.id.text1,Tugas);

        listtugas.setAdapter(adapter);
        listtugas.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "Memilih :" +Tugas[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}