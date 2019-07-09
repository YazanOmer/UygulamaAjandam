package com.example.uygulamaajandam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class Uygulamalar extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private NavigationView nv;
    private DrawerLayout dw;
    private Toolbar toolbar;
    private Fragment fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_uygulamalar);


        Boolean bool2=getIntent().getBooleanExtra("bool2",false);

        if(bool2){

            fr=new FragmentAltinci();

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_tutucu,fr).commit();

        }
        else {

            fr=new FragmentBirinci();

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_tutucu,fr).commit();

        }



        nv=findViewById(R.id.nv);
        dw=findViewById(R.id.dw);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, dw, toolbar,0, 0);
        dw.addDrawerListener(toggle);
        toggle.syncState();


        View headerView=nv.inflateHeaderView(R.layout.drawer_baslik);

        nv.setNavigationItemSelectedListener(this);



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();

        if(id==R.id.action_kilo){
            fr=new FragmentBirinci();

        }
        if(id==R.id.action_hesap){
            fr=new FragmentIkinci();

        }
        if(id==R.id.action_oyun){
            fr=new FragmentUcuncu();
        }

        if(id==R.id.action_film){
            fr=new FragmentDorduncu();
        }

        if(id==R.id.action_oyunlar){
            fr=new FragmentBesinci();
        }

        if(id==R.id.action_bilgi){
            fr=new FragmentAltinci();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_tutucu,fr).commit();

        dw.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public void onBackPressed() {

        if(dw.isDrawerOpen(GravityCompat.START)){
            dw.closeDrawer(GravityCompat.START);
        }

        else {
            Intent i=new Intent(Intent.ACTION_MAIN);
            i.addCategory(Intent.CATEGORY_HOME);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


            startActivity(i);
        }
    }
}
