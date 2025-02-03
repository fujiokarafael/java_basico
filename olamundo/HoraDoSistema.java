package olamundo;

import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {
    public static void main (String[] argv){

        Date date = new Date();
        Locale local= Locale.getDefault();


        System.out.println("A hora do sistema é: "+ date.toString());

        System.out.println(local.getDisplayLanguage());

    }
}
