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

public class DRAGONOID extends AppCompatActivity {

    TextView txt, txt2, txt3,txt3a, txt4, txt5 , txt4a, txt5a,info;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#%");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 202000;


   DragonTamer dragonTamer = new DragonTamer(4,200,100,40,30,30,20,"Dragon Tamer",4,
            1,0,20,50,30,0.80,0.25,0.50,0.05);

    ElementalDracomancer elementalDracomancer = new ElementalDracomancer(4,200,100,40,30,30,20,"Elemental Dracomancer",4,
            1,0,20,50,30,0.80,0.25,0.50,0.05);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragonoid);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.textView3);
        txt3a=findViewById(R.id.textView4);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        info=findViewById(R.id.textViewInfo);
        monpic1 = findViewById(R.id.imageView15);
        monpic2 = findViewById(R.id.imageView16);
        spinner = findViewById(R.id.spinner);
        editAdd = findViewById(R.id.editAdd);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spin = spinner.getSelectedItem().toString();



                if (spin.equals("Dragon Tamer")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);

                    dragonTamer.setLvl(40);

                    //layout display
                    txt.setText(dragonTamer.getHeroClass());
                    txt2.setText("ID: "+idstart+dragonTamer.getHeroID());
                    txt5a.setText(""+dragonTamer.getLvl());
                    txt3.setText(""+wholenum.format(dragonTamer.baseHPwSTR())+"/"+wholenum.format(dragonTamer.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(dragonTamer.baseHPwSTR())+"/"+wholenum.format(dragonTamer.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(dragonTamer.pAtkPts())+" \nPhysical Def: "+wholenum.format(dragonTamer.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(dragonTamer.mAtkPts())+" \nMagic Def: "+wholenum.format(dragonTamer.mDefPts())+"\nEvasion Rate: "+decF.format(dragonTamer.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(dragonTamer.strWithGrowth())+" INT: "+wholenum.format(dragonTamer.intWithGrowth())+
                            " AGI: "+wholenum.format(dragonTamer.agiWithGrowth()));
                    info.setText("How to train your edgy dragon (2010)");
                    

                }

                if (spin.equals("Elemental Dracomancer")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    elementalDracomancer.setLvl(40);

                    //layout display
                    txt.setText(elementalDracomancer.getHeroClass());
                    txt2.setText("ID: "+idstart+elementalDracomancer.getHeroID());
                    txt5a.setText(""+elementalDracomancer.getLvl());
                    txt3.setText(""+wholenum.format(elementalDracomancer.baseHPwSTR())+"/"+wholenum.format(elementalDracomancer.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(elementalDracomancer.baseHPwSTR())+"/"+wholenum.format(elementalDracomancer.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(elementalDracomancer.pAtkPts())+" \nPhysical Def: "+wholenum.format(elementalDracomancer.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(elementalDracomancer.mAtkPts())+" \nMagic Def: "+wholenum.format(elementalDracomancer.mDefPts())+"\nEvasion Rate: "+decF.format(dragonTamer.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(elementalDracomancer.strWithGrowth())+" INT: "+wholenum.format(elementalDracomancer.intWithGrowth())+
                            " AGI: "+wholenum.format(elementalDracomancer.agiWithGrowth()));
                    info.setText("Nananananaanana \nNot Batman!!!\nbut Dragon hybrid thing man!");
                    txt.setTextSize(10);
              

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (spin.equals("Elemental Dracomancer")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    elementalDracomancer.setLvl(level);

                    if ((elementalDracomancer.getLvl() >= 40) && (elementalDracomancer.getLvl() <= 99)) {


                        txt.setText(elementalDracomancer.getHeroClass());
                        txt2.setText("ID: "+idstart+elementalDracomancer.getHeroID());
                        txt5a.setText(""+elementalDracomancer.getLvl());
                        txt3.setText(""+wholenum.format(elementalDracomancer.baseHPwSTR())+"/"+wholenum.format(elementalDracomancer.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(elementalDracomancer.baseHPwSTR())+"/"+wholenum.format(elementalDracomancer.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(elementalDracomancer.pAtkPts())+" \nPhysical Def: "+wholenum.format(elementalDracomancer.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(elementalDracomancer.mAtkPts())+" \nMagic Def: "+wholenum.format(elementalDracomancer.mDefPts())+("Evasion Rate: "+decF.format(elementalDracomancer.evasionPts())));
                        txt4a.setText("STR: "+wholenum.format(elementalDracomancer.strWithGrowth())+" INT: "+wholenum.format(elementalDracomancer.intWithGrowth())+
                                " AGI: "+wholenum.format(elementalDracomancer.agiWithGrowth()));
                        

                    }


                    else {
                        Toast.makeText(DRAGONOID.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("Dragon Tamer")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    dragonTamer.setLvl(level);

                    if ((dragonTamer.getLvl() >= 40) && (dragonTamer.getLvl() <= 99)) {


                        txt.setText(dragonTamer.getHeroClass());
                        txt2.setText("ID: "+idstart+dragonTamer.getHeroID());
                        txt5a.setText(""+dragonTamer.getLvl());
                        txt3.setText(""+wholenum.format(dragonTamer.baseHPwSTR())+"/"+wholenum.format(dragonTamer.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(dragonTamer.baseHPwSTR())+"/"+wholenum.format(dragonTamer.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(dragonTamer.pAtkPts())+" \nPhysical Def: "+wholenum.format(dragonTamer.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(dragonTamer.mAtkPts())+" \nMagic Def: "+wholenum.format(dragonTamer.mDefPts())+("Evasion Rate: "+decF.format(elementalDracomancer.evasionPts())));
                        txt4a.setText("STR: "+wholenum.format(dragonTamer.strWithGrowth())+" INT: "+wholenum.format(dragonTamer.intWithGrowth())+
                                " AGI: "+wholenum.format(dragonTamer.agiWithGrowth()));
                        
                    }


                    else {
                        Toast.makeText(DRAGONOID.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DRAGONOID.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
