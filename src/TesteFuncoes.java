
public class TesteFuncoes {

    public static void main(String[] args) {

        TesteSomaNaoStatic testeSomaNaoStatic = new TesteSomaNaoStatic();

        int resultadoSomaStatic = TesteSomaStatic.somaValores(10, 10);
        int resultadoSomaNaoStatic = testeSomaNaoStatic.somaValores(10, 10);

        System.out.println(resultadoSomaStatic);
        System.out.println(resultadoSomaNaoStatic);


    }






}
