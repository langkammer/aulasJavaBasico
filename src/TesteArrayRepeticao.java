import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TesteArrayRepeticao {

    public static void main(String[] args) {
        String [] arrayDePessoas = {"Pedro", "Jose", "Matheus", "Judas", "Paulo", "Thiago"};

        int [] idade = {34, 30, 25, 30, 40, 27};

        boolean [] traidor = {false, false, false, true, false, false};

        Set<String> setString = new HashSet<>();

        setString.add("Pedro");
        setString.add("Pedro");


        for (int posicao = 0; posicao < arrayDePessoas.length; posicao++) {
            System.out.println("posicao for " + posicao);
            System.out.println("for " + arrayDePessoas[posicao]);
        }

        int posicao = 0;

        while (posicao < arrayDePessoas.length) {
            System.out.println("while posicao " + posicao);
            System.out.println("while " + arrayDePessoas[posicao]);
            posicao++;
        }

    }
}
