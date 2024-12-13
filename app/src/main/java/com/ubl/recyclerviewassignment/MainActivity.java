package com.ubl.recyclerviewassignment;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Hardcoded data
        List<Student> students = new ArrayList<>();
        students.add(new Student("842094", "Azizah Media Nurrahmah", "azizahnrmh@gmail.com", "04/12/2005"));
        students.add(new Student("842095", "Brian Chandra", "brianchndr@gmail.com", "02/02/2001"));
        students.add(new Student("842096", "Kim Kanawa", "kimknw@gmail.com", "03/03/2002"));
        students.add(new Student("842097", "Diana Prince", "diana@gmail.com", "04/04/2003"));
        students.add(new Student("842098", "Eve Adams", "eve@gmail.com", "05/05/2004"));

        StudentAdapter adapter = new StudentAdapter(students);
        recyclerView.setAdapter(adapter);
    }
}
