package com.example.cutomerapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceFragmentCompat;

import com.google.android.material.navigation.NavigationView;

import java.util.Set;

public class SettingsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

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


    //FIX THIS!
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                startActivity(new Intent(SettingsActivity.this, MainActivity.class));
                //Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.search:
                startActivity(new Intent(SettingsActivity.this, SearchActivity.class));
                //Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.orderHistory:
                startActivity(new Intent(SettingsActivity.this, OrderActivity.class));
                //Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.support:
                startActivity(new Intent(SettingsActivity.this, SupportActivity.class));
                finish();
                break;
            case R.id.account:
                startActivity(new Intent(SettingsActivity.this, AccountActivity.class));
                finish();
                break;
            case R.id.setting:
                //startActivity(new Intent(SettingsActivity.this, SettingsActivity.class));
                break;
        }
        return false;
    }


    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}