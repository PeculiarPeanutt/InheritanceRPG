package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstAct extends AppCompatActivity {

    Button herobtn, monsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        herobtn = findViewById(R.id.herobtn);
        monsbtn = findViewById(R.id.mnsbtn);


        herobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(firstAct.this, MainActivity.class);
                startActivity(intent);

            }
        });

        monsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(firstAct.this, monsters.class);
                startActivity(intent);

            }
        });


    }
}
