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

public class WARRIOR extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;


    Valkyrie valkyrie =  new Valkyrie (2,200,100,60,10,30,20,"Valkyrie",2,
            1,0,55,20,25,0.90,0.25,0.25,0.03);

    ShieldMaiden shieldMaiden =  new ShieldMaiden(2,200,100,60,10,30,20,"Shield Maiden",2,
            1,0,55,20,25,0.90,0.25,0.25,0.03);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrior);

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



                if (spin.equals("Valkyrie")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);

                    valkyrie.setLvl(40);

                    //layout display
                    txt.setText(valkyrie.getHeroClass());
                    txt2.setText("ID: "+idstart+valkyrie.getHeroID() + "a Level: "+valkyrie.getLvl());
                    txt3.setText("HP: "+wholenum.format(valkyrie.baseHPwSTR())+" MP: "+wholenum.format(valkyrie.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(valkyrie.pAtkPts())+" pDef: "+decF.format(valkyrie.pDefPts())+
                            "\nmAtk: "+decF.format(valkyrie.mAtkPts())+" mDef: "+decF.format(valkyrie.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(valkyrie.strWithGrowth())+" INT: "+wholenum.format(valkyrie.intWithGrowth())+
                            " AGI: "+wholenum.format(valkyrie.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(valkyrie.evasionPts()));

                }

                if (spin.equals("Shield Maiden")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    shieldMaiden.setLvl(40);

                    //layout display
                    txt.setText(shieldMaiden.getHeroClass());
                    txt2.setText("ID: "+idstart+shieldMaiden.getHeroID() + "b Level: "+shieldMaiden.getLvl());
                    txt3.setText("HP: "+wholenum.format(shieldMaiden.baseHPwSTR())+" MP: "+wholenum.format(shieldMaiden.baseHPwSTR()));
                    txt4.setText("pAtk: "+decF.format(shieldMaiden.pAtkPts())+" pDef: "+decF.format(shieldMaiden.pDefPts())+
                            "\nmAtk: "+decF.format(shieldMaiden.mAtkPts())+" mDef: "+decF.format(shieldMaiden.mDefPts()));
                    txt4a.setText("STR: "+wholenum.format(shieldMaiden.strWithGrowth())+" INT: "+wholenum.format(shieldMaiden.intWithGrowth())+
                            " AGI: "+wholenum.format(shieldMaiden.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(shieldMaiden.evasionPts()));

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (spin.equals("Shield Maiden")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    shieldMaiden.setLvl(level);

                    if ((shieldMaiden.getLvl() >= 40) && (shieldMaiden.getLvl() <= 99)) {


                        txt.setText(shieldMaiden.getHeroClass());
                        txt2.setText("ID: "+idstart+shieldMaiden.getHeroID() + "b Level: "+shieldMaiden.getLvl());
                        txt3.setText("HP: "+wholenum.format(shieldMaiden.baseHPwSTR())+" MP: "+wholenum.format(shieldMaiden.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(shieldMaiden.pAtkPts())+" pDef: "+shieldMaiden.pDefPts()+
                                "\nmAtk: "+shieldMaiden.mAtkPts()+" mDef: "+shieldMaiden.mDefPts());
                        txt4a.setText("STR: "+wholenum.format(shieldMaiden.strWithGrowth())+" INT: "+wholenum.format(shieldMaiden.intWithGrowth())+
                                " AGI: "+wholenum.format(shieldMaiden.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(shieldMaiden.evasionPts()));

                    }


                    else {
                        Toast.makeText(WARRIOR.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("Valkyrie")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    valkyrie.setLvl(level);

                    if ((valkyrie.getLvl() >= 40) && (valkyrie.getLvl() <= 99)) {


                        txt.setText(valkyrie.getHeroClass());
                        txt2.setText("ID: "+idstart+valkyrie.getHeroID() + "a Level: "+valkyrie.getLvl());
                        txt3.setText("HP: "+wholenum.format(valkyrie.baseHPwSTR())+" MP: "+wholenum.format(valkyrie.baseHPwSTR()));
                        txt4.setText("pAtk: "+decF.format(valkyrie.pAtkPts())+" pDef: "+valkyrie.pDefPts()+
                                "\nmAtk: "+valkyrie.mAtkPts()+" mDef: "+valkyrie.mDefPts());
                        txt4a.setText("STR: "+wholenum.format(valkyrie.strWithGrowth())+" INT: "+wholenum.format(valkyrie.intWithGrowth())+
                                " AGI: "+wholenum.format(valkyrie.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(valkyrie.evasionPts()));
                    }


                    else {
                        Toast.makeText(WARRIOR.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }




            }
        });

    }
}
