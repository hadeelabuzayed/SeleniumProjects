package magentoTest;

import java.util.Random;

public class parameters {
	static String url="https://magento.softwaretestingboard.com/\\";
	public static String[] firstName= {"Hadeeel","Rema","Mousa","Rania"};
	public static String[] lastName= {"Mohammed","Ali","Sami","Saif"};
	static String Fname=chooseRandomName(firstName);
	static String Lname=chooseRandomFamily(lastName);
	static String Email=Fname+"."+Lname+"123"+"@gmail.com";
    static String randomPassword = generateRandomPassword();
	private static String generateRandomPassword() {
		Random randomPassword=new Random();
		int passwordLength=9;
        StringBuilder password = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = randomPassword.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
   
	}
	private static String chooseRandomFamily(String[] lastName2) {
		Random randomFamily=new Random();
		int randomIndex2=randomFamily.nextInt(lastName.length);
		return lastName2[randomIndex2];
	}
	private static String chooseRandomName(String[] firstName2) {
		Random randomName=new Random();
		int randomIndex=randomName.nextInt(firstName.length);
		return firstName2[randomIndex];
	}
}
