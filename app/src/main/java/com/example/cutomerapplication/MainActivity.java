package com.example.cutomerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureSearchButton();


    }

   /* public void onClickButton(View view){
        Toast toast = Toast.makeText(this,"Test",Toast.LENGTH_SHORT);
        toast.show();

    }
    */


   private void configureSearchButton(){

       Button searchButton = (Button) findViewById(R.id.searchButton);
       searchButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent (MainActivity.this, SearchActivity.class));
           }
       });

   }
}
