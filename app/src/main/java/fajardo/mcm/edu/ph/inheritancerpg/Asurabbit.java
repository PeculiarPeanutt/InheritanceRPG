package fajardo.mcm.edu.ph.inheritancerpg;

public class Asurabbit extends Hero {

    public Asurabbit (int id, double baseHP, double baseMP, double pAtk,
                      double mAtk, double pDef, double mDef, String heroClass,
                      int heroID, int lvl, double exp, double baseSTR,
                      double baseAGI, double baseINT , double strGrowth,
                      double agiGrowth, double intGrowth, double evasion)
    {
        super(id, baseHP, baseMP, pAtk, mAtk, pDef, mDef, heroClass,
                heroID, lvl, exp, baseSTR, baseAGI, baseINT, strGrowth,
                agiGrowth, intGrowth, evasion);
    }


    @Override
    public double baseHPwSTR () {
        return super.getBaseHP() + (20*strWithGrowth() +5*intWithGrowth());
    }

    public double baseMPwAGI () {
        return super.getBaseMP() + (10*agiWithGrowth()+10*super.intWithGrowth());
    }


    //if mag error try this basig pwede -- super.intWithGrowth() vice versa lng
}
