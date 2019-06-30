package br.com.poo.smd.lista12.conta;

public class XptoPlus  extends Xpto{

    public XptoPlus(Integer n, double s) {
        super(n, s);
       
    }

    @Override
    public void depositar(double v) {
        setSaldo(getSaldo()+((v*0.005)+v));
    }

    @Override
    public void sacar(double v) {
        setSaldo(getSaldo()-v);
    }
    @Override
    public String toString() {
        return "Tipo: "+ getClass().getSimpleName() +super.toString() ; 
    }

    
}