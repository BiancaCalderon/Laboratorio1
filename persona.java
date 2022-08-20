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

public class persona {
int Confiabilidad;
int Galleta;
Random rand = new Random();

public persona() {
	Galleta = rand.nextInt(16);
	System.out.println(this.Galleta);
	Confiabilidad  = rand.nextInt(11);
}

public int getConfiabilidad() {
return Confiabilidad;
}

public void setConfiabilidad(int confiabilidad) {
	Confiabilidad = confiabilidad;
}

public int tieneGalleta() {
	return Galleta;
}
public boolean darGalleta() {
	if(this.Galleta>0) {
		return true;
	}
	else {
		return false;
	}
	}
public void setGalleta(int galleta) {
  Galleta = galleta;
}
	
}