public class vowel{
 
    public static void main(String[] args) {
 
       String str="madar saheb dudekula";
       char ch;
       int i=0;
       while(i<str.length()){
           ch=str.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               System.out.println(ch);
           }
           i++;
       }
    }
}