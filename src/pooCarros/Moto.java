package pooCarros;

public class Moto {
	private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    //metodo constructor ()
    
    public Moto() {
           
            ruedas= 2;
            largo = 1000;
            ancho = 700;
            motor = 700;
            peso  = 350;
           
    }
    
    public String getRuedas() {
   	 return "las ruedas de la Moto son: "+ ruedas;
    }
    
    public String getLargo() {
   	 return "el largo de la Moto es: "+ largo;
    }
    
    public String getAncho() {
   	 return "el largo de la Moto es: "+ ancho;
    }
    
    public String getMotor() {
   	 return "el largo de la Moto es: "+ motor;
    }
    public String getPeso() {
   	 return "el largo de la Moto es: "+ peso;
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

