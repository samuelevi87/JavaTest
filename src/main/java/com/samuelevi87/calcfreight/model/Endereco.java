package com.samuelevi87.calcfreight.model;

import java.io.Serial;
import java.io.Serializable;

public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String ddd;
    private String ibge;
    private String gia;
    private String siafi;

    public Endereco() {
    }

    public Endereco(Long id, String cep, String logradouro, String complemento, String bairro, String cidade, String uf, String ddd, String ibge, String gia, String siafi) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.ddd = ddd;
        this.ibge = ibge;
        this.gia = gia;
        this.siafi = siafi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        return id.equals(endereco.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
