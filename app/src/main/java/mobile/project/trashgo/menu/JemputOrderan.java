package mobile.project.trashgo.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import mobile.project.trashgo.R;

public class JemputOrderan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jemput_orderan);

        ImageView imageView = (ImageView) findViewById(R.id.truk);

        ObjectAnimator animationup = ObjectAnimator.ofFloat(imageView, "translationX", 2000f);
        animationup.setDuration(15000);
        animationup.start();

        new Timer().schedule(new TimerTask() {
            public void run() {
                JemputOrderan.this.runOnUiThread(new Runnable() {
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), MenuUtama.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }, 6000);

    }


}
