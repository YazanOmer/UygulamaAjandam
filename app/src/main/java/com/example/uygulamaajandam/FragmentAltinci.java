package com.example.uygulamaajandam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentAltinci extends Fragment {

    private EditText editKullanici,editMail,editSifre,editSifre2;
    private TextView sifreSorun2,sifreDurum2;
    private SeekBar  seekBar2;
    private Button   sifreDegistir2;
    private String   isim,mail,s3,s4;
    private Bilgiler bilgiler;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewroot7=inflater.inflate(R.layout.fragment_altinci_layout,container,false);


        editKullanici=viewroot7.findViewById(R.id.editText3);
        editMail=viewroot7.findViewById(R.id.editText4);
        editSifre=viewroot7.findViewById(R.id.editText5);
        editSifre2=viewroot7.findViewById(R.id.editText6);
        sifreSorun2=viewroot7.findViewById(R.id.sifreSorun2);
        sifreDurum2=viewroot7.findViewById(R.id.sifreDurum2);
        seekBar2=viewroot7.findViewById(R.id.seekBar2);
        sifreDegistir2=viewroot7.findViewById(R.id.sifreDegistir2);




        editSifre.addTextChangedListener(new TextWatcher() {
            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                s3=editSifre.getText().toString();

                seekBar2.setProgress(s3.length());

                if(s3.length()<6){
                    sifreDurum2.setText("Sifre zayif");
                    sifreDurum2.setTextColor(Color.RED);
                }
                else if(6<=s3.length()&&s3.length()<8){
                    sifreDurum2.setText("Sifre normal");
                    sifreDurum2.setTextColor(Color.YELLOW);
                }
                else {
                    sifreDurum2.setText("Sifre Güclü");
                    sifreDurum2.setTextColor(Color.GREEN);
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        editSifre2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                s4=editSifre2.getText().toString();
                if(s4.equals(s3)){
                    sifreSorun2.setText("Sifreler aynı");
                }
                else{
                    sifreSorun2.setText("Sifreler uyusmuyor");
                }




            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        sifreDegistir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Şifre başarıyla değiştirildi",Toast.LENGTH_SHORT).show();

                    isim=editKullanici.getText().toString();
                    mail=editMail.getText().toString();


                    Intent i3=new Intent(getContext(),MainActivity.class);
                    bilgiler=new Bilgiler(isim,s3,mail);
                    i3.putExtra("bilgi",bilgiler);
                    i3.putExtra("boolean",true);


                    startActivity(i3);




            }
        });







        return viewroot7;
    }
}
