package VariousExamples;

public class StringPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = {'H','e','l','l','o',' ','W','o','r','l','d'};
		String s = new String(ch);
		for(int i = 0; i<=s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

}
