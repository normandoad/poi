package ar.com.curso.poi.testCerradura;

import java.util.Random;

public class Tambor {
	
	private int numero=0;

	public Tambor() {
		// TODO Auto-generated constructor stub
	}

	public void girar() {
		// TODO Auto-generated method stub
		Random r=new Random();
		this.numero=r.nextInt(7) +1;
	}

	public int obtenerPosicion() {
		// TODO Auto-generated method stub
		return numero;
	}

}
