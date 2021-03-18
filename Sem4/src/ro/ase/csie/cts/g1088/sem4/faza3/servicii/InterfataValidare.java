package ro.ase.csie.cts.g1088.sem4.faza3.servicii;

import ro.ase.csie.cts.g1088.sem4.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.sem4.exceptii.ExceptieVechimeClient;

public interface InterfataValidare {

    public void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient;

    public void validarePret(float pretInitial) throws ExceptiePretInvalid;
}