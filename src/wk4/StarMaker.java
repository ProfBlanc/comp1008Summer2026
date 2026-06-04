// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package wk4;
public class StarMaker {
    public static void main(String[] args) {
       
       StringBuilder spaces = new StringBuilder("54310");
       StringBuilder stars = new StringBuilder("136911");
       int lastNumber = 0;
       int numStars = 0;
       for(int i = 0; i < spaces.length(); i++){
           int num = Integer.parseInt(
               String.valueOf(spaces.charAt(i))
               );
           for(int j = 0; j < num; j++){
               System.out.print(' ');
           }
               numStars = Integer.parseInt(
                        String.valueOf(stars.charAt(i ) )
                   );

                   if(numStars < lastNumber){
                      for(int k = i + 1; k < i * i; k++ ){
                          
                          int testVal = Integer.parseInt( String.valueOf(numStars) + String.valueOf(stars.charAt(k)) );

                          if(testVal > lastNumber){
                              numStars = testVal;
                              break;
                          }
                          
                      } 
                   }
                       lastNumber = numStars;

           for(int l = 0; l < numStars ; l++){
                   System.out.print("*");
           }
           System.out.println();


       }



    }
}
