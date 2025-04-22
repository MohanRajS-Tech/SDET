package selenium;

public class JavaBasics001 {
    public static void main(String[] args) {
		//java variable
		//variable & Data Types
		
		System.out.println("Variables print out");
		
		int num = 5;
		String name ="mohan";
		char letter = 'a';
		double dec = 7.87;
		Boolean result = true;
		System.out.println(num+"  "+name+"  "+letter+"  "+dec+"  "+result+ "\n");
		
		//arrays-to store multiple value in a single variable
		System.out.println("Int Array print out");
		//1st way
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
				
		//2nd way
		int[] arr2 = {6,7,8,9,10};
		System.out.println(arr[4]+ arr2[4]);//15
				
		//for loop
		int len=(arr2.length-1);
		
		for(int i = 0; i<arr2.length;i++)
		{
			System.out.println(arr2[len-i]);
		}
		
		
		System.out.println("\n"+ "String Array & Enhanced Loop print out");
		String[] string = {"Selenium","Java","Webdriver","Automation","Testing"};
		//Enhanced for loop
		for(String s: string )
		{
			System.out.println(s);
		}

		

	}
    
}
