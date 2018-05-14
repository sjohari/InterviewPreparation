package structuralPatterns.decoratorPattern;

public class WebPageAuthenticator extends WebPageDecorator{
	
	WebPageAuthenticator(WebPage webPage){
		super(webPage);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Web Authenticator..");
		
	}
}
