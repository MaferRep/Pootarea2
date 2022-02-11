package pooCarros;

public class UsuCarro {
	
	  public static void main (String[] args) {

	System.out.println("datos carro\n");
		  
	  Carro Renault= new Carro();
	 
   
	  System.out.println(Renault.getRuedas());
	  System.out.println(Renault.getLargo());
	  System.out.println(Renault.getAncho());
	  System.out.println(Renault.getMotor());
	  System.out.println(Renault.getPeso());
	  
	  System.out.println("\ndatos camioneta\n");
	  
	  Camioneta toyota= new Camioneta();

	  System.out.println(toyota.getRuedas());
	  System.out.println(toyota.getLargo());
	  System.out.println(toyota.getAncho());
	  System.out.println(toyota.getMotor());
	  System.out.println(toyota.getPeso());
	  
	  System.out.println("\ndatos moto\n");
	  
	  Moto nanda= new Moto();
	  
	  System.out.println(nanda.getRuedas());
	  System.out.println(nanda.getLargo());
	  System.out.println(nanda.getAncho());
	  System.out.println(nanda.getMotor());
	  System.out.println(nanda.getPeso());
	  
	  //modificando datos en el carro
	  
	  System.out.println("\ndatos modificados carro\n");
	 
	 Renault.setRuedas (5);
	 
	 System.out.println(Renault.getRuedas());
	 
	 
	 Renault.setLargo (1500);
	 
	 System.out.println(Renault.getLargo());
	 
	 
	 Renault.setMotor (8000);
	 
	 System.out.println(Renault.getMotor());
	 
	 
	 Renault.setAncho (8000);
	 
	 System.out.println(Renault.getAncho());
	 
	 
	 Renault.setPeso (1000);
	 
	 System.out.println(Renault.getPeso());
	 
	  //modificando datos en la camioneta
	 
	  System.out.println("\ndatos modificados camioneta\n");
		 
	 toyota.setRuedas (6);
	 
	 System.out.println(toyota.getRuedas());
	 
	 
	 toyota.setLargo (100);
	 
	 System.out.println(toyota.getLargo());
	 
	 
	 toyota.setMotor (800);
	 
	 System.out.println(toyota.getMotor());
	 
	 
	 toyota.setAncho (8000);
	 
	 System.out.println(toyota.getAncho());
	 
	 
	 toyota.setPeso (100);
	 
	 System.out.println(toyota.getPeso());
	 
	 //modificando datos en la moto
	 
	  System.out.println("\ndatos modificados moto\n");
		 
		 nanda.setRuedas (3);
		 
		 System.out.println(nanda.getRuedas());
		 
		 
		 nanda.setLargo (170);
		 
		 System.out.println(nanda.getLargo());
		 
		 
		 nanda.setMotor (800);
		 
		 System.out.println(nanda.getMotor());
		 
		 
		 nanda.setAncho (20);
		 
		 System.out.println(nanda.getAncho());
		 
		 
		 nanda.setPeso (1000);
		 
		 System.out.println(nanda.getPeso());
}
}
