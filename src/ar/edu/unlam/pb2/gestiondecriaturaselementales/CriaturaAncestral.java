package ar.edu.unlam.pb2.gestiondecriaturaselementales;

public class CriaturaAncestral extends CriaturaElemental {

	private boolean estaSensibleAlEntrenamiento = false;
	private final Integer ENERGIA_GANADA = 10;
	private final Integer MINIMO_ENERGIA = 100;
	private final Integer ENERGIA_QUE_PIERDE = 15;

	public CriaturaAncestral(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.nivelEnergia = generador.nextInt(101) + MINIMO_ENERGIA;
	}

	public CriaturaAncestral(String nombre, ElementosEnum elemento, Integer nivelEnergia, boolean esTranquila) {
		super(nombre, elemento, nivelEnergia, esTranquila);
		if (nivelEnergia < 100)
			throw new IllegalArgumentException(
					"No se puede inicializar una CRIATURA ANCESTRAL con menos de 100 de ENERGIA. Valor ingresado:"
							+ nivelEnergia);
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		if (this.nivelEnergia == this.MAXIMO_ENERGIA)
			throw new LimiteEnergiaSuperadoException("La energia esta en su nivel maximo. No se puede seguir entrenando");
		
		if (estaSensibleAlEntrenamiento == true) {
			
			nivelEnergia -= ENERGIA_QUE_PIERDE;
			if (nivelEnergia < MINIMO_ENERGIA) nivelEnergia = MINIMO_ENERGIA;
			if (generador.nextInt(4) == 0) estaSensibleAlEntrenamiento = false;
			
		} else {
			
			if (this.nivelEnergia > this.MAXIMO_ENERGIA - ENERGIA_GANADA) {
				nivelEnergia = this.MAXIMO_ENERGIA;
			} else {
				nivelEnergia += ENERGIA_GANADA;
			}
			if (generador.nextInt(4) == 0);
		
		}

	}
}
