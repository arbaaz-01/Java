import java.io.*;
import java.util.Scanner;

public class pract_10B{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name, phoneno, add;
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Phone No: ");
		phoneno = sc.nextLine();
		System.out.print("Enter Address: ");
		add = sc.nextLine();
		try{
		FileOutputStream fos = new FileOutputStream("arbaaz.txt");
		byte[] b1 = name.getBytes();
		fos.write(b1);
		byte[] b2 = phoneno.getBytes();
		fos.write(b2);
		byte[] b3 = add.getBytes();
		fos.write(b3);
		fos.close();
		System.out.println("File Created");
		}
		catch(Exception e){
			System.out.println(e);
		}
		sc.close();
	}
}
