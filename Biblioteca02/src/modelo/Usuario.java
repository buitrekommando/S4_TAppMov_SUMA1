package modelo;
public class Usuario extends Persona{
    private int id;
    private String correo;
    public Usuario(String nombre, String apellido, int id, String correo){
        super(nombre, apellido);
        this.id = id;
        this.correo = correo;
    }

    //Getter and setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Setters y Getters


}
