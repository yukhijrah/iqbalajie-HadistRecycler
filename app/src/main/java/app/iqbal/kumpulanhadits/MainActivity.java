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
    private LinearLayout doaMain;
    private List<Doa> doas = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doaMain = (LinearLayout) findViewById(R.id.doa_main);
        clickMe();
    }

    private void clickMe() {
        doaMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(moveIntent);
                doaCollections();
            }
        });
    }

    private void doaCollections() {
        doas.add(new Doa("test1", "tost1", "waeweawewa"));
        doas.add(new Doa("test2", "tost2", "sjdahjksdj"));
        doas.add(new Doa("test3", "tost3", "dgsdqgGfaf"));
        doas.add(new Doa("test4", "tost4", "sfhdafeehh"));
        doas.add(new Doa("test5", "tost5", "adgdfndQRA"));

    }
}
