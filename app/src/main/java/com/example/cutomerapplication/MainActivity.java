package com.example.cutomerapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureSearchButton();

        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawerOpen, R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

   /* public void onClickButton(View view){
        Toast toast = Toast.makeText(this,"Test",Toast.LENGTH_SHORT);
        toast.show();

    }
    */


   private void configureSearchButton(){

       Button CurOrder1 = (Button) findViewById(R.id.CurOrder1);
       CurOrder1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent (MainActivity.this, CurOrderActivity.class));
           }
       });

   }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.home:
                startActivity(new Intent (MainActivity.this, MainActivity.class));
                //Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                startActivity(new Intent (MainActivity.this, SearchActivity.class));
                //Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.orderHistory:
                startActivity(new Intent (MainActivity.this, OrderActivity.class));
                //Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.support:
                startActivity(new Intent (MainActivity.this, SupportActivity.class));
                break;
            case R.id.account:
                startActivity(new Intent (MainActivity.this, AccountActivity.class));
                break;
            case R.id.setting:
                startActivity(new Intent (MainActivity.this, SettingsActivity.class));
                break;
        }
        return false;
    }
}
