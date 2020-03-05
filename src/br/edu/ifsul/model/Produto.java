package br.edu.ifsul.model;

//public class Produto implements Comparable<Produto> {
public class Produto  {
    /* Atributos*/
    private int  id;
    private String nome;
    private String descricao;
    private Double valor;
    private int estoque;

    // Construtor

    public Produto (){

    }

    public Produto(String nome, String descricao, double valor, int estoque, int id) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.id = id;
    }

    // Metodos


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    /*@Override public int compareTo(Produto outroProduto) {
        if (this.id > outroProduto.getId()) {
            return -1;
        } if (this.id < outroProduto.getId()) {
            return 1;
        }
        return 0;
    }*/



    @Override
    public String toString() {
        return "\nProduto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
