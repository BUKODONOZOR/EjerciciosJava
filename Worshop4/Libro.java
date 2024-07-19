// Clase Libro que representa un libro en una biblioteca
public class Libro {
    // Atributos privados de la clase
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean prestado;

    // Constructor para inicializar los atributos de la clase
    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.prestado = false; // Por defecto, el libro no está prestado
    }

    // Métodos getters para obtener el estado de los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // Métodos setters para modificar el estado de los atributos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    // Método para prestar el libro, cambia el estado de prestado a true
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    // Método para devolver el libro, cambia el estado de prestado a false
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    @Override
    public String toString() {
        return "Libro" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", prestado=" + prestado +
                '}';
    }

    public static void main(String[] args) {
        // Crear una instancia de Libro
        Libro libro = new Libro("1984", "George Orwell", 1949);

        // Mostrar el estado inicial del libro
        System.out.println(libro);

        // Prestar el libro
        libro.prestar();

        // Mostrar el estado del libro después de prestarlo
        System.out.println(libro);

        // Intentar prestar el libro nuevamente
        libro.prestar();

        // Devolver el libro
        libro.devolver();

        // Mostrar el estado del libro después de devolverlo
        System.out.println(libro);

        // Intentar devolver el libro nuevamente
        libro.devolver();
    }
}

