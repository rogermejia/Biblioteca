package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Libros;
import listas.*;

public class BibliotecaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = " ";
		Integer anio = 0;
		Integer anioPub = 0;
		Integer mesPub = 0;
		Integer diaPub = 0;
		Integer cat = 0;
		Integer edit = 0;
		Listas l = new Listas();
		Scanner s = new Scanner(System.in);
		boolean check = false;
		boolean check2 = false;
		List<Libros> listLibros = new ArrayList<>();
		int i = 0;

		l.llenarEditoriales();
		l.llenarLibros();
		l.llenarCategoria();

		listLibros = l.getListLibros();

	while(check2 == false) {
		
		l.menu();
		
		s = new Scanner(System.in);
		int condicional = s.nextInt();
		if (condicional == 1) { // OPCION MENU 1 AGREGAR EDITORIAL ***********************************
			i = 0;
			// Do statement
			System.out.println("Ingrese el nombre de una editorial ");
			do {

				do {
					s = new Scanner(System.in);
					nombre = s.nextLine();

					if (nombre.equalsIgnoreCase(l.getListEdit().get(i).getEditorial())) {
						System.out.println("Ese nombre ya está registrado ");
						check = false;
					} else {
						check = true;
					}

				} while (check == false);

				i++;
			} while (i >= l.getListEdit().size());

			l.agregarEditorial(nombre);
			l.obtenerEditoriales();

		} else if (condicional == 2) { // OPCION AGREGAR CATEGORIA ********************************************

			i = 0;
			// Do statement
			System.out.println("Ingrese el nombre de una categoria ");
			do {

				do {
					s = new Scanner(System.in);
					nombre = s.nextLine();

					if (nombre.equalsIgnoreCase(l.getListCategorias().get(i).getCategoria())) {
						System.out.println("Ese nombre ya está registrado ");
						check = false;
					} else {
						check = true;
					}

				} while (check == false);

				i++;
			} while (i >= l.getListCategorias().size());

			l.agregarCategoria(nombre);
			l.obtenerCategorias();

		} else if (condicional == 5) {

			i = 0;
			// Do statement
			System.out.println("Ingrese el nombre de un libro ");
			do {

				do {
					s = new Scanner(System.in);
					nombre = s.nextLine();
					if (nombre.equalsIgnoreCase(l.getListLibros().get(i).getNombre())) {
						System.out.println("Ese nombre ya está registrado ");
						check = false;
					} else {
						check = true;
					}

				} while (check == false);

				i++;
			} while (i >= l.getListLibros().size());

			System.out.println("Ingrese el año que se publicó ");
			anio = s.nextInt();

			anioPub = anio;
			System.out.println("Ingrese el mes que se publicó ");
			mesPub = s.nextInt();

			System.out.println("Ingrese el día que se publicó ");
			diaPub = s.nextInt();

			System.out.println("Seleccione la categoria ");
			l.obtenerCategorias();
			cat = s.nextInt();

			System.out.println("Seleccione la editorial ");
			l.obtenerEditoriales();
			edit = s.nextInt();

			l.agregarLibros(nombre, anio, anioPub, mesPub, diaPub, cat, edit);

			l.obtenerLibros();
			
			
		}else if(condicional == 4) {
			System.out.println("¿Que libro desea encontrar?");
			int j = 0;
			s = new Scanner(System.in);
			nombre = s.nextLine();
			
			
				while(check2 == false) {
				if(nombre.equalsIgnoreCase(listLibros.get(j).getNombre())){
					check2 = true;
				}
				j++;
				}
			System.out.println(listLibros.get(j).getNombre());
		}

		

	}
	}
}
