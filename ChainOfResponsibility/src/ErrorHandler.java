import java.util.Date;

public class ErrorHandler extends LoggerHandler{
    ErrorHandler(LoggerHandler loggerHandler) {
        super(loggerHandler);
    }

    @Override
    public void log(LogLevel level, String message) {
        if(level == LogLevel.ERROR){
            System.out.println("Error: "+new Date()+ " message: "+ message);
        } else {
            super.log(level,message);
        }
    }
}
