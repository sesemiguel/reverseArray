import java.util.*;
public class FirstClass  
{
    static Scanner inp = new Scanner(System.in);
 	public static void main (String[] args)
 	{
 		int ArraySize = inp.nextInt();
 		int Array[] = new int[ArraySize];
		for (int i = 0; i<Array.length; i++) {
			Array[i] = inp.nextInt();
	    }
		
		for (int i = 0; i<Array.length/2; i++) {
			 int temp = Array[i];
			 Array[i] = Array[Array.length-1-i];
			 Array[Array.length-1-i] = temp;
			//System.out.print(Array[i]+" ");
	    }
		for (int i = 0; i<Array.length; i++) {
			System.out.print(Array[i]+" ");
	    }
    }
}