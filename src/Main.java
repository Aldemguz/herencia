/*
 Probando herencias, video 40. codigo facilito
 * @author aldemaro
 */
public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Edicson");
        Jefatura jefe1 = new Jefatura("Aldemaro",300.00,2018,8,20);
        System.out.println(empleado1.dimeFechaContrato());
        System.out.println(jefe1.dimeFechaContrato());
    }
    
}
