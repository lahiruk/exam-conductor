package lk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private String unusedGlobal;
	private String usedGlobal;
	public String publicGlobal;
	protected String protectedGlobal;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	private void unusedFunction(String unusedParam,String usedParam) {
		String usedVariable;
		System.out.println(usedParam==usedGlobal?usedVariable:"");
		String unusedVariable;
		usedFunction("test","Test");
		usedFunction2("test");
	}

	private void usedFunction(String usedParam, String unusedParam2) {
		String usedVariable;
		System.out.println(usedParam==usedGlobal?usedVariable:"");
	}
	
	private void usedFunction2(String usedParam) {
		String usedVariable;
		System.out.println(usedParam==usedGlobal?usedVariable:"");
	}
	
	protected void protectedFunction() {

	}
	
	private boolean returnFunction() {
		return true;
	}
}
