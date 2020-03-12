package fajardo.mcm.edu.ph.inheritancerpg;

public class Valkyrie extends Hero {

    public Valkyrie (int id, double baseHP, double baseMP, double pAtk,
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
        return super.getBaseHP() + (30*strWithGrowth());
    }

    @Override
    public double pAtkPts () {
        return super.getpAtk()+(.1*agiWithGrowth())+(.3*strWithGrowth()) ;
    }

    @Override
    public double mAtkPts () {
        return super.getmAtk()*(.2*intWithGrowth());
    }

}
