import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<Integer>();

        cola.add(2);
        cola.add(17);
        cola.add(9);

        System.out.println("Los elementos de la cola son: " + cola);
    }
}