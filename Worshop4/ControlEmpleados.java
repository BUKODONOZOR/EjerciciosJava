import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

class Persona{
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad ;
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

class empleado extends Persona {
    private int empleadoId;
    private double salario;

    public empleado(int edad , double salario, String nombre , int empleadoId ) {
        super(nombre, edad);
        this.empleadoId = empleadoId;
        this.salario = salario;

    }


    public void setEmpleadoId(int empleadoId) {
        empleadoId = empleadoId;
    }

    public void setSalario(double salario) {
        salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

}

class EmpleadoT extends  empleado{

    public EmpleadoT(int edad , double salario , String nombre , int empleadoId){
        super(edad , salario , nombre,empleadoId );

    }

}

class EmpleadoP extends  empleado{
    public EmpleadoP(int edad , double salario , String nombre , int empleadoId){
        super(edad , salario , nombre,empleadoId);
    }
}

class GestionEmpleados {
    private ArrayList<Persona> personas;

    public GestionEmpleados(){
        personas =  new ArrayList<>();
    }

    public void AgregarPersona(Persona persona){
        personas.add(persona);
        System.out.println("Persona Agregada");
    }

    public void MostrarPersona(){
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }

    public  Persona MostrarPersonaNombre(String nombre){
        for(Persona persona: personas){
            if(Objects.equals(persona.getNombre(), nombre)){
                System.out.println(persona);
            }
        }
        return  null;

    }

    public boolean EliminarPersonaNombre(String nombre){
        for(Persona persona : personas){
            if (Objects.equals(persona.getNombre(), nombre ) ){
                personas.remove(persona);
                System.out.println("Persona Eliminada");
                return true;
            }
        }
        return false;
    }
}



