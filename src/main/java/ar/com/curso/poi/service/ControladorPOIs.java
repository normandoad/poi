package ar.com.curso.poi.service;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import ar.com.curso.poi.entities.dao.entities.Pois;


@Path("/")
public class ControladorPOIs {
	
	private List<String> listaServicios = new ArrayList<String>();

	@GET
	@Path("/{servicioIngresado}")
	public String servicios(@PathParam("servicioIngresado") String servicioIngresado){
		this.listaServicios = new ArrayList<String>();
		this.listaServicios.add("BSASTURISTICA");
		this.listaServicios.add("BSASHISTORICO");
		this.listaServicios.add("TINTORERIAS");
		
		if (listaServicios.contains(servicioIngresado)){
			
			if ("TINTORERIAS".equals(servicioIngresado))
				return "";
			
			
			
			String aux = "";
			
			for (Pois pois : this.getPois(servicioIngresado)) {
				aux = aux + pois.getDescripcion() + "," + pois.getLatitud() + "," + pois.getLongitud() +";";
			}
			
			return aux;
			
		}
			return "Servicio no encontrado.";
		
	}
	
	
	@GET
	@Path("/{servicioIngresado}/{latitud}/{longitud}")
	public String serviciosPoiMasCercano(@PathParam("servicioIngresado") String servicioIngresado,@PathParam("latitud") String latitud,@PathParam("longitud") String longitud){
		this.listaServicios = new ArrayList<String>();
		this.listaServicios.add("BSASTURISTICA");
		this.listaServicios.add("BSASHISTORICO");
		this.listaServicios.add("TINTORERIAS");
		
		if (this.listaServicios.contains(servicioIngresado)){
			
			if ("TINTORERIAS".equals(servicioIngresado))
				return "";
			
			List<Pois>listaPois=this.getPois(servicioIngresado);
			
			Double distancia=Double.POSITIVE_INFINITY;
			Pois poiMasCercano=null;
			try{
			for (Pois pois : listaPois) {
				Double distanciaCalculada=this.distanciaCoord(pois.getLatitud().doubleValue(), pois.getLongitud().doubleValue(), new Double(latitud.replace(",", ".") ), new Double(longitud.replace(",", ".")));
				if(distanciaCalculada.doubleValue()<distancia.doubleValue()){
					distancia=new Double(distanciaCalculada);
					poiMasCercano=pois;
				}
			}
			}catch(Exception e){
				return"Error en el ingreso de Datos de posición";
			}
			
			
				String aux =poiMasCercano.getDescripcion() + "," + poiMasCercano.getLatitud() + "," + poiMasCercano.getLongitud() +";";
			
			return aux;
			
		}
			return "Servicio no encontrado.";
		
	}
	
	private  Double distanciaCoord(Double lat1, Double lng1, Double lat2, Double lng2) {  
        //double radioTierra = 3958.75;//en millas  
		Double radioTierra = 6371d;//en kilómetros  
		Double dLat = Math.toRadians(lat2 - lat1);  
		Double dLng = Math.toRadians(lng2 - lng1);  
		Double sindLat = Math.sin(dLat / 2);  
		Double sindLng = Math.sin(dLng / 2);  
        Double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
        Double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        Double distancia = radioTierra * va2;  
   
        return distancia;  
    }   
	
