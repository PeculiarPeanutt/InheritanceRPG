package fajardo.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

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

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;


   DragonTamer dragonTamer = new DragonTamer(4,200,100,40,30,30,20,"Dragon Tamer",4,
            1,0,20,50,30,0.80,0.25,0.50,0.05);

    ElementalDracomancer elementalDracomancer = new ElementalDracomancer(4,200,100,40,30,30,20,"Elemental Dracomancer",4,
            1,0,20,50,30,0.80,0.25,0.50,0.05);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragonoid);

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
                    txt2.setText("ID: "+idstart+dragonTamer.getHeroID() + "a Level: "+dragonTamer.getLvl());
                    txt3.setText("HP: "+wholenum.format(dragonTamer.baseHPwSTR())+" MP: "+wholenum.format(dragonTamer.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(dragonTamer.pAtkPts())+" pDef: "+decF.format(dragonTamer.pDefPts())+
                            "\nmAtk: "+decF.format(dragonTamer.mAtkPts())+" mDef: "+decF.format(dragonTamer.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(dragonTamer.strWithGrowth())+" INT: "+wholenum.format(dragonTamer.intWithGrowth())+
                            " AGI: "+wholenum.format(dragonTamer.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(dragonTamer.evasionPts()));

                }

                if (spin.equals("Elemental Dracomancer")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    elementalDracomancer.setLvl(40);

                    //layout display
                    txt.setText(elementalDracomancer.getHeroClass());
                    txt2.setText("ID: "+idstart+elementalDracomancer.getHeroID() + "b Level: "+elementalDracomancer.getLvl());
                    txt3.setText("HP: "+wholenum.format(elementalDracomancer.baseHPwSTR())+" MP: "+wholenum.format(elementalDracomancer.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(elementalDracomancer.pAtkPts())+" pDef: "+decF.format(elementalDracomancer.pDefPts())+
                            "\nmAtk: "+decF.format(elementalDracomancer.mAtkPts())+" mDef: "+decF.format(elementalDracomancer.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(elementalDracomancer.strWithGrowth())+" INT: "+wholenum.format(elementalDracomancer.intWithGrowth())+
                            " AGI: "+wholenum.format(elementalDracomancer.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(elementalDracomancer.evasionPts()));

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
                        txt2.setText("ID: "+idstart+elementalDracomancer.getHeroID() + "b Level: "+elementalDracomancer.getLvl());
                        txt3.setText("HP: "+wholenum.format(elementalDracomancer.baseHPwSTR())+" MP: "+wholenum.format(elementalDracomancer.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(elementalDracomancer.pAtkPts())+" pDef: "+decF.format(elementalDracomancer.pDefPts())+
                                "\nmAtk: "+decF.format(elementalDracomancer.mAtkPts())+" mDef: "+decF.format(elementalDracomancer.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(elementalDracomancer.strWithGrowth())+" INT: "+wholenum.format(elementalDracomancer.intWithGrowth())+
                                " AGI: "+wholenum.format(elementalDracomancer.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(elementalDracomancer.evasionPts()));

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
                        txt2.setText("ID: "+idstart+dragonTamer.getHeroID() + "a Level: "+dragonTamer.getLvl());
                        txt3.setText("HP: "+wholenum.format(dragonTamer.baseHPwSTR())+" MP: "+wholenum.format(dragonTamer.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(dragonTamer.pAtkPts())+" pDef: "+decF.format(dragonTamer.pDefPts())+
                                "\nmAtk: "+decF.format(dragonTamer.mAtkPts())+" mDef: "+decF.format(dragonTamer.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(dragonTamer.strWithGrowth())+" INT: "+wholenum.format(dragonTamer.intWithGrowth())+
                                " AGI: "+wholenum.format(dragonTamer.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(dragonTamer.evasionPts()));
                    }


                    else {
                        Toast.makeText(DRAGONOID.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }




            }
        });

    }
}
