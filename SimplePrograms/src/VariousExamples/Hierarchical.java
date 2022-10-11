package VariousExamples;

class Developer{  
	String companyName = "InfoTech company";     
	protected void ShowCommonInfo() {           
		System.out.println("Company: " +companyName); 
	}
}

class JavaDeveloper extends Developer{
	String lang = "Java";
	String tools = "Eclipse";
	String role = "JavaDeveloper";
	public void showDetails() {
		ShowCommonInfo();
		System.out.println("Role: "+role);
		System.out.println("Program Lang: "+lang);
		System.out.println("IDE: "+tools);
	}
}
class WebDeveloper extends Developer{ 
	String lang = "HTML, CSS";
	String tools = "VScode";
	String role = "WebDeveloper";
	public void showDetails() {
		ShowCommonInfo();
		System.out.println("Role: "+role);
		System.out.println("Program lang: "+lang);
		System.out.println("IDE: "+tools);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		JavaDeveloper javaDeveloper = new JavaDeveloper();
		WebDeveloper webDeveloper = new WebDeveloper();
		javaDeveloper.showDetails();
		System.out.println();
		webDeveloper.showDetails();
	}

}