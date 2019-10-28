package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;
    List<SuperHero> superHeroList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);
//        SuperHero hero = new SuperHero("Devilew");
//        superHeroList.add(hero);
//        hero = new SuperHero("Devilux");
//        superHeroList.add(hero);
//        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(superHeroList);
//        rvSuperHero.setAdapter(superHeroAdapter);
//        LinearLayoutManager layoutManager
//                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        rvSuperHero.setLayoutManager(layoutManager);

        for (int i=0;i<=17;i++){
            superHeroList.add(new SuperHero("-","Devilew"));
        }
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(getApplication(),superHeroList);
        rvSuperHero.setAdapter(superHeroAdapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL, false);
        rvSuperHero.setLayoutManager(layoutManager);
    }
}
