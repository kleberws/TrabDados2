public class ArvoreBinaria {
    private NoBinario raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private NoBinario inserirRec(NoBinario no, int valor) {
        if (no == null) {
            return new NoBinario(valor);
        }
        if (valor < no.valor) {
            no.esquerda = inserirRec(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRec(no.direita, valor);
        }
        return no;
    }

    // Método para imprimir a árvore nível por nível
    public void imprimirPorNivel() {
        int altura = altura(raiz);
        for (int i = 0; i < altura; i++) {
            System.out.print("Nível " + i + ": ");
            imprimirNivel(raiz, i);
            System.out.println();
        }
    }

    private void imprimirNivel(NoBinario no, int nivel) {
        if (no == null) return;
        if (nivel == 0) {
            System.out.print(no.valor + " ");
        } else {
            imprimirNivel(no.esquerda, nivel - 1);
            imprimirNivel(no.direita, nivel - 1);
        }
    }

    // Método para calcular a altura da árvore
    private int altura(NoBinario no) {
        if (no == null) return 0;
        int altEsq = altura(no.esquerda);
        int altDir = altura(no.direita);
        return Math.max(altEsq, altDir) + 1;
    }

    public boolean estaDesbalanceada() {
        return Math.abs(altura(raiz.esquerda) - altura(raiz.direita)) > 1;
    }
}