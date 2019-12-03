import java.util.List;

public class ListaCompras {

    public void setProductlist1(List<Produto> Productlist1) {
        Productlist1 = Productlist1;
    }

    public void setProductlist2(List<Produto> Productlist2) {
        Productlist2 = Productlist2;
    }
    private String name;
    private User user;
    private List<User>userlist;
    private List<Produto>produtolist1;
    private List<Produto>produtolist2;
    private Produto p;
    int i;
    int total;


    public String getListName(){
        return name;
    }
    public  String getUserName(){
        return user.getName();
    }
    public double getPercentageCompleted(){
        return (produtolist2.size() / (produtolist2.size()+ produtolist1.size())) *100;
    }
    public int getTotalOfProducts(){
        return produtolist1.size();
    }
    public int getTotalOfProductsOnShoppingCart(){
        return produtolist2.size();
    }
    public double getTotalPrice() {
        for (i = 0; i <= produtolist2.size() + produtolist1.size(); i++) {
            total += p.getPrice();
        }
        return total;
    }
    public double getTotalPriceOnCart(){
        for (i= 0 ; i<= produtolist2.size() ; i++){
            total += p.getPrice();
        }
        return total;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setUser(User user){
        this.user = user;
    }
    public boolean AddProduct(Produto p ){
        return this.produtolist1.add(p);

    }
    public boolean removeProduct(Produto p){
        if(this.produtolist1.contains(p)){
            return this.produtolist1.remove(p);
        }
        return false;
    }
     public boolean addProductShoppingCart(Produto p){
        if(this.produtolist1.contains(p)){
            this.removeProduct(p);
            this.produtolist2.add(p);
            return true;
        }
        return false;
     }
     public boolean removeProductShoopingCart(Produto p){
        if(this.produtolist2.contains(p)){
            this.produtolist2.remove(p);
            this.AddProduct(p);
            return true;
        }
        return false;
     }



}
