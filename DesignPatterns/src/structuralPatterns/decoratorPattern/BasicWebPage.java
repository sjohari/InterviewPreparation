package structuralPatterns.decoratorPattern;

public class BasicWebPage implements WebPage{

	@Override
	public void display() {
		System.out.println("Basic Web page..");
	}

}
