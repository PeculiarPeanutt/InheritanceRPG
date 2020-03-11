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

public class ASSASSIN extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4, txt5 , txt4a, txt5a;
    ImageView monpic1, monpic2;
    Spinner spinner;
    String spin ;
    EditText editAdd;
    Button btn, btn2;
    DecimalFormat decF = new DecimalFormat("#.##");
    DecimalFormat wholenum = new DecimalFormat("#");
    int idstart = 20200311;
    
    
    Asurabbit asura = new Asurabbit(1,200,100,50,25,35,15,"Asurabbit",1,
            1,0,30,50,20,0.50,0.80,0.25, 0.05);
    
    Usaginobi usaginobi = new Usaginobi(1,200,100,50,25,35,15,"Usaginobi",1,
            1,0,30,50,20,0.50,0.80,0.25, 0.05);
    

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
                
                
                
                if (spin.equals("Usaginobi")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);
                    
                    usaginobi.setLvl(40);

                    //layout display
                    txt.setText(usaginobi.getHeroClass());
                    txt2.setText("ID: "+idstart+usaginobi.getHeroID() + " Level: "+usaginobi.getLvl());
                    txt3.setText("HP: "+wholenum.format(usaginobi.baseHPwSTR())+" MP: "+wholenum.format(usaginobi.baseMPwAGI()));
                    txt4.setText("pAtk: "+decF.format(usaginobi.pAtkPts())+" pDef: "+usaginobi.pDefPts()+
                            "\nmAtk: "+usaginobi.mAtkPts()+" mDef: "+usaginobi.mDefPts());
                    txt4a.setText("STR: "+wholenum.format(usaginobi.strWithGrowth())+" INT: "+wholenum.format(usaginobi.intWithGrowth())+
                            " AGI: "+wholenum.format(usaginobi.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(usaginobi.evasionPts()));
                    
                }

                if (spin.equals("Asurabbit")) {

                    //pictures
                    monpic1.setVisibility(View.VISIBLE);
                    monpic2.setVisibility(View.INVISIBLE);

                    asura.setLvl(40);

                    //layout display
                    txt.setText(asura.getHeroClass());
                    txt2.setText("ID: "+idstart+asura.getHeroID() + " Level: "+asura.getLvl());
                    txt3.setText("HP: "+wholenum.format(asura.baseHPwSTR())+" MP: "+wholenum.format(asura.baseMPwAGI()));
                    txt4.setText("pAtk: "+decF.format(asura.pAtkPts())+" pDef: "+asura.pDefPts()+
                            "\nmAtk: "+asura.mAtkPts()+" mDef: "+asura.mDefPts());
                    txt4a.setText("STR: "+wholenum.format(asura.strWithGrowth())+" INT: "+wholenum.format(asura.intWithGrowth())+
                            " AGI: "+wholenum.format(asura.agiWithGrowth()));
                    txt5.setText("Evasion Rate: "+decF.format(asura.evasionPts()));

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
                        txt2.setText("ID: "+idstart+asura.getHeroID() + " Level: "+asura.getLvl());
                        txt3.setText("HP: "+wholenum.format(asura.baseHPwSTR())+" MP: "+wholenum.format(asura.baseMPwAGI()));
                        txt4.setText("pAtk: "+decF.format(asura.pAtkPts())+" pDef: "+asura.pDefPts()+
                                "\nmAtk: "+asura.mAtkPts()+" mDef: "+asura.mDefPts());
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
                        txt2.setText("ID: "+idstart+usaginobi.getHeroID() + " Level: "+usaginobi.getLvl());
                        txt3.setText("HP: "+wholenum.format(usaginobi.baseHPwSTR())+" MP: "+wholenum.format(usaginobi.baseMPwAGI()));
                        txt4.setText("pAtk: "+decF.format(usaginobi.pAtkPts())+" pDef: "+usaginobi.pDefPts()+
                                "\nmAtk: "+usaginobi.mAtkPts()+" mDef: "+usaginobi.mDefPts());
                        txt4a.setText("STR: "+wholenum.format(usaginobi.strWithGrowth())+" INT: "+wholenum.format(usaginobi.intWithGrowth())+
                                " AGI: "+wholenum.format(usaginobi.agiWithGrowth()));
                        txt5.setText("Evasion Rate: "+decF.format(usaginobi.evasionPts()));
                    }


                    else {
                        Toast.makeText(ASSASSIN.this,
                                "Invalid level value",
                                Toast.LENGTH_LONG).show();
                    }
                }




            }
        });




    }
}
