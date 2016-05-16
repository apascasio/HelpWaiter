package org.pascasio.helpwaiter;


import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
        , ListFood.OnFragmentInteractionListener,TableList.OnFragmentInteractionListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        Fragment fm;
        FragmentTransaction ft;

        ft = getSupportFragmentManager().beginTransaction();
        boolean FragmentTransaction = false;
        switch (id){
            case R.id.mesas:
                ft.replace(R.id.contenedor, new TableList());

                break;
            case R.id.platos:
                ft.replace(R.id.platos, new ListFood());
                break;
        }
        ft.commit();

        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
