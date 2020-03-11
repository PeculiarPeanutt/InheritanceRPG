package fajardo.mcm.edu.ph.inheritancerpg;

public class Usaginobi extends Hero {

    public Usaginobi (int id, double baseHP, double baseMP, double pAtk,
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
        return super.getBaseHP() + (20*intWithGrowth()+10*strWithGrowth());
    }

    public double baseMPwAGI () {
        return super.getBaseMP() + (10*agiWithGrowth());
    }

}
