package com.cursoceat.model;

	/* Las cajas una vez creadas no se pueden modificar sus dimensiones, lo único que se 
	 * puede cambiar es el texto de la etiqueta que lleva pegada. 
	 * Siempre guardaremos las dimensiones en metros.  */
	public class Caja {

	    public enum Unidad {
	        CM, M
	    } //centímetros y metros como posibles unidades de medida

	    protected final double ancho, alto, fondo; //dimensiones
	    protected final Unidad unid; //unidades de medida
	    protected double volumen; //el volumen lo calculamos siempre em metros cúbicos
	    public String etiqueta; //permitimos que la etiqueta se modifique libremente

	    //Método Constructor
	    public Caja(double ancho, double alto, double fondo, Unidad unid) {
	        this.ancho = ancho;
	        this.alto = alto;
	        this.fondo = fondo;
	        this.unid = unid;

	        switch (unid) { //el volumen se calcula siempre en metros cúbicos
	            case CM:
	                volumen = (ancho / 100) * (alto / 100) * (fondo / 100); //pasamos a metros
	                break;
	            case M:
	                volumen = ancho * alto * fondo; //las medidas ya están en metros
	                break;
	        }
	    }

	    //devuelve la capacidad de la caja, siempre en metros cúbicos
	    public double getVolumen() {
	        return this.volumen;
	    }

	    public void setEtiqueta(String etiqueta) {
	    	if (etiqueta.length()<=30) {
	        this.etiqueta = etiqueta;
	    	}else {
	    		this.etiqueta=etiqueta.substring(0, 29);
	    	}
	    	}

	    @Override
	    public String toString() {
	        return this.ancho + "x" + this.alto + "x" + this.fondo + " " + this.unid.toString() 
	        +"\nVolumen: "+this.volumen+ " Mts Cúbicos\n" +"\nEtiqueta: "+ this.etiqueta;
	    }
	}


