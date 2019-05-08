package com.verifone.tony.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.verifone.tony.uitest.adapter.FruitAdapterRecycler;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        //顺序
/*        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterRecycler fruitAdapterRecycler = new FruitAdapterRecycler(fruitList);
        recyclerView.setAdapter(fruitAdapterRecycler);*/

        //网格
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterRecycler fruitAdapterRecycler = new FruitAdapterRecycler(fruitList);
        recyclerView.setAdapter(fruitAdapterRecycler);
    }

    private void initFruits() {
        for (int i=0; i<20; i++) {
            Fruit apple = new Fruit("Apple", R.mipmap.apple);
            Fruit mango = new Fruit("Mango", R.mipmap.mongo);
            Fruit banana = new Fruit("Banana", R.mipmap.banana);

            fruitList.add(apple);
            fruitList.add(mango);
            fruitList.add(banana);
        }
    }
}
