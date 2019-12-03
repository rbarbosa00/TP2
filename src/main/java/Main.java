import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Main {

    public static void main(String args[]) {
        Categoria categoria1 = new Categoria("Carne", "Bovina", "Vermelho");
        Categoria categoria2 = new Categoria("Frutas", "Maduras", "Verde");
        Categoria categoria3 = new Categoria("Cereais","Doces","Castanho");

        Produto produto1 = new Produto("Amora", "vermelhas", "Imagem", categoria2,1, "kg");
        Produto produto2 = new Produto("Peito","Bovina","Imagem",categoria1,10,"kg");
        Produto produto3 = new Produto("Cereja","maduras","Imagem",categoria2,5,"kg");
        Produto produto4 = new Produto("Chocapic","Sabor a chocolate","imagem",categoria3,23,"un");
        Produto produto5 = new Produto("Nesquik","Sabor a chocolate","Imagem",categoria3,58,"un");
        Produto produto6 = new Produto("Costela","Bovina","Imagem",categoria1,6,"kg");
        Produto produto7 = new Produto("Kiwi","Maduro","Imagem",categoria2,8,"kg");

        Address address1 = new Address("Rua de Sobrado","10","4700-565");
        Address address2 = new Address("Rua da Marginal","20","4700-713");

        User user1 = new User("Joaquim Alberto","joaquimalberto@gmail.com","joaquim253","joaquim1970",address1);
        User user2 = new User("Maria Joana","mariajoana@gmail.com","mariajoana00","w33d",address2);

        ListaCompras lista1= new ListaCompras("Lista 1",user1,user2);
        ListaCompras lista2= new ListaCompras("Lista 2",user1,user2);

        List<Produto> newProductList = new ArrayList<>();
        newProductList.add(produto1);
        newProductList.add(produto2);
        newProductList.add(produto3);
        newProductList.add(produto4);
        newProductList.add(produto5);
        newProductList.add(produto6);
        newProductList.add(produto7);
        lista1.setProductlist1(newProductList);

        List<Produto> newProductList2 = new ArrayList<>();
        newProductList.add(produto1);
        newProductList.add(produto2);
        lista1.setProductlist2(newProductList2);

        System.out.println(lista1.getUserName()+"\n"+ lista2.getTotalOfProductsOnShoppingCart()+"\n"+ lista1.getTotalOfProducts());
    }
}


