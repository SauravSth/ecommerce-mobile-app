package com.example.saurav_shrestha_project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
    EditText inputEmail_Register, inputUsername_Register, inputPassword_Register, inputConfirmPassword_Register;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        auth = FirebaseAuth.getInstance();
        inputUsername_Register = findViewById(R.id.inputUsername_Register);
        inputEmail_Register = findViewById(R.id.inputEmail_Register);
        inputPassword_Register = findViewById(R.id.inputPassword_Register);
        inputConfirmPassword_Register = findViewById(R.id.inputConfirmPassword_Register);
    }
    public void login(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }
    public void register(View view) {
        String username = inputUsername_Register.getText().toString();
        String email = inputEmail_Register.getText().toString();
        String password = inputPassword_Register.getText().toString();
        String confirmPassword = inputConfirmPassword_Register.getText().toString();

        if (username.isEmpty()) {
            Toast.makeText(RegistrationActivity.this, "The Username field is empty", Toast.LENGTH_LONG).show();
            return;
        }
        if (email.isEmpty()) {
            Toast.makeText(RegistrationActivity.this, "The email field is empty", Toast.LENGTH_LONG).show();
            return;
        }
        if (password.isEmpty()) {
            Toast.makeText(RegistrationActivity.this, "The password field is empty", Toast.LENGTH_LONG).show();
            return;
        }
        if (confirmPassword.isEmpty()) {
            Toast.makeText(RegistrationActivity.this, "The confirm password field is empty", Toast.LENGTH_LONG).show();
            return;
        }
        if (!password.equals(confirmPassword)) {
            Toast.makeText(RegistrationActivity.this, "The passwords do not match", Toast.LENGTH_LONG).show();
            return;
        }
        if (password.length() < 6) {
            Toast.makeText(RegistrationActivity.this, "Password cannot be less than 6 characters", Toast.LENGTH_LONG).show();
            return;
        }

        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(RegistrationActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(RegistrationActivity.this, "User created successfully", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                } else {
                    Toast.makeText(RegistrationActivity.this, "User not created"+task.getException(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}