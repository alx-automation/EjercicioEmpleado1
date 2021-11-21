package ejercicio;

import java.util.List;

public class EmpleadoTest {

    public static void main(String[] args) {
        //intancia
        //objeto
        //encapsulamiento
        //método constructor

        SueldoEmpleado sueldoFinalPepe = new SueldoEmpleado();

        sueldoFinalPepe.asignacionSueldoBaseEmpleado(6);

        List<Integer> listaVentasMesualesPepe = sueldoFinalPepe.ingresarCantidadVentasPorMes();

        sueldoFinalPepe.obtenerSueldoEmpleadoPorMes(101);

        int cantidadMeses = sueldoFinalPepe.obtenerCantidadMesesSuperaVenta(listaVentasMesualesPepe);
        boolean cumpleCondicion = sueldoFinalPepe.evaluarVentasMesesEmpleado(cantidadMeses);

        System.out.println("El sueldo final de Pepe es: " + sueldoFinalPepe.sueldoFinalDelEmpleado(cumpleCondicion));
    }

}
