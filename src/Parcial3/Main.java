package Parcial3;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        Icon opcion=new ImageIcon("yourFile.gif");
        Object opcionArray[]={"Cliente","Empledo"};
        int pregunta = JOptionPane.showOptionDialog(frame,"<html> ╔ Bienvenito Akhros International <br> ║ Area para clientes <br> ║ Area para Empleados <br> ╚ Elija una opcion","Seleccion Principal",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,opcion,opcionArray,opcionArray[1]);
        if (pregunta == JOptionPane.YES_OPTION){
            Cliente cliente=new Cliente();
            cliente.MenuCliente();
        }
        if (pregunta == JOptionPane.NO_OPTION){
            Empleado empleado=new Empleado();
            empleado.MenuEmpleados();
        }
    }
}
