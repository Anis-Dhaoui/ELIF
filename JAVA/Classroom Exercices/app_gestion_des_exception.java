 //CAS 1:
 //Puisque x est nul, NullPointerException se produira chaque
 //fois que vous l'utiliserez jusqua ce que vous l'initialisiez.
 //SOLUTION:
 //static int x[] = new int[5];

// public class SuperHotel {
     //static int x[];
//     public void reserver(){
    
//              x[0] = 1;     
//     }
    
//     public static void main(String args[]){
        
//         SuperHotel s = new SuperHotel();
//         s.reserver();
//     }
// }



//Cas 2: 
//ArithmeticException(exeption non verifie dans Java)
//car nous essayons de diviser 20 par 0:
// import java.util.*;
// public class DivisionExecption {


//      static  int x =20;
//      static int y ;
//           public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);
//             System.out.println(" Enter un entier");
//              y = scanner.nextInt();
//             System.out.println(x/y);
//     }
// }


//CAS 3:
//java.lang.StackOverflowError(l'application epuisee causee par recursivitee infinie)
// public class AppelMethod {

//         public void method1(){
//         this.method2();
//     }

//     public void method2(){
//       this.method1();
//     }

//   public static void main(String[] args) {

//       AppelMethod appel = new AppelMethod();
// 		appel.method1();
// }
// }



//CAS 4:
//java.lang.ArrayIndexOutOfBoundsException
//indiquer qu'un tableau a ete acceedee avec un index illeegal.
//Solution:
//for(int i=0;i<3;++i){
// public class AddTable {
//     public static void main(String[] args) {

// 		int[] array = new int[3];
// 		for(int i=0;i<4;++i){
// 			array[i] = i;
// 		}
// 		System.out.println(array);
// 	}
// }


//ACTIVITEE
import java.io.*;
public class TestExceptions{
    public static void main(String[] args){

        //Open the Input file
        File inputFile = new File("Sample.jpg");
        //Open the Output file
        File outputFile1 = new File("Output1.jpg");

        //Get file handlers in Byte Stream format
        FileInputStream in1 = new FileInputStream(inputFile);
        FileOutputStream out1 = new FileOutputStream(outputFile1);

        int c1;

        while ((c1 = in1.read()) != -1){   //Until end of file
           out1.write(c1);
        }

        //Close the files
        in1.close();
        out1.close();
    }
}
