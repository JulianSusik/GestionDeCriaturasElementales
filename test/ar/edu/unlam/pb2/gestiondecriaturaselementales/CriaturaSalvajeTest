package ar.edu.unlam.pb2.gestiondecriaturaselementales;

import static org.junit.Assert.*;

import org.junit.Test;

public class CriaturaSalvajeTest {

	@Test
	public void queSePuedaCrearUnaCriaturaSalvaje() {
		CriaturaSalvaje criatura = new CriaturaSalvaje("Goru", Elementos.AGUA, 50, EstadoEmocional.TRANQUILA);

		assertEquals("Goru", criatura.getNombre());
		assertEquals(Integer.valueOf(50), criatura.getNivelEnergia());
		assertEquals(Elementos.AGUA, criatura.getAfinidadElemental());
		assertEquals(EstadoEmocional.TRANQUILA, criatura.getEstado());
	}

	@Test(expected = LimiteEnergiaSuperadoException.class)
	public void queUnaCriaturaSalvajeLanceExcepcionSiSuperaEnergiaMaxima() throws LimiteEnergiaSuperadoException {
		CriaturaSalvaje criatura = new CriaturaSalvaje("Goru", Elementos.AGUA, 190, EstadoEmocional.TRANQUILA);
		criatura.entrenar(20);
	}
}

