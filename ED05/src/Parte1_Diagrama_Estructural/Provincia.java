package Parte1_Diagrama_Estructural;

public class Provincia {
	private String _nombre;
	private int _codigoPostal;
	public ComunidadAutonoma _pertenece;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public int getCodigoPostal() {
		return this._codigoPostal;
	}

	public void setCodigoPostal(int aCodigoPostal) {
		this._codigoPostal = aCodigoPostal;
	}

	public Ciudad[] obtenerCiudades() {
		throw new UnsupportedOperationException();
	}

	public Ciudad obtenerCiudad(String aCiudad) {
		throw new UnsupportedOperationException();
	}
}