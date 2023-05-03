package parcial2.examen2;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        Pedido pd=new Pedido();
        Pago pg=new Pago();
        Cajero cj=new Cajero();
        Usuario us=new Usuario();
        Menu mn=new Menu();
        CuartoPollo cp=new CuartoPollo();
        MedioPollo mp=new MedioPollo();
        QueenMenu qm=new QueenMenu();
        KingMenu km=new KingMenu();
        Extras ex=new Extras();

        System.out.println("Chickens Kingdom");
    }
}
