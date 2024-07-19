import java.util.Scanner;

public class TallerMotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la capacidad máxima del taller y el número de trabajos a registrar
        System.out.print("Ingrese la capacidad máxima del taller: ");
        int maxEmployees = scanner.nextInt();
        System.out.print("Ingrese el número de trabajos a registrar: ");
        int numTrabajos = scanner.nextInt();

        // Asegurarse de que el número de trabajos no supere la capacidad máxima
        if (numTrabajos > maxEmployees) {
            System.out.println("El número de trabajos no puede superar la capacidad máxima del taller.");
            return;
        }

        // Definir la estructura de datos
        String[][][] taller = new String[maxEmployees][2][4];

        // Inicializar el array tridimensional con la información de los trabajos
        for (int i = 0; i < numTrabajos; i++) {
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.print("Ingrese el nombre del empleado: ");
            String empleado = scanner.nextLine();

            System.out.print("Ingrese el tipo de vehículo (0 para Moto, 1 para Carro): ");
            int tipoVehiculo = scanner.nextInt();

            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.print("Ingrese la marca: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Ingrese el año: ");
            String ano = scanner.nextLine();

            System.out.print("Ingrese el estado (Pendiente, En reparación, Reparado): ");
            String estado = scanner.nextLine();

            taller[i][tipoVehiculo][0] = marca;
            taller[i][tipoVehiculo][1] = modelo;
            taller[i][tipoVehiculo][2] = ano;
            taller[i][tipoVehiculo][3] = estado;
        }

        // Mostrar todos los vehículos en una tabla
        System.out.println("Agenda de trabajos:");
        System.out.println("| Tipo  | Marca   | Modelo  | Año  | Estado       |");
        System.out.println("|-------|---------|---------|------|--------------|");

        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (taller[i][j][0] != null) {
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    System.out.printf("| %-5s | %-7s | %-7s | %-4s | %-12s |%n", tipo, taller[i][j][0], taller[i][j][1], taller[i][j][2], taller[i][j][3]);
                }
            }
        }

        // Contar y mostrar cuántos vehículos hay en cada estado
        int pendientes = 0, enReparacion = 0, reparados = 0;
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (taller[i][j][3] != null) {
                    switch (taller[i][j][3].toLowerCase()) {
                        case "pendiente":
                            pendientes++;
                            break;
                        case "en reparación":
                            enReparacion++;
                            break;
                        case "reparado":
                            reparados++;
                            break;
                    }
                }
            }
        }

        System.out.println("Vehículos en cada estado:");
        System.out.println("Pendientes: " + pendientes);
        System.out.println("En reparación: " + enReparacion);
        System.out.println("Reparados: " + reparados);

        // Permitir buscar un vehículo por su marca y modelo
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese la marca del vehículo a buscar: ");
        String marcaBuscar = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el modelo del vehículo a buscar: ");
        String modeloBuscar = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (taller[i][j][0] != null && taller[i][j][0].equalsIgnoreCase(marcaBuscar) && taller[i][j][1].equalsIgnoreCase(modeloBuscar)) {
                    encontrado = true;
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    System.out.printf("Vehículo encontrado: Tipo: %s, Marca: %s, Modelo: %s, Año: %s, Estado: %s%n", tipo, taller[i][j][0], taller[i][j][1], taller[i][j][2], taller[i][j][3]);
                }
            }
        }
        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }

        // Permitir actualizar el estado de un vehículo específico
        System.out.print("Ingrese la marca del vehículo a actualizar: ");
        String marcaActualizar = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el modelo del vehículo a actualizar: ");
        String modeloActualizar = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el nuevo estado (Pendiente, En reparación, Reparado): ");
        String nuevoEstado = scanner.nextLine();

        boolean actualizado = false;
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (taller[i][j][0] != null && taller[i][j][0].equalsIgnoreCase(marcaActualizar) && taller[i][j][1].equalsIgnoreCase(modeloActualizar)) {
                    taller[i][j][3] = nuevoEstado;
                    actualizado = true;
                    System.out.println("Estado actualizado con éxito.");
                }
            }
        }
        if (!actualizado) {
            System.out.println("Vehículo no encontrado para actualizar.");
        }
    }
}
