abstract public class LoggerHandler {
    LoggerHandler handler;

    LoggerHandler(LoggerHandler loggerHandler){
        this.handler=loggerHandler;
    }

    public void log(LogLevel level,String message){
        if(handler!=null){
            handler.log(level,message);
        } else {
            System.out.println("Request cannot be processed");
        }
    }
}
