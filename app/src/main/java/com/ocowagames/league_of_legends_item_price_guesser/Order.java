package com.ocowagames.league_of_legends_item_price_guesser;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Derek on 12/25/2016.
 */

public class Order extends AppCompatActivity implements View.OnClickListener{

    ImageView itemIcon;
    EditText guess;
    Button confirm;
    TextView theScore;
    int score = 0;
    Item[] items;
    int increment=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setItemOrder();
        itemIcon = (ImageView)findViewById(R.id.item_icon);
        guess = (EditText)findViewById(R.id.guess);

        confirm = (Button)findViewById(R.id.confirm);
        confirm.setOnClickListener(this);

        theScore = (TextView)findViewById(R.id.score);




    }
    private void setItemOrder(){

        items = new Item[157];
        Item healthpotion = new Item(R.mipmap.health_potion_item,50);
        Item refillablepotion = new Item(R.mipmap.refillable_potion_item,150);
        Item abyssalscepter = new Item(R.mipmap.abyssal_scepter_item,2750);
        items[0] = healthpotion;
        items[1] = refillablepotion;
        items[2] = abyssalscepter;
    }

    private void nextItem(){
        increment++;
        itemIcon.setImageResource(items[increment].getDrawableId());
    }
    private void updateScore(){
        score++;
        theScore.setText("Your score is:\n" + score);
    }
    private boolean checkGuess(){

        if(Integer.parseInt(guess.getText().toString()) == items[increment].getPrice())
            return true;
        return false;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == confirm.getId()){
            if(checkGuess()){
                updateScore();
            }
            nextItem();
            System.out.println(Integer.parseInt(guess.getText().toString()));
            System.out.println(items[increment].getPrice());

        }


    }
}
