public class Produto {
    long codigoBarras;
    String descricao;
    String unidade;
    double estoque;
    String categoria;
    public void mostrar(){
        System.out.println("\n--- Produto ---\nCódigo:"+codigoBarras +
        " - " + descricao + "\nEstoque: " + estoque);
    }
}
