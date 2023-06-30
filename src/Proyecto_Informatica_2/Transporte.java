package Proyecto_Informatica_2;
import Parcial3.RutaTransporte;
import java.util.Scanner;
import java.util.ArrayList;
public class Transporte extends Empleado{
    private int carnetConducir_Tpt;
    private String direccion_Tpt;
    private int telefono_Tpt;
    public Transporte() {
    }
    public int getCarnetConducir_Tpt() {
        return carnetConducir_Tpt;
    }
    public void setCarnetConducir_Tpt(int carnetConducir_Tpt) {
        this.carnetConducir_Tpt = carnetConducir_Tpt;
    }
    public String getDireccion_Tpt() {
        return direccion_Tpt;
    }
    public void setDireccion_Tpt(String direccion_Tpt) {
        this.direccion_Tpt = direccion_Tpt;
    }
    public int getTelefono_Tpt() {
        return telefono_Tpt;
    }
    public void setTelefono_Tpt(int telefono_Tpt) {
        this.telefono_Tpt = telefono_Tpt;
    }
    @Override
    public String toString() {
        return "Transporte{" +
                "Carnet de Conducir: " + carnetConducir_Tpt + '\'' +
                ", Direccion: '" + direccion_Tpt + '\'' +
                ", Telefono/Celular: " + telefono_Tpt +
                '}';
    }
    public void AreaTransporte(){
        Scanner sc=new Scanner(System.in);
        Transporte transporte=new Transporte();
        RutaTransporte rutaTransporte=new RutaTransporte();
        ArrayList<Transporte> datosTransporte=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Area de transporte");
            System.out.print("║ 1- Ingresar carnet de conducir:");
            int cc=sc.nextInt();
            transporte.setCarnetConducir_Tpt(cc);
            System.out.print("║ 2- Ingresar direccion:");
            String dir=sc.next();
            transporte.setDireccion_Tpt(dir);
            System.out.print("╚ 3- Ingresar telefono:");
            int tel=sc.nextInt();
            transporte.setTelefono_Tpt(tel);
            System.out.println("Estos son los datos que ingresaste");
            System.out.println(transporte.toString());
            datosTransporte.add(transporte);
            System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
            op=sc.nextInt();
            if (op == 0) {
                rutaTransporte.MenuEmpleados();
            }
        } while (1!=op);
    }
}
