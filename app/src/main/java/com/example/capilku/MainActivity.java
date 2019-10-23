package com.example.capilku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    TextView tv_ForgetPass, login_title;
    EditText edittext_username, edittext_pass;
    ImageView user_profile_photo;
    String user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        tv_ForgetPass = (TextView) findViewById(R.id.tv_ForgetPass);
        login_title = (TextView) findViewById(R.id.login_title);
        edittext_username = (EditText) findViewById(R.id.edittext_username);
        edittext_pass = (EditText) findViewById(R.id.edittext_pass);
        user_profile_photo = (ImageView) findViewById(R.id.user_profile_photo);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = edittext_username.getText().toString();
                pass = edittext_pass.getText().toString();


                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(in);

            }
        });

    }

    public void profile(View view) {
    }

    public void aplikasi(View view) {
    }
}
