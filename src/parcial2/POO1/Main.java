package parcial2.POO1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cuenta cuenta=new Cuenta();
        System.out.println(" Bienvenido ");
        System.out.print("-> Ingrese su nombre: ");
        String a= sc.next();
        cuenta.setNombre(a);
        System.out.print("-> Ingrese su apellido: ");
        String b= sc.next();
        cuenta.setApellido(b);
        System.out.print("-> Ingrese su numero de cuenta: ");
        int c= sc.nextInt();
        cuenta.setNumeroCuenda(c);
        System.out.print("-> Ingrese la cantidad de dinero en su cuenta: ");
        double d= sc.nextDouble();
        cuenta.setCantidad(d);
        System.out.println("Cual es la opcion que decea usar?:");
        System.out.println("1- Depositar");
        System.out.println("2- Retirar");
        System.out.println("3- Revisar cuenta");
        System.out.print("Opcion ->");
        int e= sc.nextInt();
        if (e==1){
            System.out.print("Ingrese la cantidad a depositar: ");
            double d1= sc.nextDouble();
            if(d>0){
                d=d+d1;
                cuenta.setCantidad(d);
                System.out.println("El deposito se hizo con exito");
                System.out.println("Cantidad en la cuenta "+cuenta.getCantidad());
            } else {
                System.out.println("Hubo un error");
            }
        } else if (e==2) {
            System.out.print("Ingrese la cantidad a retirar: ");
            double f= sc.nextDouble();
            if ((d-f)>0){
                d=d-f;
                cuenta.setCantidad(d);
                System.out.println("El retiro se hizo con exito");
                System.out.println("Cantidad en la cuenta "+cuenta.getCantidad());
            } else {
                f=0;
                cuenta.setCantidad(f);
                System.out.println("La cantidad en cuenta es cero "+cuenta.getCantidad());
            }
        } else if (e==3) {
            System.out.println("Estos son los datos de su cuenta");
            System.out.println(cuenta.toString());
        }
    }
}
