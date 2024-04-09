package client;

import java.rmi.Naming;
import java.util.Scanner;

import service.InterfaceServiceDistant;



public class ClientRMI {
	
	public static void main(String[] args) {
		try 
		{
			InterfaceServiceDistant stub = (InterfaceServiceDistant) Naming.lookup("rmi://localhost:1098/calcul");
			
			int a, b;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Donner le 1er nombre : ");
			a = scanner.nextInt();
			System.out.println();
			System.out.print("Donner le 2eme nombre : ");
			b = scanner.nextInt();
			System.out.println();
			System.out.println("Somme\t\t=\t"+stub.somme(a, b));
			System.out.println("Soustraction\t=\t"+stub.soustraction(a, b));
			System.out.println("Multiplication\t=\t"+stub.multiplication(a, b));
			System.out.println("Division\t=\t"+stub.division(a, b));
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
