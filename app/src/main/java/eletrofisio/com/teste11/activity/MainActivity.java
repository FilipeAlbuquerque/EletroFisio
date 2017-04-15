package eletrofisio.com.teste11.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.fragments.AparelhosFragment;
import eletrofisio.com.teste11.fragments.ClassificFragment;
import eletrofisio.com.teste11.fragments.ContraIndicacaoFragment;
import eletrofisio.com.teste11.fragments.FaseAgudaFragment;
import eletrofisio.com.teste11.fragments.FaseCronicaFragment;
import eletrofisio.com.teste11.fragments.FonoforeseFragment;
import eletrofisio.com.teste11.fragments.IndicacoesFragment;
import eletrofisio.com.teste11.fragments.InicioFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //Chamando a tela Inicio
        InicioFragment inicioFragment = new InicioFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.relativelayout_for_fragment, inicioFragment,
                inicioFragment.getTag())
                .commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


       /* int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.ic_inicio) {
            // Chamando a home
            InicioFragment inicioFragment = new InicioFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, inicioFragment,
                    inicioFragment.getTag())
                    .commit();



        } else if (id == R.id.nav_aparelhos) {

            //Toast.makeText(this, "Gallery",Toast.LENGTH_LONG ).show();
            AparelhosFragment aparelhosFragment = AparelhosFragment.newInstance("some1", "some2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, aparelhosFragment,
                    aparelhosFragment.getTag())
                    .commit();


        } else if (id == R.id.ic_contra) {

            //Toast.makeText(this, "Contra-Indicações", Toast.LENGTH_LONG).show();
            ContraIndicacaoFragment contraIndicacaoFragment = ContraIndicacaoFragment.newInstance("some1", "some2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, contraIndicacaoFragment,
                    contraIndicacaoFragment.getTag())
                    .commit();

        }else if (id == R.id.ic_indicacoes) {

            //Toast.makeText(this, "Contra-Indicações", Toast.LENGTH_LONG).show();
            IndicacoesFragment indicacoesFragment = IndicacoesFragment.newInstance("some1", "some2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, indicacoesFragment,
                    indicacoesFragment.getTag())
                    .commit();

         }else if (id == R.id.fase_aguda) {

        //Toast.makeText(this, "Contra-Indicações", Toast.LENGTH_LONG).show();
        FaseAgudaFragment faseAgudaFragment = FaseAgudaFragment.newInstance("some1", "some2");
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.relativelayout_for_fragment, faseAgudaFragment,
                faseAgudaFragment.getTag())
                .commit();

    } else if (id == R.id.fase_cronica) {

            FaseCronicaFragment faseCronicaFragment = FaseCronicaFragment.newInstance("some1", "some2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, faseCronicaFragment,
                    faseCronicaFragment.getTag())
                    .commit();

    }else if (id == R.id.id_fonoforese){

            FonoforeseFragment fonoforeseFragment = FonoforeseFragment.newInstance("some1", "some2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, fonoforeseFragment,
                    fonoforeseFragment.getTag())
                    .commit();

    }else if (id == R.id.id_classific){


            ClassificFragment classificFragment = ClassificFragment.newInstance("some 1", "some 2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_for_fragment, classificFragment,
                    classificFragment.getTag())
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /*// Manipulando o ciclo de vida da Activity
    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(getApplicationContext(), "onStart metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(getApplicationContext(), "onRestart metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(getApplicationContext(), "onResume metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(getApplicationContext(), "onPause metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(getApplicationContext(), "onStop metodo chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(), "onDestroy metodo chamado", Toast.LENGTH_SHORT).show();
    }*/

}
