package ro.ase.csie.cts.g1088.dp.decorator;

public class TestDecorator {
    public static void main(String[] args) {

        SuperErou dragon = new Dragon("Dragon albastru", 1000);
        dragon.alearga();
        dragon.esteLovit(800);
        dragon.seVindeca(100);

        SuperErou dragon2 = new Dragon("Dragon galben", 1000);
        dragon.alearga();
        dragon.esteLovit(200);
        dragon.seVindeca(100);

        //aplicam decoratori pe primul dragon
        //SuperErou dragonCuArmura = new DecoratorArmura(dragon, 300);
        //dragonCuArmura.esteLovit(400);

        dragon = new DecoratorArmura(dragon, 300);
        dragon.esteLovit(400);

        dragon = new DecoratorEsteRanit(dragon);
        dragon.esteLovit(400);
        dragon.alearga();

    }
}
