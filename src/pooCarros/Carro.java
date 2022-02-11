package pooCarros;

public class Carro {
	
	 private int ruedas;
     private int largo;
     private int ancho;
     private int motor;
     private int peso;

     //metodo constructor ()
     
     public Carro() {
            
             ruedas= 4;
             largo = 2000;
             ancho = 300;
             motor = 1600;
             peso  = 500;
            
     }
     
     public String getRuedas() {
    	 return "las ruedas del carro son: "+ ruedas;
     }
     
     public String getLargo() {
    	 return "el largo del carro es: "+ largo;
     }
     
     public String getAncho() {
    	 return "el Ancho del carro es: "+ ancho;
     }
     
     public String getMotor() {
    	 return "el Motor del carro es: "+ motor;
     }
     public String getPeso() {
    	 return "el Peso del carro es: "+ peso;
     }
     
     //setters
     
     public void setRuedas(int ruedas)
     {
             this.ruedas = ruedas;
     }
     
     public void setLargo(int largo)
     {
             this.largo = largo;
     }

     public void setAncho(int ancho)
     {
             this.ancho = ancho;
     }
     
     public void setMotor(int motor)
     {
             this.motor = motor;
     }
     
     public void setPeso(int peso)
     {
             this.peso = peso;
     }
 
 
}

