import modelo.Usuario;
import modelo.Autor;
import modelo.Libro;
import modelo.Prestamo;

public class Main {
    public static void main(String[] args) {
//        // Instanciamos un objeto de la clase Persona
//        Persona persona = new Persona("José Luis", "Henriquez");
//
//        // Imprimimos el nombre y apellido de la persona
//        System.out.println("Nombre Persona: " + persona.getNombre());
//        System.out.println("Apellido Persona: " + persona.getApellido());
//        System.out.println("Nombre completo Persona: " + persona.getNombreCompleto());
//Nueva nota de test.
//Nota editada desde GitHub
//Nota editada desde IntelliJ PC windows
//Nota editada desde github android

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
        Autor autor = new Autor("Robert C. Martin ", "Martin ", "17", "12", "1952", "Estado Unidense");

        //imprimimos el nombre y apellido del autor que son heredados
        System.out.println("Nombre Autor: "+autor.getNombreCompleto()  + ", nació "+ autor.getNacimiento()+", su nacionalidad es: "+autor.getNacionalidad());



        System.out.println("--------------");

        //intanciar un objeto de la clase Libro
        Libro libro = new Libro("Robert C. Martin ", "Martin ", "17","12", "1952", "Estado Unidense", 1,"Clean Code: A Handbook of Agile Software Craftsmanship", "978-0132350884", "1954", autor);

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