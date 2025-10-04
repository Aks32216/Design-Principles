import java.util.Date;

public class DebugHandler extends LoggerHandler{
    DebugHandler(LoggerHandler loggerHandler) {
        super(loggerHandler);
    }

    @Override
    public void log(LogLevel level, String message) {
        if(level == LogLevel.DEBUG){
            System.out.println("Debug: "+new Date()+ " message: "+ message);
        } else {
            super.log(level,message);
        }
    }
}
