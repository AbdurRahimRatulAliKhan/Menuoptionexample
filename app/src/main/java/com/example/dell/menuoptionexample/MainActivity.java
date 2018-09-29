package com.example.dell.menuoptionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home_btn){
            Toast.makeText(this, "You click home button", Toast.LENGTH_SHORT).show();
            return true;


        }

        if (id == R.id.about_us){
            Toast.makeText(this, "You click about us", Toast.LENGTH_SHORT).show();
            return true;


        }

        if (id == R.id.exit_btn){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
