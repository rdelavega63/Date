public class Fecha {
private int dia;
private int mes;
private int anio;
private String factual;
public void convierteFecha(String date) {
        String str = date.toString();
        factual = str;
        String[] data = str.split("\\.");
        this.dia = Integer.parseInt(data[2]);
        this.mes = Integer.parseInt(data[1]);
        this.anio = Integer.parseInt(data[0]);
}
public String formatoGeneral() {
        String nStr = String.format("%02d", dia)+"/"+String.format("%02d", mes)+"/"+String.format("%04d", anio);
        return nStr;
}
public boolean esBisiesto() {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                return true;
        } else {
                return false;
        }
}
public int diferenciaAnios(String date) {
        String[] data = new String[2];
        String str = date.toString();
        String[] fecha2 = str.split("\\.");
        data[0] = factual;
        data[1] = date;
        try {
                validaFecha(data);
                return (anio - Integer.parseInt(fecha2[0]));
        } catch (ExceptionAnios e) {
                System.out.println("\t\t"+e.toString());
                return 0;
        }
}
public static void validaFecha(String[] date) throws ExceptionAnios {
        String[] str = new String[2];

        for (int i = 0; i < date.length; i++) {
                str[i] = date[i].toString();
        }

        String[] date1 = str[0].split("\\.");
        String[] date2 = str[1].split("\\.");

        if (Integer.parseInt(date2[0]) > Integer.parseInt(date1[0])
            && Integer.parseInt(date2[1]) > Integer.parseInt(date1[1])
            && Integer.parseInt(date2[2]) > Integer.parseInt(date1[2])) {
                throw new ExceptionAnios("FECHA 2 MAYOR");
        } else if (Integer.parseInt(date2[0]) > Integer.parseInt(date1[0])
                   && Integer.parseInt(date2[1]) > Integer.parseInt(date1[1])) {
                throw new ExceptionAnios("FECHA 2 MAYOR");
        } else if (Integer.parseInt(date2[0]) > Integer.parseInt(date1[0])) {
                throw new ExceptionAnios("FECHA 2 MAYOR");
        }
}
}
