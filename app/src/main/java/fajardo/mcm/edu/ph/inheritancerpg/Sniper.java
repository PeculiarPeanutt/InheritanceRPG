package fajardo.mcm.edu.ph.inheritancerpg;

public class Sniper extends Hero  {

    public Sniper (int id, double baseHP, double baseMP, double pAtk,
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
        return getBaseHP() + (20*agiWithGrowth());
    }

    @Override
    public double pDefPts () {
        return super.getpDef()+(.2*agiWithGrowth()+.1*strWithGrowth());
    }
    @Override
    public double mDefPts () {
        return super.getmDef()+(.1*agiWithGrowth()+.1*intWithGrowth());
    }
    @Override
    public double evasionPts() {
        return getEvasion()+getAgiGrowth()*(.0004)*intWithGrowth();
    }


}
