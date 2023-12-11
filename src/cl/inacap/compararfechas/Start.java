package cl.inacap.compararfechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Start {

	public static void main(String[] args) {
        try {
            SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = sdformat.parse("05/10/2020");
            Date fecha2 = sdformat.parse("05/10/2021");
            System.out.println("Fecha-1: " + sdformat.format(fecha1));
            System.out.println("Fecha-2: " + sdformat.format(fecha2));
            if (fecha2.after(fecha1)) {
                System.out.println("Fecha-2 es después que Fecha-1");
            }
            if (fecha1.equals(fecha2)) {
            	System.out.println("Fecha-1 y Fecha-2 son iguales");
            }
        } catch (ParseException ex) {
        	
        }
    }
    
}   
