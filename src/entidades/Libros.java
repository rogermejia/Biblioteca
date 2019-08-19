package entidades;

import java.util.Date;

public class Libros {
	private Integer idLibro;
	private String nombre;
	private Integer year;
	private Double precio;
	private Date fechaL;
	private String categoria;
	private String editorial;
	
	
	
	public Libros(Integer idLibro, String nombre, Integer year, Double precio, Date fechaL, String categoria,
			String editorial) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.year = year;
		this.precio = precio;
		this.fechaL = fechaL;
		this.categoria = categoria;
		this.editorial = editorial;
	}
	
	public Libros() {

	}
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getFechaL() {
		return fechaL;
	}
	public void setFechaL(Date fechaL) {
		this.fechaL = fechaL;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
}
