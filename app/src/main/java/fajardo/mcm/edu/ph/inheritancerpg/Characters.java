package fajardo.mcm.edu.ph.inheritancerpg;

public class Characters {

    private int id;
    private double baseHP, baseMP, pAtk, mAtk , pDef , mDef;

    public Characters (int id, double baseHP, double baseMP, double pAtk,
                      double mAtk, double pDef, double mDef){

        this.id = id;
        this.baseHP = baseHP;
        this.baseMP = baseMP;
        this.pAtk = pAtk;
        this.mAtk = mAtk;
        this.pDef = pDef;
        this.mDef = mDef;

    }

    //setters

    public void setId (int id) {
        this.id = id;
    }

    public void setBaseHP(double baseHP) {
        this.baseHP = baseHP;
    }

    public void setBaseMP(double baseMP) {
        this.baseMP = baseMP;
    }

    public void setpAtk(double pAtk) {
        this.pAtk = pAtk;
    }

    public void setmAtk(double mAtk) {
        this.mAtk = mAtk;
    }

    public void setpDef(double pDef) {
        this.pDef = pDef;
    }

    public void setmDef(double mDef) {
        this.mDef = mDef;
    }

    //getters

    public int getId() {
        return id;
    }

    public double getBaseHP() {
        return baseHP;
    }

    public double getBaseMP() {
        return baseMP;
    }

    public double getpAtk() {
        return pAtk;
    }

    public double getmAtk() {
        return mAtk;
    }

    public double getpDef() {
        return pDef;
    }

    public double getmDef() {
        return mDef;
    }


}

