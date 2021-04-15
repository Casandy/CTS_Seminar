package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class DecoratorErouAbstract extends SuperErou {

    SuperErou erou = null;

    public DecoratorErouAbstract(SuperErou erou) {
        super(erou.nume, erou.puncteViata);
        this.erou = erou;
    }

    public DecoratorErouAbstract(String nume, int puncteViata) {
        super(nume, puncteViata);
    }

    @Override
    public void alearga() {
        this.erou.alearga();
    }

    @Override
    public void esteLovit(int puncte) {
        this.erou.esteLovit(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.erou.seVindeca(puncte);
    }
}
