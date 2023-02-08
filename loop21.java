 //      * 
 //     *  * 
 //    *    * 
 //   *      * 
 //  *        * 
 // *        * 
 //  *      * 
 //   *    * 
 //    *  * 
 //     * 





class loop21
  {
    public static void main(String args[]){
      for(int i=1;i<=5;i++){
        for(int j=5;j>=i;j--){
          System.out.print(" ");
        }
        for(int k=1;k<(2*i);k++){
          if(k>1&&k<(2*i)-1){
             System.out.print(" ");
          }
          else
            System.out.print(" *"); 
        }
         System.out.println(" ");
         }
      for(int n=5;n>=1;n--){
        for(int l=5;l>n;l--){
          System.out.print(" ");
        }
        for( int m=1;m<(2*n);m++){
          if(m>1&&m<(2*n)-1){
             System.out.print(" ");
          }
          else
            System.out.print(" *"); 
        }
         System.out.println(" ");
      }
    }
  }