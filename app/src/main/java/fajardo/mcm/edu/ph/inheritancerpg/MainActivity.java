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


    TextView txtClass, txtNum, txt3,txt3a, txt4, txt5 , txt4a, txt5a, info;
    ImageView assBunnyImg, priestImg, dragonoidImg, warriorImg, gunnerImg;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#%");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 202000;

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

        txtClass=findViewById(R.id.textView);
        txtNum = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.textView3);
        txt3a = findViewById(R.id.textView4);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        info= findViewById(R.id.textViewInfo);
        assBunnyImg = findViewById(R.id.abunny);
        priestImg = findViewById(R.id.priestImg);
        gunnerImg = findViewById(R.id.gunnerImg);
        dragonoidImg=findViewById(R.id.dragonoidImg);
        warriorImg=findViewById(R.id.warriorImg);
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
                    assBunnyImg.setVisibility(View.VISIBLE);
                    warriorImg.setVisibility(View.INVISIBLE);
                    priestImg.setVisibility(View.INVISIBLE);
                    dragonoidImg.setVisibility(View.INVISIBLE);
                    gunnerImg.setVisibility(View.INVISIBLE);

                    //layout display
                    txtClass.setText(assassin.getHeroClass());
                    txtNum.setText("ID: "+idstart+assassin.getHeroID());
                    txt3.setText(""+wholenum.format(assassin.getBaseHP())+"/"+wholenum.format(assassin.getBaseHP()));
                    txt3a.setText(""+wholenum.format(assassin.getBaseMP())+"/"+wholenum.format(assassin.getBaseMP()));
                    txt4.setText("Physical Atk: "+wholenum.format(assassin.getpAtk())+"\nPhysical Def: "+wholenum.format(assassin.getpDef())+
                            "\nMagic Atk: "+wholenum.format(assassin.getmAtk())+"\nMagic Def: "+wholenum.format(assassin.getmDef())+"\nEvasion Rate: "+decF.format(assassin.getEvasion()));
                    txt4a.setText("STR: "+wholenum.format(assassin.getBaseSTR())+" INT: "+wholenum.format(assassin.getBaseINT())+" AGI: "+wholenum.format(assassin.getBaseAGI()));
                    txt5a.setText(""+assassin.getLvl());
                    info.setText("The rabbit assassin class, ready to steal all your carrots not only silently but also deadily");
                }

                else if (spin.equals("Warrior")) {

                    assBunnyImg.setVisibility(View.INVISIBLE);
                    warriorImg.setVisibility(View.VISIBLE);
                    priestImg.setVisibility(View.INVISIBLE);
                    dragonoidImg.setVisibility(View.INVISIBLE);
                    gunnerImg.setVisibility(View.INVISIBLE);

                    txtClass.setText(warrior.getHeroClass());
                    txtNum.setText("ID: "+idstart+warrior.getHeroID());
                    txt3.setText(""+wholenum.format(warrior.getBaseHP())+"/"+wholenum.format(warrior.getBaseHP()));
                    txt3a.setText(""+wholenum.format(warrior.getBaseMP())+"/"+wholenum.format(warrior.getBaseMP()));
                    txt4.setText("Physical Atk: "+wholenum.format(warrior.getpAtk())+"\nPhysical Def: "+wholenum.format(warrior.getpDef())+
                            "\nMagic Atk: "+wholenum.format(warrior.getmAtk())+"\nMagic Def: "+wholenum.format(warrior.getmDef())+"\nEvasion Rate: "+decF.format(warrior.getEvasion()));
                    txt4a.setText("STR: "+wholenum.format(warrior.getBaseSTR())+" INT: "+wholenum.format(warrior.getBaseINT())+" AGI: "+wholenum.format(warrior.getBaseAGI()));
                    txt5a.setText(""+warrior.getLvl());
                    info.setText("Warrior class!\nEpic waifu with epic pet butterfly!");

                }

                else if (spin.equals("Healer")) {

                    assBunnyImg.setVisibility(View.INVISIBLE);
                    warriorImg.setVisibility(View.INVISIBLE);
                    priestImg.setVisibility(View.VISIBLE);
                    dragonoidImg.setVisibility(View.INVISIBLE);
                    gunnerImg.setVisibility(View.INVISIBLE);

                    txtClass.setText(healer.getHeroClass());
                    txtNum.setText("ID: "+idstart+healer.getHeroID());
                    txt3.setText(""+wholenum.format(healer.getBaseHP())+"/"+wholenum.format(healer.getBaseHP()));
                    txt3a.setText(""+wholenum.format(healer.getBaseMP())+"/"+wholenum.format(healer.getBaseMP()));
                    txt4.setText("Physical Atk: "+wholenum.format(healer.getpAtk())+"\nPhysical Def: "+wholenum.format(healer.getpDef())+
                            "\nMagic Atk: "+wholenum.format(healer.getmAtk())+"\nMagic Def: "+wholenum.format(healer.getmDef())+"\nEvasion Rate: "+decF.format(healer.getEvasion()));
                    txt4a.setText("STR: "+wholenum.format(healer.getBaseSTR())+" INT: "+wholenum.format(healer.getBaseINT())+" AGI: "+wholenum.format(healer.getBaseAGI()));
                    txt5a.setText(""+healer.getLvl());
                    info.setText("Skidaddle Skidoodle.\nYour hp is now recovered.");
                }

                else if (spin.equals("Dragonoid")){

                    assBunnyImg.setVisibility(View.INVISIBLE);
                    warriorImg.setVisibility(View.INVISIBLE);
                    priestImg.setVisibility(View.INVISIBLE);
                    dragonoidImg.setVisibility(View.VISIBLE);
                    gunnerImg.setVisibility(View.INVISIBLE);


                    txtClass.setText(dragonoid.getHeroClass());
                    txtNum.setText("ID: "+idstart+dragonoid.getHeroID());
                    txt3.setText(""+wholenum.format(dragonoid.getBaseHP())+"/"+wholenum.format(dragonoid.getBaseHP()));
                    txt3a.setText(""+wholenum.format(dragonoid.getBaseMP())+"/"+wholenum.format(dragonoid.getBaseMP()));
                    txt4.setText("Physical Atk: "+wholenum.format(dragonoid.getpAtk())+"\nPhysical Def: "+wholenum.format(dragonoid.getpDef())+
                            "\nMagic Atk: "+wholenum.format(dragonoid.getmAtk())+"\nMagic Def: "+wholenum.format(dragonoid.getmDef())+"\nEvasion Rate: "+decF.format(dragonoid.getEvasion()));
                    txt4a.setText("STR: "+wholenum.format(dragonoid.getBaseSTR())+" INT: "+wholenum.format(dragonoid.getBaseINT())+" AGI: "+wholenum.format(dragonoid.getBaseAGI()));
                    txt5a.setText(""+dragonoid.getLvl());
                    info.setText("Hngggg Edgy. Dragons. Rawr.");
                }

                else if (spin.equals("Gunner")){


                    assBunnyImg.setVisibility(View.INVISIBLE);
                    warriorImg.setVisibility(View.INVISIBLE);
                    priestImg.setVisibility(View.INVISIBLE);
                    dragonoidImg.setVisibility(View.INVISIBLE);
                    gunnerImg.setVisibility(View.VISIBLE);

                    txtClass.setText(gunner.getHeroClass());
                    txtNum.setText("ID: "+idstart+gunner.getHeroID());
                    txt3.setText(""+wholenum.format(gunner.getBaseHP())+"/"+wholenum.format(gunner.getBaseHP()));
                    txt3a.setText(""+wholenum.format(gunner.getBaseMP())+"/"+wholenum.format(gunner.getBaseMP()));
                    txt4.setText("Physical Atk: "+wholenum.format(gunner.getpAtk())+"\nPhysical Def: "+wholenum.format(gunner.getpDef())+
                            "\nMagic Atk: "+wholenum.format(gunner.getmAtk())+"\nMagic Def: "+wholenum.format(gunner.getmDef())+"\nEvasion Rate: "+decF.format(gunner.getEvasion()));
                    txt4a.setText("STR: "+wholenum.format(gunner.getBaseSTR())+" INT: "+wholenum.format(gunner.getBaseINT())+" AGI: "+wholenum.format(gunner.getBaseAGI()));
                    txt5a.setText(""+gunner.getLvl());
                    info.setText("It's HIGHH NOOON!\nPew pew pew!");
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


                        txtClass.setText(gunner.getHeroClass());
                        txtNum.setText("ID: "+idstart+gunner.getHeroID());
                        txt3.setText(""+wholenum.format(gunner.baseHPwSTR())+"/"+wholenum.format(gunner.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(gunner.baseMPwINT())+"/"+wholenum.format(gunner.baseMPwINT()));
                        txt4.setText("Physical Atk: "+wholenum.format(gunner.pAtkPts())+"\nPhysical Def: "+wholenum.format(gunner.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(gunner.mAtkPts())+"\nMagic Def: "+wholenum.format(gunner.mDefPts())+"\nEvasion Rate: "+decF.format(gunner.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(gunner.strWithGrowth())+" INT: "+wholenum.format(gunner.intWithGrowth())+" AGI: "+wholenum.format(gunner.agiWithGrowth()));
                        txt5a.setText(""+gunner.getLvl());
                    }
                    
                    else if ((gunner.getLvl() == 1)){
                        txtClass.setText(gunner.getHeroClass());
                        txtNum.setText("ID: "+idstart+gunner.getHeroID());
                        txt3.setText(""+wholenum.format(gunner.getBaseHP())+"/"+wholenum.format(gunner.getBaseHP()));
                        txt3a.setText(""+wholenum.format(gunner.getBaseMP())+"/"+wholenum.format(gunner.getBaseMP()));
                        txt4.setText("Physical Atk: "+wholenum.format(gunner.getpAtk())+"\nPhysical Def: "+wholenum.format(gunner.getpDef())+
                                "\nMagic Atk: "+wholenum.format(gunner.getmAtk())+"\nMagic Def: "+wholenum.format(gunner.getmDef())+"\nEvasion Rate: "+decF.format(gunner.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(gunner.getBaseSTR())+" INT: "+wholenum.format(gunner.getBaseINT())+" AGI: "+wholenum.format(gunner.getBaseAGI()));
                        txt5a.setText(""+gunner.getLvl());
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


                        txtClass.setText(assassin.getHeroClass());
                        txtNum.setText("ID: "+idstart+assassin.getHeroID());
                        txt3.setText(""+wholenum.format(assassin.baseHPwSTR())+"/"+wholenum.format(assassin.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(assassin.baseMPwINT())+"/"+wholenum.format(assassin.baseMPwINT()));
                        txt4.setText("Physical Atk: "+wholenum.format(assassin.pAtkPts())+"\nPhysical Def: "+wholenum.format(assassin.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(assassin.mAtkPts())+" Magic Def: "+wholenum.format(assassin.mDefPts())+"\nEvasion Rate: "+decF.format(assassin.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(assassin.strWithGrowth())+" INT: "+wholenum.format(assassin.intWithGrowth())+" AGI: "+wholenum.format(assassin.agiWithGrowth()));
                        txt5a.setText(""+assassin.getLvl());
                    }

                    else if ((assassin.getLvl() == 1)){
                        txtClass.setText(assassin.getHeroClass());
                        txtNum.setText("ID: "+idstart+assassin.getHeroID());
                        txt3.setText(""+wholenum.format(assassin.getBaseHP())+"/"+wholenum.format(assassin.getBaseHP()));
                        txt3a.setText(""+wholenum.format(assassin.getBaseMP())+"/"+wholenum.format(assassin.getBaseMP()));
                        txt4.setText("Physical Atk: "+wholenum.format(assassin.getpAtk())+"\nPhysical Def: "+wholenum.format(assassin.getpDef())+
                                "\nMagic Atk: "+wholenum.format(assassin.getmAtk())+" Magic Def: "+wholenum.format(assassin.getmDef())+"\nEvasion Rate: "+decF.format(assassin.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(assassin.getBaseSTR())+" INT: "+wholenum.format(assassin.getBaseINT())+" AGI: "+wholenum.format(assassin.getBaseAGI()));
                        txt5a.setText(""+assassin.getLvl());
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


                        txtClass.setText(healer.getHeroClass());
                        txtNum.setText("ID: "+idstart+healer.getHeroID());
                        txt3.setText(""+wholenum.format(healer.baseHPwSTR())+"/"+wholenum.format(healer.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(healer.baseMPwINT())+"/"+wholenum.format(healer.baseMPwINT()));
                        txt4.setText("Physical Atk: "+wholenum.format(healer.pAtkPts())+"\nPhysical Def: "+wholenum.format(healer.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(healer.mAtkPts())+" Magic Def: "+wholenum.format(healer.mDefPts())+"\nEvasion Rate: "+decF.format(healer.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(healer.strWithGrowth())+" INT: "+wholenum.format(healer.intWithGrowth())+" AGI: "+wholenum.format(healer.agiWithGrowth()));
                        txt5a.setText(""+healer.getLvl());

                    }

                    else if ((healer.getLvl() == 1)){
                        txtClass.setText(healer.getHeroClass());
                        txtNum.setText("ID: "+idstart+healer.getHeroID());
                        txt3.setText(""+wholenum.format(healer.getBaseHP())+"/"+wholenum.format(healer.getBaseHP()));
                        txt3a.setText(""+wholenum.format(healer.getBaseMP())+"/"+wholenum.format(healer.getBaseMP()));
                        txt4.setText("Physical Atk: "+wholenum.format(healer.getpAtk())+"\nPhysical Def: "+wholenum.format(healer.getpDef())+
                                "\nMagic Atk: "+wholenum.format(healer.getmAtk())+" Magic Def: "+wholenum.format(healer.getmDef())+"\nEvasion Rate: "+decF.format(healer.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(healer.getBaseSTR())+" INT: "+wholenum.format(healer.getBaseINT())+" AGI: "+wholenum.format(healer.getBaseAGI()));
                        txt5a.setText(""+healer.getLvl());
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


                        txtClass.setText(dragonoid.getHeroClass());
                        txtNum.setText("ID: "+idstart+dragonoid.getHeroID());
                        txt3.setText(""+wholenum.format(dragonoid.baseHPwSTR())+"/"+wholenum.format(dragonoid.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(dragonoid.baseMPwINT())+"/"+wholenum.format(dragonoid.baseMPwINT()));
                        txt4.setText("Physical Atk: "+wholenum.format(dragonoid.pAtkPts())+"\nPhysical Def: "+wholenum.format(dragonoid.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(dragonoid.mAtkPts())+"\nMagic Def: "+wholenum.format(dragonoid.mDefPts())+"\nEvasion Rate: "+decF.format(dragonoid.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(dragonoid.strWithGrowth())+" INT: "+wholenum.format(dragonoid.intWithGrowth())+" AGI: "+wholenum.format(dragonoid.agiWithGrowth()));
                        txt5a.setText(""+dragonoid.getLvl());

                    }

                    else if ((dragonoid.getLvl() == 1)){
                        txtClass.setText(dragonoid.getHeroClass());
                        txtNum.setText("ID: "+idstart+dragonoid.getHeroID());
                        txt3.setText(""+wholenum.format(dragonoid.getBaseHP())+"/"+wholenum.format(dragonoid.getBaseHP()));
                        txt3a.setText(""+wholenum.format(dragonoid.getBaseMP())+"/"+wholenum.format(dragonoid.getBaseMP()));
                        txt4.setText("Physical Atk: "+wholenum.format(dragonoid.getpAtk())+"\nPhysical Def: "+wholenum.format(dragonoid.getpDef())+
                                "\nMagic Atk: "+wholenum.format(dragonoid.getmAtk())+"\nMagic Def: "+wholenum.format(dragonoid.getmDef())+"\nEvasion Rate: "+decF.format(dragonoid.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(dragonoid.getBaseSTR())+" INT: "+wholenum.format(dragonoid.getBaseINT())+" AGI: "+wholenum.format(dragonoid.getBaseAGI()));
                        txt5a.setText(""+healer.getLvl());
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


                        txtClass.setText(warrior.getHeroClass());
                        txtNum.setText("ID: "+idstart+warrior.getHeroID());
                        txt3.setText(""+wholenum.format(warrior.baseHPwSTR())+"/"+wholenum.format(warrior.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(warrior.baseMPwINT())+"/"+wholenum.format(warrior.baseMPwINT()));
                        txt4.setText("Physical Atk: "+wholenum.format(warrior.pAtkPts())+"\nPhysical Def: "+wholenum.format(warrior.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(warrior.mAtkPts())+"\nMagic Def: "+wholenum.format(warrior.mDefPts())+"\nEvasion Rate: "+decF.format(warrior.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(warrior.strWithGrowth())+" INT: "+wholenum.format(warrior.intWithGrowth())+" AGI: "+wholenum.format(warrior.agiWithGrowth()));
                        txt5a.setText(""+warrior.getLvl());
                    }

                    else if ((warrior.getLvl() == 1)){
                        txtClass.setText(warrior.getHeroClass());
                        txtNum.setText("ID: "+idstart+warrior.getHeroID());
                        txt3.setText(""+wholenum.format(warrior.getBaseHP())+"/"+wholenum.format(warrior.getBaseHP()));
                        txt3a.setText(""+wholenum.format(warrior.getBaseMP())+"/"+wholenum.format(warrior.getBaseMP()));
                        txt4.setText("Physical Atk: "+wholenum.format(warrior.getpAtk())+"\nPhysical Def: "+wholenum.format(warrior.getpDef())+
                                "\nMagic Atk: "+wholenum.format(warrior.getmAtk())+"\nMagic Def: "+wholenum.format(warrior.getmDef())+"\nEvasion Rate: "+decF.format(warrior.getEvasion()));
                        txt4a.setText("STR: "+wholenum.format(warrior.getBaseSTR())+" INT: "+wholenum.format(warrior.getBaseINT())+" AGI: "+wholenum.format(warrior.getBaseAGI()));
                        txt5.setText("Evasion Rate: "+decF.format(warrior.getEvasion()));
                        txt5a.setText(""+warrior.getLvl());
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


                if (spin.equals("Healer")){
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
