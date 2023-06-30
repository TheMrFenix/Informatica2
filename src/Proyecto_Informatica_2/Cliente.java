package Proyecto_Informatica_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Cliente {
    private String nombreCE_Clt;
    private int id_Clt;
    private String correoElectronico_Clt;
    public Cliente() {
    }
    public String getNombreCE_Clt() {
        return nombreCE_Clt;
    }
    public void setNombreCE_Clt(String nombreCE_Clt) {
        this.nombreCE_Clt = nombreCE_Clt;
    }
    public int getId_Clt() {
        return id_Clt;
    }
    public void setId_Clt(int id_Clt) {
        this.id_Clt = id_Clt;
    }
    public String getCorreoElectronico_Clt() {
        return correoElectronico_Clt;
    }
    public void setCorreoElectronico_Clt(String correoElectronico_Clt) {
        this.correoElectronico_Clt = correoElectronico_Clt;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre de la Empresa: '" + nombreCE_Clt + '\'' +
                ", ID: " + id_Clt +
                ", Correo Electronica: '" + correoElectronico_Clt + '\'' +
                '}';
    }
    public static void MenuCliente(){
        Scanner sc=new Scanner(System.in);
        Cliente cliente=new Cliente();
        RutaCliente rc=new RutaCliente();
        Random rnd=new Random();
        ArrayList<Cliente> DatosCliente=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Registro de usuario");
            System.out.print("║ 1- Ingresar nombre:");
            String nc= sc.next();
            cliente.setNombreCE_Clt(nc);
            int rid= rnd.nextInt(20);
            System.out.println("║ Codigo id ["+rid+"]");
            System.out.print("║ 2- Ingresar id:");
            int id= sc.nextInt();
            if (id==rid){
                cliente.setId_Clt(id);
                System.out.print("╚ 3- Ingresar correo electronico:");
                String ce= sc.next();
                cliente.setCorreoElectronico_Clt(ce);
                System.out.println("Estos son los datos que ingresaste");
                System.out.println(cliente.toString());
                DatosCliente.add(cliente);
            } else {
                System.out.println("vuelva a intentarlo");
            }
            System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
            op=sc.nextInt();
            if (op == 0) {
                rc.MenuRutaCliente();
            }
        }while (op!=1);
    }
}
