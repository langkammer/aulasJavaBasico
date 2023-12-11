public enum EstadoDoBrasil {

    SP("SP", "São Paulo"),
    MG("MG", "Minas Gerais"),
    BA("BA", "Bahia"),
    RS("RS", "Rio Grande do Sul"),
    PA("PA", "Pará"),
    PR("PR", "Paraná"),
    GO("GO", "Goias"),
    RJ("RJ", "Rio de Janeiro");

    private String descricao;
    private String codigo;

    EstadoDoBrasil(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
