import java.io.*;
class abc
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String n=br.readLine();
		System.out.println(n);
	}
}