package com.example.uygulamaajandam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class MainActivity extends AppCompatActivity{
    private Button buttonGirisYap;
    private EditText inputKullaniciAdi,inputSifre;
    private String kullaniciAdi,sifre,mail;
    private Bilgiler gelenBilgi;
    private String gelenBilgi2;
    private Boolean sonuc,sonuc2,sonuc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGirisYap=findViewById(R.id.buttonGirisYap);
        inputKullaniciAdi=findViewById(R.id.inputKullaniciAdi);
        inputSifre=findViewById(R.id.inputSifre);






        sonuc=getIntent().getBooleanExtra("boolean",false);

        gelenBilgi=(Bilgiler)getIntent().getSerializableExtra("bilgi");


        if(!sonuc){


            kullaniciAdi="admin";
            sifre="admin";
            mail="";
            sonuc2=true;
        }
        else  {


            kullaniciAdi=gelenBilgi.getKullaniciAdi();
            sifre=gelenBilgi.getSifre();
            sonuc2=false;


        }




        buttonGirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputK=inputKullaniciAdi.getText().toString();
                String inputS=inputSifre.getText().toString();

                if(inputK.equals(kullaniciAdi)&&inputS.equals(sifre)){
                    Intent i=new Intent(MainActivity.this,Uygulamalar.class);
                    i.putExtra("bool2",sonuc2);
                    startActivity(i);


                }else{




                    Snackbar snackbar=Snackbar.make(view,"Şifreniz Yanlış", Snackbar.LENGTH_LONG).setAction("Şifre Değiştir", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                           // Intent i=new Intent(MainActivity.this,SifreActivity.class);
                            //startActivity(i);

                        }
                    });

                    snackbar.setActionTextColor(Color.RED);

                    View vi=snackbar.getView();
                    TextView textView=vi.findViewById(com.google.android.material.R.id.snackbar_text);

                    textView.setTextColor(Color.GREEN);

                    snackbar.show();

                }

            }
        });



    }
}
