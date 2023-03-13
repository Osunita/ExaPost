package examen.examen.model;

public class alumno {
    private int id;
    private String nombre;
    private boolean fct;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFct() {
        return fct;
    }

    public void setFct(boolean fct) {
        this.fct = fct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
