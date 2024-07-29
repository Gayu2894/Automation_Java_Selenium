package java_Program_Basic.Assignment;

public class RemoveWhitSpaceInString {

	public static void main(String[] args) {
		
		//String s="java is a program";
		//System.out.println(s.replace(" ", ""));
		
		//String s="$#$Ga^%$#yu";
		//System.out.println(s.replaceAll("\\W+",""));
		
		String s="sdddffeererttyhvvv";
		int TotalChar=s.length();
		System.out.println("Total Character count: "+TotalChar);
		int charcount=s.replace("d", "").length();
		int count=TotalChar-charcount;
		System.out.println("Count of character d: "+count);
		

	}

}
