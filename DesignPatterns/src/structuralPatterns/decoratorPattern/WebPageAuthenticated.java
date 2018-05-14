package structuralPatterns.decoratorPattern;

//logged in user is right or not

public class WebPageAuthenticated extends WebPageDecorator {
	
	WebPageAuthenticated(WebPage webPage){
		super(webPage);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Web Authenticated..");
		
	}
}
