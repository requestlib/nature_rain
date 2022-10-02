package com.example.naturerain;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import com.example.naturerain.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button hellobtn = (Button) findViewById(R.id.hellobutton);
        hellobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView hellotv = (TextView) findViewById(R.id.hellotextView);
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                hellotv.setText(R.string.interact_message);
            }
        });
    }

}