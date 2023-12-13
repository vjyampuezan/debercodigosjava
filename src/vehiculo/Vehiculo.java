/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author Personal
 */
public class Vehiculo {
  public String color;
  public int velocidad;
  public float tamaño;
  private char placa;

  public Vehiculo(String color, int velocidad, float tamaño, char placa){
      this.color=color;
      this.velocidad=velocidad;
      this.tamaño=tamaño;
      this.placa=placa;
  } 
  public void avanzar(){}
  public void parar(){}
  public void girarDerecha(){}
  public void girarIzquierda(){}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char psq = 0;
        Vehiculo miVehiculo = new Vehiculo("verde",80,3.2f,psq);
      char rce = 0;
        Vehiculo tuVehiculo = new Vehiculo("rojo",120,4.1f,rce);
      char lmn = 0;
        Vehiculo suVehiculo = new Vehiculo("amarillo",100,3.4f,lmn);
      char bmi = 0;
        Vehiculo nuestroVehiculo = new Vehiculo("pqs",100,3.4f,bmi);
        
        
    }

    private static class moto {
  public String color;
  public int velocidad;
  public float tamaño;
  public Rueda[] ruedas;
  private Motor motor;
  
  
        public moto(String color, int velocidad,float tamaño,Rueda [] ruedas, Motor motor) {
            
            this.color= color;
            this.velocidad= velocidad;
            this.tamaño=tamaño;
            this.ruedas=ruedas;
            this.motor=motor;
            
        }
        public void avanzar(){
            motor.inyectarCarburatnte();
            for (int i=0; i < ruedas.length; i++){
                ruedas[i].girar();
            }
            
        }
        
        public static void main (String[] args){
            Rueda[] ruedas = null;
               
                Rueda rueda1 = new Rueda(20,"Dunlop");

                Rueda rueda2 = new Rueda (20,"Dunlop");

                Rueda rueda3 = new Rueda (22,"Dunlop");
                Rueda rueda4 = new Rueda (22,"Dunlop");

      moto mimoto = new moto ("verde",80,3.2f,ruedas,new Motor("Diesel",100));
                
            }
        }
        
    

    public static class Motor {

        public Motor() {
        }

    Motor(String diesel, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public void inyectarCarburatnte() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static class Rueda {

        public Rueda() {
        }

    Rueda(int i, String dunlop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        void girar() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
    

