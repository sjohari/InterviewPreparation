package behaviouralPatterns.chainOfResponsibility;

public class InfoLogger implements Logger{

	private Logger nextLogger;


	@Override
	public void writeLog(String message, LogType logType) {
		if(logType.equals(LogType.INFO)){
			System.out.println("[INFO] : " + message);
		}
		nextLogger.writeLog(message, logType);	
	}

	@Override
	public void setnextLogger(Logger logger) {
		this.nextLogger = logger;
	}
	
	public void someLogic() throws BusinessException{
		throw new BusinessException("someMessage");
	}

}
