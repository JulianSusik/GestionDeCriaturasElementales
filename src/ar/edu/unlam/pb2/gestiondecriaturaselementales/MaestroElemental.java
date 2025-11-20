package ar.edu.unlam.pb2.gestiondecriaturaselementales;

import java.util.HashMap;
import java.util.Map;

public class MaestroElemental {
	private String nombre;
	private Integer nivelMaestria;
	private Elemento afinidadPrincipal;
	private Map<String, Criatura> criaturas;

	public MaestroElemental(String nombre, Integer nivelMaestria, Elemento afinidadPrincipal) {
		this.nombre = nombre;
		this.nivelMaestria = nivelMaestria;
		this.afinidadPrincipal = afinidadPrincipal;
		this.criaturas = new HashMap<>();
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public Integer getNivelMaestria() {
		// TODO Auto-generated method stub
		return nivelMaestria;
	}

	public Elemento getAfinidadPrincipal() {
		return afinidadPrincipal;
	}

	public Map<String, Criatura> getCriaturas() {
		return criaturas;
	}

	public void asignarCriatura(Criatura criatura) {
		this.criaturas.put(criatura.getNombre(), criatura);
		
	}

}
