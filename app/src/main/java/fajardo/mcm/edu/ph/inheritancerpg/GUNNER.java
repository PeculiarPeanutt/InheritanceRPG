package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

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

import java.text.DecimalFormat;

public class GUNNER extends AppCompatActivity {

    TextView txt, txt2, txt3, txt3a, txt4, txt5 , txt4a, txt5a, info;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#%");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 202000;


   Rocketeer rocketeer = new Rocketeer(5,200,100,40,20,50,30,"Rocketeer",5,
            1,0,20,60,20,0.20,0.90,0.20,0.09);

   Sniper sniper = new Sniper(5,200,100,40,20,50,30,"Sniper",5,
            1,0,20,60,20,0.20,0.90,0.20,0.09);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunner);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.textView3);
        txt3a=findViewById(R.id.textView4);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        info=findViewById(R.id.textViewInfo);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        monpic1 = findViewById(R.id.imageView17);
        monpic2 = findViewById(R.id.imageView22);
        spinner = findViewById(R.id.spinner);
        editAdd = findViewById(R.id.editAdd);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spin = spinner.getSelectedItem().toString();



                if (spin.equals("Sniper")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);

                    sniper.setLvl(40);

                    //layout display
                    txt.setText(sniper.getHeroClass());
                    txt2.setText("ID: "+idstart+sniper.getHeroID());
                    txt5a.setText(""+sniper.getLvl());
                    txt3.setText(""+wholenum.format(sniper.baseHPwSTR())+"/"+wholenum.format(sniper.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(sniper.baseHPwSTR())+"/"+wholenum.format(sniper.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(sniper.pAtkPts())+" \nPhysical Def: "+wholenum.format(sniper.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(sniper.mAtkPts())+" \nMagic Def: "+wholenum.format(sniper.mDefPts())+"\nEvasion Rate: "+decF.format(sniper.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(sniper.strWithGrowth())+" INT: "+wholenum.format(sniper.intWithGrowth())+
                            " AGI: "+wholenum.format(sniper.agiWithGrowth()));
                    info.setText("360 no scope");

                }

                if (spin.equals("Rocketeer")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    rocketeer.setLvl(40);

                    //layout display
                    txt.setText(rocketeer.getHeroClass());
                    txt2.setText("ID: "+idstart+rocketeer.getHeroID());
                    txt5a.setText(""+rocketeer.getLvl());
                    txt3.setText(""+wholenum.format(rocketeer.baseHPwSTR())+"/"+wholenum.format(rocketeer.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(rocketeer.baseHPwSTR())+"/"+wholenum.format(rocketeer.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(rocketeer.pAtkPts())+" \nPhysical Def: "+wholenum.format(rocketeer.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(rocketeer.mAtkPts())+" \nMagic Def: "+wholenum.format(rocketeer.mDefPts())+"\nEvasion Rate: "+decF.format(rocketeer.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(rocketeer.strWithGrowth())+" INT: "+wholenum.format(rocketeer.intWithGrowth())+
                            " AGI: "+wholenum.format(rocketeer.agiWithGrowth()));
                    info.setText("Fire! In! The! Hole!");

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (spin.equals("Rocketeer")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    rocketeer.setLvl(level);

                    if ((rocketeer.getLvl() >= 40) && (rocketeer.getLvl() <= 99)) {


                        txt.setText(rocketeer.getHeroClass());
                        txt2.setText("ID: "+idstart+rocketeer.getHeroID());
                        txt5a.setText(""+rocketeer.getLvl());
                        txt3.setText(""+wholenum.format(rocketeer.baseHPwSTR())+"/"+wholenum.format(rocketeer.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(rocketeer.baseHPwSTR())+"/"+wholenum.format(rocketeer.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(rocketeer.pAtkPts())+" \nPhysical Def: "+wholenum.format(rocketeer.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(rocketeer.mAtkPts())+" \nMagic Def: "+wholenum.format(rocketeer.mDefPts())+"\nEvasion Rate: "+decF.format(rocketeer.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(rocketeer.strWithGrowth())+" INT: "+wholenum.format(rocketeer.intWithGrowth())+
                                " AGI: "+wholenum.format(rocketeer.agiWithGrowth()));

                    }


                    else {
                        Toast.makeText(GUNNER.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("Sniper")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    sniper.setLvl(level);

                    if ((sniper.getLvl() >= 40) && (sniper.getLvl() <= 99)) {


                        txt.setText(sniper.getHeroClass());
                        txt2.setText("ID: "+idstart+sniper.getHeroID());
                        txt5a.setText(""+sniper.getLvl());
                        txt3.setText(""+wholenum.format(sniper.baseHPwSTR())+"/"+wholenum.format(sniper.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(sniper.baseHPwSTR())+"/"+wholenum.format(sniper.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(sniper.pAtkPts())+" \nPhysical Def: "+wholenum.format(sniper.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(sniper.mAtkPts())+" \nMagic Def: "+wholenum.format(sniper.mDefPts())+"\nEvasion Rate: "+decF.format(sniper.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(sniper.strWithGrowth())+" INT: "+wholenum.format(sniper.intWithGrowth())+
                                " AGI: "+wholenum.format(sniper.agiWithGrowth()));

                    }


                    else {
                        Toast.makeText(GUNNER.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GUNNER.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
