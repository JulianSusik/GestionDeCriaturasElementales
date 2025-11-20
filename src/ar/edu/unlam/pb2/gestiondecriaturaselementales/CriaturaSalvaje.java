package ar.edu.unlam.pb2.gestiondecriaturaselementales;

public class CriaturaSalvaje extends Criatura {

    public CriaturaSalvaje(String nombre, Integer energia, Elemento afinidad) {
        super(nombre, energia, afinidad);
    }

    @Override
    public void entrenar(Integer puntos) {
    	  this.energia += puntos;

    	    if (this.energia > 200) {
    	        throw new RuntimeException("La energía de una criatura salvaje no puede superar 200.");
    	    }
    }
}
