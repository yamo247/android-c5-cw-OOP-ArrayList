package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> Students = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        Student s1 = new Student("chika", 15, 90 , R.drawable.chika);
        Student s2 = new Student("violet", 13, 90 , R.drawable.violet);
        Student s3 = new Student("hinata", 17, 90 , R.drawable.hinata);
        Student s4 = new Student("miyamura", 16, 90 , R.drawable.miyamura);

        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Students.add(s4);

        StudentAdapter studentAdapter = new StudentAdapter(this,0,Students);


        listView.setAdapter(studentAdapter);
    }
}