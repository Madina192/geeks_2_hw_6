package com.example.geeks_2_hw_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton button = findViewById(R.id.button);
        EditText editText1 = findViewById(R.id.ed_1);
        EditText editText2 = findViewById(R.id.ed_2);
        TextView resetPassword = findViewById(R.id.tx_reset_password);
        TextView textDescr = findViewById(R.id.tx_descr);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("admin") && editText2.getText().toString().equals("admin")) {
                    editText1.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    resetPassword.setVisibility(View.GONE);
                    textDescr.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Вы ввели неправильный логин или пароль!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText1.getText().toString().isEmpty()) {
                    button.setBackground(getResources().getDrawable(R.drawable.btn_login));
                } else{
                    button.setBackground(getResources().getDrawable(R.drawable.btn_login_brown));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText2.getText().toString().isEmpty()) {
                    button.setBackground(getResources().getDrawable(R.drawable.btn_login));
                } else{
                    button.setBackground(getResources().getDrawable(R.drawable.btn_login_brown));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}