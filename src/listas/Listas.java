package listas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.*;

public class Listas {
	private List<Categoria> listCategorias = new ArrayList<Categoria>();
	private List<Editoriales> listEdit = new ArrayList<Editoriales>();
	private List<Libros> listLibros = new ArrayList<Libros>();
	private Categoria categ = new Categoria();
	private Editoriales edit = new Editoriales();
	private Date fecha = new Date();

	//private Libros libro = new Libros(1, "Jicaras Tristes", 1930, 6.50, fecha, categ.getCategoria(),
			//edit.getEditorial());
	
	public void menu() {
		System.out.println("  ");
		System.out.println("Menu principal: ");
		System.out.println("1. Agregar editorial "); //
		System.out.println("2. Agregar categorias "); //
		System.out.println("3. Mostrar libros por categoria ");
		System.out.println("4. Buscar libros por nombre ");
		System.out.println("5. Agregar libro ");
	}
	
public void obtenerCategorias() {
	for(Categoria c: listCategorias) {
		System.out.println(" ");
		System.out.print(c.getIdCat() +" | ");
		System.out.print(c.getCategoria() +" | ");
		//System.out.println(" ");
	}
}
	
public void obtenerEditoriales() {
	for(Editoriales e: listEdit) {
		System.out.println(" ");
		System.out.print(e.getIdCat() +" | ");
		System.out.print(e.getEditorial() +" | ");
		//System.out.println(" ");
	}
}

	public void obtenerLibros() {
		for(Libros l: listLibros) {
			System.out.println(" ");
			System.out.print(l.getIdLibro() +" | ");
			System.out.print(l.getNombre() +" | ");
			System.out.print(l.getYear() +" | ");
			System.out.print(l.getPrecio() +" | ");
			System.out.print(l.getFechaL() +" | ");
			System.out.print(l.getCategoria() +" | ");
			System.out.print(l.getEditorial() +" | ");
			System.out.println(" ");
		}
	}
	
	public void agregarCategoria(String cat) {   //AGREGAR CATEGORIAS
		Categoria c = new Categoria();
			c.setIdCat(listCategorias.size()+1);
			c.setCategoria(cat);
			listCategorias.add(c);
		
	}
	
	public void agregarEditorial(String ed) {   //AGREGAR CATEGORIAS
		Editoriales e = new Editoriales();
			e.setIdCat(listCategorias.size()+1);
			e.setEditorial(ed);
		listEdit.add(e);
	}
	
	//AGREGAR LIBROS
	public void agregarLibros(String nombre, Integer anio, Integer anioPub, Integer mesPub, Integer diaPub, Integer cat, Integer edit) {
		Libros l = new Libros();
		l.setIdLibro(listLibros.size()+1);
		l.setNombre(nombre);
		l.setYear(anio);
		Date publi = new Date();
		publi.setYear(anio);
		publi.setMonth(mesPub);
		publi.setDate(diaPub);
		l.setFechaL(publi);
		Categoria c = new Categoria();
		c=listCategorias.get(cat-1);
		l.setCategoria(c.getCategoria());
		Editoriales e = new Editoriales();
		e=listEdit.get(edit-1);
		l.setEditorial(e.getEditorial());
		listLibros.add(l);
	}
	
	public void llenarEditoriales() {
		Editoriales e1 = new Editoriales();
		e1.setIdCat(1);
		e1.setEditorial("La Ceiba");
		
		Editoriales e2 = new Editoriales();
		e2.setIdCat(2);
		e2.setEditorial("Roxville");
		
		Editoriales e3 = new Editoriales();
		e3.setIdCat(3);
		e3.setEditorial("Santillana");
		
		listEdit.add(e1);
		listEdit.add(e2);
		listEdit.add(e3);
	}
	
	public void llenarCategoria() {
		Categoria cat1 = new Categoria();
		cat1.setIdCat(1);
		cat1.setCategoria("Aventuras");
		
		Categoria cat2 = new Categoria();
		cat2.setIdCat(2);
		cat2.setCategoria("Terror");
		
		Categoria cat3 = new Categoria();
		cat3.setIdCat(3);
		cat3.setCategoria("Infantiles");
		
		listCategorias.add(cat1);
		listCategorias.add(cat2);
		listCategorias.add(cat3);
	}
	
	
	public void llenarLibros() {
		Libros libro1 = new Libros();
		libro1.setIdLibro(1);
		libro1.setNombre("El viaje al centro de la Tierra");
		libro1.setYear(1880);
		libro1.setPrecio(20.00);
		Date fecha1 = new Date();
		fecha1.setYear(80);
		fecha1.setMonth(5);
		fecha1.setDate(20);
		libro1.setFechaL(fecha1);
		libro1.setCategoria("Aventuras");
		libro1.setEditorial("La Ceiba");
		
		Libros libro2 = new Libros();
		libro2.setIdLibro(2);
		libro2.setNombre("Narraciones extraordinarias");
		libro2.setYear(1890);
		libro2.setPrecio(12.00);
		Date fecha2 = new Date();
		fecha2.setYear(1892);
		fecha2.setMonth(9);
		fecha2.setDate(3);
		libro2.setFechaL(fecha2);
		libro2.setCategoria("Terror");
		libro2.setEditorial("Roxville");
		
		Libros libro3 = new Libros();
		libro3.setIdLibro(3);
		libro3.setNombre("Cuentos de Barro");
		libro3.setYear(1970);
		libro3.setPrecio(9.50);
		Date fecha3 = new Date();
		fecha3.setYear(1971);
		fecha3.setMonth(2);
		fecha3.setDate(16);
		libro3.setFechaL(fecha3);
		libro3.setCategoria("Infantiles");
		libro3.setEditorial("Santillana");
		
		listLibros.add(libro1);
		listLibros.add(libro2);
		listLibros.add(libro3);
	}

	public List<Categoria> getListCategorias() {
		return listCategorias;
	}

	public void setListCategorias(List<Categoria> listCategorias) {
		this.listCategorias = listCategorias;
	}

	public List<Editoriales> getListEdit() {
		return listEdit;
	}

	public void setListEdit(List<Editoriales> listEdit) {
		this.listEdit = listEdit;
	}

	public List<Libros> getListLibros() {
		return listLibros;
	}

	public void setListLibros(List<Libros> listLibros) {
		this.listLibros = listLibros;
	}

	


}