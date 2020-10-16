import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Givi Khutsishvili
//Email: gugakhutsishvili@yahoo.com

public class work8 {
	
	public static void main(String[] args) {
		
		//reading two inputs...
		List<String> biglist = new ArrayList<String>();
		function("http://www.nbg.ge/rss.php", biglist);
		Scanner scnr = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		System.out.println("Exchange From: ");
		String x = scnr.nextLine().toUpperCase();
		System.out.println("Exchange To: ");
		String y = scnr2.nextLine().toUpperCase();
		System.out.println(exchangeRate(x, y, biglist));
		
		scnr.close();
		scnr2.close();
		
	}
	
	//This function reads arraylist of strings, if the input matches the list,
	//it calculates the values for that input, if the input doesn't exist in the
	//list then it return -1, which means the input was incorrect.
	//also i didn't round the answer by two decimal, because i think this is more specific.
	public static double exchangeRate(String from, String to, List <String> x){
		int answer;
		double answer2;
		int answer3;
		double answer4;
		double answer5;
		double answer6;
		double togeo1 = 0;
		double togeo2 = 0;
		int count = 0;
		int count2 = 0;
					
		for(int i=0; i<x.size(); i++){
			count ++;
			if(from.equals(x.get(i))){
				
				String z = x.get(i+1); 
				String[] parts = z.split(" ");
				String part1 = parts[0];
				answer = Integer.parseInt(part1);
				answer2 = Double.parseDouble(x.get(i+2));
				answer5 = answer2/answer;
				togeo1 = 1/answer5;
				break;
			}
			if(count==x.size()){
				return -1;
			}
		}
		
		for(int i=0; i<x.size(); i++){
			count2++;
			if(to.equals(x.get(i))){
				
				String z2 = x.get(i+1); 
				String[] parts2 = z2.split(" ");
				String part2 = parts2[0];
				answer3 = Integer.parseInt(part2);
				answer4 = Double.parseDouble(x.get(i+2));
				answer6 = answer4/answer3;
				togeo2 = 1/answer6;
				break;
			}
			if(count2==x.size()){
				return -1;
			}
		}
		
		double finalanswer = togeo2/togeo1;
		
		return finalanswer;
	}
	//this function helps us to read the whole page, and copy the needed
	//strings to an arraylist of strings, so that we can manipulate with it
	//in the next function. The function gives two errors if, the link was incorrect,
	//or if something went wrong with the reader.
	public static void function(String urladdress, List <String> y){
		try{
		URL x = new URL(urladdress);
		BufferedReader in = new BufferedReader(new InputStreamReader(x.openStream()));
		String line;
		
		while((line = in.readLine())!=null){
			if(line.contains("<td>")){
				int first = line.indexOf("<td>");
				String temp = line.substring(first);
				temp = temp.replace("<td>", "");
				int last = temp.indexOf("</td>");
				temp = temp.substring(0, last);
				y.add(temp);
				}
				
			}
		in.close();
		} catch (MalformedURLException ue){
			System.out.println("Wrong Url...");
		} catch (IOException ioe){
			System.out.println("The reader has a problem...");
		}
		
	}
	
}
