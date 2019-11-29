public class Address {
    private String streetname;
    private int doornol;
    private int postalcode;

    public String getStreetname(){
        return  streetname;
    }
    public int getDoornol(){
        return  doornol;
    }
    public int getPostalcode(){
        return postalcode;
    }

    public void setStreetname(String streetname){
        this.streetname = streetname;
    }
    public void setDoornol(int doornol){
        this.doornol = doornol;
    }
    public void setPostalcode(int postalcode){
        this.postalcode = postalcode;
    }

}
