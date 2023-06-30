package Proyecto_Informatica_2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        Empleado empleado=new Empleado();
        ArrayList<Empleado> Datos=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int opMain=0;
        do {
            System.out.println("╔ Bienvenito Akhros International");
            System.out.println("║ 1- Area para clientes");
            System.out.println("║ 2- Area para Empleados");
            System.out.println("║ 3- Salir");
            System.out.print("╚ Elija una opcion: ");
            opMain=sc.nextInt();
            switch (opMain){
                case 1:
                    cliente.MenuCliente();
                    break;
                case 2:
                    empleado.MenuEmpleado();
                    break;
            }
        } while (opMain!=3);
    }
}
