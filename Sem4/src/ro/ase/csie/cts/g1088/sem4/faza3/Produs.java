package ro.ase.csie.cts.g1088.sem4.faza3;

import ro.ase.csie.cts.g1088.sem4.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.sem4.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.sem4.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.g1088.sem4.faza3.servicii.InterfataValidare;

public class Produs {


    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
            throws ExceptiePretInvalid, ExceptieVechimeClient {

        InterfataMarketing serviciuMk = null;
        InterfataValidare serviciuValidare = null;

        serviciuValidare.validarePret(pretInitial);
        serviciuValidare.validareVechime(vechimeClientInAni);

        float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0 : serviciuMk.getDiscountFidelitate(vechimeClientInAni);

        float discount = tipProdus.getDiscount();
        float valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount);
        float pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);

        return pretFinal;
    }

    private static float getPretCuDiscount(float pretInitial, float discount) {
        return pretInitial - (discount * pretInitial);
    }




}