package modelo;

public class Libro extends Autor{
    private int id;
    private String titulo;
    private Long isbn;
    private String anioPublicacion;
    private Autor autor;


    public Libro(String nombre, String apellido, String diaNacimiento, String mesNacimiento,String anioNacimiento, String nacionalidad, int id, String titulo, Long isbn, String anioPublicacion, Autor autor) {
        super(nombre, apellido, diaNacimiento, mesNacimiento, anioNacimiento, nacionalidad);
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Long getIsbn() {
        return isbn;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    public String getDatosLibroCompleto(){
        //retorna nombre de libro + nombre autor
        return "<"+this.titulo +">" +". Escrito por:  " + this.autor.getNombre()+" "+this.autor.getApellido();

    }

}
