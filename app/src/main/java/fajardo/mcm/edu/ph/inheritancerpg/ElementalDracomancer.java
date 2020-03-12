package fajardo.mcm.edu.ph.inheritancerpg;

public class ElementalDracomancer extends Hero {

    public ElementalDracomancer (int id, double baseHP, double baseMP, double pAtk,
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
        return getBaseHP() + (20*strWithGrowth());
    }

    @Override
    public double baseMPwINT () {
        return getBaseMP() + (20*intWithGrowth());
    }

    @Override
    public double mAtkPts () {
        return super.getmAtk()*(.1*intWithGrowth()+.1*strWithGrowth()+.1*agiWithGrowth());
    }

    @Override
    public double mDefPts () {
        return super.getmDef()+(.1*intWithGrowth()+.1*strWithGrowth()+.1*agiWithGrowth());
    }


}
