//Given an input string s and a pattern p, implement regular expression matching
//with support for '.' and '*' where:'.' Matches any single character.'*' Matches
//zero or more of the preceding element.The matching should cover the entire 
//input string (not partial).


package Digitnumbersmartrix;

public class Regular_Expression {

	public boolean isMatch(String s, String p){
		return match(0, 0, s, p);


	}
	public boolean match(int i, int j, String s, String p) {
		if(j == p.length())return i == s.length(); 
		boolean f = i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
		boolean a = false;
		if(j + 1<p.length() && p.charAt(j+1) == '*') {
			a = (f && match(i+1, j, s, p)) || match(i, j+2, s, p);
		}
		else {
			a = f && match(i+1, j+1, s, p);
		}
		return a;
	}

}
