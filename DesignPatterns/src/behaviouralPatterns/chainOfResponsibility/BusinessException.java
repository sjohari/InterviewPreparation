package behaviouralPatterns.chainOfResponsibility;

public class BusinessException extends Exception{
	String message;
	
	BusinessException(String someMessage){
		message = someMessage;
	}
	void writeMessage(){
		System.out.println("BusinessException occured due to : " + message );
	}
}
