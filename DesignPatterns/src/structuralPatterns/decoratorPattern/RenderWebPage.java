package structuralPatterns.decoratorPattern;

public class RenderWebPage {

	public static void main(String[] args) {
		WebPage webPage = new WebPageAuthenticated(new BasicWebPage());
		webPage.display();
		
		
		System.out.println("----------------------------------------------------");
		
		
		webPage = new WebPageAuthenticated(new WebPageAuthenticator(new BasicWebPage()));
		webPage.display();

	}

}
