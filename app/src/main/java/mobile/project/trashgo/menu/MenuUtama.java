package mobile.project.trashgo.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import mobile.project.trashgo.R;
import mobile.project.trashgo.user.Login;

public class MenuUtama extends AppCompatActivity {

    //loginsession
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Pass = "passKey";
    public static final String Emaill = "emailKey";
    SharedPreferences sharedpreferences;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_navigasi, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.maps:
                startActivity(new Intent(this, PetaInformasi.class));
                return true;
            case R.id.tentang:
                startActivity(new Intent(this, Tentang.class));
                return true;
            case R.id.logout:
                Intent intent4 = new Intent(this, Login.class);
                sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.remove(Emaill);
                editor.remove(Pass);
                editor.commit();
                startActivity(intent4);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    boolean doubleBackToExitPressedOnce = false;

    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan Kembali Untuk Keluar Aplikasi", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    public void jemputSampah(View view) {
        Intent jemputSampah = new Intent(this,JemputSampah.class);
        startActivity(jemputSampah);
    }

    public void petaInformasi(View view) {
        Intent petaInformasi = new Intent(this,PetaInformasi.class);
        startActivity(petaInformasi);
    }

    public void menuRongsok(View view) {
        Intent rongsok = new Intent(this, MenuRongsok.class);
        startActivity(rongsok);
    }
}
