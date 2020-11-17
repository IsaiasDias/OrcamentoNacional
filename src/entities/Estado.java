package entities;

public class Estado {
    private String nome;
    private String sigla;
    private boolean distritoFederal;
    private float orcamentoTotal;
    private float gastosTotais;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the distritoFederal
     */
    public boolean isDistritoFederal() {
        return distritoFederal;
    }

    /**
     * @param distritoFederal the distritoFederal to set
     */
    public void setDistritoFederal(boolean distritoFederal) {
        this.distritoFederal = distritoFederal;
    }

    /**
     * @return the orcamentoTotal
     */
    public float getOrcamentoTotal() {
        return orcamentoTotal;
    }

    /**
     * @param orcamentoTotal the orcamentoTotal to set
     */
    public void setOrcamentoTotal(float orcamentoTotal) {
        this.orcamentoTotal = orcamentoTotal;
    }

    /**
     * @return the gastosTotais
     */
    public float getGastosTotais() {
        return gastosTotais;
    }

    /**
     * @param gastosTotais the gastosTotais to set
     */
    public void setGastosTotais(float gastosTotais) {
        this.gastosTotais = gastosTotais;
    }
    
    
}
