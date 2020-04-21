package com.example.cutomerapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class CurOrderActivity extends AppCompatActivity {


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur_order);


        Intent item = getIntent();
        int value1 = item.getExtras().getInt("num1",-1);
        if(value1 !=-1){
            int value2 = item.getExtras().getInt("num2",-1);
            int value3 = item.getExtras().getInt("num3",-1);
            int value4 = item.getExtras().getInt("num4",-1);
            int value5 = item.getExtras().getInt("num5",-1);
            int total = item.getExtras().getInt("price",-1);
            ((TextView)findViewById(R.id.cur_order_text_1)).setText("1. Glue(10EA) : "+value1 +" Order");
            ((TextView)findViewById(R.id.cur_order_text_2)).setText("2. Glue(10EA) : "+value2+" Order");
            ((TextView)findViewById(R.id.cur_order_text_3)).setText("3. Glue(10EA) : "+value3+" Order");
            ((TextView)findViewById(R.id.cur_order_text_4)).setText("4. Glue(10EA) : "+value4+" Order");
            ((TextView)findViewById(R.id.cur_order_text_5)).setText("5. Glue(10EA) : "+value5+" Order");
            ((TextView)findViewById(R.id.cur_order_text_total)).setText("Total : $"+total+".00");
            ((TextView)findViewById(R.id.cur_order_promote)).setText("Order $"+(100.00-(double)total)+" more today and get free delivery for next order!");

        }

    }

    public void goBackToMain(View view){
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

}
