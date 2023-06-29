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
        int opMC=0;
        do {
            System.out.println("╔ Menu de Cliento ♦");
            System.out.println("║ 1- Ingresar");
            System.out.println("║ 2- Registrarse");
            System.out.println("║ 3- Volver");
            System.out.print("╚ Elija una Opcion:");
            opMC=sc.nextInt();
            switch (opMC) {
                case 1:
                    Ingresar();
                    break;
                case 2:
                    Registrar();
                    break;
            }
        }while (opMC!=3);
    }
    public static void Ingresar(){

        /*JFrame frame= new JFrame();
        JTextArea textoArea=new JTextArea(5,100);
        textoArea.setText("");
        JTextField campoNombre=new JTextField();
        JTextField campoID=new JTextField();
        final JTextField campoCorreo=new JTextField();
        Object[] ingresoCampos={"<html> *Datos defoult si no se registro* <br> (Usuario,001,usuario1@email.com)=[0] <br> ╔ Ingrese sus datos de usuario","╠ Nombre de Empresa: ",campoNombre,"╠ ID: ",campoID,"╚ Correo Electronico: ",campoCorreo};

        int opcion = JOptionPane.showConfirmDialog(frame,ingresoCampos,"Cliente",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (opcion == JOptionPane.OK_OPTION){
            String texto = campoNombre.getText()+"\n"+ campoID.getText()+"\n"+campoCorreo.getText();
            textoArea.setText(texto);
        }*/
    }
    public static void Registrar(ArrayList<Cliente> DatosCliente){
        Scanner sc=new Scanner(System.in);
        Cliente cliente=new Cliente();
        RutaCliente rc=new RutaCliente();
        Random rnd=new Random();
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
            cliente.setId_Clt(id);
            System.out.print("╚ 3- Ingresar correo electronico:");
            String ce= sc.next();
            cliente.setCorreoElectronico_Clt(ce);
            System.out.println("Estos son los datos que ingresaste");
            System.out.println(cliente.toString());
            DatosCliente.add(cliente);
            System.out.print("1 if you wanna go back: ");
            op=sc.nextInt();
            rc.MenuRutaCliente();
        }while (op!=1);
    }
}
