package ar.com.curso.poi.accept;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import ar.com.curso.poi.service.ControladorPOIs;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class TestPoisMasCercanos {
	
	private String milatitud = "";
	private String milongitud = "";
	private String resultado = "";
	private String servicio = "";
	
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
        
        Assert.assertEquals(1, intIndex);
	}
	
	@Entonces("el servicio devuelve el resultado vacío")
	public void devuelveElMasCercano2(){
			Assert.assertEquals("", resultado);
	}
	
	
	@Entonces("el servicio devuelve el error: (.*)")
	public void devuelveElMasCercano2(String error){
			Assert.assertEquals(error, resultado);
	}
	
	@Dado("que estoy utilizando el servicio (.*)")
	public void utilizandoUnServicio(String vservicio){
		this.servicio = vservicio;
	}
	
	@Cuando("pido todos los POIs asociados a ese servicio")
	public void buscoPoisPorServicio(){

		ControladorPOIs obj_ControladorPOIs = new ControladorPOIs();
		
		resultado = obj_ControladorPOIs.servicios(servicio);
		
	}
	
	@Entonces("el servicio retorna")
	public void verificoelresutadodepois(DataTable table){

//		Gson parser = new Gson();
//		System.out.println(resultado);
//		List<Pois> fromJson = parser.fromJson(resultado, List.class);
//		Assert.assertEquals(table.size(), fromJson.size());
		List<List<String>> data = table.raw();
	    
	    String[]sp=StringUtils.split(resultado, ';'); 

        for (int j = 0; j < 6; j++) {  
                String[]sp1=StringUtils.split(sp[j],','); 
                for (int i = 0; i < 2; i++) {
             
                        Assert.assertEquals(data.get(j).get(i), (sp1[i]));
                } 
        } 


	}
}
