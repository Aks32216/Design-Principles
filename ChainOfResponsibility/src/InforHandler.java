import java.util.Date;

public class InforHandler extends LoggerHandler{
    InforHandler(LoggerHandler loggerHandler) {
        super(loggerHandler);
    }

    @Override
    public void log(LogLevel level, String message) {
        if(level == LogLevel.INFO){
            System.out.println("Infor: "+new Date()+ " message: "+ message);
        } else {
            super.log(level,message);
        }
    }
}
