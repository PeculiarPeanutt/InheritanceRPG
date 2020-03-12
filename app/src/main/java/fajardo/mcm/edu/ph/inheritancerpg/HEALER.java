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

public class HEALER extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;


    BattlePriest battlePriest  =  new BattlePriest(3,200,100,20,60,15,35,"Battle Priest",3,
            1,0,20,30,50,0.80,0.25,0.25,0.05);

    HighPriest highPriest =  new HighPriest(3,200,100,20,60,15,35,"High Priest",3,
            1,0,20,30,50,0.80,0.25,0.25,0.05);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assassin);

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



                if (spin.equals("High Priest")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);

                    highPriest.setLvl(40);

                    //layout display
                    txt.setText(highPriest.getHeroClass());
                    txt2.setText("ID: "+idstart+highPriest.getHeroID() + " Level: "+highPriest.getLvl());
                    txt3.setText("HP: "+wholenum.format(highPriest.baseHPwSTR())+" MP: "+wholenum.format(highPriest.baseHPwINT()));
                    txt4.setText("pAtk: "+decF.format(highPriest.pAtkPts())+" pDef: "+decF.format(highPriest.pDefPts())+
                            "\nmAtk: "+decF.format(highPriest.mAtkPts())+" mDef: "+decF.format(highPriest.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(highPriest.strWithGrowth())+" INT: "+wholenum.format(highPriest.intWithGrowth())+
                            " AGI: "+wholenum.format(highPriest.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(highPriest.evasionPts()));

                }

                if (spin.equals("Battle Priest")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    battlePriest.setLvl(40);

                    //layout display
                    txt.setText(battlePriest.getHeroClass());
                    txt2.setText("ID: "+idstart+battlePriest.getHeroID() + " Level: "+battlePriest.getLvl());
                    txt3.setText("HP: "+wholenum.format(battlePriest.baseHPwSTR())+" MP: "+wholenum.format(battlePriest.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(battlePriest.pAtkPts())+" pDef: "+decF.format(battlePriest.pDefPts())+
                            "\nmAtk: "+decF.format(battlePriest.mAtkPts())+" mDef: "+decF.format(battlePriest.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(battlePriest.strWithGrowth())+" INT: "+wholenum.format(battlePriest.intWithGrowth())+
                            " AGI: "+wholenum.format(battlePriest.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(battlePriest.evasionPts()));

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
                        txt2.setText("ID: "+idstart+battlePriest.getHeroID() + " Level: "+battlePriest.getLvl());
                        txt3.setText("HP: "+wholenum.format(battlePriest.baseHPwSTR())+" MP: "+wholenum.format(battlePriest.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(battlePriest.pAtkPts())+" pDef: "+decF.format(battlePriest.pDefPts())+
                                "\nmAtk: "+decF.format(battlePriest.mAtkPts())+" mDef: "+decF.format(battlePriest.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(battlePriest.strWithGrowth())+" INT: "+wholenum.format(battlePriest.intWithGrowth())+
                                " AGI: "+wholenum.format(battlePriest.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(battlePriest.evasionPts()));

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
                        txt2.setText("ID: "+idstart+highPriest.getHeroID() + " Level: "+highPriest.getLvl());
                        txt3.setText("HP: "+wholenum.format(highPriest.baseHPwSTR())+" MP: "+wholenum.format(highPriest.baseHPwINT()));
                        txt4.setText("pAtk: "+decF.format(highPriest.pAtkPts())+" pDef: "+decF.format(highPriest.pDefPts())+
                                "\nmAtk: "+decF.format(highPriest.mAtkPts())+" mDef: "+decF.format(highPriest.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(highPriest.strWithGrowth())+" INT: "+wholenum.format(highPriest.intWithGrowth())+
                                " AGI: "+wholenum.format(highPriest.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(highPriest.evasionPts()));
                    }


                    else {
                        Toast.makeText(HEALER.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }




            }
        });



    }
}
