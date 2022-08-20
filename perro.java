
/**
 * Programación Orientada a Objetos
 * Profesor: Moises ALonso
 * Sección: 30
 */
/**
 * Laboratorio1
 * @author Bianca Calderón
 *
 */
import java.util.Random;

public class perro {
	int umbral;
	int animo;
	Random rand = new Random();
	
	void psican(persona voluntario) {
		this.animo = (int) ((1.0 / voluntario.getConfiabilidad() ) * (rand.nextFloat()-0.5) * 10 + this.animo);
		if (voluntario.tieneGalleta() > 0) {
			voluntario.darGalleta();
			this.animo += (1.0 / voluntario.getConfiabilidad()) * (rand.nextFloat());
		}
		System.out.println("Mi nuevo animo es: " + animo );
		}
	
public perro() {
	

	animo = rand.nextInt(11)-5;
	umbral = rand.nextInt(26)-20;
	
}

public void morder() {
	if (animo < umbral ) {
		System.out.println("Mal ánimo, morderá");
	}
}
public void ladrar() {
	if((umbral < animo) && (animo < 0) ) {
		System.out.println("Ánimo regular, perro ladra");	
	}
}
public void movercola() {
	if(animo>0);
	System.out.println("Buen ánimo, perro mueve la cola");
}

		
	}

