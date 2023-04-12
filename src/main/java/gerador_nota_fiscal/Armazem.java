package gerador_nota_fiscal;

import java.util.Stack;

public class Armazem<E> {

    private Stack<E> historico;

    public Armazem() {
        this.historico = new Stack<>();
    }

    protected void adicionaNoHistorico(E entidade) {
        this.historico.push(entidade);
    }

    public E getUltimoAdicionado() {
        return this.historico.peek();
    }

}
