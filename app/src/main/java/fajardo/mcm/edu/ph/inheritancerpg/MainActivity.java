package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2, monpic3, monpic4, monpic5;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        monpic1 = findViewById(R.id.imageView1);
        monpic2 = findViewById(R.id.imageView2);
        monpic3 = findViewById(R.id.imageView3);
        monpic4 = findViewById(R.id.imageView4);
        monpic5 = findViewById(R.id.imageView5);
        spinner = findViewById(R.id.spinner);
        editAdd = findViewById(R.id.editAdd);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spin = spinner.getSelectedItem().toString();

                if (spin.equals("Rabbit Assassin")) {

                    Hero assassin = new Hero(1,200,100,50,25,35,15,"Assassin",1,
                            1,0,30,50,20,0.50,0.80,0.25, 0.05);


                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(assassin.getHeroClass());
                    txt2.setText("ID: "+assassin.getId());
                    txt3.setText("HP: "+assassin.getBaseHP()+" MP: "+assassin.getBaseMP());
                    txt4.setText("pAtk: "+assassin.getpAtk()+" pDef: "+assassin.getpDef()+"\nmAtk: "+assassin.getmAtk()+" mDef: "+assassin.getmDef());

                }

                else if (spin.equals("Warrior")) {

                    Hero warrior =  new Hero(2,200,100,60,10,30,20,"Warrior",2,
                            1,0,55,20,25,0.90,0.25,0.25,0.03);

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(warrior.getHeroClass());
                    txt2.setText("ID: "+warrior.getId());
                    txt3.setText("HP: "+warrior.getBaseHP()+" MP: "+warrior.getBaseMP());
                    txt4.setText("pAtk: "+warrior.getpAtk()+" pDef: "+warrior.getpDef()+"\nmAtk: "+warrior.getmAtk()+" mDef: "+warrior.getmDef());

                }

                else if (spin.equals("Healer")) {


                    Hero healer =  new Hero(3,200,100,20,60,15,35,"Healer",3,
                            1,0,20,30,50,0.80,0.25,0.25,0.05);

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.VISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(healer.getHeroClass());
                    txt2.setText("ID: "+healer.getId());
                    txt3.setText("HP: "+healer.getBaseHP()+" MP: "+healer.getBaseMP());
                    txt4.setText("pAtk: "+healer.getpAtk()+" pDef: "+healer.getpDef()+"\nmAtk: "+healer.getmAtk()+" mDef: "+healer.getmDef());

                }

                else if (spin.equals("Dragonoid")){

                    Hero dragonoid = new Hero(4,200,100,40,30,30,20,"Dragonoid",4,
                            0,0,0,0,0,0,0,0,0.05);
                    

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.VISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);


                    txt.setText(dragonoid.getHeroClass());
                    txt2.setText("ID: "+dragonoid.getId());
                    txt3.setText("HP: "+dragonoid.getBaseHP()+" MP: "+dragonoid.getBaseMP());
                    txt4.setText("pAtk: "+dragonoid.getpAtk()+" pDef: "+dragonoid.getpDef()+"\nmAtk: "+dragonoid.getmAtk()+" mDef: "+dragonoid.getmDef());

                }

                else if (spin.equals("Gunner")){

                    Hero Gunner = new Hero(5,200,100,40,20,50,30,"Gunner",5,
                            1,0,20,60,20,0.20,0.90,0.20,0.09);



                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.VISIBLE);



                    txt.setText(Gunner.getHeroClass());
                    txt2.setText("ID: "+Gunner.getId());
                    txt3.setText("HP: "+Gunner.getBaseHP()+" MP: "+Gunner.getBaseMP());
                    txt4.setText("pAtk: "+Gunner.getpAtk()+" pDef: "+Gunner.getpDef()+"\nmAtk: "+Gunner.getmAtk()+" mDef: "+Gunner.getmDef());

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        
        




    }

}
