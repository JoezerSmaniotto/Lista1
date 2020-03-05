package br.edu.ifsul.model;

public class Conta {
    // Atributo
    private double saldo;

    // Construtor
    public Conta(){

    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    // Metodos


    public double getSaldo() {
        return saldo;
    }


    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if( (this.saldo - valor) <  0 ){
            System.out.println("Saldo Insuficiente !!");
        }else {
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa){

        this.saldo+= this.saldo * (taxa / 100);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
