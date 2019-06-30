package Lista12.conta;


public class XptoBasic extends Xpto{

    public XptoBasic(Integer n, double s) {
        super(n, s);
       
    }

    @Override
    public void depositar(double v) {
        setSaldo(getSaldo()+v);
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