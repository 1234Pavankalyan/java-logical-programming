class string4{
  public static void main(String args[]){
    String st1="pavankalyan";
     String st2="PAVANKALYAN";
 System.out.println(   st1.equals(st2));
   
      if(st1.equalsIgnoreCase(st2)){
          System.out.println("both are equals");
    }
    else{
     System.out.println("both are not equals"); 
    }
  }
}