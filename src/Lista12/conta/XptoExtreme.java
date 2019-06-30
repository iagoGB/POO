package Lista12.conta;

/**
 * XptoExtreme
 */
public class XptoExtreme extends Xpto{

    public XptoExtreme(Integer n, double s) {
        super(n, s);
    }

    @Override
    public void depositar(double v) {
        setSaldo(getSaldo()+((v*0.002)+v));
    }

    @Override
    public void sacar(double v) {
        double op = (v - (v * 0.002));
        setSaldo(getSaldo() - op);
        System.out.println("Você sacou: "+ v +" mas foi debitado apenas "+ op);
    }

    @Override
    public String toString() {
        return "Tipo: "+ getClass().getSimpleName() +": " + super.toString() ; 
    }

    
}