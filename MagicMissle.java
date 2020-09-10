class MagicMissle{
	public static void main(String[] args){

	int hitOne = (int)(Math.random() * 100 % 4);
        int hitTwo = (int)(Math.random() * 100 % 4);
        int hitThree = (int)(Math.random() * 100 % 4);

	System.out.println("The first hit did " + (hitOne + 1) + " damage");
        System.out.println("The second hit did " + (hitTwo + 1) + " damage");
        System.out.println("The third hit did " + (hitThree + 1) + " damage");

	}
}
