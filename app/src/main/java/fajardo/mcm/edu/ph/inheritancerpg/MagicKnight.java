package fajardo.mcm.edu.ph.inheritancerpg;

public class MagicKnight extends Hero {

    //WA NIY LABOT NA CLASS AHHAHA

    public MagicKnight(int id, double baseHP, double baseMP, double pAtk,
                       double mAtk, double pDef, double mDef, String heroClass,
                       int heroID, int lvl, double exp, double baseSTR,
                       double baseAGI, double baseINT , double strGrowth,
                       double agiGrowth, double intGrowth, double evasion){

        super(id, baseHP, baseMP, pAtk, mAtk, pDef, mDef, heroClass,
                heroID, lvl, exp, baseSTR, baseAGI, baseINT, strGrowth,
                agiGrowth, intGrowth, evasion);

    }


    @Override
    public double baseHPwSTR () {
        return super.getBaseHP() + (20*strWithGrowth() +5*intWithGrowth());
    }

}
