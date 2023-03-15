package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.Caja;
import com.cursoceat.model.Caja.Unidad;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** Comencemos a crear la caja ** ");
		System.out.println("¿En que unidad de medida indicara los datos? \n1. Centímetros 2. Metros");
		int opcion=new Scanner(System.in).nextInt();
		Unidad uni=null;
		uni=Unidad.values()[opcion-1];
		System.out.println("Indique el Alto de la Caja");
		double alto=new Scanner(System.in).nextDouble();
		System.out.println("Indique el Ancho de la Caja");
		double ancho=new Scanner(System.in).nextDouble();
		System.out.println("Indique el Fondo de la Caja");
		double fondo=new Scanner(System.in).nextDouble();
		Caja nuevaCaja=new Caja(ancho, alto, fondo, uni);
		System.out.println("Indique el texto de la Etiqueta (max 30 caracteres)");
		nuevaCaja.setEtiqueta(new Scanner(System.in).nextLine());
		System.out.println("La caja tiene las siguientes caracteristicas");
		System.out.println(nuevaCaja.toString());
		
		
	}

}
