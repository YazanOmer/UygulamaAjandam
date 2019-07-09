package com.example.uygulamaajandam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textViewSonuc;
    private Button buttonTekrar;
    private boolean sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);



        imageView=findViewById(R.id.imageView2);
        textViewSonuc=findViewById(R.id.textViewSonuc);
        buttonTekrar=findViewById(R.id.buttonTekrar);


        sonuc=getIntent().getBooleanExtra("sonuc",false);

        if(sonuc){

            imageView.setImageResource(R.drawable.gulen_surat);
            textViewSonuc.setText("Kazandınız");
        }
        else{
            imageView.setImageResource(R.drawable.gulmeyen_surat);
            textViewSonuc.setText("Kaybettiniz");
            textViewSonuc.setTextColor(Color.BLACK);
        }







        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SonucActivity.this,TahminActivity.class);
                startActivity(i);
                finish();
            }
        });



    }
}
