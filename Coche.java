package poo;

public class Coche {
	
	private String marca;
	private int ruedas;  
	private int largo ; 
	private int ancho; 
	private String motor ; 
	private int peso_plataforma ; 
	
	private  String color; 
	private int peso_total; 
	private boolean asientos_cuero, climatizador; 
	
	
	public Coche() {
		marca = "Ford";
		ruedas = 4; 
		largo = 4000; 
		ancho = 1800; 
		motor = "4 cilidros"; 
		peso_plataforma = 500; 
		
	}
	
	
public void set_marca (String marca_coche) { //SETTER
		
		marca = marca_coche; 
	
	}

	public void set_largo(int largo) {
		this.largo=largo;
		
	}
	
	public String get_largo() {
		return "El vehiculo tiene un largo de " + largo + "mm";
		
	}
	
	
	public void set_ancho(int ancho) {
		this.ancho=ancho;
		
	}
	
	public String get_ancho() {
		return "El vehiculo tiene un largo de " + ancho + "mm";
		
	}
	
	public void set_motor (String motor_coche) { //SETTER
		
		motor = motor_coche; 
	
	}
	
	public String get_motor() { //Getter
		return "El vehiculo tiene un motor de "+ motor; 
	}
	
	
	
	public String dime_datos_generales() { //GETTER
		
		return "\tEl vehiculo " + marca + "\n\n-La plataforma del vehiculo tiene "+ ruedas+" ruedas\n" + 
		"-Mide "+ largo +" milimetros con un ancho de "+ ancho+
		" milimetros\n-Un peso de plataforma de "+ peso_plataforma+ " kg"; 
	}
	
	public void establece_color (String color_coche) { //SETTER
		
		color = color_coche; 
		
	}
	
	public String dimeColor() { //Getter
		return "\n-El color del coche es "+ color; 
	}
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true; 
		}else {
			this.asientos_cuero = false; 
		}
	}
	
	public String dime_asientos() { //GETTER
		
		if(asientos_cuero==true) {
			return "\n-El coche tiene asientos de cuero"; 
		}else {
			return "\n-El coche tiene asientos de serie"; 
		}
	}
	
	public void configura_climatizador(String climatizador) {//SETTER
		
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador =true; 
		}else {
			this.climatizador = false; 
		}
	}
	
	public String dime_climatizador() {//GETTER
		if(climatizador ==true){
			return "\n-El coche incorpora climatizador"; 
		}else {
			return "\n-El coche lleva aire acondicionado"; 
		}
	}
	
	
	public String dime_peso_coche() {//SETTER Y GETTER 
		
		int peso_carroceria =500; 
		
		peso_total = peso_plataforma+peso_carroceria; 
		
		if(asientos_cuero ==true) {
			peso_total= peso_total+50; 
		}
		
		if(climatizador==true) {
			peso_total= peso_total+20; 
		}
		
		return "\n-El peso del coche es: "+ peso_total; 
	}
	
	 public String precio_coche() { //GETTER
		
		 int precio_final = 10000; 
		 
		 if(asientos_cuero==true) {
			 precio_final+=2000; 
		 }
		 if(climatizador==true) {
			 precio_final+=1500; 
		 }
		 
		 return "\nEl precio total es: "+ precio_final ; 
	 }

}