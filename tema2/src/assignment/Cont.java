package assignment;

public class Cont {
    private double	valoareImprumut;
    private double rata;
    private int	zileActiv;
    private Account tipCont;

    public double getValoareImprumut() {
        return this.valoareImprumut;
    }

    public double getRata() {
        return this.rata;
    }

    public int getZileActiv() {
        return this.zileActiv;
    }

    public Account getTipCont() {
        return this.tipCont;
    }

    public boolean validator (double val) throws Exception {
        if(val < 0 ) {
            throw new Exception();
        } else {
            return true;
        }
    }

    //metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
    public double getRataLunara() {
        return getValoareImprumut() * getRata();
    }

    public void setValoareImprumut(double valoare) throws Exception {
        if(validator(valoare)) {
            this.valoareImprumut = valoare;
        }
    }

    public void setRata(double rata) throws Exception {
        if(validator(rata)) {
            this.rata = rata;
        }
    }

    public void setZileActiv(int zileActiv){
        this.zileActiv = zileActiv;
    }

    public void setTipCont(Account tipCont) {
        this.tipCont = tipCont;
    }

    @Override
    public String toString() {
        return "Loan: " + getValoareImprumut() +
                "; rate: " + getRata() +
                "; days active:" + getZileActiv() +
                "; Type: " + getTipCont() +
                ";";
    }

    public void print() {
        System.out.println("This is an account");
    }

    public static double calculeazaComisionTotal(Cont[]	conturi) {
        double comisionTotal = 0.0;
        Cont cont;
        for	(int i = 0;i < conturi.length;i++) {
            cont=conturi[i];
            comisionTotal += calculeazaComision(cont);

        }
        return	comisionTotal;
    }

    private static double calculeazaComision(Cont cont) {
        double comision = 0.0125;
        double temp = 365;
        if(cont.tipCont == Account.PREMIUM || cont.tipCont == Account.SUPER_PREMIUM) {
            return comision * (cont.valoareImprumut *
                    Math.pow(cont.rata, (cont.zileActiv / temp)) -
                    cont.valoareImprumut);
        } else {
            return 0;
        }
    }

    public Cont(double valoare, double rata, Account tip_cont) throws Exception {
        if(validator(valoare) && validator(rata)) {
            setValoareImprumut(valoare);
            setRata(rata);
        }
        setTipCont(tip_cont);
    }


}