package parcial2.POO2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persona edad1=new Persona("","","","","","");
        System.out.print("Ingrese su nombre: ");
        String a1= sc.next();
        edad1.setNombre(a1);
        System.out.print("Ingrese su Primer apellido: ");
        String a2= sc.next();
        edad1.setPrimerApellido(a2);
        System.out.print("Ingrese su Segundo apellido: ");
        String a3= sc.next();
        edad1.setSegundoApellido(a3);
        System.out.println("Ingrese su fecha de nacimiento > ");
        System.out.print("Dia: ");
        String b1= sc.next();
        edad1.setDia(b1);
        System.out.print("Mes: ");
        String b2= sc.next();
        edad1.setMes(b2);
        System.out.print("Año: ");
        String b3= sc.next();
        edad1.setAño(b3);
        System.out.println("Estos son los datos que ingresaste");
        System.out.println(edad1.toString());
        System.out.println("Saber edad");
        obtenerEdad();
    }
    public static void obtenerEdad(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el año actual >");
        System.out.print("Año: ");
        int a1= sc.nextInt();
        System.out.println("Ingrese su año de nacimiento >");
        int a2= sc.nextInt();
        int a3=a1-a2;
        System.out.println("Su edad es de= "+a3+" años");
    }
}