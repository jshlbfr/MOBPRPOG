package com.example.albufera_lab_act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);
        login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(v);
            }
        });
    }

    public void login(View view) {
        String userInput = username.getText().toString();
        String passwordInput = password.getText().toString();

        if (userInput.equals("user") && passwordInput.equals("1234")) {
            // Correct password
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, activity_logged.class);
            startActivity(intent);
        } else {
            // Wrong password
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }
}
