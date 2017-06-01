package ar.com.curso.poi.entities.dao.entities;

import java.math.BigDecimal;

public class Pois {
	private Long idPoi;
	private String descripcion;
	private BigDecimal latitud;
	private BigDecimal longitud;
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
	public BigDecimal getLatitud() {
		return latitud;
	}
	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}
	public BigDecimal getLongitud() {
		return longitud;
	}
	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}
	
	
}
