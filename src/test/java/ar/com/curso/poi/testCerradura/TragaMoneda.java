package ar.com.curso.poi.testCerradura;

import java.util.ArrayList;
import java.util.List;

public class TragaMoneda {
	
	private List<Tambor> tambores=new ArrayList<>();

	public TragaMoneda() {
		// TODO Auto-generated constructor stub
	}
	
	public void activar(){
		tambores.add(new Tambor());
		tambores.add(new Tambor());
		tambores.add(new Tambor());
	}
	
	public void girarTambores(){
		for (Tambor tambor : tambores) {
			tambor.girar();
		}
	}

	public List<Tambor> getTambores() {
		return tambores;
	}

	public void setTambores(List<Tambor> tambores) {
		this.tambores = tambores;
	}

	public boolean entregaPremio() {
		return this.tambores.get(0).obtenerPosicion()==this.tambores.get(1).obtenerPosicion()&&this.tambores.get(1).obtenerPosicion()==this.tambores.get(2).obtenerPosicion();
	}
	

}
