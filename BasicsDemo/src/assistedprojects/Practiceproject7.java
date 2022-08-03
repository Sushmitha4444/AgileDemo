package practiceprojects;

public class Practiceproject7 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		Practiceproject7 obj=new Practiceproject7();
		Practiceproject7.Inner in=obj.new Inner();  
		in.hello();  
	}
}
