import java.util.Date;

public class Logger {
    private static Logger logger;

    private Logger(){}

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }

        }
        return logger;
    }

    public void log(String message){
        System.out.println(new Date() + " : " + message);
    }
}


//public class Logger {
//    private Logger() {}
//
//    private static class LoggerHolder {
//        private static final Logger INSTANCE = new Logger();
//    }
//
//    public static Logger getInstance() {
//        return LoggerHolder.INSTANCE;
//    }
//
//    public void log(String message) {
//        System.out.println(new Date() + " : " + message);
//    }
//}
