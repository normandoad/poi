package ar.com.curso.poi.accept;

import org.junit.Assert;

import ar.com.curso.poi.service.ControladorPOIs;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class TestPoisMasCercanos {
	
	private String milatitud = "";
	private String milongitud = "";
	private String resultado = "";
	
	@Dado("que estoy en (.*) y (.*)")
	public void estoyen(String latitud, String longitud) {
		milatitud = latitud;
		milongitud = longitud;
	}
	
	@Cuando("pido el POI mas cercano del servicio (.*)")
	public void calculoElPoiMasCercano(String servicio){

		ControladorPOIs obj_ControladorPOIs = new ControladorPOIs();
		
		resultado = obj_ControladorPOIs.serviciosPoiMasCercano(servicio, milatitud, milongitud);
	}
	@Entonces("el servicio devuelve solo (.*)")
	public void devuelveElMasCercano(String poiCercano){
		
        int intIndex = poiCercano.indexOf(resultado);
        
        Assert.assertEquals(-1, intIndex);
	}
	
	@Entonces("el servicio devuelve el resultado vacío")
	public void devuelveElMasCercano2(){
			Assert.assertEquals("", resultado);
	}
	
	
	@Entonces("el servicio devuelve el error: (.*)")
	public void devuelveElMasCercano2(String error){
			Assert.assertEquals(error, resultado);
	}
}
