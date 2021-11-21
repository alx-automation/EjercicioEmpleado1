package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SueldoEmpleado {

    String dni;
    String nombre = "pepe";
    double sueldoEmpleado;
    double sueldoBaseEmpleado;

    SueldoEmpleado() {

    }

    public List<Integer> ingresarCantidadVentasPorMes() {
        List<Integer> totalProductosVendidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el valor del total de ventas del empleado: ");
            totalProductosVendidos.add(scanner.nextInt());
        }
        return totalProductosVendidos;
    }

    public void asignacionSueldoBaseEmpleado(int tiempoTrabajoEmpleado) {
        if (tiempoTrabajoEmpleado >= 0 && tiempoTrabajoEmpleado <= 5) {
            sueldoBaseEmpleado = 2500;
        } else {
            if (tiempoTrabajoEmpleado >= 6 && tiempoTrabajoEmpleado <= 7) {
                sueldoBaseEmpleado = 4000;
            } else {
                if (tiempoTrabajoEmpleado >= 8 && tiempoTrabajoEmpleado <= 10) {
                    sueldoBaseEmpleado = 6000;
                }
            }
        }
    }

    public double sueldoFinalDelEmpleado(boolean seCumpleCondicion) {
        double sueldoFinalEmpleado = 0;
        if (seCumpleCondicion) {
            sueldoFinalEmpleado = sueldoEmpleado * 1.15;
        }

        return sueldoFinalEmpleado;
    }

    public double obtenerSueldoEmpleadoPorMes(int cantidadProductos) {

        if (cantidadProductos >= 0 && cantidadProductos <= 50) {
            sueldoEmpleado = sueldoBaseEmpleado * 1.1;
        } else {
            if (cantidadProductos >= 51 && cantidadProductos <= 100) {
                sueldoEmpleado = sueldoBaseEmpleado * 1.15;
            } else {
                if (cantidadProductos >= 101 && cantidadProductos <= 150) {
                    sueldoEmpleado = sueldoBaseEmpleado * 1.2;
                }
            }
        }
        return sueldoEmpleado;
    }

    public int obtenerCantidadMesesSuperaVenta(List<Integer> totalProductosVendidos) {
        int contador = 0;
        for (Integer elemento : totalProductosVendidos) {
            if (elemento >= 100) {
                contador++;
            }
        }
        return contador;
    }

    public boolean evaluarVentasMesesEmpleado(int cantidadMesesSuperaVentas) {
        boolean empleadoCumpleCondicion = false;
        if (cantidadMesesSuperaVentas == 3) {
            empleadoCumpleCondicion = true;
        }
        return empleadoCumpleCondicion;
    }
}
