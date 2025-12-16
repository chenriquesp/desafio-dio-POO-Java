package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //Quando cria um conteúdo já possui um valor padrão de 10 de XP e poderá aumentar.
    protected static final double XP_PADRAO = 10;

    //Atributos da Classe Abstrata
    private String titulo;
    private String descricao;

    //deverá ser declarado nas classes filhas.
    public abstract double calcularXp();

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
}
