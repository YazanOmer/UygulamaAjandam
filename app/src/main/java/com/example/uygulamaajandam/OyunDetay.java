package com.example.uygulamaajandam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class OyunDetay extends AppCompatActivity {
    private ImageView oyunDetayResim;
    private TextView oyunDetayİsim,oyunDetayFiyat;
    private RatingBar ratingBar;
    private Oyunlar oyun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_detay);

        oyunDetayResim=findViewById(R.id.oyunDetayResim);
        oyunDetayİsim=findViewById(R.id.oyunDetayİsim);
        oyunDetayFiyat=findViewById(R.id.oyunDetayFiyat);
        ratingBar=findViewById(R.id.ratingBar);

        oyun=(Oyunlar)getIntent().getSerializableExtra("nesne");

        oyunDetayResim.setImageResource(getResources().getIdentifier(
                oyun.getResim()
                ,"drawable"
                ,getPackageName()

        ));

        oyunDetayİsim.setText(oyun.getIsim());
        oyunDetayFiyat.setText(String.valueOf(oyun.getFiyat()));

        ratingBar.setRating((float) oyun.getOy());








    }
}
