class worker{
  private float height=3.5f;
  private String colour="white";

public void setheight(float height){
  this.height=height;
}
public void setcolour(String colour){
  this.colour=colour;
}
  public String getcolour(){
    return colour;
  }
  public float getheight(){
    return height;
  }
  public void display(){
    System.out.println(height);
     System.out.println(colour);
  }
}
public class ste2{
  public static void main(String args[]){
    worker w=new worker();
    w.setheight(4.5f);
    w.setcolour("white");
    
    w.display();
     w.setheight(4.5678f);
    w.setcolour("whiteerwer");
     System.out.println(w.getheight());
     System.out.println(w.getcolour());
  }
}