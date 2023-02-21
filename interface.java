class a{
float sno;
  String sname;
  float sub1;
  float sub2;
  float sub3;
  float total;
  float avg;  
}
interface b{
  report(){
    float total=sub1+sub2+sub3;
    float avg=(total)/3;
    
    if(avg>60){
      System.out.println("grade c");
    }
    else if(avg>80){
      System.out.println("grade b");
    }
    else if(avg>90){
      System.out.println("grade a");
    }   
    else{
      System.out.println("grade fail");
    }
  }
}
class c extends A implements b{
  report(){
     String sname="pavan";
    float sno=143;
  float sub1=67;
  float sub2=56;
  float sub3=78;
    System.out.println(sname);
     System.out.println(sno);
     System.out.println(sub1);
     System.out.println(sub3);
     System.out.println(sub2);
    System.out.println(total);
    System.out.println(avg);
  }
}
class interface1{
  
}