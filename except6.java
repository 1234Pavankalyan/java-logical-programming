class except6 extends Exception{
  float sub1;
  float sub2;
  float sub3;
  except6(float sub1,float sub2,float sub3)
  {
    this.sub1=sub1;
    this.sub2=sub2;
    this.sub3=sub3;
  }
  public String toString()
  {
    return "error failed lower score";
   
     
  }
}
public class NewThrow{
  static void test(int no)throws extend6{
    if((sub1<40)&&(sub2<40)&&(sub3<40)){
     throw new except6(sub1,sub2,sub3); 
    }
    System.out.println("value is "+sub1+" "+sub2+" "+sub3+" you passed ");
  }
  public static void main(String args[]){
    try
    {
      test(89,40,60);
    }
    catch(expect6 ae)
{
     System.out.println("expect6 :"+ae);
 }
  }
}

