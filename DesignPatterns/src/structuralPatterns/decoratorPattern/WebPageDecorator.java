package structuralPatterns.decoratorPattern;

public class WebPageDecorator implements WebPage {
	
	protected WebPage webPage;
	
	WebPageDecorator(WebPage webPage){
		this.webPage = webPage;
	}

	@Override
	public void display() {
		this.webPage.display();	
	}

}
