class read
{
         void disp()
         {
            System.out.println("my name is pavankalyan");
           }
}
class derive extends read
{
    void disp()
         {
            super.disp();   
            System.out.println("i am in vijayawada");
          }
}
class superm
{
    public static void main(String args[])
    {
            derive d=new derive();
            d.disp();         
      }
}