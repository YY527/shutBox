package deng.michelle;

import java.util.Random;

public class Die {
	
		// instance variables
		private static int value;
		private static int numSides;
		
		Die (){
			numSides = 6;
			value = roll();
		}
		
		Die(int n){
			numSides = n;
			value = roll();
		}
		// simulate a  single Die roll
		public static int roll() {
			Random rand = new Random();
			value = rand.nextInt(1, numSides+1);
			return value;
		}
		
		public void setSides(int n) {
			numSides = n;
	
	}
}
	