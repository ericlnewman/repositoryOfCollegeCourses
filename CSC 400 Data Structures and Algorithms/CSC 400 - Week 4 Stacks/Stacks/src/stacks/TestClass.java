package stacks;

public class TestClass {

	public static void main(String[] args) {
		
		PostFixConverter changeFix = new PostFixConverter();
		        String a = "a*b/(c-d) ";
		        String b = "(a-b*c)/(d*e*f+g) ";
		        String c = "a/b*(c+(d-e)) ";
		        String d = "(a^b*c-d)^e+f^g^h ";
				System.out.println("Infix: " + a);
		        System.out.println("Postfix: " + changeFix.convertToPostfix(a) +"\n"); 
		        System.out.println("Infix: " + b);
		        System.out.println("Postfix: " + changeFix.convertToPostfix(b) +"\n");
		        System.out.println("Infix: " + c);
		        System.out.println("Postfix: " + changeFix.convertToPostfix(c) +"\n");
		        System.out.println("Infix: " + d);
		        System.out.println("Postfix: " + changeFix.convertToPostfix(d) +"\n");
		}
}
