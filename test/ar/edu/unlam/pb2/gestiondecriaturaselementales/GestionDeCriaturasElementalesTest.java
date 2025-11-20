package ar.edu.unlam.pb2.gestiondecriaturaselementales;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GestionDeCriaturasElementalesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void queSePuedaCrearUnaCriaturaSalvaje() {
		Criatura criatura = new CriaturaSalvaje("Goru", 50, Elemento.AGUA);

		assertEquals("Goru", criatura.getNombre());
		assertEquals(Integer.valueOf(50), criatura.getEnergia());
		assertEquals(Elemento.AGUA, criatura.getAfinidad());
		assertEquals(EstadoEmocional.TRANQUILA, criatura.getEstadoEmocional());
	}

	@Test
	public void queSePuedaCrearUnMaestroElementalSinCriaturasASuCargo() {
		MaestroElemental maestro = new MaestroElemental("Kai", 30, Elemento.FUEGO);
		assertEquals("Kai", maestro.getNombre());
		assertEquals(Integer.valueOf(30), maestro.getNivelMaestria());
		assertEquals(Elemento.FUEGO, maestro.getAfinidadPrincipal());
		assertNotNull(maestro.getCriaturas());
		assertTrue(maestro.getCriaturas().isEmpty());

	}

	@Test
	public void queSePuedaAsignarCriaturasACargoDeUnMaestro() {
		MaestroElemental maestro = new MaestroElemental("Kai", 30, Elemento.FUEGO); // creo un maestro
		Criatura criatura = new CriaturaSalvaje("Goru", 50, Elemento.AGUA); // creo una criatura
		maestro.asignarCriatura(criatura);
		assertTrue(maestro.getCriaturas().containsKey("Goru"));

	}
	
	@Test(expected = RuntimeException.class)
	public void queUnaCriaturaSalvajeLanceExcepcionSiSuperaEnergiaMaxima() {
	    Criatura criatura = new CriaturaSalvaje("Goru", 190, Elemento.AGUA);
	    criatura.entrenar(20); 
	}

}
