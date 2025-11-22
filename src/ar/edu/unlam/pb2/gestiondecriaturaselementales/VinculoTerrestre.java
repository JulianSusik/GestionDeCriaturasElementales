package ar.edu.unlam.pb2.gestiondecriaturaselementales;

public class VinculoTerrestre extends TransformacionDecorator {

	public VinculoTerrestre(CriaturaElemental criatura) {
		super(criatura);
	}

	@Override
	public Integer getNivelEnergia() {
		Integer energiaBase = criatura.getNivelEnergia();
		return Math.max(50, energiaBase);
	}

	@Override
	public Elementos getAfinidadElemental() {
		return Elementos.TIERRA;
	}

}
