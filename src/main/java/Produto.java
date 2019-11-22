
public class Produto {
    private String name;
    private String description;
    private String picture;
    private Categoria category;
    private double price;
    private char unitytype;

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
    public void setName(){
        this.name = name;
    }
    public void setDescription(){
        this.description = description;
    }
    public void setPicture(){
        this.picture = picture;
    }
    public void setCategory(){
        this.category = category;
    }
    public void setPrice(){
        this.price = price;
    }
    public void setUnitytype(){
        this.unitytype = unitytype;
    }

}
