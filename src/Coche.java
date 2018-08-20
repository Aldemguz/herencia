/*
 Definicion de un coche
 * @author aldemaro
 */
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    
    public Coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma = 500;
    }
    
    public String dime_datos_generales(){
        return "ruedas: "+ruedas+", largo: "+largo/1000+"mts, ancho: "+ancho+
                "cms, peso: "+peso_plataforma+" kg";
    }
    
    public void establece_color(String color_coche){
        this.color = color_coche;
    }
    
    public String dime_color(){
        return "el colore es: "+color;
    }
    
    public void configura_asientos(String asientos_cueros){
        if(asientos_cueros.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }
        else
            this.asientos_cuero=false;
    }
    public String dime_asientos(){
        if(asientos_cuero)
            return "El coche tiene asientos de cuero";
        else
            return "El coche no tiene asientos de cuero";
    }
    
    public void configura_climatizador(String climatizador_coche){
        if(climatizador_coche.equalsIgnoreCase("si")){
            this.climatizador=true;
        }
        else
            this.asientos_cuero=false;
    }
    public String dime_climatizador(){
        if(climatizador)
            return "El coche tiene climatizador";
        else
            return "El coche no tiene climatizador";
    }
    
    public String asignar_peso_coche(){
        int peso_carroceria = 500;
        peso_total = peso_plataforma+peso_carroceria;
        if(asientos_cuero)
            peso_total+=50;
        else
            peso_total+=20;
        
        return "el peso del coche es: "+ peso_total+ "\n";
    }
   
    
}
