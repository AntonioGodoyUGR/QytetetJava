package qytetetjava;

public class TituloPropiedad {

    private String nombre;
    private boolean hipotecado;
    private int alquilerBase;
    private int factorRevalorizacion;
    private int hipotecaBase;
    private int precioEdificar;
    private Casilla casilla;
    private Jugador propietario;
    
    public TituloPropiedad(String nombre, int alquilerBase, int hipotecaBase, int precioEdificar, int factorRevalorizacion){
        
        this.nombre = nombre;
        this.alquilerBase = alquilerBase;
        this.factorRevalorizacion = factorRevalorizacion;
        this.hipotecaBase = hipotecaBase;
        this.hipotecado = false;
        this.precioEdificar = precioEdificar;
        
    }
      
    /*----------------------------------------------------------------------------*/
    
    void cobrarAlquiler(int coste){
        
        
    }
    
    boolean propietarioEncarcelado(){
        
        return false;
    }
    
    void setCasilla(Casilla casilla){
        
    }
    
    void setHipotecada(boolean hipotecada){
        
    }
    
    void setPropietario(Jugador propietario){
        
    }
    
    boolean tengoPropiedad(){
        
        return false;
    }
    
    /*----------------------------------------------------------------------------*/
    public String getNombre() {
        return nombre;
    }

    public boolean getHipotecado() {
        return hipotecado;
    }

    public int getAlquilerBase() {
        return alquilerBase;
    }

    public int getFactorRevalorizacion() {
        return factorRevalorizacion;
    }

    public int getHipotecaBase() {
        return hipotecaBase;
    }

    public int getPrecioEdificar() {
        return precioEdificar;
    }
    
    public String toString(){
        
        return "\nNombre = " + nombre + "\nAlquiler Base = " + alquilerBase + "\nHipoteca Base = " + hipotecaBase + "\nPrecio Edificar = " + precioEdificar + "\n" ;
    }
    
}
