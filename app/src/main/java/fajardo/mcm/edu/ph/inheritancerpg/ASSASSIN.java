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

public class ASSASSIN extends AppCompatActivity {

    TextView txt, txt2, txt3,txt3a, txt4, txt5 , txt4a, txt5a, info;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#%");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 202000;
    
    
    Asurabbit asura = new Asurabbit(1,200,100,50,25,35,15,"Asurabbit",1,
            1,0,30,50,20,0.50,0.80,0.25, 0.05);
    
    Usaginobi usaginobi = new Usaginobi(1,200,100,50,25,35,15,"Usaginobi",1,
            1,0,30,50,20,0.50,0.80,0.25, 0.05);
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assassin);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.textView3);
        txt3a=findViewById(R.id.textView4);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt4a = findViewById(R.id.txt4a);
        txt5a = findViewById(R.id.txt5a);
        info=findViewById(R.id.textViewInfo);
        monpic1 = findViewById(R.id.imageView8);
        monpic2 = findViewById(R.id.imageView14);
        spinner = findViewById(R.id.spinner);
        editAdd = findViewById(R.id.editAdd);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        
        
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                
                spin = spinner.getSelectedItem().toString();
                
                
                
                if (spin.equals("Usaginobi")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    
                    usaginobi.setLvl(40);

                    //layout display
                    txt.setText(usaginobi.getHeroClass());
                    txt5a.setText(""+usaginobi.getLvl());
                    txt2.setText("ID: "+idstart+usaginobi.getHeroID());
                    txt3.setText(wholenum.format(usaginobi.baseHPwSTR())+"/"+wholenum.format(usaginobi.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(usaginobi.baseMPwAGI())+"/"+wholenum.format(usaginobi.baseMPwAGI()));
                    txt4.setText("Physical Atk: "+wholenum.format(usaginobi.pAtkPts())+"\nPhysical Def: "+wholenum.format(usaginobi.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(usaginobi.mAtkPts())+" Magic Def: "+wholenum.format(usaginobi.mDefPts())+"\nEvasion Rate: "+decF.format(usaginobi.evasionPts()));
                    txt4a.setText("STR: "+wholenum.format(usaginobi.strWithGrowth())+" INT: "+wholenum.format(usaginobi.intWithGrowth())+ " AGI: "+wholenum.format(usaginobi.agiWithGrowth()));
                    info.setText("Not here to become the hokage,\nbut here to probably kill the hokage");

                }

                if (spin.equals("Asurabbit")) {

                    //pictures
                    monpic1.setVisibility(View.INVISIBLE);
                    monpic2.setVisibility(View.VISIBLE);

                    asura.setLvl(40);

                    //layout display
                    txt.setText(asura.getHeroClass());
                    txt2.setText("ID: "+idstart+asura.getHeroID());
                    txt3.setText(""+wholenum.format(asura.baseHPwSTR())+"/"+wholenum.format(asura.baseHPwSTR()));
                    txt3a.setText(""+wholenum.format(asura.baseMPwAGI())+"/"+wholenum.format(asura.baseMPwAGI()));
                    txt4.setText("Physical Atk: "+wholenum.format(asura.pAtkPts())+" Physical Def: "+wholenum.format(asura.pDefPts())+
                            "\nMagic Atk: "+wholenum.format(asura.mAtkPts())+" Magic Def: "+wholenum.format(asura.mDefPts())+("\nEvasion Rate: "+decF.format(asura.evasionPts())));
                    txt4a.setText("STR: "+wholenum.format(asura.strWithGrowth())+" INT: "+wholenum.format(asura.intWithGrowth())+ " AGI: "+wholenum.format(asura.agiWithGrowth()));
                    txt5a.setText(""+asura.getLvl());
                    info.setText("Rabbit from the pits of hell!\nAlso has Sharinggan, probably.");

                }
                
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (spin.equals("Asurabbit")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    asura.setLvl(level);

                    if ((asura.getLvl() >= 40) && (asura.getLvl() <= 99)) {


                        txt.setText(asura.getHeroClass());
                        txt2.setText("ID: "+idstart+asura.getHeroID());
                        txt5a.setText(""+asura.getLvl());
                        txt3.setText("HP: "+wholenum.format(asura.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(asura.baseMPwAGI()));
                        txt4.setText("Physical Atk: "+decF.format(asura.pAtkPts())+" Physical Def: "+decF.format(asura.pDefPts())+
                                "\nMagic Atk: "+decF.format(asura.mAtkPts())+" Magic Def: "+decF.format(asura.mDefPts()));
                        txt4a.setText("STR: "+wholenum.format(asura.strWithGrowth())+" INT: "+wholenum.format(asura.intWithGrowth())+
                                " AGI: "+wholenum.format(asura.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(asura.evasionPts()));

                    }


                    else {
                        Toast.makeText(ASSASSIN.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }


                else if (spin.equals("Usaginobi")) {

                    int level;
                    level = Integer.parseInt(String.valueOf(editAdd.getText()));
                    usaginobi.setLvl(level);

                    if ((usaginobi.getLvl() >= 40) && (usaginobi.getLvl() <= 99)) {


                        txt.setText(usaginobi.getHeroClass());
                        txt2.setText("ID: "+idstart+usaginobi.getHeroID());
                        txt5a.setText(""+usaginobi.getLvl());
                        txt3.setText(wholenum.format(usaginobi.baseHPwSTR())+"/"+wholenum.format(usaginobi.baseHPwSTR()));
                        txt3a.setText(""+wholenum.format(usaginobi.baseMPwAGI())+"/"+wholenum.format(usaginobi.baseMPwAGI()));
                        txt4.setText("Physical Atk: "+wholenum.format(usaginobi.pAtkPts())+"\nPhysical Def: "+wholenum.format(usaginobi.pDefPts())+
                                "\nMagic Atk: "+wholenum.format(usaginobi.mAtkPts())+"\nMagic Def: "+wholenum.format(usaginobi.mDefPts())+"\nEvasion Rate: "+decF.format(usaginobi.evasionPts()));
                        txt4a.setText("STR: "+wholenum.format(usaginobi.strWithGrowth())+" INT: "+wholenum.format(usaginobi.intWithGrowth())+
                                " AGI: "+wholenum.format(usaginobi.agiWithGrowth()));
                        
                    }


                    else {
                        Toast.makeText(ASSASSIN.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }



            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ASSASSIN.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
