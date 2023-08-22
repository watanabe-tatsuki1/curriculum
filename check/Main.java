package check;

import constants.Constants;

public class Main {

	private static String firstName = "Tatsuki";
	private static String lastName = "Watanabe";

	public static void main(String[] args) {

		System.out.println("printNameメソッド → " + printName(firstName, lastName));

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rp.introduce();
	}

	private static String printName(String fn, String ln) {
		String fullName = fn + ln;
		return fullName;
	}

}
