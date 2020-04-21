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
        Intent item = new Intent(this,CurOrderActivity.class);
        int orderNum1 = Integer.parseInt(((TextView)findViewById(R.id.new_order_text_1)).getText().toString());
        int orderNum2 = Integer.parseInt(((TextView)findViewById(R.id.new_order_text_2)).getText().toString());
        int orderNum3 = Integer.parseInt(((TextView)findViewById(R.id.new_order_text_3)).getText().toString());
        int orderNum4 = Integer.parseInt(((TextView)findViewById(R.id.new_order_text_4)).getText().toString());
        int orderNum5 = Integer.parseInt(((TextView)findViewById(R.id.new_order_text_5)).getText().toString());
        int price = orderNum1+orderNum2+orderNum3+orderNum4+orderNum5;
        item.putExtra("num1",orderNum1);
        item.putExtra("num2",orderNum2);
        item.putExtra("num3",orderNum3);
        item.putExtra("num4",orderNum4);
        item.putExtra("num5",orderNum5);
        item.putExtra("price",price);
        startActivity(item);
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
