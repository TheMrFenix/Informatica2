package parcial2.POO3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Laptop pc=new Laptop("","","","",0,0);
        System.out.println("Laptop Gecks");
        System.out.print("Ingrese el nombre de el pc: ");
        String n= sc.next();
        pc.setNombre(n);
        System.out.print("Ingrese la marca de el pc: ");
        String ma= sc.next();
        pc.setMarca(ma);
        System.out.print("Ingrese el modelo de le pc: ");
        String mo= sc.next();
        pc.setModelo(mo);
        System.out.print("Ingrese la serie de el pc: ");
        String s= sc.next();
        pc.setSerie(s);
        System.out.print("Ingrese el precio de el pc: ");
        float p= sc.nextFloat();
        pc.setPrecio(p);
        System.out.print("Ingrese la cantidad de el pc: ");
        int c= sc.nextInt();
        pc.setCantidad(c);
        System.out.println("Estos son los datos que ingresaste");
        System.out.println(pc.toString());
        int op;
        do {
            System.out.println("menu de opciones");
            System.out.println("1- Actualizar cantidad");
            System.out.println("2- Cambiar precio");
            System.out.println("3- Venta de laptops");
            System.out.println("0- Salir");
            System.out.print("Opcion >");
             op= sc.nextInt();
            switch (op){
                case 1:
                    ActualizarCantidad(pc);
                    break;
                case 2:
                    CambiarPrecio(pc);
                    break;
                case 3:
                    VentaLaptop(pc);
                    break;
            }
        } while (op!=0);
    }
    public static void ActualizarCantidad(Laptop pc){
        Scanner sc=new Scanner(System.in);
        System.out.println("Actualizar la Cantidad de laptops");
        System.out.println("Esta es la cantidad de laptops ");
        System.out.print(pc.getCantidad());
        System.out.println();
        System.out.print("Ingrese la nueva cantidad: ");
        int c1= sc.nextInt();
        pc.setCantidad(c1);
        System.out.println("Este es el nuevo valor");
        pc.getCantidad();
    }
    public static void CambiarPrecio(Laptop pc){
        Scanner sc=new Scanner(System.in);
        System.out.println("Cambiar el precio de Laptops");
        System.out.println("Este es el precio ");
        System.out.println(pc.getPrecio());
        System.out.println();
        System.out.print("Ingrese el nuevo precio: ");
        float p1= sc.nextFloat();
        pc.setPrecio(p1);
        System.out.println("Este es el nuevo precio");
        pc.getPrecio();
    }
    public static void VentaLaptop(Laptop pc){
        Scanner sc=new Scanner(System.in);
        System.out.println("Venta de laptops");
        System.out.print("Ingrese la cantidad que decea comprar: ");
        int c2= sc.nextInt();
        float p2=pc.getPrecio();
        float v=p2*c2;
        System.out.println("Este es el valor de las ventas "+v+" Bs");
    }
}