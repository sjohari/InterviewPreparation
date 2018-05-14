package behaviouralPatterns.chainOfResponsibility;

public interface Logger {
	void writeLog(String message ,LogType logType );
	void setnextLogger(Logger logger);
}
