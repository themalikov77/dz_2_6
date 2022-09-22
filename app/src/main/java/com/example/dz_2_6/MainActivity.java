package com.example.dz_2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.opengl.Visibility;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView register;
    private TextView not_register;
    private TextView input;
    private TextView click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.button);
        register = (TextView) findViewById(R.id.register);
        not_register = (TextView) findViewById(R.id.password_not);
        input = (TextView) findViewById(R.id.input);
        click = (TextView) findViewById(R.id.click);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickLogin();
            }
        });

        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    login.setEnabled(true);
                }else login.setEnabled(false)  ;

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    login.setEnabled(true);
                }else login.setEnabled(false)  ;

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void onClickLogin() {
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            username.setVisibility(View.GONE);
            password.setVisibility(View.GONE);
            login.setVisibility(View.GONE);
            register.setVisibility(View.GONE);
            not_register.setVisibility(View.GONE);
            input.setVisibility(View.GONE);
            click.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(), "Вход успешно выполнен!",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Неправильные данные. Попробуйте ещё раз!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}