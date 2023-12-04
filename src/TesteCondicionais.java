public class TesteCondicionais {


    public static void main(String[] args) {
        // + - * / %

        // = esse vc atribui valor

        // == isso aqui == a isso aqui
        // >=
        // <=
        // !true = false !false = true
        // !=

        int soma = 10 + 8;

        if (soma == 12) {
            System.out.println("soma é igual 12");
        }

        if (soma >= 12) {
            System.out.println("soma é maior igual 12");
        }

        if (soma <= 12) {
            System.out.println("soma é menor igual 12");
        }

        if (soma != 12) {
            System.out.println("soma é diferente 12");
        }


        switch (soma) {
            case 12:
                System.out.println("case resultado case da soma é 12");
                break;
            case 8:
                System.out.println("case resultado da soma é 8");
                break;
            case 18:
                System.out.println("case resultado da soma é 18");
                break;
            default:
                System.out.println("resultado da soma não é nenhum dos demais cases");
                break;

        }

        String msg = soma >= 12 ? "Soma é maior igual a 12" : "Soma é menor que 12";

        System.out.println(msg);

    }





}
