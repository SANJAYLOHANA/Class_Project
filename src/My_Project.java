class myProject1 {
int sum;
int my_Calculator(int num1, int num2){
    
    sum = num1 + num2;
    return sum;
   }
}
class myproject2 extends myProject1{
   int sub;
   int my_Calculator2(int num1, int num2){
    sub = num1 - num2;
    return sub;
   }
}
class myproject3 extends myProject2{
   int multi;
   int my_Calculator3(int num1, int num2){
    multi = num1 * num2;
    return multi;
   }
}
public class My_Project { 
public static void main(String[] args) {
     myproject2 my = new myproject2();
     System.out.println("The Sum Of Given Integers Is: "+my.my_Calculator(10, 20));
     System.out.println("The Sub Of Given Integers Is: "+my.my_Calculator2(20, 10));
     System.out.println("The Sub Of Given Integers Is: "+my.my_Calculator3(20, 10));
    }
}