package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2, monpic3, monpic4, monpic5;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;

    //hero

    Hero assassin = new Hero(1,200,100,50,25,35,15,"Rabbit Assassin",1,
            1,0,30,50,20,0.50,0.80,0.25, 0.05);

    Hero warrior =  new Hero(2,200,100,60,10,30,20,"Warrior",2,
            1,0,55,20,25,0.90,0.25,0.25,0.03);

    Hero healer =  new Hero(3,200,100,20,60,15,35,"Healer",3,
            1,0,20,30,50,0.80,0.25,0.25,0.05);

    Hero gunner = new Hero(5,200,100,40,20,50,30,"Gunner",5,
            1,0,20,60,20,0.20,0.90,0.20,0.09);

    Hero dragonoid = new Hero(4,200,100,40,30,30,20,"Dragonoid",4,
            1,0,20,50,30,0.80,0.25,0.50,0.05);


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


                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    //layout display
                    txt.setText(assassin.getHeroClass());
                    txt2.setText("ID: "+idstart+assassin.getHeroID() + " Level: "+assassin.getLvl());
                    txt3.setText("HP: "+wholenum.format(assassin.getBaseHP())+" MP: "+wholenum.format(assassin.getBaseMP()));
                    txt4.setText("pAtk: "+decF.format(assassin.getpAtk())+" pDef: "+assassin.getpDef()+
                            "\nmAtk: "+assassin.getmAtk()+" mDef: "+assassin.getmDef());
                    txt4a.setText("STR: "+wholenum.format(assassin.getBaseSTR())+" INT: "+wholenum.format(assassin.getBaseINT())+" AGI: "+wholenum.format(assassin.getBaseAGI()));
                    txt5.setText("Evasion Rate: "+decF.format(assassin.getEvasion()));
                }

                else if (spin.equals("Warrior")) {


                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(warrior.getHeroClass());
                    txt2.setText("ID: "+idstart+warrior.getHeroID() + " Level: "+warrior.getLvl());
                    txt3.setText("HP: "+wholenum.format(warrior.getBaseHP())+" MP: "+wholenum.format(warrior.getBaseMP()));
                    txt4.setText("pAtk: "+decF.format(warrior.getpAtk())+" pDef: "+warrior.getpDef()+
                            "\nmAtk: "+warrior.getmAtk()+" mDef: "+warrior.getmDef());
                    txt4a.setText("STR: "+wholenum.format(warrior.getBaseSTR())+" INT: "+wholenum.format(warrior.getBaseINT())+" AGI: "+wholenum.format(warrior.getBaseAGI()));
                    txt5.setText("Evasion Rate: "+decF.format(warrior.getEvasion()));


                }

                else if (spin.equals("Healer")) {




                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.VISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);

                    txt.setText(healer.getHeroClass());
                    txt2.setText("ID: "+idstart+healer.getHeroID() + " Level: "+healer.getLvl());
                    txt3.setText("HP: "+wholenum.format(healer.getBaseHP())+" MP: "+wholenum.format(healer.getBaseMP()));
                    txt4.setText("pAtk: "+decF.format(healer.getpAtk())+" pDef: "+healer.getpDef()+
                            "\nmAtk: "+healer.getmAtk()+" mDef: "+healer.getmDef());
                    txt4a.setText("STR: "+wholenum.format(healer.getBaseSTR())+" INT: "+wholenum.format(healer.getBaseINT())+" AGI: "+wholenum.format(healer.getBaseAGI()));
                    txt5.setText("Evasion Rate: "+decF.format(healer.getEvasion()));
                }

                else if (spin.equals("Dragonoid")){




                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.VISIBLE);
                    monpic5.setVisibility(View.INVISIBLE);


                    txt.setText(dragonoid.getHeroClass());
                    txt2.setText("ID: "+idstart+dragonoid.getHeroID() + " Level: "+dragonoid.getLvl());
                    txt3.setText("HP: "+wholenum.format(dragonoid.getBaseHP())+" MP: "+wholenum.format(dragonoid.getBaseMP()));
                    txt4.setText("pAtk: "+decF.format(dragonoid.getpAtk())+" pDef: "+dragonoid.getpDef()+
                            "\nmAtk: "+dragonoid.getmAtk()+" mDef: "+dragonoid.getmDef());
                    txt4a.setText("STR: "+wholenum.format(dragonoid.getBaseSTR())+" INT: "+wholenum.format(dragonoid.getBaseINT())+" AGI: "+wholenum.format(dragonoid.getBaseAGI()));
                    txt5.setText("Evasion Rate: "+decF.format(dragonoid.getEvasion()));

                }

                else if (spin.equals("Gunner")){


                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    monpic3.setVisibility(View.INVISIBLE);
                    monpic4.setVisibility(View.INVISIBLE);
                    monpic5.setVisibility(View.VISIBLE);

                    txt.setText(gunner.getHeroClass());
                    txt2.setText("ID: "+idstart+gunner.getHeroID() + " Level: "+gunner.getLvl());
                    txt3.setText("HP: "+wholenum.format(gunner.getBaseHP())+" MP: "+wholenum.format(gunner.getBaseMP()));
                    txt4.setText("pAtk: "+decF.format(gunner.getpAtk())+" pDef: "+gunner.getpDef()+
                            "\nmAtk: "+gunner.getmAtk()+" mDef: "+gunner.getmDef());
                    txt4a.setText("STR: "+wholenum.format(gunner.getBaseSTR())+" INT: "+wholenum.format(gunner.getBaseINT())+" AGI: "+wholenum.format(gunner.getBaseAGI()));
                    txt5.setText("Evasion Rate: "+decF.format(gunner.getEvasion()));

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (spin.equals("Gunner")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    gunner.setLvl(level);

                    if ((gunner.getLvl() >= 2) && (gunner.getLvl() <= 40)) {


                        txt.setText(gunner.getHeroClass());
                        txt2.setText("ID: "+idstart+gunner.getHeroID() + " Level: "+gunner.getLvl());
                        txt3.setText("HP: "+wholenum.format(gunner.baseHPwSTR())+" MP: "+wholenum.format(gunner.baseMPwINT()));
                        txt4.setText("pAtk: "+decF.format(gunner.pAtkPts())+" pDef: "+decF.format(gunner.pDefPts())+
                                "\nmAtk: "+decF.format(gunner.mAtkPts())+" mDef: "+decF.format(gunner.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(gunner.strWithGrowth())+" INT: "+wholenum.format(gunner.intWithGrowth())+" AGI: "+wholenum.format(gunner.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(gunner.evasionPts()));

                    }
                    
                    else if ((gunner.getLvl() == 1)){
                        txt.setText(gunner.getHeroClass());
                        txt2.setText("ID: "+idstart+gunner.getHeroID() + " Level: "+gunner.getLvl());
                        txt3.setText("HP: "+wholenum.format(gunner.getBaseHP())+" MP: "+wholenum.format(gunner.getBaseMP()));
                        txt4.setText("pAtk: "+decF.format(gunner.getpAtk())+" pDef: "+gunner.getpDef()+
                                "\nmAtk: "+gunner.getmAtk()+" mDef: "+gunner.getmDef());
                        txt4a.setText("STR: "+wholenum.format(gunner.getBaseSTR())+" INT: "+wholenum.format(gunner.getBaseINT())+" AGI: "+wholenum.format(gunner.getBaseAGI()));
                        txt5.setText("Evasion Rate: "+decF.format(gunner.getEvasion()));
                    }

                    else {
                        Toast.makeText(MainActivity.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("Rabbit Assassin")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    assassin.setLvl(level);

                    if ((assassin.getLvl() >= 2) && (assassin.getLvl() <= 40)) {


                        txt.setText(assassin.getHeroClass());
                        txt2.setText("ID: "+idstart+assassin.getHeroID() + " Level: "+assassin.getLvl());
                        txt3.setText("HP: "+wholenum.format(assassin.baseHPwSTR())+" MP: "+wholenum.format(assassin.baseMPwINT()));
                        txt4.setText("pAtk: "+decF.format(assassin.pAtkPts())+" pDef: "+decF.format(assassin.pDefPts())+
                                "\nmAtk: "+decF.format(assassin.mAtkPts())+" mDef: "+decF.format(assassin.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(assassin.strWithGrowth())+" INT: "+wholenum.format(assassin.intWithGrowth())+" AGI: "+wholenum.format(assassin.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(assassin.evasionPts()));

                    }

                    else if ((assassin.getLvl() == 1)){
                        txt.setText(assassin.getHeroClass());
                        txt2.setText("ID: "+idstart+assassin.getHeroID() + " Level: "+assassin.getLvl());
                        txt3.setText("HP: "+wholenum.format(assassin.getBaseHP())+" MP: "+wholenum.format(assassin.getBaseMP()));
                        txt4.setText("pAtk: "+decF.format(assassin.getpAtk())+" pDef: "+assassin.getpDef()+
                                "\nmAtk: "+assassin.getmAtk()+" mDef: "+assassin.getmDef());
                        txt4a.setText("STR: "+wholenum.format(assassin.getBaseSTR())+" INT: "+wholenum.format(assassin.getBaseINT())+" AGI: "+wholenum.format(assassin.getBaseAGI()));
                        txt5.setText("Evasion Rate: "+decF.format(assassin.getEvasion()));
                    }
                    
                    else {
                        Toast.makeText(MainActivity.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }





                else if (spin.equals("Healer")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    healer.setLvl(level);

                    if ((healer.getLvl() >= 2) && (healer.getLvl() <= 40)) {


                        txt.setText(healer.getHeroClass());
                        txt2.setText("ID: "+idstart+healer.getHeroID() + " Level: "+healer.getLvl());
                        txt3.setText("HP: "+wholenum.format(healer.baseHPwSTR())+" MP: "+wholenum.format(healer.baseMPwINT()));
                        txt4.setText("pAtk: "+decF.format(healer.pAtkPts())+" pDef: "+decF.format(healer.pDefPts())+
                                "\nmAtk: "+decF.format(healer.mAtkPts())+" mDef: "+decF.format(healer.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(healer.strWithGrowth())+" INT: "+wholenum.format(healer.intWithGrowth())+" AGI: "+wholenum.format(healer.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(healer.evasionPts()));

                    }

                    else if ((healer.getLvl() == 1)){
                        txt.setText(healer.getHeroClass());
                        txt2.setText("ID: "+idstart+healer.getHeroID() + " Level: "+healer.getLvl());
                        txt3.setText("HP: "+wholenum.format(healer.getBaseHP())+" MP: "+wholenum.format(healer.getBaseMP()));
                        txt4.setText("pAtk: "+decF.format(healer.getpAtk())+" pDef: "+healer.getpDef()+
                                "\nmAtk: "+healer.getmAtk()+" mDef: "+healer.getmDef());
                        txt4a.setText("STR: "+wholenum.format(healer.getBaseSTR())+" INT: "+wholenum.format(healer.getBaseINT())+" AGI: "+wholenum.format(healer.getBaseAGI()));
                        txt5.setText("Evasion Rate: "+decF.format(healer.getEvasion()));
                    }
                    
                    else {
                        Toast.makeText(MainActivity.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("Dragonoid")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    dragonoid.setLvl(level);

                    if ((dragonoid.getLvl() >= 2) && (dragonoid.getLvl() <= 40)) {


                        txt.setText(dragonoid.getHeroClass());
                        txt2.setText("ID: "+idstart+dragonoid.getHeroID() + " Level: "+dragonoid.getLvl());
                        txt3.setText("HP: "+wholenum.format(dragonoid.baseHPwSTR())+" MP: "+wholenum.format(dragonoid.baseMPwINT()));
                        txt4.setText("pAtk: "+decF.format(dragonoid.pAtkPts())+" pDef: "+decF.format(dragonoid.pDefPts())+
                                "\nmAtk: "+decF.format(dragonoid.mAtkPts())+" mDef: "+decF.format(dragonoid.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(dragonoid.strWithGrowth())+" INT: "+wholenum.format(dragonoid.intWithGrowth())+" AGI: "+wholenum.format(dragonoid.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(dragonoid.evasionPts()));

                    }

                    else if ((dragonoid.getLvl() == 1)){
                        txt.setText(dragonoid.getHeroClass());
                        txt2.setText("ID: "+idstart+dragonoid.getHeroID() + " Level: "+dragonoid.getLvl());
                        txt3.setText("HP: "+wholenum.format(dragonoid.getBaseHP())+" MP: "+wholenum.format(dragonoid.getBaseMP()));
                        txt4.setText("pAtk: "+decF.format(dragonoid.getpAtk())+" pDef: "+dragonoid.getpDef()+
                                "\nmAtk: "+dragonoid.getmAtk()+" mDef: "+dragonoid.getmDef());
                        txt4a.setText("STR: "+wholenum.format(dragonoid.getBaseSTR())+" INT: "+wholenum.format(dragonoid.getBaseINT())+" AGI: "+wholenum.format(dragonoid.getBaseAGI()));
                        txt5.setText("Evasion Rate: "+decF.format(dragonoid.getEvasion()));
                    }
                    
                    else {
                        Toast.makeText(MainActivity.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }



                else if (spin.equals("Warrior")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    warrior.setLvl(level);

                    if ((warrior.getLvl() >= 2) && (warrior.getLvl() <= 40)) {


                        txt.setText(warrior.getHeroClass());
                        txt2.setText("ID: "+idstart+warrior.getHeroID() + " Level: "+warrior.getLvl());
                        txt3.setText("HP: "+wholenum.format(warrior.baseHPwSTR())+" MP: "+wholenum.format(warrior.baseMPwINT()));
                        txt4.setText("pAtk: "+decF.format(warrior.pAtkPts())+" pDef: "+decF.format(warrior.pDefPts())+
                                "\nmAtk: "+decF.format(warrior.mAtkPts())+" mDef: "+decF.format(warrior.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(warrior.strWithGrowth())+" INT: "+wholenum.format(warrior.intWithGrowth())+" AGI: "+wholenum.format(warrior.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(warrior.evasionPts()));

                    }

                    else if ((warrior.getLvl() == 1)){
                        txt.setText(warrior.getHeroClass());
                        txt2.setText("ID: "+idstart+warrior.getHeroID() + " Level: "+warrior.getLvl());
                        txt3.setText("HP: "+wholenum.format(warrior.getBaseHP())+" MP: "+wholenum.format(warrior.getBaseMP()));
                        txt4.setText("pAtk: "+decF.format(warrior.getpAtk())+" pDef: "+warrior.getpDef()+
                                "\nmAtk: "+warrior.getmAtk()+" mDef: "+warrior.getmDef());
                        txt4a.setText("STR: "+wholenum.format(warrior.getBaseSTR())+" INT: "+wholenum.format(warrior.getBaseINT())+" AGI: "+wholenum.format(warrior.getBaseAGI()));
                        txt5.setText("Evasion Rate: "+decF.format(warrior.getEvasion()));
                    }
                    
                    else {
                        Toast.makeText(MainActivity.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


            }
        });





        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (spin.equals("Rabbit Assassin")){
                    Intent intent = new Intent(MainActivity.this,ASSASSIN.class);
                    startActivity(intent);
                }

                else if (spin.equals("Warrior")){
                    Intent intent = new Intent(MainActivity.this,WARRIOR.class);
                    startActivity(intent);
                }

                else if (spin.equals("Healer")){
                    Intent intent = new Intent(MainActivity.this,HEALER.class);
                    startActivity(intent);
                }

                else if (spin.equals("Dragonoid")){
                    Intent intent = new Intent(MainActivity.this,DRAGONOID.class);
                    startActivity(intent);
                }

                else if (spin.equals("Gunner")){
                    Intent intent = new Intent(MainActivity.this,GUNNER.class);
                    startActivity(intent);
                }


            }
        });




    }

}
