import java.util.*;
  
  public class Main{
  
  public static int covertSourceToBaseTen(int n,int sourceBase) {
      int i=0;
      int baseTen = 0;
      while(n > 0) {
      
          baseTen += Math.pow(sourceBase,i)*(n%10);
          n /= 10;
          i++;
      }
      return baseTen;
  }
  
  public static int convertBaseTenToDes(int n,int destBase) {
      if(n == 0) {
          return 0;
      }
      return (convertBaseTenToDes(n/destBase,destBase)*10)+(n%destBase);
  }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int baseTen = covertSourceToBaseTen(n,sourceBase);
     System.out.println(convertBaseTenToDes(baseTen,destBase));
   }   
  }
