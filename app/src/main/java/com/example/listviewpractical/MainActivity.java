package com.example.listviewpractical;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<UserDetails> list;
MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list=new ArrayList<>();
        list.add(new UserDetails("Varad", "Varad@gmail.com", "21"));
        list.add(new UserDetails("Rahul", "Rahul123@gmail.com", "22"));
        list.add(new UserDetails("Aditi", "Aditi.k@gmail.com", "20"));
        list.add(new UserDetails("Soham", "soham99@yahoo.com", "23"));
        list.add(new UserDetails("Pooja", "pooja.raj@gmail.com", "24"));
        list.add(new UserDetails("Amit", "amit12@gmail.com", "25"));
        list.add(new UserDetails("Neha", "neha45@gmail.com", "22"));
        list.add(new UserDetails("Kunal", "kunal.shah@gmail.com", "23"));
        list.add(new UserDetails("Riyan", "riyan.parag@gmail.com", "21"));
        list.add(new UserDetails("Manoj", "manoj34@gmail.com", "26"));
        list.add(new UserDetails("Shruti", "shruti.jain@gmail.com", "22"));
        list.add(new UserDetails("Vikas", "vikas.tiwari@gmail.com", "27"));
        list.add(new UserDetails("Nisha", "nisha.mittal@gmail.com", "24"));
        list.add(new UserDetails("Pranav", "pranav.patil@gmail.com", "23"));
        list.add(new UserDetails("Deepika", "deepika.k@gmail.com", "25"));
        list.add(new UserDetails("Rohan", "rohan.mehta@gmail.com", "22"));
        list.add(new UserDetails("Sneha", "sneha.kulkarni@gmail.com", "21"));
        list.add(new UserDetails("Aniket", "aniket.singh@gmail.com", "24"));
        list.add(new UserDetails("Meera", "meera.nair@gmail.com", "23"));
        list.add(new UserDetails("Harsh", "harsh.agarwal@gmail.com", "26"));


        myAdapter=new MyAdapter(list);
        recyclerView.setAdapter(myAdapter);


    }
}