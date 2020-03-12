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

public class GUNNER extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;


   Rocketeer rocketeer = new Rocketeer(5,200,100,40,20,50,30,"Rocketeer",5,
            1,0,20,60,20,0.20,0.90,0.20,0.09);

   Sniper sniper = new Sniper(5,200,100,40,20,50,30,"Sniper",5,
            1,0,20,60,20,0.20,0.90,0.20,0.09);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunner);

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



                if (spin.equals("Sniper")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);

                    sniper.setLvl(40);

                    //layout display
                    txt.setText(sniper.getHeroClass());
                    txt2.setText("ID: "+idstart+sniper.getHeroID() + " Level: "+sniper.getLvl());
                    txt3.setText("HP: "+wholenum.format(sniper.baseHPwSTR())+" MP: "+wholenum.format(sniper.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(sniper.pAtkPts())+" pDef: "+decF.format(sniper.pDefPts())+
                            "\nmAtk: "+decF.format(sniper.mAtkPts())+" mDef: "+decF.format(sniper.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(sniper.strWithGrowth())+" INT: "+wholenum.format(sniper.intWithGrowth())+
                            " AGI: "+wholenum.format(sniper.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(sniper.evasionPts()));

                }

                if (spin.equals("Rocketeer")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    rocketeer.setLvl(40);

                    //layout display
                    txt.setText(rocketeer.getHeroClass());
                    txt2.setText("ID: "+idstart+rocketeer.getHeroID() + " Level: "+rocketeer.getLvl());
                    txt3.setText("HP: "+wholenum.format(rocketeer.baseHPwSTR())+" MP: "+wholenum.format(rocketeer.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(rocketeer.pAtkPts())+" pDef: "+decF.format(rocketeer.pDefPts())+
                            "\nmAtk: "+decF.format(rocketeer.mAtkPts())+" mDef: "+decF.format(rocketeer.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(rocketeer.strWithGrowth())+" INT: "+wholenum.format(rocketeer.intWithGrowth())+
                            " AGI: "+wholenum.format(rocketeer.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(rocketeer.evasionPts()));

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
                        txt2.setText("ID: "+idstart+rocketeer.getHeroID() + " Level: "+rocketeer.getLvl());
                        txt3.setText("HP: "+wholenum.format(rocketeer.baseHPwSTR())+" MP: "+wholenum.format(rocketeer.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(rocketeer.pAtkPts())+" pDef: "+decF.format(rocketeer.pDefPts())+
                                "\nmAtk: "+decF.format(rocketeer.mAtkPts())+" mDef: "+decF.format(rocketeer.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(rocketeer.strWithGrowth())+" INT: "+wholenum.format(rocketeer.intWithGrowth())+
                                " AGI: "+wholenum.format(rocketeer.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(rocketeer.evasionPts()));

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
                        txt2.setText("ID: "+idstart+sniper.getHeroID() + " Level: "+sniper.getLvl());
                        txt3.setText("HP: "+wholenum.format(sniper.baseHPwSTR())+" MP: "+wholenum.format(sniper.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(sniper.pAtkPts())+" pDef: "+decF.format(sniper.pDefPts())+
                                "\nmAtk: "+decF.format(sniper.mAtkPts())+" mDef: "+decF.format(sniper.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(sniper.strWithGrowth())+" INT: "+wholenum.format(sniper.intWithGrowth())+
                                " AGI: "+wholenum.format(sniper.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(sniper.evasionPts()));
                    }


                    else {
                        Toast.makeText(GUNNER.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }




            }
        });
    }
}
