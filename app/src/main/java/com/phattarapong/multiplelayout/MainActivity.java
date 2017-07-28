package com.phattarapong.multiplelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.phattarapong.multiplelayout.adapter.MultipleLayoutRecyclerAdapter;
import com.phattarapong.multiplelayout.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        List items = new ArrayList();
        for(int i =0;i<=10;i++){
            items.add(new Item("I am EditText : " +i,Item.TYPE_EDITTEXT));
            items.add(new Item("I am ImageView : " +i,Item.TYPE_IMAGEVIEW));
            items.add(new Item("I am TextView : " +i,Item.TYPE_TEXTVIEW));
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.Adapter adapter = new MultipleLayoutRecyclerAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
