import practico_1.List;
import practico_2.Tree;

public class Main {


    public static void main(String[] args) {
        Tree<Integer> numeros = new Tree<Integer>();
        Tree<String> letras = new Tree<>();
        List<Integer> masNumeros = new List<>();

        masNumeros.insertOrd(7);
        masNumeros.insertOrd(2);
        masNumeros.insertOrd(5);
        masNumeros.insertOrd(6);
        masNumeros.insertOrd(1);

        for(int i:masNumeros)
            System.out.println(i);

       /* numeros.add(1);
        numeros.add(3);
        numeros.add(9);
        numeros.add(4);
        numeros.add(7);
        letras.add("z");
        letras.add("j");
        letras.add("y");
        letras.add("a");


        System.out.println("En pos-orden");
        numeros.printPosOrder();
        letras.printPosOrder();
        System.out.println("En pre-orden");
        numeros.printPreOrder();
        System.out.println("En in-orden");
        numeros.printInOrder();

        */

    }


}
