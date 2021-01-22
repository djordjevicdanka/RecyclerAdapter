package com.example.app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    String [] name = {

            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",
            "User7",
            "User8",
            "User9",
            "User10",
            "User11",

    };

    String [] desc = {

            "Description1",
            "Description2",
            "Description3",
            "Description4",
            "Description5",
            "Description6",
            "Description7",
            "Description8",
            "Description9",
            "Description10",
            "Description11",


    };

    int [] image = {

            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,

    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    toolbar = (Toolbar) findViewById(R.id.toolbar);


    recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);

        List<User> sampleuser = new ArrayList<>();

        for (int i=0; i<name.length; i++){

            User user = new User();

            user.username= name[i];
            user.userdesc= desc[i];
            user.userimage= image[i];

            sampleuser.add(user);

        }

       LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

       recyclerView.setLayoutManager(linearLayoutManager);

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        //recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getBaseContext(), sampleuser));



    }




}