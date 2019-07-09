package com.example.uygulamaajandam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.cardTasarimTutucu> {
    private Context mContext;
    private List<Filmler> filmListe;

    public MyAdapter(Context mContext, List<Filmler> filmListe) {
        this.mContext = mContext;
        this.filmListe = filmListe;
    }




    public class cardTasarimTutucu extends RecyclerView.ViewHolder{

        private ImageView cardResim;
        private TextView  cardİsim,cardFiyat;
        private Button    cardButon;

        public cardTasarimTutucu(View view){
            super(view);

            cardResim=view.findViewById(R.id.cardResim);
            cardİsim=view.findViewById(R.id.cardBaslik);

            cardButon=view.findViewById(R.id.cardButon);

        }

    }

    @NonNull
    @Override
    public cardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim,parent,false);

        return new cardTasarimTutucu(v);
    }

    @Override
    public void onBindViewHolder(@NonNull cardTasarimTutucu holder, int position) {

        final Filmler film=filmListe.get(position);

        holder.cardİsim.setText(film.getIsim());


        holder.cardResim.setImageResource(mContext.getResources().getIdentifier(
                film.getResim()
                ,"drawable"
                ,mContext.getPackageName()

        ));




    }

    @Override
    public int getItemCount() {
        return filmListe.size();
    }



}
