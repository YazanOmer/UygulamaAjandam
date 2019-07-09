package com.example.uygulamaajandam;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OyunAdapter extends RecyclerView.Adapter<OyunAdapter.CardTasarimTutucu2>{

      private Context context;
      private List<Oyunlar> oyunlarList;

    public OyunAdapter(Context context, List<Oyunlar> oyunlarList) {
        this.context = context;
        this.oyunlarList = oyunlarList;
    }




    public class CardTasarimTutucu2 extends RecyclerView.ViewHolder {

        private ImageView oyunResim,oyunDaha;
        private TextView oyunBaslik;
        private Button oyunButon;

        public CardTasarimTutucu2 (View view){
            super(view);

            oyunBaslik=view.findViewById(R.id.oyunBaslik);
            oyunResim=view.findViewById(R.id.oyunResim);
            oyunButon=view.findViewById(R.id.oyunButon);
            oyunDaha=view.findViewById(R.id.oyunDaha);

        }

    }


    @NonNull
    @Override
    public CardTasarimTutucu2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v2= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_oyuntasarim,parent,false);

        return new CardTasarimTutucu2(v2);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardTasarimTutucu2 holder, int position) {

        final Oyunlar oyun=oyunlarList.get(position);

        holder.oyunBaslik.setText(oyun.getIsim());

        holder.oyunResim.setImageResource(context.getResources().getIdentifier(
                oyun.getResim()
                ,"drawable"
                ,context.getPackageName()

        ));


        holder.oyunDaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu=new PopupMenu(context,holder.oyunDaha);
                popupMenu.getMenuInflater().inflate(R.menu.card_oyunmenu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){
                            case R.id.action_detay:
                                {
                                    Intent i=new Intent(context,OyunDetay.class);
                                    i.putExtra("nesne",oyun);
                                    context.startActivity(i);
                                }

                            case R.id.action_kaldir :
                                {

                                }
                            default:
                                return false;
                        }

                    }
                });

                popupMenu.show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return oyunlarList.size();
    }






}
