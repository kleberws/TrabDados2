public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(40);
        arvore.inserir(30);
        arvore.inserir(60);
        arvore.inserir(20);
        arvore.inserir(35);
        arvore.inserir(50);
        arvore.inserir(70);

        arvore.imprimirPorNivel();

        if (arvore.estaDesbalanceada()) {
            System.out.println("A árvore está desbalanceada.");
        } else {
            System.out.println("A árvore está balanceada.");
        }
    }
}

