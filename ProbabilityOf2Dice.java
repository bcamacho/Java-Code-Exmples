class ProbabilityOf2Dice {
	public static void main(String[] args) {
		//Roll two dice, what is the probability of rolloing no sixes & rolling sixes
		//There are 6 sides to a dice
		float notRolling6=(5/6f)*(5/6f);
		System.out.println("You have a "+notRolling6+"% of not rolling double sixes");
		float rolling6=(1/6f)*(1/6f);
		System.out.println("You have a "+rolling6+"% of rolling double sixes");

	}
}