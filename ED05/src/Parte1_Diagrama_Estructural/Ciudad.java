package Parte1_Diagrama_Estructural;

import java.util.Vector;
import Parte1_Diagrama_Estructural.Negocios;

public class Ciudad {
	private String _nombre;
	private int _poblacion;
	public Provincia _pertenece;
	public Vector<Negocios> _tiene = new Vector<Negocios>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public int getPoblacion() {
		return this._poblacion;
	}

	public void setPoblacion(int aPoblacion) {
		this._poblacion = aPoblacion;
	}

	public Turisticas[] obtenerCiudadesTuristicas() {
		throw new UnsupportedOperationException();
	}

	public Turistica obtenerCiudadTuristica(String aTuristica) {
		throw new UnsupportedOperationException();
	}

	public Negocios[] obtenerNegocios() {
		throw new UnsupportedOperationException();
	}
}