package entities;

import enums.MunicipioEnum;

public class Municipio {
    private String nome;
    private int populacao;
    private MunicipioEnum clima;
    private float gastos;

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
     * @return the populacao
     */
    public int getPopulacao() {
        return populacao;
    }

    /**
     * @param populacao the populacao to set
     */
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    /**
     * @return the clima
     */
    public MunicipioEnum getClima() {
        return clima;
    }

    /**
     * @param clima the clima to set
     */
    public void setClima(MunicipioEnum clima) {
        this.clima = clima;
    }

    /**
     * @return the gastos
     */
    public float getGastos() {
        return gastos;
    }

    /**
     * @param gastos the gastos to set
     */
    public void setGastos(float gastos) {
        this.gastos = gastos;
    }
    
    
    
}
