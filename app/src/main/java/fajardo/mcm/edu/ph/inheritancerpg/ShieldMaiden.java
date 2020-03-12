package fajardo.mcm.edu.ph.inheritancerpg;

public class ShieldMaiden extends Hero {

    public ShieldMaiden (int id, double baseHP, double baseMP, double pAtk,
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
    public double pDefPts () {
        return super.getpDef()+(.1*strWithGrowth()+ .1*agiWithGrowth());
    }
    @Override
    public double mDefPts () {
        return super.getmDef()+(.1*strWithGrowth()+ .1*intWithGrowth());
    }
    @Override
    public double evasionPts() {
        return getEvasion()+agiWithGrowth()*(.0004)*intWithGrowth();
    }


}
