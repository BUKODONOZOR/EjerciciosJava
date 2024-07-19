public class Empleado<Aumento>
{
    int id;
    String nombre;
    String posicion;
    double salario;


    public Empleado(int id,String nombre,String posicion , double salario ){
         this.nombre = nombre;
        this.posicion = posicion ;
        this.salario = salario  ;
        this.id =id ;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void AumentarSalario(double porcentaje){
        double valoraumento = porcentaje / 100 ;
        double aumentopesos =  (salario * valoraumento);
        salario = salario + aumentopesos;

    }



    @Override
    public String toString(){
        return

                "Empleado :" + id + '\'' + "Nombre: " + nombre + '\'' + "cargo: " + posicion + '\'' + "Salario:" + salario + '\'';



    }

    public static void main(String[] args) {
        empleado Antony = new empleado(20, 200000 , "Antony" ,1);

        System.out.println(Antony);

        Antony.AumentarSalario(100);

        System.out.println(Antony);
    }


}
