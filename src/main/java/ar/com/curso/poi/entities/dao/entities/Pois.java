package ar.com.curso.poi.entities.dao.entities;

public class Pois {
	private Long idPoi;
	private String descripcion;
	private Float latitud;
	private Float longitud;
	private Long idServicio;
	
	public Long getIdPoi() {
		return idPoi;
	}
	public void setIdPoi(Long idPoi) {
		this.idPoi = idPoi;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}
	public Float getLatitud() {
		return latitud;
	}
	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}
	public Float getLongitud() {
		return longitud;
	}
	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}
	
	
}
