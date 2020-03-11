package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class monsters extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5;
    ImageView monpic1, monpic2, monpic3, monpic4, monpic5;
    Spinner spinner;
    String spin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters);

        txt = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        monpic1 = findViewById(R.id.imageView1);
        monpic2 = findViewById(R.id.imageView2);
        monpic3 = findViewById(R.id.imageView3);
        monpic4 = findViewById(R.id.imageView4);
        monpic5 = findViewById(R.id.imageView5);
        spinner = findViewById(R.id.spinner);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spin = spinner.getSelectedItem().toString();

                if (spin.equals("Slime")) {

                    Monster slime = new Monster(41,0,0,0,0,0,0,"");
                    slime.setBaseHP(25);
                    slime.setBaseMP(10);
                    slime.setDescrip("Slime");


                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(slime.getDescrip());
                    txt2.setText("ID: "+slime.getId());
                    txt3.setText("HP: "+slime.getBaseHP());
                    txt4.setText("MP: "+slime.getBaseMP());

                }

                else if (spin.equals("Goblin")) {

                    Monster goblin = new Monster(42,0,0,0,0,0,0,"");
                    goblin.setBaseHP(50);
                    goblin.setBaseMP(20);
                    goblin.setDescrip("Goblin");

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(goblin.getDescrip());
                    txt2.setText("ID: "+goblin.getId());
                    txt3.setText("HP: "+goblin.getBaseHP());
                    txt4.setText("MP: "+goblin.getBaseMP());

                }

                else if (spin.equals("Fairy")) {

                    Monster fairy = new Monster(43,0,0,0,0,0,0,"");
                    fairy.setBaseHP(50);
                    fairy.setBaseMP(20);
                    fairy.setDescrip("Fairy");

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.VISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(fairy.getDescrip());
                    txt2.setText("ID: "+fairy.getId());
                    txt3.setText("HP: "+fairy.getBaseHP());
                    txt4.setText("MP: "+fairy.getBaseMP());

                }

                else if (spin.equals("Bakunawa")){

                    Monster bakunawa = new Monster(44,100,60,50,50,20,30,
                            "Boss 1: Bakunawa-Lord of Moons");

                    bakunawa.setId(44);
                    bakunawa.setDescrip("Boss 1: Bakunawa-Lord of Moons");
                    bakunawa.setBaseHP(100);
                    bakunawa.setBaseMP(60);
                    bakunawa.setpAtk(50);
                    bakunawa.setmAtk(50);
                    bakunawa.setpDef(20);
                    bakunawa.setmDef(30);

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.VISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);


                    txt.setText(bakunawa.getDescrip());
                    txt2.setText("ID: "+bakunawa.getId());
                    txt3.setText("HP: "+bakunawa.getBaseHP()+ " MP: " +bakunawa.getBaseMP());
                    txt4.setText("Physical Attack: "+bakunawa.getpAtk()+" Physical Defense: "+bakunawa.getpDef());
                    txt5.setText("Magic Attack: "+bakunawa.getmAtk()+" Magic Defense: "+bakunawa.getmDef());

                }

                else if (spin.equals("Mayari")){

                    Monster mayari = new Monster(45,200,90,40,100,40,70,
                            "Boss 2: Mayari- Moon Goddess Fallen from Grace");

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.VISIBLE);

                    mayari.setId(45);
                    mayari.setDescrip("Boss 2: Mayari- Moon Goddess Fallen from Grace");
                    mayari.setBaseHP(200);
                    mayari.setBaseMP(90);
                    mayari.setpAtk(40);
                    mayari.setmAtk(100);
                    mayari.setpDef(40);
                    mayari.setmDef(70);

                    txt.setText(mayari.getDescrip());
                    txt2.setText("ID: "+mayari.getId());
                    txt3.setText("HP: "+mayari.getBaseHP()+ " MP: " +mayari.getBaseMP());
                    txt4.setText("Physical Attack: "+mayari.getpAtk()+" Physical Defense: "+mayari.getpDef());
                    txt5.setText("Magic Attack: "+mayari.getmAtk()+" Magic Defense: "+mayari.getmDef());

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
