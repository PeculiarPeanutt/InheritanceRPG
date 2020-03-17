package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class monsters extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5,info;
    ImageView monpic1, monpic2, monpic3, monpic4, monpic5, tab;
    DecimalFormat wholenum= new DecimalFormat("#");
    Spinner spinner;
    String spin ;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters);

        txt = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        info=findViewById(R.id.textViewInfo);
        monpic1 = findViewById(R.id.imageView28);
        monpic2 = findViewById(R.id.imageView30);
        monpic3 = findViewById(R.id.imageView31);
        monpic4 = findViewById(R.id.imageView33);
        monpic5 = findViewById(R.id.imageView3);
        tab=findViewById(R.id.imageView27);
        spinner = findViewById(R.id.spinner);
        btn=findViewById(R.id.button);



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
                    tab.setVisibility(View.INVISIBLE);
                    txt5.setVisibility(View.INVISIBLE);

                    txt.setText(slime.getDescrip());
                    txt2.setText("ID: "+slime.getId());
                    txt3.setText(""+wholenum.format(slime.getBaseHP())+"/"+wholenum.format(slime.getBaseHP()));
                    txt4.setText(""+wholenum.format(slime.getBaseMP())+"/"+wholenum.format(slime.getBaseMP()));
                    info.setText("Warning: \nWash your hands after battle!");
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
                    txt5.setVisibility(View.INVISIBLE);
                    tab.setVisibility(View.INVISIBLE);



                    txt.setText(goblin.getDescrip());
                    txt2.setText("ID: "+goblin.getId());
                    txt3.setText(""+wholenum.format(goblin.getBaseHP())+"/"+wholenum.format(goblin.getBaseHP()));
                    txt4.setText(""+wholenum.format(goblin.getBaseMP())+"/"+wholenum.format(goblin.getBaseMP()));
                    info.setText("Not the K-Drama");

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
                    tab.setVisibility(View.INVISIBLE);
                    txt5.setVisibility(View.INVISIBLE);

                    txt.setText(fairy.getDescrip());
                    txt2.setText("ID: "+fairy.getId());
                    txt3.setText(""+wholenum.format(fairy.getBaseHP())+"/"+wholenum.format(fairy.getBaseHP()));
                    txt4.setText(""+wholenum.format(fairy.getBaseMP())+"/"+wholenum.format(fairy.getBaseMP()));
                    info.setText("Hey! Look! but Don't Listen!");

                }

                else if (spin.equals("Bakunawa")){

                    Monster bakunawa = new Monster(44,100,60,50,50,20,30,
                            "Bakunawa");

                    bakunawa.setId(44);
                    bakunawa.setDescrip("Bakunawa");
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
                    tab.setVisibility(View.VISIBLE);
                    txt5.setVisibility(View.VISIBLE);


                    txt.setText(bakunawa.getDescrip());
                    txt2.setText("ID: "+bakunawa.getId());
                    txt3.setText(""+wholenum.format(bakunawa.getBaseHP())+"/"+wholenum.format(bakunawa.getBaseHP()));
                    txt4.setText(""+wholenum.format(bakunawa.getBaseMP())+"/"+wholenum.format(bakunawa.getBaseMP()));
                    txt5.setText("Physical Attack: "+wholenum.format(bakunawa.getpAtk())+"\nPhysical Defense: "+wholenum.format(bakunawa.getpDef())
                            +"\nMagic Attack: "+wholenum.format(bakunawa.getmAtk())+"\nMagic Defense: "+wholenum.format(bakunawa.getmDef()));
                    info.setText("Om nom moon eater");

                }

                else if (spin.equals("Mayari")){

                    Monster mayari = new Monster(45,200,90,40,100,40,70,
                            "Mayari");

                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.VISIBLE);
                    tab.setVisibility(View.VISIBLE);
                    txt5.setVisibility(View.VISIBLE);

                    mayari.setId(45);
                    mayari.setDescrip("Mayari");
                    mayari.setBaseHP(200);
                    mayari.setBaseMP(90);
                    mayari.setpAtk(40);
                    mayari.setmAtk(100);
                    mayari.setpDef(40);
                    mayari.setmDef(70);

                    txt.setText(mayari.getDescrip());
                    txt2.setText("ID: "+mayari.getId());
                    txt3.setText(""+wholenum.format(mayari.getBaseHP())+"/"+wholenum.format(mayari.getBaseHP()));
                    txt4.setText(""+wholenum.format(mayari.getBaseMP())+"/"+wholenum.format(mayari.getBaseMP()));
                    txt5.setText("Physical Attack: "+wholenum.format(mayari.getpAtk())+"\nPhysical Defense: "+wholenum.format(mayari.getpDef())
                            +"\nMagic Attack: "+wholenum.format(mayari.getmAtk())+"\nMagic Defense: "+wholenum.format(mayari.getmDef()));
                    info.setText("Tumblr Waifu \nUwU");

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(monsters.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
