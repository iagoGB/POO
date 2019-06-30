package Lista12.sistema;

import java.util.ArrayList;
import java.util.List;

import Lista12.conta.Xpto;
import Lista12.conta.XptoBasic;
import Lista12.conta.XptoExtreme;
import Lista12.conta.XptoPlus;

public class Controlador {
    private List<Xpto> listaXpto;;
    
    public Controlador() {
        setListaXpto(new ArrayList<Xpto>());
    }

    public List<Xpto> getListaXpto() {
        return listaXpto;
    }
    public void setListaXpto(List<Xpto> listaXpto) {
        this.listaXpto = listaXpto;
    }
    //Adicionar e remover Xptos na lista
    public void add(Xpto x){
        getListaXpto().add(x);
    }
    public void remove(Xpto x){
        getListaXpto().remove(x);
    }
    //Depositar e Sacar
    public void depositar (int id, double v)  {
        for (Xpto o : getListaXpto()){
            if (o.getNumeroConta() == id){
                o.depositar(v);
                return;
            }
        } 
        throw new RuntimeException("Conta informada não existe");

    }

    public void sacar (int id, double v)  {
        for (Xpto o : getListaXpto()){
            if (o.getNumeroConta() == id){
                o.sacar(v);
                return;
            }
        } 
        throw new RuntimeException("Conta informada não existe");

    }

    public void consultar(int id)  {
        for (Xpto o : getListaXpto()){
            if (o.getNumeroConta() == id){
                System.out.println(o.toString());
                return;
            }
        } 
        throw new RuntimeException("Conta informada n�o existe");
    }
    
    public void criarContaBasic(int id) {
    	add(new XptoBasic(id, 0));
    }
    public void criarContaPlus(int id) {
    	add(new XptoPlus(id, 0));
    }
    public void criarContaExtreme(int id) {
    	add(new XptoExtreme(id, 0));
    }
    
}