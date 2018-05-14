package behaviouralPatterns.chainOfResponsibility;

public class DebugLogger implements Logger {
	
	private Logger nextLogger;
	
	@Override
	public void setnextLogger(Logger logger){
		this.nextLogger = logger;
	}

	@Override
	public void writeLog(String message, LogType logType) {
		if(logType.equals(LogType.DEBUG)){
			System.out.println("[DEBUG] : " + message);
		}
		nextLogger.writeLog(message, logType);	
	}

}