	private List<Pois> getPois(String servicio){
		
		
		Pois obj1_Poi = new Pois();
		obj1_Poi.setIdPoi(1l);
		obj1_Poi.setDescripcion("Las Cuartetas");
		obj1_Poi.setLatitud(new BigDecimal("-34.603714"));
		obj1_Poi.setLongitud(new BigDecimal("-58.378579"));
		obj1_Poi.setIdServicio(1l);
		
		Pois obj2_Poi = new Pois();
		obj2_Poi.setIdPoi(2l);
		obj2_Poi.setDescripcion("El Cuartito");
		obj2_Poi.setLatitud(new BigDecimal("-34.597669"));
		obj2_Poi.setLongitud(new BigDecimal("-58.385478"));
		obj2_Poi.setIdServicio(1l);
		
		Pois obj3_Poi = new Pois();
		obj3_Poi.setIdPoi(3l);
		obj3_Poi.setDescripcion("Palacio de la Pizza");
		obj3_Poi.setLatitud(new BigDecimal("-34.603069"));
		obj3_Poi.setLongitud(new BigDecimal("-58.377335"));
		obj3_Poi.setIdServicio(1l);
		
		Pois obj4_Poi = new Pois();
		obj4_Poi.setIdPoi(4l);
		obj4_Poi.setDescripcion("Cancha Velez");
		obj4_Poi.setLatitud(new BigDecimal("-34.635203"));
		obj4_Poi.setLongitud(new BigDecimal("-58.520708"));
		obj4_Poi.setIdServicio(1l);
		
		Pois obj5_Poi = new Pois();
		obj5_Poi.setIdPoi(5l);
		obj5_Poi.setDescripcion("Bombonera");
		obj5_Poi.setLatitud(new BigDecimal("-34.635836"));
		obj5_Poi.setLongitud(new BigDecimal("-58.365467"));
		obj5_Poi.setIdServicio(1l);
		
		Pois obj6_Poi = new Pois();
		obj6_Poi.setIdPoi(6l);
		obj6_Poi.setDescripcion("Ferro");
		obj6_Poi.setLatitud(new BigDecimal("-34.618315"));
		obj6_Poi.setLongitud(new BigDecimal("-58.447630"));
		obj6_Poi.setIdServicio(1l);
		
		Pois obj7_Poi = new Pois();
		obj7_Poi.setIdPoi(7l);
		obj7_Poi.setDescripcion("Obelisco");
		obj7_Poi.setLatitud(new BigDecimal("-34.600328"));
		obj7_Poi.setLongitud(new BigDecimal("-58.381916"));
		obj7_Poi.setIdServicio(2l);
		
		Pois obj8_Poi = new Pois();
		obj8_Poi.setIdPoi(7l);
		obj8_Poi.setDescripcion("Cabildo");
		obj8_Poi.setLatitud(new BigDecimal("-34.670445"));
		obj8_Poi.setLongitud(new BigDecimal("-58.390443"));
		obj8_Poi.setIdServicio(2l);
		
		Pois obj9_Poi = new Pois();
		obj9_Poi.setIdPoi(7l);
		obj9_Poi.setDescripcion("plaza de mayo");
		obj9_Poi.setLatitud(new BigDecimal("-34.608075"));
		obj9_Poi.setLongitud(new BigDecimal("-58.372262"));
		obj9_Poi.setIdServicio(2l);
		
		Pois obj10_Poi = new Pois();
		obj10_Poi.setIdPoi(7l);
		obj10_Poi.setDescripcion("convento santo domingo");
		obj10_Poi.setLatitud(new BigDecimal("-34.612297"));
		obj10_Poi.setLongitud(new BigDecimal("-58.371885"));
		obj10_Poi.setIdServicio(2l);
		
		Pois obj11_Poi = new Pois();
		obj11_Poi.setIdPoi(7l);
		obj11_Poi.setDescripcion("convento san francisco");
		obj11_Poi.setLatitud(new BigDecimal("-34.610231"));
		obj11_Poi.setLongitud(new BigDecimal("-58.371763"));
		obj11_Poi.setIdServicio(2l);
		
		Pois obj12_Poi = new Pois();
		obj12_Poi.setIdPoi(7l);
		obj12_Poi.setDescripcion("cafe de los angelitos");
		obj12_Poi.setLatitud(new BigDecimal("-34.610231"));
		obj12_Poi.setLongitud(new BigDecimal("-58.371763"));
		obj12_Poi.setIdServicio(2l);
		
		
		List<Pois> listaPois = new ArrayList<Pois>();
		listaPois.add(obj1_Poi);
		listaPois.add(obj2_Poi);
		listaPois.add(obj3_Poi);
		listaPois.add(obj4_Poi);
		listaPois.add(obj5_Poi);
		listaPois.add(obj6_Poi);
		listaPois.add(obj7_Poi);
		//if("BSASTURISTICA".equals(servicio))
		
		if ("BSASHISTORICO".equals(servicio)){
			
		
			obj7_Poi.setIdPoi(7l);
			obj7_Poi.setDescripcion("Obelisco");
			obj7_Poi.setLatitud(new BigDecimal("-34.600328"));
			obj7_Poi.setLongitud(new BigDecimal("-58.381916"));
			obj7_Poi.setIdServicio(2l);
			
			obj8_Poi.setIdPoi(7l);
			obj8_Poi.setDescripcion("Cabildo");
			obj8_Poi.setLatitud(new BigDecimal("-34.670445"));
			obj8_Poi.setLongitud(new BigDecimal("-58.390443"));
			obj8_Poi.setIdServicio(2l);
			
			obj9_Poi.setIdPoi(7l);
			obj9_Poi.setDescripcion("plaza de mayo");
			obj9_Poi.setLatitud(new BigDecimal("-34.608075"));
			obj9_Poi.setLongitud(new BigDecimal("-58.372262"));
			obj9_Poi.setIdServicio(2l);
			
			obj10_Poi.setIdPoi(7l);
			obj10_Poi.setDescripcion("convento santo domingo");
			obj10_Poi.setLatitud(new BigDecimal("-34.612297"));
			obj10_Poi.setLongitud(new BigDecimal("-58.371885"));
			obj10_Poi.setIdServicio(2l);
			
			obj11_Poi.setIdPoi(7l);
			obj11_Poi.setDescripcion("convento san francisco");
			obj11_Poi.setLatitud(new BigDecimal("-34.610231"));
			obj11_Poi.setLongitud(new BigDecimal("-58.371763"));
			obj11_Poi.setIdServicio(2l);
			
			listaPois = new ArrayList<Pois>();
			listaPois.add(obj7_Poi);
			listaPois.add(obj8_Poi);
			listaPois.add(obj9_Poi);
			listaPois.add(obj10_Poi);
			listaPois.add(obj11_Poi);
		}
		return listaPois;
	}

}
