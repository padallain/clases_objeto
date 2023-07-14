package poo;



public class Uso_Vehiculo {
	
public static void main (String[] args) {
	
	
	//COCHE1	
		Coche coche1 = new Coche(); 
		
		coche1.establece_color("Negro");
		coche1.set_ancho(1900);
		coche1.set_largo(4100);
		coche1.configura_asientos("si");
		coche1.configura_climatizador("si");
		
		//COCHE2
		Coche coche2 = new Coche(); 
		coche2.set_marca("Toyota");
		coche2.establece_color("Blanco");
		coche2.set_ancho(1750);
		coche2.set_largo(3900);
		coche2.configura_asientos("no");
		coche2.configura_climatizador("si");
		
		
		//COCHE3
		Coche coche3 = new Coche(); 
		coche3.set_marca("Chevette");
		coche3.establece_color("Rojo");
		coche3.set_ancho(1600);
		coche3.set_largo(3800);
		coche3.configura_asientos("no");
		coche3.configura_climatizador("no");
				
				
		//COCHE4
		Coche coche4 = new Coche(); 
		coche4.set_marca("Honda");
		coche4.establece_color("Azul");
		coche4.set_ancho(2000);
		coche4.set_largo(4200);
		coche4.configura_asientos("Si");
		coche4.configura_climatizador("Si");
		
		//COCHE5
		Coche coche5 = new Coche(); 
		coche5.set_marca("Renauld");
		coche5.establece_color("Verde");
		coche5.set_ancho(1800);
		coche5.set_largo(3800);
		coche5.configura_asientos("no");
		coche5.configura_climatizador("Si");
		
		//COCHE6
		Coche coche6 = new Coche(); 
		coche6.set_marca("Mitsubishi");
		coche6.establece_color("Negro");
		coche6.set_ancho(2000);
		coche6.set_largo(3900);
		coche6.configura_asientos("si");
		coche6.configura_climatizador("Si");				
		
		
		
		//FURGONETA 1
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		mifurgoneta1.set_marca("Toyota");
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.set_ancho(2400);
		mifurgoneta1.set_largo(5000);
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.configura_climatizador("Si");
		
		//FURGONETA 2
		Furgoneta mifurgoneta2 = new Furgoneta(8, 640);
		mifurgoneta2.set_marca("Dodge");
		mifurgoneta2.establece_color("Gris");
		mifurgoneta2.set_ancho(2500);
		mifurgoneta2.set_largo(5100);
		mifurgoneta2.configura_asientos("no");
		mifurgoneta2.configura_climatizador("Si");
		
		
		//FURGONETA 3
		Furgoneta mifurgoneta3 = new Furgoneta(10, 640);
		mifurgoneta3.set_marca("Mercedes ");
		mifurgoneta3.establece_color("Negro");
		mifurgoneta3.set_ancho(2550);
		mifurgoneta3.set_largo(5150);
		mifurgoneta3.configura_asientos("si");
		mifurgoneta3.configura_climatizador("Si");
		
		
		//FURGONETA 4
		Furgoneta mifurgoneta4 = new Furgoneta(5,480);
		mifurgoneta4.set_marca("FIAT");
		mifurgoneta4.establece_color("Blanca");
		mifurgoneta4.set_ancho(2350);
		mifurgoneta4.set_largo(4800);
		mifurgoneta4.configura_asientos("no");
		mifurgoneta4.configura_climatizador("no");
				
		//FURGONETA 5
		Furgoneta mifurgoneta5 = new Furgoneta(7, 560);
		mifurgoneta5.set_marca("Volkswagen ");
		mifurgoneta5.establece_color("Gris");
		mifurgoneta5.set_ancho(2300);
		mifurgoneta5.set_largo(5050);
		mifurgoneta5.configura_asientos("Si");
		mifurgoneta5.configura_climatizador("No");
				
				
		//FURGONETA 6
		Furgoneta mifurgoneta6 = new Furgoneta(10, 640);
		mifurgoneta6.set_marca("Jeep");
		mifurgoneta6.establece_color("Verde");
		mifurgoneta6.set_ancho(2600);
		mifurgoneta6.set_largo(5300);
		mifurgoneta6.configura_asientos("si");
		mifurgoneta6.configura_climatizador("Si");



		
		
		
		
		System.out.println(coche1.dime_datos_generales() +" "+
				coche1.dime_asientos()+" "+
				coche1.dime_climatizador()+" "+
				coche1.dime_peso_coche()+" "+
				coche1.dimeColor()+
				coche1.precio_coche()+"$\n\n") ;
		
		
		System.out.println(coche2.dime_datos_generales() +" "+
				coche2.dime_asientos()+" "+
				coche2.dime_climatizador()+" "+
				coche2.dime_peso_coche()+" "+
				coche2.dimeColor()+
				coche2.precio_coche()+"$\n\n") ;
		
		System.out.println(coche3.dime_datos_generales() +" "+
				coche3.dime_asientos()+" "+
				coche3.dime_climatizador()+" "+
				coche3.dime_peso_coche()+" "+
				coche3.dimeColor()+
				coche3.precio_coche()+"$\n\n") ;
		
		System.out.println(coche4.dime_datos_generales() +" "+
				coche4.dime_asientos()+" "+
				coche4.dime_climatizador()+" "+
				coche4.dime_peso_coche()+" "+
				coche4.dimeColor()+ 
				coche4.precio_coche()+"$\n\n") ;
		
		
		System.out.println(coche5.dime_datos_generales() +" "+
				coche5.dime_asientos()+" "+
				coche5.dime_climatizador()+" "+
				coche5.dime_peso_coche()+" "+
				coche5.dimeColor()+
				coche5.precio_coche()+"$\n\n") ;
		
		System.out.println(mifurgoneta1.dime_datos_generales()
				+" "+ mifurgoneta1.dime_asientos()+" "+
				mifurgoneta1.dime_climatizador()+" "+
				mifurgoneta1.dime_peso_coche()+" "+
				mifurgoneta1.dimeColor()+" "+
				mifurgoneta1.dimeDatosFurgoneta()+
				
				mifurgoneta1.precio_coche()+"$\n\n");
		
		System.out.println(mifurgoneta2.dime_datos_generales()
				+" "+ mifurgoneta2.dime_asientos()+" "+
				mifurgoneta2.dime_climatizador()+" "+
				mifurgoneta2.dime_peso_coche()+" "+
				mifurgoneta2.dimeColor()+" "+
				mifurgoneta2.dimeDatosFurgoneta()+
				
				mifurgoneta2.precio_coche()+"$\n\n");
		
		System.out.println(mifurgoneta3.dime_datos_generales()
				+" "+ mifurgoneta3.dime_asientos()+" "+
				mifurgoneta3.dime_climatizador()+" "+
				mifurgoneta3.dime_peso_coche()+" "+
				mifurgoneta3.dimeColor()+" "+
				mifurgoneta3.dimeDatosFurgoneta()+
				mifurgoneta3.precio_coche()+"$\n\n");
		
		System.out.println(mifurgoneta4.dime_datos_generales()
				+" "+ mifurgoneta4.dime_asientos()+" "+
				mifurgoneta4.dime_climatizador()+" "+
				mifurgoneta4.dime_peso_coche()+" "+
				mifurgoneta4.dimeColor()+" "+
				mifurgoneta4.dimeDatosFurgoneta()+
				mifurgoneta4.precio_coche()+"$\n\n");
		
		
		System.out.println(mifurgoneta5.dime_datos_generales()
				+" "+ mifurgoneta5.dime_asientos()+" "+
				mifurgoneta5.dime_climatizador()+" "+
				mifurgoneta5.dime_peso_coche()+" "+
				mifurgoneta5.dimeColor()+" "+
				mifurgoneta5.dimeDatosFurgoneta()+
				mifurgoneta5.precio_coche()+"$\n\n");
		
		
		System.out.println(mifurgoneta6.dime_datos_generales()
				+" "+ mifurgoneta6.dime_asientos()+" "+
				mifurgoneta6.dime_climatizador()+" "+
				mifurgoneta6.dime_peso_coche()+" "+
				mifurgoneta6.dimeColor()+" "+
				mifurgoneta6.dimeDatosFurgoneta()+
				mifurgoneta6.precio_coche()+"$\n\n");
		
		
		
		
		
		
		
		
		
		
	}

}
