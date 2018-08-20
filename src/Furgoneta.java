/*
 Clase furgoneta
 * @author aldemaro
 */
//      jerga de programacion.
//  JAVA NO ADMITE HERENCIAS MULTIPLES!!!.
//        clase-hijo        clase-padre
//         sub-clase         super-clase
public class Furgoneta extends Coche{
    //Attributes
    private int capacidad_carga;
    private int plazas_extras;
    
    //Methods
    public Furgoneta(int plazas_extras, int capacidad_carga){
        super(); // llama al constructor de la clase-padre
        this.capacidad_carga = capacidad_carga;
        this.plazas_extras = plazas_extras;
    }
    
    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es: "+capacidad_carga+" y las plazas son:"
                +plazas_extras;
    }
}
