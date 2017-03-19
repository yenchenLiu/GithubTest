package com.example.daychen.androidgo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.action_jump_activity2) {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
            Log.d("click", "open activity2");
            return true;
        }
        else if(itemThatWasClickedId == R.id.action_jump_activity3){
            Intent intent = new Intent(this, Activity3.class);
            startActivity(intent);
            Log.d("click", "open activity3");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
