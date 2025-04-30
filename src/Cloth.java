public class Cloth {
    public String logo="";
    public String color="";
    public String size="";

    //方法一
    public Cloth(String logo,String color,String size){
        this.logo=logo;
        this.color=color;
        this.size=size;
    }
    public void ShowInfo() {
        System.out.println("logo:"+this.logo+" color:"+this.color+" size:"+this.size);
        
    }
}
