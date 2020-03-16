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

public class WARRIOR extends AppCompatActivity {

    TextView txt, txt2,txt3, txt3a, txt4, txt5 , txt4a, txt5a, info;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#%");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 202000;


    Valkyrie valkyrie =  new Valkyrie (2,200,100,60,10,30,20,"Valkyrie",2,
            1,0,55,20,25,0.90,0.25,0.25,0.03);

    ShieldMaiden shieldMaiden =  new ShieldMaiden(2,200,100,60,10,30,20,"Shield Maiden",2,
            1,0,55,20,25,0.90,0.25,0.25,0.03);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrior);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.textView3);
        txt3a= findViewById(R.id.textView4);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        info=findViewById(R.id.textViewInfo);
        monpic1 = findViewById(R.id.imageView2);
        monpic2 = findViewById(R.id.imageView32);
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
                    txt2.setText("ID: "+idstart+valkyrie.getHeroID());
                    txt5a.setText(""+valkyrie.getLvl());
                    txt3.setText(""+wholenum.format(+valkyrie.baseHPwSTR())+"/"+wholenum.format(valkyrie.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(valkyrie.baseHPwSTR())+"/"+wholenum.format(valkyrie.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(valkyrie.pAtkPts())+" \nPhysical Def: "+wholenum.format(valkyrie.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(valkyrie.mAtkPts())+" \nMagic Def: "+wholenum.format(valkyrie.mDefPts())+"\nEvasion Rate: "+decF.format(valkyrie.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(valkyrie.strWithGrowth())+" INT: "+wholenum.format(valkyrie.intWithGrowth())+
                            " AGI: "+wholenum.format(valkyrie.agiWithGrowth()));
                    info.setText("Is it a bird??\nIs it a plane??\nIt's not superman.");

                }

                if (spin.equals("Shield Maiden")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    shieldMaiden.setLvl(40);

                    //layout display
                    txt.setText(shieldMaiden.getHeroClass());
                    txt2.setText("ID: "+idstart+shieldMaiden.getHeroID());
                    txt5a.setText(""+shieldMaiden.getLvl());
                    txt3.setText(""+wholenum.format(shieldMaiden.baseHPwSTR())+"/"+wholenum.format(shieldMaiden.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(shieldMaiden.baseHPwSTR())+wholenum.format(shieldMaiden.baseHPwSTR()));
                    txt4.setText("Physical Atk: "+wholenum.format(shieldMaiden.pAtkPts())+" \nPhysical Def: "+wholenum.format(shieldMaiden.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(shieldMaiden.mAtkPts())+" \nMagic Def: "+wholenum.format(shieldMaiden.mDefPts())+"\nEvasion Rate: "+decF.format(shieldMaiden.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(shieldMaiden.strWithGrowth())+" INT: "+wholenum.format(shieldMaiden.intWithGrowth())+
                            " AGI: "+wholenum.format(shieldMaiden.agiWithGrowth()));
                    info.setText("CAN shield you away from your problems");

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
                        txt2.setText("ID: "+idstart+shieldMaiden.getHeroID());
                        txt5a.setText(""+shieldMaiden.getLvl());
                        txt3.setText(""+wholenum.format(+shieldMaiden.baseHPwSTR())+"/"+wholenum.format(shieldMaiden.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(shieldMaiden.baseHPwSTR())+"/"+wholenum.format(shieldMaiden.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(shieldMaiden.pAtkPts())+" \nPhysical Def: "+shieldMaiden.pDefPts()+
                                "\nMagic Atk: "+shieldMaiden.mAtkPts()+" \nMagic Def: "+shieldMaiden.mDefPts()+"\nEvasion Rate: "+decF.format(shieldMaiden.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(shieldMaiden.strWithGrowth())+" INT: "+wholenum.format(shieldMaiden.intWithGrowth())+
                                " AGI: "+wholenum.format(shieldMaiden.agiWithGrowth()));

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
                        txt2.setText("ID: "+idstart+valkyrie.getHeroID());
                        txt5a.setText(valkyrie.getLvl());
                        txt3.setText(""+wholenum.format(+valkyrie.baseHPwSTR())+"/"+wholenum.format(valkyrie.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(valkyrie.baseHPwSTR())+"/"+wholenum.format(valkyrie.baseHPwSTR()));
                        txt4.setText("Physical Atk: "+wholenum.format(valkyrie.pAtkPts())+" \nPhysical Def: "+valkyrie.pDefPts()+
                                "\nMagic Atk: "+valkyrie.mAtkPts()+" \nMagic Def: "+valkyrie.mDefPts()+"\nEvasion Rate: "+decF.format(valkyrie.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(valkyrie.strWithGrowth())+" INT: "+wholenum.format(valkyrie.intWithGrowth())+
                                " AGI: "+wholenum.format(valkyrie.agiWithGrowth()));

                    }


                    else {
                        Toast.makeText(WARRIOR.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WARRIOR.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
