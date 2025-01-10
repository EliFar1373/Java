package com.learn;

@FunctionalInterface
interface HJJ2{
	int show(int i,int j);
}

public class LambdaExpressionLeran3 {
	 public static void main(String[] args) {
//       HJJ1 obj = new HJJ1() {
//           @Override
//           public int show(int i, int j) {
//               return i + j;
//           }
//       };

   	
   	  HJJ2 obj = (i,j)->i+j;
       int result = obj.show(1, 2);
       System.out.println(result);
   }

}
