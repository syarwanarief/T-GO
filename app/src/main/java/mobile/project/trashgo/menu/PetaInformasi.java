package mobile.project.trashgo.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import mobile.project.trashgo.R;

public class PetaInformasi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peta_informasi);
    }

    public void lokasi1(View view) {
        String uri = "http://maps.google.com/maps?daddr=TPA Sampah Bakung";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(PetaInformasi.this, "Silahkan install aplikasi Google Maps terlebih dahulu", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void lokasi2(View view) {
        String uri = "http://maps.google.com/maps?daddr=TPSA Karang Anyar";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(PetaInformasi.this, "Silahkan install aplikasi Google Maps terlebih dahulu", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void lokasi3(View view) {
        String uri = "http://maps.google.com/maps?daddr=Pengelolaan Sampah Lampung Selatan";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(PetaInformasi.this, "Silahkan install aplikasi Google Maps terlebih dahulu", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void lokasi4(View view) {
        String uri = "http://maps.google.com/maps?daddr=TPA Unila";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(PetaInformasi.this, "Silahkan install aplikasi Google Maps terlebih dahulu", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void lokasi5(View view) {
        String uri = "http://maps.google.com/maps?daddr=TPA Bumiarum Pringsewu";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(PetaInformasi.this, "Silahkan install aplikasi Google Maps terlebih dahulu", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void lokasi6(View view) {
        String uri = "http://maps.google.com/maps?daddr=TPA Lubuk Kamal";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(PetaInformasi.this, "Silahkan install aplikasi Google Maps terlebih dahulu", Toast.LENGTH_LONG).show();
            }
        }
    }
}
