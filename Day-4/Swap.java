import java.util.*;

public class Swap {

	public static void main(String a[])
	{
        Scanner sc=new Scanner(System.in);

		ArrayList<String> ArrList = new ArrayList<String>();
		System.out.println("Enter the 5 team names:");
		ArrList.add(sc.nextLine());
		ArrList.add(sc.nextLine());
		ArrList.add(sc.nextLine());
		ArrList.add(sc.nextLine());
		ArrList.add(sc.nextLine());


        System.out.println("Enter swap positions:");
        int num1=sc.nextInt();
		int num2=sc.nextInt();

		Collections.swap(ArrList, num2, num1);
		System.out.println("After Swap the ArrayList");
		System.out.println(ArrList);
	}
}