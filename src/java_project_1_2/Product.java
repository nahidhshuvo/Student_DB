
package java_project_1_2;


public class Product {
    
    private int id;
    private String name;
    private int price;
    private String addDate;
    private byte[] picture;
    
    public Product(int pid, String pname,int pprice, String pAddDate, byte[] pimg)
    { 
        this.id = pid;
        this.name = pname;
        this.price =pprice;
        this.addDate = pAddDate;
        this.picture =pimg;
        
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    { 
        return price;
    }
    public String getAddDate()
    {
        return addDate;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    
}
