import java.util.ArrayList;

// Clase base Producto
class Producto {
    private int id;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + '}';
    }
}

// Clase ProductoEspecifico que hereda de Producto
class ProductoEspecifico extends Producto {
    private String categoria;
    private String marca;

    // Constructor
    public ProductoEspecifico(int id, String nombre, double precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    // Getters y Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProductoEspecifico{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

// Clase Inventario para gestionar el inventario
class Inventario {
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para añadir un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    // Método para mostrar todos los productos en el inventario
    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Método para buscar un producto por ID
    public Producto buscarProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    // Método para eliminar un producto por ID
    public boolean eliminarProductoPorId(int id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto);
            return true;
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
        return false;
    }

    public static void main(String[] args) {
        // Crear instancia de Inventario
        Inventario inventario = new Inventario();

        // Crear productos y agregarlos al inventario
        Producto prod1 = new Producto(1, "Producto 1", 100.0);
        ProductoEspecifico prod2 = new ProductoEspecifico(2, "Producto 2", 150.0, "Categoria 1", "Marca A");
        ProductoEspecifico prod3 = new ProductoEspecifico(3, "Producto 3", 200.0, "Categoria 2", "Marca B");

        inventario.agregarProducto(prod1);
        inventario.agregarProducto(prod2);
        inventario.agregarProducto(prod3);

        // Mostrar inventario
        System.out.println("Inventario completo:");
        inventario.mostrarInventario();

        // Buscar y eliminar un producto por ID
        System.out.println("Buscar producto con ID 2:");
        System.out.println(inventario.buscarProductoPorId(2));

        System.out.println("Eliminar producto con ID 2:");
        inventario.eliminarProductoPorId(2);

        // Mostrar inventario después de la eliminación
        System.out.println("Inventario después de la eliminación:");
        inventario.mostrarInventario();
    }
}
