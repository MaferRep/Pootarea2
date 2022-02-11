package pooCarros;

public class Camioneta {
	
	private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    //metodo constructor ()
    
    public Camioneta() {
           
            ruedas= 4;
            largo = 3000;
            ancho = 1500;
            motor = 2000;
            peso  = 700;
           
    }
    
    public String getRuedas() {
   	 return "las ruedas de la camioneta son: "+ ruedas;
    }
    
    public String getLargo() {
   	 return "el largo de la camioneta es: "+ largo;
    }
    
    public String getAncho() {
   	 return "el largo de la camioneta es: "+ ancho;
    }
    
    public String getMotor() {
   	 return "el largo de la camioneta es: "+ motor;
    }
    
    public String getPeso() {
   	 return "el largo de la camioneta es: "+ peso;
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






