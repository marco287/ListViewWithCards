package com.example.listviewwithcards;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private MonRecyclerViewAdapter mAdapter;
    private List<Donnee> donnees;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        //mLayoutManager=new GridLayoutManager(this,2, GridLayoutManager.VERTICAL, false);

        /** ((GridLayoutManager)mLayoutManager) .setSpanSizeLookup(
         new GridLayoutManager.SpanSizeLookup() {

        @Override public int getSpanSize(int arg0) {
        return (arg0 % 3) == 0 ? 2 : 1;
        }
        });*/


        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MonRecyclerViewAdapter(getDataSource());
        mRecyclerView.setAdapter(mAdapter);

        /** RecyclerView.ItemDecoration itemDecoration =
         new DividerItemDecoration(this, R.drawable.divider);
         mRecyclerView.addItemDecoration(itemDecoration);*/
    }

    private ArrayList<Donnee> getDataSource() {
        ArrayList results = new ArrayList<Donnee>();
        String[] noms = {"mercure", "venus", "earth", "mars", "jupiter", "saturne", "uranus", "neptune", "pluton"};
        int[] tailles = {4900, 12000, 12800, 6800, 144000, 120000, 52000, 50000, 2300};
        int[] images = {R.drawable.mercure, R.drawable.venus, R.drawable.terre, R.drawable.mars, R.drawable.jupiter, R.drawable.saturne, R.drawable.uranus, R.drawable.nepturne, R.drawable.pluton};
        for (int i = 0; i < noms.length; i++) {
            results.add(new Donnee(noms[i], tailles[i], images[i]));

        }
        return results;

    }
}
