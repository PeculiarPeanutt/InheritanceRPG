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

public class HEALER extends AppCompatActivity {

    TextView txt, txt2, txt3, txt3a, txt4, txt5 , txt4a, txt5a, info;
    ImageView monpic1, BattlePriestImg;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#%");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 202000;


    BattlePriest battlePriest  =  new BattlePriest(3,200,100,20,60,15,35,"Battle Priest",3,
            1,0,20,30,50,0.80,0.25,0.25,0.05);

    HighPriest highPriest =  new HighPriest(4,200,100,20,60,15,35,"High Priest",3,
            1,0,20,30,50,0.80,0.25,0.25,0.05);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healer);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.textView3);
        txt3a= findViewById(R.id.textView4);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        info=findViewById(R.id.textViewInfo);
        monpic1 = findViewById(R.id.imageView26);
        BattlePriestImg = findViewById(R.id.imageView23);
        spinner = findViewById(R.id.spinner);
        editAdd = findViewById(R.id.editAdd);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spin = spinner.getSelectedItem().toString();



                if (spin.equals("High Priest")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    BattlePriestImg.setVisibility(View.INVISIBLE);

                    highPriest.setLvl(40);

                    //layout display
                    txt.setText(highPriest.getHeroClass());
                    txt2.setText("ID: "+idstart+highPriest.getHeroID());
                    txt5a.setText(""+highPriest.getLvl());
                    txt3.setText(""+wholenum.format(highPriest.baseHPwSTR())+"/"+wholenum.format(highPriest.baseHPwINT()));
                    txt3a.setText(""+wholenum.format(highPriest.baseHPwSTR())+"/"+wholenum.format(highPriest.baseHPwINT()));
                    txt4.setText("Physical Atk: "+wholenum.format(highPriest.pAtkPts())+" \nPhysical Def: "+wholenum.format(highPriest.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(highPriest.mAtkPts())+" \nMagic Def: "+wholenum.format(highPriest.mDefPts())+"\nEvasion Rate: "+decF.format(highPriest.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(highPriest.strWithGrowth())+" INT: "+wholenum.format(highPriest.intWithGrowth())+
                            " AGI: "+wholenum.format(highPriest.agiWithGrowth()));
                    info.setText("You get a heal!\nand You get a Heal!\nAND YOU GET A HEAL!!!");

                }

                if (spin.equals("Battle Priest")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    BattlePriestImg.setVisibility(View.VISIBLE);

                    battlePriest.setLvl(40);

                    //layout display
                    txt.setText(battlePriest.getHeroClass());
                    txt2.setText("ID: "+idstart+battlePriest.getHeroID());
                    txt5a.setText(""+battlePriest.getLvl());
                    txt3.setText(""+wholenum.format(battlePriest.baseHPwSTR())+"/"+wholenum.format(battlePriest.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(battlePriest.baseHPwSTR())+"/"+wholenum.format(battlePriest.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(battlePriest.pAtkPts())+" \nPhysical Def: "+wholenum.format(battlePriest.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(battlePriest.mAtkPts())+" \nMagic Def: "+wholenum.format(battlePriest.mDefPts())+"\nEvasion Rate: "+decF.format(battlePriest.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(battlePriest.strWithGrowth())+" INT: "+wholenum.format(battlePriest.intWithGrowth())+
                            " AGI: "+wholenum.format(battlePriest.agiWithGrowth()));
                    info.setText("Pretty much has the power of \nGod and Anime on their side ");

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (spin.equals("Battle Priest")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    battlePriest.setLvl(level);

                    if ((battlePriest.getLvl() >= 40) && (battlePriest.getLvl() <= 99)) {


                        txt.setText(battlePriest.getHeroClass());
                        txt2.setText("ID: "+idstart+battlePriest.getHeroID());
                        txt5a.setText(""+battlePriest.getLvl());
                        txt3.setText(""+wholenum.format(battlePriest.baseHPwSTR())+"/"+wholenum.format(battlePriest.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(battlePriest.baseHPwSTR())+"/"+wholenum.format(battlePriest.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(battlePriest.pAtkPts())+" \nPhysical Def: "+wholenum.format(battlePriest.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(battlePriest.mAtkPts())+" \nMagic Def: "+wholenum.format(battlePriest.mDefPts())+"\nEvasion Rate: "+decF.format(battlePriest.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(battlePriest.strWithGrowth())+" INT: "+wholenum.format(battlePriest.intWithGrowth())+
                                " AGI: "+wholenum.format(battlePriest.agiWithGrowth()));

                    }

                    else {
                        Toast.makeText(HEALER.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("High Priest")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    highPriest.setLvl(level);

                    if ((highPriest.getLvl() >= 40) && (highPriest.getLvl() <= 99)) {


                        txt.setText(highPriest.getHeroClass());
                        txt2.setText("ID: "+idstart+highPriest.getHeroID());
                        txt5a.setText( ""+highPriest.getLvl());
                        txt3.setText(""+wholenum.format(highPriest.baseHPwSTR())+"/"+wholenum.format(highPriest.baseHPwINT()));
                        txt3a.setText(""+wholenum.format(highPriest.baseHPwSTR())+"/"+wholenum.format(highPriest.baseHPwINT()));
                        txt4.setText("Physical Atk: "+wholenum.format(highPriest.pAtkPts())+" \nPhysical Def: "+wholenum.format(highPriest.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(highPriest.mAtkPts())+" \nMagic Def: "+wholenum.format(highPriest.mDefPts())+"\nEvasion Rate: "+decF.format(highPriest.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(highPriest.strWithGrowth())+" INT: "+wholenum.format(highPriest.intWithGrowth())+
                                " AGI: "+wholenum.format(highPriest.agiWithGrowth()));
                    }

                    else {
                        Toast.makeText(HEALER.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HEALER.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
