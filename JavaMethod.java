
public class JavaMethod {


	public static void main(String[] args) {
		JavaMethod.StaticMethod();

		JavaMethod jm = new JavaMethod();	
		jm.normalMethod();

	}
	public void normalMethod() {

		System.out.println("I am a non static Method");
	}

	public static void StaticMethod() {

		System.out.println("I am a static Method");
		System.out.println("this method is success");

	}



}
