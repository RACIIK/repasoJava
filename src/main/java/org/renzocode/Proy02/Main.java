package org.renzocode.Proy02;

import org.renzocode.Proy02.CriaturasMarinas.Delfin;
import org.renzocode.Proy02.CriaturasMarinas.Pulpo;


public class Main {

    public static void main (String[] args){

        Delfin delfin = new Delfin("Rodolfo");
        Pulpo pulpo = new Pulpo("Gonzales", 6);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();

    }
}
