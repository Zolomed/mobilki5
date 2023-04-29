package com.mycompany.myapplication.Data.UI;

import android.app.Fragment;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mycompany.myapplication.R;


public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }


    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        EditText editEmail;
        EditText editPassword;
        Button Login;
        Button Sign_up;
        editEmail = view.findViewById(R.id.editTextTextEmailAddress);
        editPassword = view.findViewById(R.id.editTextTextPassword);
        Login = view.findViewById(R.id.Login_button);
        Sign_up = view.findViewById(R.id.Sign_up_button);

        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                result.putString("email",editEmail.getText().toString());
                result.putString("password",editPassword.getText().toString());
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        return view;
    }
}