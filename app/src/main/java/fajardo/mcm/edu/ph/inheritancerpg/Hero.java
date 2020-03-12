package fajardo.mcm.edu.ph.inheritancerpg;

public class Hero extends Characters {

    private String heroClass;
    private int lvl, heroID;
    private double exp;
    private double baseSTR, baseAGI, baseINT;
    private double strGrowth, agiGrowth, intGrowth, evasion;

    public Hero(int id, double baseHP, double baseMP, double pAtk,
                double mAtk, double pDef, double mDef, String heroClass,
                int heroID, int lvl, double exp, double baseSTR,
                double baseAGI, double baseINT , double strGrowth,
                double agiGrowth, double intGrowth, double evasion)
    {

        super(id, baseHP, baseMP, pAtk, mAtk, pDef, mDef);
        this.heroClass = heroClass;
        this.lvl = lvl;
        this.heroID = heroID;
        this.exp = exp;
        this.baseSTR = baseSTR;
        this.baseAGI = baseAGI;
        this.baseINT = baseINT;
        this.strGrowth = strGrowth;
        this.agiGrowth = agiGrowth;
        this.intGrowth = intGrowth;
        this.evasion = evasion;

    }

    //setters
    @Override
    public void setBaseHP(double baseHP) {
        super.setBaseHP(baseHP);
    }
    @Override
    public void setBaseMP(double baseMP) {
        super.setBaseMP(baseMP);
    }
    @Override
    public void setpAtk(double pAtk) {
        super.setpAtk(pAtk);
    }
    @Override
    public void setmAtk(double mAtk) {
        super.setmAtk(mAtk);
    }
    @Override
    public void setpDef(double pDef) {
        super.setpDef(pDef);
    }
    @Override
    public void setmDef(double mDef) {
        super.setmDef(mDef);
    }

    //getters
    @Override
    public double getBaseHP() {
        return super.getBaseHP();
    }
    @Override
    public double getBaseMP() {
        return super.getBaseMP();
    }
    @Override
    public double getpAtk() {
        return super.getpAtk();
    }
    @Override
    public double getmAtk() {
        return super.getmAtk();
    }
    @Override
    public double getpDef() {
        return super.getpDef();
    }
    @Override
    public double getmDef() {
        return super.getmDef();
    }



    //local setters and getters
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    public void setBaseSTR(double baseSTR) {
        this.baseSTR = baseSTR;
    }
    public void setBaseAGI(double baseAGI) {
        this.baseAGI = baseAGI;
    }
    public void setBaseINT(double baseINT) {
        this.baseINT = baseINT;
    }
    public void setStrGrowth(double strGrowth) {
        this.strGrowth = strGrowth;
    }
    public void setAgiGrowth(double agiGrowth) {
        this.agiGrowth = agiGrowth;
    }
    public void setIntGrowth(double intGrowth) {
        this.intGrowth = intGrowth;
    }
    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }
    public int getLvl() {
        return lvl;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public int getHeroID() {
        return heroID;
    }
    public double getExp() {
        return exp;
    }
    public double getBaseSTR() {
        return baseSTR;
    }
    public double getBaseAGI() {
        return baseAGI;
    }
    public double getBaseINT() {
        return baseINT;
    }
    public double getAgiGrowth() {
        return agiGrowth;
    }
    public double getIntGrowth() {
        return intGrowth;
    }
    public double getStrGrowth() {
        return strGrowth;
    }
    public double getEvasion() {
        return evasion;
    }





    //methods
    public double baseHPwSTR () {
        return getBaseHP() + (10*strWithGrowth());
    }
    public double baseMPwINT () {
        return getBaseMP() + (10*intWithGrowth());
    }
    public double strWithGrowth() {
        return baseSTR + (strGrowth*lvl);
    }
    public double agiWithGrowth() {
        return baseAGI + (agiGrowth*lvl);
    }
    public double intWithGrowth() {
        return baseINT + (intGrowth*lvl);
    }
    public double pAtkPts () {
        return super.getpAtk()+(.2*agiWithGrowth())+(.2*strWithGrowth()) ;
    }
    public double pDefPts () {
        return super.getpDef()+(.1*agiWithGrowth());
    }
    public double mDefPts () {
        return super.getmDef()+(.2*intWithGrowth());
    }
    public double evasionPts() {
        return getEvasion()+getAgiGrowth()*(.0004);
    }
    public double mAtkPts () {
        return super.getmAtk()*(.3*intWithGrowth());
    }

}
