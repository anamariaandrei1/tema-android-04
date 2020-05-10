package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

	private List<Student> studentList;

	public StudentAdapter(List<Student> studentList) {
		this.studentList = studentList;
	}

	@NonNull
	@Override
	public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
		return new StudentViewHolder(studentItem);
	}

	@Override
	public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
		Student currentStudent = studentList.get(position);
		holder.getFirstName().setText(currentStudent.getFirstName());
		holder.getLastName().setText(currentStudent.getLastName());
	}

	@Override
	public int getItemCount() {
		return studentList.size();
	}
}
