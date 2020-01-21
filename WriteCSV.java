package files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class WriteCSV {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try {
FileWriter file=new FileWriter("a.csv");

PrintWriter pr=new PrintWriter(file);
pr.print("id");
pr.print(",");
pr.println("name");
Scanner sc=new Scanner(System.in);
System.out.println("enter5 id and name");
for(int i=0;i<5;i++)
{
	pr.print(sc.nextInt());
	pr.print(",");
	pr.println(sc.next());
	System.out.println("inserted");
}
pr.flush();
pr.close();
file.close();

	}
		catch(Exception e)
		{
			System.out.println("error");
		}
		}

}
