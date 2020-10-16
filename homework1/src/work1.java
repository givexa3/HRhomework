import java.util.Arraylist;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//Givi Khutsishvili
//13.10.2020
//Email: gugakhutsishvili@yahoo.com

//Homework6 creating my own Data-structure, which does the work in O(1) time.
//This algorithm removes the element from the string, the user should indicate
//the string and also the index, which he wants to remove.
class newdatastructure {
	String String;
	newdatastructure(String y, int z){
		
		String temp = y;
		String part1 = temp.substring(0, z);
		String part2 = temp.substring(z+1, temp.length());
		
		this.String = part1 + part2;
	}
}

public class work1 {
    
	//The main output is written here...
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a sentence: ");
	
	System.out.println(isPalindrome(input.nextLine()));
	
	System.out.print("Enter a cents: ");
	
	System.out.println("Mininum change: " + minSplit(input.nextInt()));
	
	int[] numbers = {-5, 0, 11, -21, 1, 10};
	int[] numbers2 = {-5, -4, -3, -10, -11, 0};
	int[] numbers3 = {7, 9, 10, 5, 21, 2, 2};
	int[] numbers4 = {-1, -10, -15, -55};
	int[] numbers5 = {1, 2, 3, 4};
		
	System.out.println("Not Contains min number1: " + notContains(numbers));
	System.out.println("Not Contains min number2: " + notContains(numbers2));
	System.out.println("Not Contains min number3: " + notContains(numbers3));
	System.out.println("Not Contains min number4: " + notContains(numbers4));
	System.out.println("Not Contains min number5: " + notContains(numbers5));
	
	System.out.print("Enter a sequence of parenthesis: ");
	
	Scanner input2 = new Scanner(System.in);
	
	System.out.println(isProperly(input2.nextLine()));
	
	System.out.print("Enter a number of stairs: ");
	System.out.println(sequence(input2.nextInt()));
	
	Scanner input3 = new Scanner(System.in);
	
	System.out.print("Enter a word: ");
	String s = input3.nextLine();
	
	System.out.print("Remove index: ");
	int n = input3.nextInt();
	
	newdatastructure lol = new newdatastructure(s, n);
	
	System.out.println(lol.String);
	
	input.close();
	input2.close();
	input3.close();

	}
	//Homework1 simple program, which reads the string backwords, and saves it
	//in a new string called temp. if the new string temp matches the input string,
	//(in case insensitive), the program outputs true, otherwise false.
	public static boolean isPalindrome(String text){
		String temp = "";
		
		for (int i=text.length()-1; i > -1; i--){
			temp = temp + text.charAt(i);
		}
		//the program should be case insensitive, which means
		//if we input Mom, the output should be also true
		if(text.toLowerCase().equals(temp.toLowerCase())){
			return true;
		}else{
			return false;
		}
		
	}
	
	//Homework2 simple algorithm. The program divides the input by the highest amount it can.
	public static int minSplit(int amount){
		int fifty = 50;
		int twenty = 20;
		int ten = 10;
		int five = 5;
		int one = 1;
		int count=0;
		
		while (amount/fifty >= 1){
			amount = amount - fifty;
			count++;
		}
		while (amount/twenty >= 1){
			amount = amount - twenty;
			count++;
		}
		while (amount/ten >= 1){
			amount = amount - ten;
			count++;
		}
		while (amount/five >= 1){
			amount = amount - five;
			count++;
		}
		while (amount/one >= 1){
			amount = amount - one;
			count++;
		}
		return count;
				
	}
	
	//Homework3 i entered 4 different arrays, with 2 worst case scenario where
	//there are all negative numbers, mixed, and all positive.
	//if there are all negative numbers then the min number that this function must give
	//is which must be greater than 0 and must not contain in this array is 1.
	public static int notContains(int[] array){
		Arrays.sort(array);
		ArrayList<Integer> temp0 = new ArrayList<Integer>();
		for (int i=0; i<array.length; i++){
			if(array[i]>0){
				temp0.add(array[i]);
			}
		}
						
		Collections.sort(temp0);
		for(int i=0; i<temp0.size(); i++){
			if(i!=temp0.size()-1){
				if(temp0.get(i) != temp0.get(i+1)){
					if((temp0.get(i+1) - temp0.get(i))!=1){
						return temp0.get(i) + 1;
					}
				}
			}
			if(i==temp0.size()-1){
				return temp0.get(i) + 1;
			}
		}
		// if non of the conditions happen return 1, which means there is no such number.
		// not to get complicated here, lets talk about the worst case what could happen,
		// if we have an array, which has all negative values,
		// for example {-1, -2, -10, -7, -3}, the minimum whole number, which is greater
		// than 0 and is not in the array is 1 in this case and not 0, so we return 1.
		return 1;
	}
	//Homework4 if the length of the input is odd, then the answer is already false,
	//however, if the input is even then we check if index 0 is the same or not with last index
	//index1 is the same or not for the last index-1, and so on.. if all of the indexes are
	//not the same the output is true, otherwise false
	public static boolean isProperly(String sequence){
		int temp = sequence.length()-1;
		if((sequence.length())%2==1){
			return false;
		}
		else{
			for (int i=0; i < (sequence.length())/2;i++)
			{
				if(sequence.charAt(i)==sequence.charAt(temp))
				{
					return false;
				}
				temp--;
			}
		}
		return true;
	}
	
	//Homework5 in this example i have tried lots of inputs 1 then 2 then 3, so on, and i found that
	//this algorithm was a fibonacci sequence. So i wrote a simple fibonacii sequence, but not
	//including numbers that are less then 1, also 1, and 2.(because we already now ansewers for them).
	public static int sequence(int x){
	    if(x<1){
	        return 0;
	    }
	    else if(x==1){
	        return 1;
	    }
	    else if(x==2){
	        return 2;
	    }
	    else{
		    int first = 1;
		    int second = 2;
		    int third = 0;
		    int temp=x-3;
		    while (temp >= 0){
		        third = first + second;
		        first = second;
		        second = third;
		        temp--;
		    }
		    return third;
	    }
	}

}
