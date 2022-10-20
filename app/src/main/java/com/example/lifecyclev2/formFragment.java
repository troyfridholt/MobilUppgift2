package com.example.lifecyclev2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;


public class formFragment extends Fragment {

    CheckBox over;
    CheckBox driversLicense;
    EditText email;
    EditText phone;
    EditText date;
    Button submitBtn;
    TextView tv_over;
    TextView tv_license;
    TextView tv_email;
    TextView tv_phone;
    TextView tv_date;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_form, container, false);

        over = (CheckBox) rootView.findViewById(R.id.checkTwo);
        driversLicense = (CheckBox) rootView.findViewById(R.id.checkOne);
        email = (EditText) rootView.findViewById(R.id.email);
        phone = (EditText) rootView.findViewById(R.id.phone);
        date = (EditText) rootView.findViewById(R.id.date);
        submitBtn = (Button) rootView.findViewById(R.id.submitBtn);
        tv_over = (TextView) rootView.findViewById(R.id.tvOver);
        tv_license = (TextView) rootView.findViewById(R.id.tvLicense);
        tv_email = (TextView) rootView.findViewById(R.id.tvEmail);
        tv_phone = (TextView) rootView.findViewById(R.id.tvPhone);
        tv_date = (TextView) rootView.findViewById(R.id.tvDate);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_over.setText(""+over.isChecked());
                tv_license.setText(""+driversLicense.isChecked());
                tv_email.setText(email.getText());
                tv_phone.setText(phone.getText());
                tv_date.setText(date.getText());
            }
        });




        return rootView;
    }
}