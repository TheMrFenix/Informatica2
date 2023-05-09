package parcial2.examen2;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String res;
//
        do {
            System.out.println("*|  Chickens Kingdom  |*");
            System.out.println("1/- Ingreso para Usuarios  ");
            System.out.println("2/- Ingreso para Trabajadores   ");
            System.out.print("Elija una opcion: ");
            int op= sc.nextInt();
            switch (op){
                case 1:
                    User();
                    break;
                case 2:
                    Worker();
                    break;
                default:
            }
            System.out.print("Desea volver a ingresar? (si/no):");
            res=sc.next();
        } while (res.equals("si"));
    }
    static void User() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        Usuario us = new Usuario();
        Pedido pd = new Pedido();
        Menu mn = new Menu();
        Pago pg=new Pago();
        CuartoPollo cp=new CuartoPollo();
        MedioPollo mp=new MedioPollo();
        QueenMenu qm=new QueenMenu();
        KingMenu km=new KingMenu();
        Extras ex=new Extras();
        Efectivo ef=new Efectivo();
        Tarjeta tj=new Tarjeta();
        System.out.print("A ingresado al menu de usuario, desea continuar? (si/no)");
        String op = sc.next();
        if (op.equals("si")) {
            for (int i1 = 0; i1 < 5; i1++) {
                System.out.println("*| Menu para Usuarios |*");
                int ID = rnd.nextInt(100);
                System.out.println("Codigo de ID [" + ID + "]");
                System.out.print("Por favor ingrese su codigo ID:");
                int a = sc.nextInt();
                if (a == ID) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        pd.setId(a);
                        System.out.println();
                        System.out.print("Ingrese su Nombre: ");
                        String b = sc.next();
                        us.setNombre(b);
                        System.out.print("Ingrese su Carnet de Identidad: ");
                        int c = sc.nextInt();
                        us.setCi(c);
                        System.out.print("Ingrese su Numero de Telefono/Celular: ");
                        int d = sc.nextInt();
                        us.setTelefono(d);
                        System.out.print("Ingrese su Direccion: ");
                        String e = sc.next();
                        us.setDireccion(e);
                        System.out.println();
                        System.out.println("Estos son los datos que Ingresaste");
                        System.out.println(us.toString());
                        System.out.println(mn.toString());
                        System.out.println();
                        System.out.print("Los datos son Correctos? (si/no): ");
                        String f = sc.next();
                        if (f.equals("si")) {
                            for (int i3 = 0; i3 < 50; i3++) {
                                System.out.println("*| la Carta del Dia |*");
                                System.out.println("1- Cuarto de Pollo  ");
                                System.out.println("2- Medio Pollo  ");
                                System.out.println("3- Queen Menu  ");
                                System.out.println("4- King Menu  ");
                                System.out.println("5- Extras  ");
                                System.out.println("6- Confirmar pedido");
                                System.out.print("Elija la opcion que desea saber: ");
                                int g = sc.nextInt();
                                if (g == 1) {
                                    System.out.println("*| el Cuarto de Pollo contiene |*");
                                    System.out.println("*- 1 Porcion de papa");
                                    System.out.println("*- 2 Presas");
                                    System.out.println("*- 1 Salsa");
                                    System.out.println("*- 1 llajua");
                                    System.out.print("Desea padir un Cuarto de Pollo? (si/no): ");
                                    String h=sc.next();
                                    if (h.equals("si")){
                                        System.out.print("Cuantos cuarto de pollo desea pedir?:");
                                        int h1=sc.nextInt();
                                        cp.setCantidadDelPedido(h1);
                                    } else {
                                        System.out.println("Presione [Enter] para regresar");
                                    }
                                } else {
                                    System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                }
                                if (g == 2) {
                                    System.out.println("*| Medio pollo contiene |*");
                                    System.out.println("*- 1 Porcion de papa");
                                    System.out.println("*- 4 Presas");
                                    System.out.println("*- 1 Salsa");
                                    System.out.println("*- 1 Llajua");
                                    System.out.print("Desea pedir un Medio Pollo? (si/no): ");
                                    String h=sc.next();
                                    if (h.equals("si")){
                                        System.out.print("Cuantos medio pollo desea pedir?: ");
                                        int h2= sc.nextInt();
                                        mp.setCantidadDelPedido(h2);
                                    } else {
                                        System.out.println("Presione [Enter] para regresar");
                                    }
                                } else {
                                    System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                }
                                if (g == 3) {
                                    System.out.println("*| El Queen Menu contiene |*");
                                    System.out.println("*- 1 Porcion de papa");
                                    System.out.println("*- 1 Vaso de Gaseosa");
                                    System.out.println("*- 2 Presas");
                                    System.out.println("*- 1 Salsa");
                                    System.out.println("*- 1 Llajua");
                                    System.out.print("Desea pedir un Queen Menu? (si/no): ");
                                    String h=sc.next();
                                    if (h.equals("si")){
                                        System.out.print("Cuantos queen menu desea pedir?: ");
                                        int h3= sc.nextInt();
                                        qm.setCantidadDelPedido(h3);
                                    } else {
                                        System.out.println("Presione [Enter] para regresar");
                                    }
                                } else {
                                    System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                }
                                if (g == 4) {
                                    System.out.println("*| El King Menu contiene |*");
                                    System.out.println("*- 1 Porcion de papa");
                                    System.out.println("*- 1 Vaso de gaseosa");
                                    System.out.println("*- 4 Presas");
                                    System.out.println("*- 1 Salsa");
                                    System.out.println("*- 1 Llajua");
                                    System.out.print("Desea pedir un King Menu? (si/no): ");
                                    String h=sc.next();
                                    if (h.equals("si")){
                                        System.out.println("Cuantos king menu desea pedir?: ");
                                        int h4=sc.nextInt();
                                        km.setCantidadDelPedido(h4);
                                    } else {
                                        System.out.println("Presione [Enter] para regresar");
                                    }
                                } else {
                                    System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                }
                                if (g == 5) {
                                    System.out.println("*| Los Extras son |*");
                                    System.out.println("*- 1 Porcion de papa");
                                    System.out.println("*- 1 Porcion de arroz");
                                    System.out.println("*- 1 Porcion de arroz con poroto");
                                    System.out.println("Desea pedir algun Extra? (si/no): ");
                                    String h=sc.next();
                                    if (h.equals("si")){
                                        System.out.println("Cuantos Extras decea pedir?: ");
                                        int h5=sc.nextInt();
                                        ex.setCantidadDelPedido(h5);
                                    } else {
                                        System.out.println("Presione [Enter] para regresar");
                                    }
                                } else {
                                    System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                }
                                if (g == 6) {
                                    for (int i4 = 0; i4 < 5; i4++) {
                                        System.out.println("Esto es lo que usted pidio: ");
                                        System.out.println(mn.toString());
                                        System.out.println();
                                        System.out.print("Desea confirmar el pedido? (si/no): ");
                                        String j=sc.next();
                                        if (j.equals("si")) {
                                            System.out.println("*| Formatos de pago |*");
                                            System.out.println("1- Efectivo");
                                            System.out.println("2- Tarjeta");
                                            System.out.print("Elija como desea pagar: ");
                                            int j1=sc.nextInt();
                                            if (j1 == 1) {
                                                for (int i5 = 0; i5 < 5; i5++) {
                                                    System.out.println(ef.toString());
                                                    System.out.println("por favor confirme si ID: ");
                                                    int k1=sc.nextInt();
                                                    if (k1 == ID) {
                                                        System.out.println("Su pedido a sido confirmado");
                                                        System.out.println("Su pedido estara en unos Minutos");
                                                        System.out.println("Gracias por comer con nosotros");
                                                    } else {
                                                        System.out.println("Vuelva a intentar");
                                                    }
                                                }
                                            } else if (j1 == 2) {
                                                for (int i5 = 0; i5 < 5; i5++) {
                                                    System.out.println("*| Pago por tarjeta |*");
                                                    System.out.print("Ingrese el numero de su tarjeta: ");
                                                    int k2=sc.nextInt();
                                                    tj.setNumero(k2);
                                                    System.out.print("Ingrese el CVV de su tarjeta: ");
                                                    int k3=sc.nextInt();
                                                    tj.setCvv(k3);
                                                    System.out.print("Ingrese la Fecha de du tarjeta: ");
                                                    int k4=sc.nextInt();
                                                    tj.setFecha(k4);
                                                    System.out.println();
                                                    System.out.println("Estos son los datos que Ingresaste");
                                                    System.out.println(tj.toString());
                                                    System.out.println();
                                                    System.out.print("Los datos son correctos? (si/no): ");
                                                    String l=sc.next();
                                                    if (l.equals("si")) {
                                                        System.out.println(pg.toString());
                                                        System.out.println("por favor confirme si ID: ");
                                                        int l1=sc.nextInt();
                                                        if (l1 == ID) {
                                                            System.out.println("Su pedido a sido confirmado");
                                                            System.out.println("Su pedido estara en unos Minutos");
                                                            System.out.println("Gracias por comer con nosotros");
                                                        } else {
                                                            System.out.println("Vuelva a intentar");
                                                        }
                                                    } else if (l.equals("no")) {
                                                        System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                                    } else {
                                                        System.out.println("INCORRECTO, VUELVA A INTENTARLO");
                                                    }
                                                }
                                            } else {
                                                System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                            }
                                        } else {
                                            System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                        }
                                    }
                                } else {
                                    System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                                }
                            }
                        } else if (f.equals("no")) {
                            System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                        } else {
                            System.out.println("INCORRECTO, VUELVA A INTENTARLO");
                        }
                    }
                } else {
                    System.out.println("Vuelva a intentar");
                }
            }
        } else if (op.equals("no")) {
            System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
        } else {
            System.out.println("INCORRECTO, VUELVA A INTENTARLO");
        }
    }
    static void Worker(){
        Random rnd=new Random();
        Scanner sc=new Scanner(System.in);
        Cajero cj=new Cajero();
//
        System.out.print("A ingresado al menu de trabajadores, desea continuar? (si/no): ");
        String a1=sc.next();
        if (a1.equals("si")){
            for (int i1=0; i1<5;i1++) {
                System.out.println("*| Menu para Trabajadores |*");
                int ID = rnd.nextInt(100);
                System.out.println("Codigo de ID [" + ID + "]");
                System.out.print("Por favor ingrese su codigo ID: ");
                int a = sc.nextInt();
                cj.setId(a);
                if (a == ID) {
                    System.out.print("Ingrese su nombre: ");
                    String b=sc.next();
                    cj.setNombre(b);
                    System.out.print("Ingrese su Email: ");
                    String c=sc.next();
                    cj.setEmail(c);
                    System.out.print("Ingrese su licencia de Conducir: ");
                    int d=sc.nextInt();
                    cj.setCarnetDeConducir(d);
                    System.out.print("Ingrese su Contraseña: ");
                    String e=sc.next();
                    cj.setContraseña(e);
                    System.out.println();
                    System.out.println("Estos son los datos que Ingreso");
                    System.out.println(cj.toString());
                    System.out.println();
                    System.out.print("Los datos son correctos (si/no): ");
                    String f=sc.next();
                    if (f.equals("si")){
                        System.out.println("Has ingresado");
                    } else if (f.equals("no")) {
                        System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
                    } else {
                        System.out.println("INCORRECTO, VUELVA A INTENTARLO");
                    }
                } else {
                    System.out.println("Vuelva a intentar");
                }
            }
        } else if (a1.equals("no")) {
            System.out.println("Volviendo a la seleccion anterior, presione [Enter]");
        } else {
            System.out.println("INCORRECTO, VUELVA A INTENTARLO");
        }
    }
}