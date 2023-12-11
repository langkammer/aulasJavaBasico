public enum CidadesDoBrasil {
    BELO_HORIZONTE("Belo Horizonte", EstadoDoBrasil.MG),
    SAO_PAULO("São Paulo", EstadoDoBrasil.SP);

    private String nome;
    private EstadoDoBrasil estadoDoBrasil;


    CidadesDoBrasil(String nome, EstadoDoBrasil estadoDoBrasil) {
        this.nome = nome;
        this.estadoDoBrasil = estadoDoBrasil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoDoBrasil getEstadoDoBrasil() {
        return estadoDoBrasil;
    }

    public void setEstadoDoBrasil(EstadoDoBrasil estadoDoBrasil) {
        this.estadoDoBrasil = estadoDoBrasil;
    }
}
