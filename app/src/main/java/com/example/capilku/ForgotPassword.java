package com.example.capilku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    TextView namaProfile, forgotpass;
    EditText edittext_gmail, pass_gmail;
    Button masuk;
    String gmail, password_gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        namaProfile = (TextView) findViewById(R.id.namaprofile);
        forgotpass = (TextView) findViewById(R.id.forgotpass);
        edittext_gmail = (EditText) findViewById(R.id.edittext_pass);
        pass_gmail = (EditText) findViewById(R.id.pass_gmail);
        masuk = (Button) findViewById(R.id.btn_masuk);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gmail = edittext_gmail.getText().toString();
                password_gmail = pass_gmail.getText().toString();


                Intent in = new Intent(ForgotPassword.this, Main2Activity.class);
                startActivity(in);

            }
        });

    }

    public void masuk(View view) {
    }
}
