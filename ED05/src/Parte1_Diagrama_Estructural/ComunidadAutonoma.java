package Parte1_Diagrama_Estructural;

import java.util.Vector;
import Parte1_Diagrama_Estructural.Provincia;

public class ComunidadAutonoma {
	private String _nombre;
	private double _superficie;
	public Vector<Provincia> _pertenece = new Vector<Provincia>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public double getSuperficie() {
		return this._superficie;
	}

	public void setSuperficie(double aSuperficie) {
		this._superficie = aSuperficie;
	}

	public Provincia[] obtenerProvincias() {
		throw new UnsupportedOperationException();
	}

	public Provincia obtenerProvincia(String aProvincia) {
		throw new UnsupportedOperationException();
	}
}