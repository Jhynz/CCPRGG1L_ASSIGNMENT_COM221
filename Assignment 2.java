import java.util.Scanner;
 

 public class App { 
   
     static Scanner scan = new Scanner(System.in);

      public static void main(String[] args) {
        System.out.println("Options: " + "\n" + "\n" + "1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Crushname" + "\n" + "6.KFC" + "\n" );
        System.out.println("Choose your app :");
        int a = scan.nextInt();
        

        switch(a){
        case 1:
        int sum = add();
        System.out.println("The sum is: " + sum);
        break;

        case 2:
        int difference = subtract();
        System.out.println("The difference is: " + difference);
        break;

        case 3:
        int product = multiplication();
        System.out.println("The product is:" + product);
        break;


        case 4:
        int quotient = division();
        System.out.println("The quotient is:" + quotient);
        break;


        case 5:
        String crushName = revealMyCrush();
        System.out.println(crushName);
        break;

        case 6:
        myOrder();
        default:
        break;
                                                 
        
        }

    }

    static int add() {
        System.out.println("Please enter two numbers to add");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x + y;
    }

    static int subtract() {
        System.out.println("Please enter two numbers to subtract");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x - y;
    }

    static int multiplication() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;


    }

    static int division() {
        System.out.println("Please enter two numbers to division");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;

    }    

    static String revealMyCrush(){
        System.out.println("This will reveal the name of your crush");
        System.out.print("Enter the your name: ");
        String myName = scan.nextLine();

        scan.nextLine();

        System.out.print("Enter the name of your crush: ");
        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your 2nd crush: ");
        String nameOfMy2ndCrush = scan.nextLine();

        return myName + " loves " + nameOfMyCrush + " and " + nameOfMy2ndCrush;
    }

    static void myOrder() {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Order here");
        System.out.print("Enter Order 1 : " );
        String myOrder1 = scan.nextLine();
        System.out.print("Enter Order 1 price : " );
        Double firstOrderPrice = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter Order 2 : " );
        String myOrder2 = scan.nextLine();
        System.out.print("Enter Order 2 price : " );
        Double secondOrderPrice = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter Order 3 : ");
        String myOrder3 = scan.nextLine();
        System.out.print("Enter Order 3 price : ");
        Double thirdOrderPrice = scan.nextDouble();

        Double totalPrice = firstOrderPrice + secondOrderPrice + thirdOrderPrice;

        System.out.println("Your order is : " + "\n" + myOrder1 + "\n" +  myOrder2 + "\n" + myOrder3 );
        System.out.println("Total price : " + totalPrice);



        scan.close();
    }
}
