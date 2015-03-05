import java.util.*;

/** 
Author: Brandy Lee Camacho
Date: March 5, 2015
App: Keeping Numbers Within Range


	Example Configuartion:
	We need to set our varible
	Double mathData=Math.random()*10;
	Example 1: "Math.random()*10" = 3.2460085763971023
	Example 2: "(int)(mathData)" = 3
	Removing decimal by converting to int = 3
	Notice that there is no rounding,
	this is important for keeping numbers within Range
	For example, you need to generate RGB color codes 255,255,255
	There will be an error if you round up to 256
	or by leaving the decimal 255.432453252

**/

class KeepingNumbersWithinRange {
	public static void main(String[] args) {
		double mathData = Math.random()*10;
		System.out.println("Example Configuartion:\nWe need to set our varible\nDouble mathData=Math.random()*10;\nExample 1: \"Math.random()*10\" = "+mathData+"\nExample 2: \"(int)(mathData)\" = "+(int)(mathData)+"\nRemoving decimal by converting to int = "+(int)(mathData)+"\nNotice that there is no rounding,\nthis is important for keeping numbers within Range\nFor example, you need to generate RGB color codes 255,255,255\nThere will be an error if you round up to 256\nor by leaving the decimal 255.432453252");
		
	}
}