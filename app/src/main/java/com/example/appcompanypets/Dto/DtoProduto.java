package com.example.appcompanypets.Dto;

public class DtoProduto
{
    private int cd_Produto;
    private int cd_Categoria;
    private String nm_Produto;
    private double vl_Produto;
    private String ds_Produto;
    private int qt_Estoque;
    private String ds_Status;

    public String getDs_Status() {
        return ds_Status;
    }

    public void setDs_Status(String ds_Status) {
        this.ds_Status = ds_Status;
    }

    public int getCd_Produto() {
        return cd_Produto;
    }

    public void setCd_Produto(int cd_Produto) {
        this.cd_Produto = cd_Produto;
    }

    public int getCd_Categoria() {
        return cd_Categoria;
    }

    public void setCd_Categoria(int cd_Categoria) {
        this.cd_Categoria = cd_Categoria;
    }

    public String getNm_Produto() {
        return nm_Produto;
    }

    public void setNm_Produto(String nm_Produto) {
        this.nm_Produto = nm_Produto;
    }

    public double getVl_Produto() {
        return vl_Produto;
    }

    public void setVl_Produto(double vl_Produto) {
        this.vl_Produto = vl_Produto;
    }

    public String getDs_Produto() {
        return ds_Produto;
    }

    public void setDs_Produto(String ds_Produto) {
        this.ds_Produto = ds_Produto;
    }

    public int getQt_Estoque() {
        return qt_Estoque;
    }

    public void setQt_Estoque(int qt_Estoque) {
        this.qt_Estoque = qt_Estoque;
    }
}
