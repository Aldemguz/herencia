/*
 Probando herencias, video 40. codigo facilito
 * @author aldemaro
 */
public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche(); //Creando 1 solo coche.
        coche1.establece_color("Rojo");
        
        Furgoneta furgo1 = new Furgoneta(7,580);
        furgo1.establece_color("Azul");
        furgo1.configura_asientos("si");
        furgo1.configura_climatizador("si");
        
        
        System.out.println(coche1.dime_datos_generales());
        System.out.println(furgo1.dime_datos_generales()+" "+furgo1.dimeDatosFurgoneta());
    }
    
}
