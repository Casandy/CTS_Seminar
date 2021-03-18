package ro.ase.csie.cts.g1088.sem4.faza3.servicii;

import ro.ase.csie.cts.g1088.sem4.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.sem4.exceptii.ExceptieVechimeClient;

public class ServiciuValidari implements InterfataValidare {
    @Override
    public void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient {
        if (vechimeClientInAni < 0) {
            throw new ExceptieVechimeClient();
        }
    }

    @Override
    public void validarePret(float pretInitial) throws ExceptiePretInvalid {
        if (pretInitial <= 0) {
            throw new ExceptiePretInvalid();
        }

    }
}