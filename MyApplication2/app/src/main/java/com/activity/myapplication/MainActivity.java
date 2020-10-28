package com.activity.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    EditText email,password;
    Button register,login;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.txt_email);
       password = findViewById(R.id.txt_password);
       register = findViewById(R.id.btn_register);
       login = findViewById(R.id.btn_login);

        mAuth = FirebaseAuth.getInstance();

    register.setOnClicklistener(new_OnCliclListener() {
        @Override
                public void onClick(View view)
            {
              email = txt-email.getText().toString().trim();
              password = txt_password.getText().toString().trim();

                mAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCanceledListener((new onCompletelistener<AuthResult>() {
                            @Override
                        }


                        }
            }
        }
    }