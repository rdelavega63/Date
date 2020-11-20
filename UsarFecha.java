/********************************************************
* Examen 1:                                            *
* El programa debe ejecutarse desde linea de comandos: *
* Por ejemplo:                                         *
* java UsarFecha 2008.8.11 2001.08.10                  *
* @brief Operaciones de fecha.                          *
* @author Ricardo de la Vega Barron .                   *
********************************************************/


import java.util.*;
import java.lang.*;

public class UsarFecha {
public static void main(String[] args) {
        Fecha date1 = new Fecha();
        Fecha date2 = new Fecha();
        ///////////////////////////////////
        // Compara fecha1 contra fecha 2 //
        ///////////////////////////////////

        System.out.println("\nFecha 1:");
        date1.convierteFecha(args[0]);
        System.out.println("\t\tFormato General: "+date1.formatoGeneral());
        System.out.println("\t\tEs Bisiesto: : "+date1.esBisiesto());
        System.out.println("\t\tDiferencia de fechas: "+date1.diferenciaAnios(args[1])+" anio[s]");

        //////////////////////////////////
        // Compara fecha2 contra fecha1 //
        //////////////////////////////////

        System.out.println("\n\nFecha 2:");
        date2.convierteFecha(args[1]);
        System.out.println("\t\tFormato General: "+date2.formatoGeneral());
        System.out.println("\t\tEs Bisiesto: : "+date2.esBisiesto());
        System.out.println("\t\tDiferencia de fechas: "+date2.diferenciaAnios(args[0])+" anios[s]");
}

}
