import modelo.Persona;
import modelo.Usuario;
import modelo.Autor;
import modelo.Libro;
import modelo.Prestamo;

public class Main {
    public static void main(String[] args) {
//        // Instanciamos un objeto de la clase Persona
//        Persona persona = new Persona("José", "Henriquez");
//
//        // Imprimimos el nombre y apellido de la persona
//        System.out.println("Nombre Persona: " + persona.getNombre());
//        System.out.println("Apellido Persona: " + persona.getApellido());
//        System.out.println("Nombre completo Persona: " + persona.getNombreCompleto());

        System.out.println("--------------");

        //instanciar un objeto de la clase Usuario
        Usuario usuario = new Usuario("José", "Henriquez", 1, "correo@correo.cl");

        //imprimimos el nombre y apellido del usuario que son heredados
        System.out.println("Nombre Usuario: " + usuario.getNombre());
        System.out.println("Apellido Usuario: " + usuario.getApellido());
        System.out.println("Nombre completo Usuario: " + usuario.getNombreCompleto());

        //imprimimos el id y correo del usuario que son propios de la clase Usuario
        System.out.println("Id Usuario: " + usuario.getId());
        System.out.println("Correo Usuario: " + usuario.getCorreo());

        System.out.println("--------------");
        //intanciar un objeto de la clase Autor
        Autor autor = new Autor("John Ronald", "Tolkien", "03", "01", "1892", "Sudafricana");

        //imprimimos el nombre y apellido del autor que son heredados
        System.out.println("Nombre Autor: "+autor.getNombreCompleto()  + ", nació "+ autor.getNacimiento()+", su nacionalidad es: "+autor.getNacionalidad());



        System.out.println("--------------");

        //intanciar un objeto de la clase Libro
        Libro libro = new Libro("John Ronald", "Tolkien", "03","01", "1892", "Sudafricana", 1,"Clean Code: A Handbook of Agile Software Craftsmanship", 9780132350884L, "1954", autor);

        System.out.println("Título Libro: " + libro.getTitulo());
        System.out.println("autor Libro: " + libro.getAutor().getNombreCompleto());
        System.out.println("Año:"+libro.getAnioPublicacion());
        System.out.println("ISBN:"+libro.getIsbn());



        System.out.println("--------------");
        //instanciar un objeto de la clase Prestamo
        Prestamo prestamo = new Prestamo("José", "Henriquez", 1, "correo@correo.l",
                "01", "01", "2021", "José", "El señor de los anillos", libro, usuario);
        System.out.println("Resumen Prestamo: "+ prestamo.getResumen());

        System.out.println("--------------");








       }
    }