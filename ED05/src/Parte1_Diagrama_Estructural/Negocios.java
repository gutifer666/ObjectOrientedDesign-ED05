package Parte1_Diagrama_Estructural;

import java.util.Vector;
import Parte1_Diagrama_Estructural.Ciudad;

public class Negocios {
	private String _nombre;
	private String _direccion;
	private String _tipo;
	public Vector<Ciudad> _tiene = new Vector<Ciudad>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}

	public String getTipo() {
		return this._tipo;
	}

	public void setTipo(String aTipo) {
		this._tipo = aTipo;
	}
}