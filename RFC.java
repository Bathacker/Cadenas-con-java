import java.util.Scanner;

public class RFC
{

	public static void main(String[] args)
	{
		
		String var, ao, dia, mes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el RFC: ");
		var = sc.next();
		ao = var.substring(4,6);
		mes = var.substring(6,8);
		dia = var.substring(8,10);
		
		System.out.println("El año en el que nacio fue: " + ao);
		System.out.println("El mes en el que nacio fue: " + mes);
		System.out.println("El dia en el que nacio fue: " + dia);
		
		sc.close();

	}

}