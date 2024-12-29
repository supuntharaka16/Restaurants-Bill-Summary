import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total food bill (in Rupees):");
		double food = input.nextDouble();
		 
		double servicefee = food * 12/100;
		double discount = 0;
		double total = food+servicefee;
		if(total>2000){
			discount = total * 5/100;
			}
		double newprice = total - discount;
		double salestax = newprice * 10/100;
		
		double finalamount = newprice + salestax;
		System.out.println("+-------------------------------------------------------------+");
		System.out.println("|                 Resturant Bill Summary                      |");
		System.out.println("+-------------------------------------------------------------+");
		System.out.println("| Total Food Bill :                   " +food+  "             |");
		System.out.println("| Service Fee (12%) :                 " +servicefee+"         |");
		System.out.println("| Discount (after applied 5%) :       "+total+"               |");
		System.out.println("| Actual Price :                      "+newprice+"            |");
		System.out.println("| Sales Tax (10%) :                   "+salestax+"            |");
		System.out.println("| Final Amount to Pay :               "+finalamount+"         |");
		System.out.println("+-------------------------------------------------------------+");
	}
}

	
