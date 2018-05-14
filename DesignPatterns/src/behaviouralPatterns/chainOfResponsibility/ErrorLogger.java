package behaviouralPatterns.chainOfResponsibility;

public class ErrorLogger implements Logger{
	private Logger nextLogger;
	
	@Override
	public void setnextLogger(Logger logger){
		this.nextLogger = logger;
	}

	@Override
	public void writeLog(String message, LogType logType) {
		if(logType.equals(LogType.ERROR)){
			System.out.println("[ERROR] : " + message);
		}
		if(nextLogger!=null){
			nextLogger.writeLog(message, logType);	
		}
		
	}

}
