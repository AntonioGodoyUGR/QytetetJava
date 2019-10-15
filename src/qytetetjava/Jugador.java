
package qytetetjava;

import java.util.ArrayList;

public class Jugador {
    
    boolean encarcelado;
    String nombre;
    int saldo;
    private Casilla casillaActual;
    private ArrayList<TituloPropiedad> propiedades;
    private Sorpresa cartaLibertad; 
    
    
    Jugador(String nombre){
        
        this.nombre = nombre;
        this.encarcelado = false;
        this.saldo = 7500;
        this.propiedades = new ArrayList();         //Deberías inicializarlo en el constructor
    }
    
    /*---------------------------------------------------------------------------*/
    public Casilla getCasillaActual(){
        
        return casillaActual;
    }
    
    public boolean getEncarcelado(){
    
        return encarcelado;
    }
    
    public boolean tengoPropiedades(){
        
        return (propiedades.size() > 0);
    }
    
    boolean actualizarPosicion( Casilla casilla){
    
        casillaActual = casilla;
        
        return true;
    }
    
    boolean comprarTitulo(){
    
        if(!casillaActual.tengoPropietario()){
            
            casillaActual.asignarPropietario(this);
            propiedades.add(casillaActual.getTituloPropiedad());
            return true;
        }
        
        return false;
    }
    
    Sorpresa devolverCartaLibertad(){
        cartaLibertad = null;
    }
    
    void irACarcel(Casilla casilla){
        
    }
    
    void modificarSaldo(int cantidad){
        
        saldo += cantidad;
    }
    
    int obtenerCapital(){
        return saldo;
    }
    
    /*TituloPropiedad[] obtenerPropiedadesHipotecadas(boolean hipotecada){          //---------IDK------------------
        
    }*/
    
    void pagarCobrarPorCasayHotel(int cantidad){
        
        saldo  += cantidad*(cuantasCasasHotelesTengo()); 
    }
    
    boolean pagarLibertad(int cantidad){
        
        saldo += cantidad;
        
        return true;
    }
    
    boolean puedoEdificarCasa(Casilla casilla){
        
        return casilla.sePuedeEdificarCasa();
    }
    
    boolean puedoEdificarHotel(Casilla casilla){
        
        return casilla.sePuedeEdificarHotel();
    }
   
    
    boolean puedoPagarHipoteca(Casilla casilla){
        
        return false;
    }
    
    boolean puedoVenderPropiedad(Casilla casilla){
        
        return false;
    }
    
    void setCartaLibertad(Sorpresa carta){
        
    }
    
    void setCasillaActual(Casilla casilla){
        
    }
    
    void setEncarcelado( boolean encarcelado){
        
    }
    
    boolean tengoCartaLibertad(){
        
        return false;
    }
    
    void venderPropiedad(Casilla casilla){
    
    }
    
    int cuantasCasasHotelesTengo(){
        
        return 0;
    }
    
    private void eliminarDeMisPropiedades(Casilla casilla){
        
        
    }
    
    private boolean esDeMiPropiedad(Casilla casilla){
        
        return false;
    }
    
    private boolean tengoSaldo(int cantidad){
        
        return false;
    }
    /*---------------------------------------------------------------------------*/
}
