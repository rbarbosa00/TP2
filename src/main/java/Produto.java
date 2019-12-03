import java.util.Locale;

public class Produto {
    private String name;
    private String description;
    private String picture;
    private Categoria category;
    private double price;
    private char unitytype;

    public Produto(String chocapic, String sabor_a_chocolate, String imagem, Categoria categoria3, int i, String un) {

    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getPicture(){
        return picture;
    }
    public Categoria getCategory(){
        return category;
    }
    public String getCategoryName(){
        return category.getName();
    }
    public String getCategoryColor(){
        return category.getColor();
    }
    public double getPrice(){
        return price;
    }
    public char getUnitytype(){
        return unitytype;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPicture(String Picture){
        this.picture = picture;
    }
    public void setCategory(Categoria category){
        this.category = category;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setUnitytype(char unitytype){
        this.unitytype = unitytype;
    }

}
