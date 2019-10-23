package com.example.capilku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView NamaProfile, textview_penjelasan, dev, fathimah, sofianida;
    ImageView imageProfile;
    Button btnProfile, btnAplikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        NamaProfile = (TextView) findViewById(R.id.NamaProfile);
        imageProfile = (ImageView) findViewById(R.id.imageProfile);
        textview_penjelasan = (TextView) findViewById(R.id.textview_penjelasan);
        dev = (TextView) findViewById(R.id.dev);
        fathimah = (TextView) findViewById(R.id.fathimah);
        sofianida = (TextView) findViewById(R.id.sofianida);
        btnProfile = (Button) findViewById(R.id.btnProfile);
        btnAplikasi = (Button) findViewById(R.id.btnAplikasi);


        Intent in = getIntent();

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://dukcapil.kemendagri.go.id/"));
                startActivity(intent);

            }
        });


        btnAplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Main2Activity.this, Permohonan.class);
                startActivity(in);
            }
        });

    }


}
