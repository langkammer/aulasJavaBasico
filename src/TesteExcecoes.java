public class TesteExcecoes {

    public static void main(String[] args) {
        TesteExcecoes testeExcecoes = new TesteExcecoes();

        testeExcecoes.geraRelatorio();
    }


    public void geraRelatorio() {
        String email = null;
        String msg = "teste";

        try {
            enviarEmail(email, msg);
        } catch (ExcpetionEnviaEmail e) {
            throw new RuntimeException(e);
        }
    }


    private void enviarEmail(String email, String msg) throws ExcpetionEnviaEmail {
        if (email == null) {
            throw new ExcpetionEnviaEmail("Email é Obrigatorio o preenchimento!");
        }
        if (msg == null) {
            throw new ExcpetionEnviaEmail("Mensagem é obrigatoria o preenhcimento!");
        }

        System.out.println("Email Enviado!!");
    }

}
