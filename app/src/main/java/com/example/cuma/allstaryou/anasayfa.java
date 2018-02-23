package com.example.cuma.allstaryou;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class anasayfa extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle("Fragment One"); //this will set title of Action Bar
                    videoFragment fragment1 = new videoFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.fram, fragment1, "Fragment One");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction1.commit();
                    return true;
                case R.id.navigation_dashboard:
                    setTitle("Fragment Two");
                    topFragment fragment2 = new topFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.fram, fragment2, "FragmentTwo");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_notifications:
                    setTitle("Fragment Three");
                    gorevFragment fragment3 = new gorevFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.fram, fragment3, "FragmentThree");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }
    };
    /*Buralar yapılacak*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

         BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setTitle("Fragment One"); //this will set title of Action Bar
        videoFragment fragment1 = new videoFragment();
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.fram, fragment1, "Fragment One");  //create first framelayout with id fram in the activity where fragments will be displayed
        fragmentTransaction1.commit();
    }

}
