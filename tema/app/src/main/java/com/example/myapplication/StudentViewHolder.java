package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
	private TextView firstName;
	private TextView lastName;
	public StudentViewHolder(@NonNull View itemView) {
		super(itemView);
		firstName = itemView.findViewById(R.id.textFirstName);
		lastName = itemView.findViewById(R.id.textLastName);
	}

	public TextView getFirstName() {
		return firstName;
	}

	public TextView getLastName() {
		return lastName;
	}
}
