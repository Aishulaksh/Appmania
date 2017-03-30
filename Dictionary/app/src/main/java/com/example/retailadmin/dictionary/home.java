package com.example.retailadmin.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ArrayList<String> name=new ArrayList<>();
        name.addAll(Arrays.asList(getResources().getStringArray(R.array.Names)));
    }
public boolean onCreateOptionsMenu(Menu menu){
    MenuInflater inflater=getMenuInflater();
    inflater.inflate(R.menu.menu_search,menu);
    MenuItem item=menu.findItem(R.id.menuSearch);
    SearchView searchView=(SearchView)item.getActionView();
    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        
        @Override
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
           // adapter.getfilter().filter(newText);
            return false;
        }
    });
    return super.onCreateOptionsMenu(menu);
}
}
