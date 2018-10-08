package app.iqbal.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import app.iqbal.kumpulanhadits.model.Doa;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lytMain;
    private List<Doa> doas = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lytMain = (LinearLayout) findViewById(R.id.lyt_main);
        clickMe();
    }

    private void clickMe() {
        lytMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(moveIntent);
            }
        });
    }

    private void doaCollections() {
        doas.add(new Doa("Doa Masuk Masjid", "Arti doa masuk masjid", "googling"));
    }
}
