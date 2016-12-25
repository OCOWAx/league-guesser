package com.ocowagames.league_of_legends_item_price_guesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button order,roulette,building;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order = (Button)findViewById(R.id.button_order);
        order.setOnClickListener(this);

        roulette = (Button)findViewById(R.id.button_roulette);
        roulette.setOnClickListener(this);

        building = (Button)findViewById(R.id.button_building);
        building.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == order.getId()){
            startActivity(new Intent(MainActivity.this,Order.class));
        }else if(v.getId() == roulette.getId()){
            startActivity(new Intent(MainActivity.this,Roulette.class));
        }else if(v.getId() == building.getId()){
            startActivity(new Intent(MainActivity.this,Building.class));
        }

    }
}
