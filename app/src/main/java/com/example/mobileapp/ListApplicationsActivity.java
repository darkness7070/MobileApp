package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListApplicationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_applications);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Application> applicationList = new ArrayList<Application>();
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        applicationList.add(new Application(0,"1","2","3","4"));
        ApplicationsAdapter adapter = new ApplicationsAdapter(applicationList);
        recyclerView.setAdapter(adapter);
    }
}