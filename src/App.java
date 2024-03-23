import java.util.Scanner;
/* Faça um programa que cadastre uma quantidade indeterminada de produtos, ao final mostre:
a) a quantidade de produtos cadastrados (contador de produtos)
b) o total de estoque existente após os cadastros
c) quantidade de produtos da categoria ALIMENTOS (contador)
d) os nomes (descrição) dos produtos de PAPELARIA cadastrados */
public class App {
    public static void main(String[] args) throws Exception {
        Produto obj1 = new Produto();
        //Produto obj2 = new Produto();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o código:");
        obj1.codigoBarras = ler.nextLong();
        System.out.println("Digite a descrição:");
        obj1.descricao = ler.next();
        System.out.println("Digite a unidade:");
        obj1.unidade = ler.next();
        System.out.println("Digite a quantidade em estoque:");
        obj1.estoque = ler.nextDouble();
        System.out.println("Digite a categoria:");
        obj1.categoria = ler.next();
        obj1.mostrar();
    }
}

