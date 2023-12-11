import java.util.List;

public class EnumMain {

    public static void main(String[] args) {
        EstadoDoBrasil estado =  EstadoDoBrasil.MG;

        System.out.println(estado.getDescricao());

        EstadoDoBrasil[] estados = EstadoDoBrasil.values();

        for (int posicao = 0; posicao < estados.length; posicao ++) {
            System.out.println(estados[posicao].getDescricao());
        }


        CidadesDoBrasil cidadesDoBrasil = CidadesDoBrasil.BELO_HORIZONTE;

        System.out.println(cidadesDoBrasil.getEstadoDoBrasil());

        CidadesDoBrasil[] cidades = CidadesDoBrasil.values();


        for (int posicao = 0; posicao < cidades.length; posicao ++) {
            if (cidades[posicao].getEstadoDoBrasil().getCodigo() == EstadoDoBrasil.SP.getCodigo()) {
                System.out.println(cidades[posicao].getNome());
            }
        }

    }
}
