package fajardo.mcm.edu.ph.inheritancerpg;

public class Monster extends Characters {

    private String descrip;

    public Monster (int id, double baseHP, double baseMP, double pAtk,
                    double mAtk, double pDef, double mDef, String descrip) {

        super(id, baseHP, baseMP, pAtk, mAtk, pDef, mDef);
        this.descrip = descrip;

    }


    //setters
    @Override
    public void setId(int id) {
        super.setId(id);
    }
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
    public int getId() {
        return super.getId();
    }
    @Override
    public double getBaseHP() {
        return super.getBaseHP();
    }
    @Override
    public double getBaseMP() {
        return super.getBaseMP();
    }
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

    //local
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public String getDescrip() {
        return descrip;
    }
}
