package com.example.cutomerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NewOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
        FloatingActionButton floatingActionButton =
                (FloatingActionButton) findViewById(R.id.new_order_back);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void orderNow(View view){
        startActivity(new Intent(this,CurOrderActivity.class));
        finish();
    }

    public void increase(View view){
        TextView orderText = null;
        switch(view.getId()){
            case R.id.new_order_increase_1:
                orderText = (TextView)findViewById(R.id.new_order_text_1);
                break;
            case R.id.new_order_increase_2:
                orderText = (TextView)findViewById(R.id.new_order_text_2);
                break;
            case R.id.new_order_increase_3:
                orderText = (TextView)findViewById(R.id.new_order_text_3);
                break;
            case R.id.new_order_increase_4:
                orderText = (TextView)findViewById(R.id.new_order_text_4);
                break;
            case R.id.new_order_increase_5:
                orderText = (TextView)findViewById(R.id.new_order_text_5);
                break;
        }
        orderText.setText(""+(Integer.parseInt(orderText.getText().toString()) + 1));
    }
    public void decrease(View view){
        TextView orderText = null;
        switch(view.getId()){
            case R.id.new_order_decrese_1:
                orderText = (TextView)findViewById(R.id.new_order_text_1);
                break;
            case R.id.new_order_decrese_2:
                orderText = (TextView)findViewById(R.id.new_order_text_2);
                break;
            case R.id.new_order_decrese_3:
                orderText = (TextView)findViewById(R.id.new_order_text_3);
                break;
            case R.id.new_order_decrese_4:
                orderText = (TextView)findViewById(R.id.new_order_text_4);
                break;
            case R.id.new_order_decrese_5:
                orderText = (TextView)findViewById(R.id.new_order_text_5);
                break;
        }
        int value = Integer.parseInt(orderText.getText().toString());
        if(value != 0){
            value --;
        }
        orderText.setText(""+value);

    }
}
