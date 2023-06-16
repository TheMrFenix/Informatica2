package Parcial3;
import java.util.Scanner;
import java.util.ArrayList;
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
    public void MenuCliente(){ // no me dio para implementar los labels
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Menu de cliente ***");
        System.out.println("1- Ingresar");
        System.out.println("2- Registrarse");
        System.out.print("->");
        int res= sc.nextInt();
        switch (res){
            case 1:
                System.out.println("-------------------------------------------------");
                Ingresar();
                System.out.println("-------------------------------------------------");
                break;
            case 2:
                System.out.println("-------------------------------------------------");
                Registrar();
                System.out.println("-------------------------------------------------");
                break;
            default:
                System.out.println("Opcion incorrecta, que tenga un buendia");
        }
    }
    public void Ingresar(){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> NombreEmpresa=new ArrayList<>();
        ArrayList<Integer> ID=new ArrayList<>();
        ArrayList<String> CorreoElectronico=new ArrayList<>();
        NombreEmpresa.add(0,"Usuario");
        ID.add(0,001);
        CorreoElectronico.add(0,"correodeusuario1@email.com");
        System.out.println();
    }
    public void Registrar(){

    }
}
