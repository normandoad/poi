/**
 * 
 */
package ar.com.curso.poi.testCerradura;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

/**
 * @author a527134
 *
 */
public class TestTragaMoneda {

	private TragaMoneda tragamonedas =new TragaMoneda();
	
	public TestTragaMoneda() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testActivar(){
		tragamonedas.activar();
		List<Tambor>tambores=tragamonedas.getTambores();
		assertThat(tambores.size()).isEqualTo(3);
	}
	
	@Test
	public void testEntregaPremio(){
		tragamonedas.activar();
		tragamonedas.girarTambores();
		boolean esPremio=tragamonedas.entregaPremio();
		assertThat(esPremio).isEqualTo(false);
	}

}
