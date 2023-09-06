package modelo;


public class Prestamo extends Usuario{
    private String diaPrestamo;
    private String mesPrestamo;
    private String anioPrestamo;

    private String UsuarioPrestamo;

    private  String LibroPrestamo;

    private Libro libro;
    private Usuario usuario;

    public Prestamo(String nombre, String apellido, int id, String correo,
                    String diaPrestamo, String mesPrestamo, String anioPrestamo,
                    String usuarioPrestamo, String libroPrestamo, Libro libro, Usuario usuario) {
        super(nombre, apellido, id, correo);
        this.diaPrestamo = diaPrestamo;
        this.mesPrestamo = mesPrestamo;
        this.anioPrestamo = anioPrestamo;
        UsuarioPrestamo = usuarioPrestamo;
        LibroPrestamo = libroPrestamo;
        this.libro = libro;
        this.usuario = usuario;
    }

    public String getDiaPrestamo() {
        return diaPrestamo;
    }

    public String getMesPrestamo() {
        return mesPrestamo;
    }

    public String getAnioPrestamo() {
        return anioPrestamo;
    }

    public String getUsuarioPrestamo() {
        return UsuarioPrestamo;
    }

    public String getLibroPrestamo() {
        return LibroPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getResumen(){
        return this.libro.getTitulo()+", prestado a: "+ this.usuario.getNombreCompleto();    }
}
