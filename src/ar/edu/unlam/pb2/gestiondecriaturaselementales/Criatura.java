package ar.edu.unlam.pb2.gestiondecriaturaselementales;

public abstract class Criatura {

    protected String nombre;
    protected Integer energia;
    protected Elemento afinidad;
    protected EstadoEmocional estado;

    public Criatura(String nombre, Integer energia, Elemento afinidad) {
    	
    	
        this.nombre = nombre;
        this.energia = energia;
        this.afinidad = afinidad;
        this.estado = EstadoEmocional.TRANQUILA;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEnergia() {
        return energia;
    }

    public Elemento getAfinidad() {
        return afinidad;
    }

    public EstadoEmocional getEstadoEmocional() {
        return estado;
    }

    public abstract void entrenar(Integer puntos);
    
    
}
