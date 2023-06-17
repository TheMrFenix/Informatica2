package Parcial3;
import javax.swing.*;
import java.awt.*;
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
    public void MenuCliente(){
        Frame frame=new Frame();
        Icon opcion=new ImageIcon("yourFile.gif");
        Object optionArray[]={"Ingresar","Registrarse"};
        int pregunta = JOptionPane.showOptionDialog(frame,"<html> ╔ Menu de Cliento ♦ <br> ║ Ingresar <br> ║ Registrarse <br> ╚ Elija una Opcion","Cliente",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,opcion,optionArray,optionArray[1]);
        if (pregunta == JOptionPane.YES_OPTION){
            Ingresar();
        }
        if (pregunta == JOptionPane.NO_OPTION){
            Registrar();
        }
    }
    public void Ingresar(){

        JFrame frame= new JFrame();
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
        }

        ArrayList<ArrayList<String>> datosCliente=new ArrayList<>(20);
        datosCliente.get(0).add(0,"Usuario");
        datosCliente.get(0).add(1,"001");
        datosCliente.get(0).add(2,"usuario1@email.com"); //poner el for para comprovar usuarios
    }
    public void Registrar(){

    }
}
