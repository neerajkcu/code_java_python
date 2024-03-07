public class ExcepTest {

   public static void main(String args[]) {
      int a = 3;
      int b = 0;
      System.out.println("result:" + divide(a,b));
   }

   private static int divide(int a, int b) {
      try {
         return a / b;
      }catch(ArithmeticException e) {
         System.out.println(e.getMessage());
      }
   return 0;
   }
}