package ar.edu.unlam.pb2.gestiondecriaturaselementales;

public enum Elementos {
	AGUA("Agua"), FUEGO("Fuego"), AIRE("Aire"), TIERRA("Tierra");

	private String nombre = "";

	Elementos(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return nombre;
	}

}
