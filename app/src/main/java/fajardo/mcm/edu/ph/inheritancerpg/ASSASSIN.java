package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ASSASSIN extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assassin);

        txt = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        monpic1 = findViewById(R.id.imageView1);
        monpic2 = findViewById(R.id.imageView2);
        spinner = findViewById(R.id.spinner);
        editAdd = findViewById(R.id.editAdd);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);




    }
}
