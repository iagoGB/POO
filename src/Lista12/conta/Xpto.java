package Lista12.conta;


public abstract class Xpto {
    //Atributos
    private int numeroConta;
    private double saldo;
    //Construtor
    public Xpto(Integer n,  double s){
        setNumeroConta(n);
        setSaldo(s);
    }
    //Métodos
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public abstract void depositar(double v);
    public abstract void sacar(double v);
    @Override
    public  String toString() {
        return "[Numero Conta:"+ getNumeroConta() + ", Saldo:" + getSaldo() + "]";
    }

}
