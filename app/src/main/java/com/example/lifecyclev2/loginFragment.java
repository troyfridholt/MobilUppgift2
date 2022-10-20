package com.example.lifecyclev2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class loginFragment extends Fragment {

    EditText nameInput;
    EditText passwordInput;
    Button loginBtnF;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        loginBtnF = (Button) rootView.findViewById(R.id.fragmentBtnLogin);
        nameInput = (EditText) rootView.findViewById(R.id.nameInput);
        passwordInput = (EditText) rootView.findViewById(R.id.passwordInput);


        loginBtnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameInput.getText().toString().equals("Snus") && passwordInput.getText().toString().equals("DoubleU")){
                    replaceFragment(new formFragment());
                }else{
                    replaceFragment(new loginFragment());
                }

            }
        });

        return rootView;
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }



}