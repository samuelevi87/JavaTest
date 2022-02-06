package com.samuelevi87.calcfreight.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Frete implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String cepOrigem;
    private String cepDestino;
    private String nomeDestinatario;
    private Double peso;
    private BigDecimal vlTotalFrete;
    private LocalDate dataPrevistaEntrega;
    private LocalDate dataConsulta;

    public Frete() {
    }

    public Frete(Long id, String cepOrigem, String cepDestino, String nomeDestinatario, Double peso, BigDecimal vlTotalFrete, LocalDate dataPrevistaEntrega, LocalDate dataConsulta) {
        this.id = id;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.nomeDestinatario = nomeDestinatario;
        this.peso = peso;
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.dataConsulta = dataConsulta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public BigDecimal getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(BigDecimal vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public LocalDate getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Frete frete = (Frete) o;

        return id.equals(frete.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Frete {" +
                "id:" + id +
                ", cepOrigem:'" + cepOrigem + '\'' +
                ", cepDestino:'" + cepDestino + '\'' +
                ", nomeDestinatario:'" + nomeDestinatario + '\'' +
                ", peso:" + peso +
                ", vlTotalFrete:" + vlTotalFrete +
                ", dataPrevistaEntrega:" + dataPrevistaEntrega +
                ", dataConsulta:" + dataConsulta +
                '}';
    }
}

