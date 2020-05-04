package com.beightlyouch.foodsuggest;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //contentViewからidを指定して見つけてくる
        textview = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        //ボタンが押されたらどうする？リスナー登録する。Clickに聞き耳を立てている
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Food food = new Food();
                String[] foods = food.getFoods();

                Random rand = new Random();
                Log.d("LENGTH", String.valueOf(foods.length));
                int num = rand.nextInt(foods.length);
                textview.setText(foods[num]);
            }
        });
    }
}
