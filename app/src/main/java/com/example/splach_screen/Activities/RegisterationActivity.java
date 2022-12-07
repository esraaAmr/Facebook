package com.example.splach_screen.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.splach_screen.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class RegisterationActivity extends AppCompatActivity {
    EditText etUserName,etEmail,etPassword,etRePassword;
    Button RegisterBtn;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        initUI();
        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Users");
        RegisterBtn.setOnClickListener(view -> {
           String userName = etUserName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(task -> {
                if (task.isSuccessful()){
                    firebaseUser = task.getResult().getUser();
                    //////////////////////////////////////////////////////
                    DatabaseReference newUser = databaseReference.child(firebaseUser.getUid());
                    ////////////////////////////////////////////////////////
                    newUser.child("Name").setValue(userName);
                    newUser.child("Email").setValue(email);
                    newUser.child("Password").setValue(password);
                    Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(intent);
                    Toast.makeText(this, "Registration Successfully", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
            });
        });}
    private void initUI() {
        etUserName = findViewById(R.id.username);
        etEmail = findViewById(R.id.email);
        etPassword =findViewById(R.id.password);
        etRePassword = findViewById(R.id.repassword);
        RegisterBtn = findViewById(R.id.signupbtn);

    }

}