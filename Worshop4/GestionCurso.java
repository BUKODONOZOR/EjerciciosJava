import java.util.ArrayList;

public class GestionCurso { }
class Estudiante{

    int id;
    String email ;
    String nombre;

    public Estudiante(int id ,String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Curso {
    private int codigo;
    private String nombreCurso;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(int codigo , String nombreCurso ){
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
        listaEstudiantes =  new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
}

class AdministracionCurso {
    public void AgregarEstudiante(Curso curso , Estudiante estudiante){
        curso.getListaEstudiantes().add(estudiante);
        System.out.println("Producto Agregado");

    }

    public void MostrarEstudianteCurso(Curso curso){
        for(Estudiante estudiante : curso.getListaEstudiantes()){
            System.out.println(estudiante);
        }
    }
}