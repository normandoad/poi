package ar.com.curso.poi.testCerradura;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestTambor {

	public TestTambor() {}
		
@Test
public void testGiraTambor(){
	Tambor tambor =new Tambor();
	tambor.girar();
	assertThat((tambor.obtenerPosicion()>=1 && tambor.obtenerPosicion()<9));
}

@Test
public void testObtenerPosicion(){
	Tambor tambor =new Tambor();
	int aux=tambor.obtenerPosicion();
	assertThat((aux>=1 && aux<8));
}
	
	

}
