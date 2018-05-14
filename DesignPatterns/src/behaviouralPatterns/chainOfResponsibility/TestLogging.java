package behaviouralPatterns.chainOfResponsibility;

public class TestLogging {
	public static void main(String args[]) {
		InfoLogger logger  = new InfoLogger();
		DebugLogger debugLogger = new DebugLogger();
		ErrorLogger errorLogger = new  ErrorLogger();
		logger.setnextLogger(debugLogger);
		debugLogger.setnextLogger(errorLogger);
		logger.writeLog("this is an error", LogType.ERROR);
		
		try{
			logger.someLogic();
		}catch(BusinessException e){
			e.writeMessage();
		}
	}
}
