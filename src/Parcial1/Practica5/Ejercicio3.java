package Parcial1.Practica5;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l;
        System.out.print("Ingrese el tamaño de la lista: ");
        l= sc.nextInt();
        List<Integer> listaDesordenada = generarListaAleatoria(l);
        System.out.println("Lista desordenada: " + listaDesordenada);
        List<Integer> listaOrdenada = ordenarLista(listaDesordenada);
        System.out.println("Lista ordenada: " + listaOrdenada);
    }
    public static List<Integer> generarListaAleatoria(int longitud) {
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int t;
        System.out.println("De 0 a Parametro limite");
        System.out.print("Ingrese el parametro limite: ");
        t= sc.nextInt();
        for (int i = 0; i < longitud; i++) {
            lista.add(random.nextInt(t));
        }
        return lista;
    }
    public static List<Integer> ordenarLista(List<Integer> lista) {
        int longitud = lista.size();
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = 0; j < longitud - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }
}