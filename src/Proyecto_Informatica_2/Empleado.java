package Proyecto_Informatica_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Empleado {
    private String nombre_Emp;
    private int id_Emp;
    private int claveAcceso_Emp;
    private int sueldo_Emp;
    public Empleado() {
    }
    public String getNombre_Emp() {
        return nombre_Emp;
    }
    public void setNombre_Emp(String nombre_Emp) {
        this.nombre_Emp = nombre_Emp;
    }
    public int getId_Emp() {
        return id_Emp;
    }
    public void setId_Emp(int id_Emp) {
        this.id_Emp = id_Emp;
    }
    public int getClaveAcceso_Emp() {
        return claveAcceso_Emp;
    }
    public void setClaveAcceso_Emp(int claveAcceso_Emp) {
        this.claveAcceso_Emp = claveAcceso_Emp;
    }
    public int getSueldo_Emp() {
        return sueldo_Emp;
    }
    public void setSueldo_Emp(int sueldo_Emp) {
        this.sueldo_Emp = sueldo_Emp;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre: '" + nombre_Emp + '\'' +
                ", ID: " + id_Emp +
                ", Clave de Acceso: " + claveAcceso_Emp +
                ", Sueldo: " + sueldo_Emp +
                '}';
    }
    public void MenuEmpleado(){
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        Empleado empleado=new Empleado();
        Transporte transporte=new Transporte();
        ArrayList<Empleado> datosEmpleado=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Menu de empleado");
            System.out.print("║ 1- Ingresar nombre:");
            String nom=sc.next();
            empleado.setNombre_Emp(nom);
            int rid= rnd.nextInt(20);
            System.out.println("║ Codigo id ["+rid+"]");
            System.out.print("║ 2- Ingresar id:");
            int id= sc.nextInt();
            if (id==rid){
                empleado.setId_Emp(id);
                System.out.print("║ 3- Ingresar clave de acceso:");
                int ca=sc.nextInt();
                empleado.setId_Emp(ca);
                System.out.print("╚ 4- Ingresar sueldo:");
                int su=sc.nextInt();
                empleado.setSueldo_Emp(su);
                System.out.println("Estos son los datos que ingresaste");
                System.out.println(empleado.toString());
                datosEmpleado.add(empleado);
            } else {
                System.out.println("Intente de nuevo");
            }
            System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
            op=sc.nextInt();
            if (op == 0) {
                transporte.AreaTransporte();
            }
        }while (op!=1);
    }
}