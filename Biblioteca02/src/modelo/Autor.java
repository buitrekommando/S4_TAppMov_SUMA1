package modelo;
public class Autor  extends Persona{
    private String diaNacimiento;
    private String mesNacimiento;

    private String anioNacimiento;
    private String nacionalidad;


    public Autor(String nombre, String apellido, String diaNacimiento, String mesNacimiento, String anioNacimiento, String nacionalidad) {
        super(nombre, apellido);
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.nacionalidad = nacionalidad;

    }

    public String getNacimiento() {
        return "el día: "+this.diaNacimiento + ", del mes: " + this.mesNacimiento + ", del año: " + this.anioNacimiento;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
}
