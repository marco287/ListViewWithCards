package com.example.listviewwithcards;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MonRecyclerViewAdapter extends RecyclerView.Adapter<MonRecyclerViewAdapter.ConteneurDeDonnee> {
    List<Donnee> donnees;

    public MonRecyclerViewAdapter(ArrayList<Donnee> donnees) {
        this.donnees = donnees;
    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        conteneur.tv_nom.setText(donnees.get(position).getNom());
        conteneur.tv_taille.setText(donnees.get(position).getTaille()+"");
        conteneur.picture.setImageResource(donnees.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return donnees.size();
    }

   /*public void setDetecteurDeClicSurRecycler(MainActivity detecteurDeClicSurRecycler) {
        this.detecteurDeClicSurRecycler = detecteurDeClicSurRecycler;
    } */


    public static class ConteneurDeDonnee extends RecyclerView.ViewHolder {
        TextView tv_nom;
        TextView tv_taille;
        ImageView picture;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            tv_nom = (TextView) itemView.findViewById(R.id.tv_nom);
            tv_taille = (TextView) itemView.findViewById(R.id.tv_taille);
            picture = (ImageView) itemView.findViewById(R.id.picture);


        }



        /**public void onClick(View v) {
         detecteurDeClicSurRecycler.clicSurRecyclerItem(getAdapterPosition(), v);
         }*/




    }


}
