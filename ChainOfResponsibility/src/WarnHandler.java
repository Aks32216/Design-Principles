import java.util.Date;

public class WarnHandler extends LoggerHandler{
    WarnHandler(LoggerHandler loggerHandler) {
        super(loggerHandler);
    }

    @Override
    public void log(LogLevel level, String message) {
        if(level == LogLevel.WARN){
            System.out.println("Warn: "+new Date()+ " message: "+ message);
        } else {
            super.log(level,message);
        }
    }
}
