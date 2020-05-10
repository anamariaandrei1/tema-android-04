package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentActivity extends AppCompatActivity {
	private List<Student> studentList;
	private RecyclerView recyclerView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_student);
		setContentView(R.layout.code_challenge_three);
//		getStudents();
//		recyclerView = findViewById(R.id.recyclerViewStudents);
//		setLayoutManager(recyclerView);
//		setAdapter(recyclerView);

	}

	private void getStudents() {
		studentList = new ArrayList<>();
		Student student = null;
		for( int i = 0; i < 20; i++) {
			student = new Student();
			student.setFirstName("First Name " + i);
			student.setLastName("Last Name " + i);
			studentList.add(student);
		}
	}

	private void setLayoutManager(RecyclerView recyclerView) {
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
		recyclerView.setLayoutManager(linearLayoutManager);
	}

	private void setAdapter(RecyclerView recyclerView) {
		StudentAdapter studentAdapter = new StudentAdapter(studentList);
		recyclerView.setAdapter(studentAdapter);
	}
}
