//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello for CoR design pattern");

        LoggerHandler handler = new InforHandler(new DebugHandler(new WarnHandler(new ErrorHandler(null))));


        handler.log(LogLevel.DEBUG,"Debugging started");
        handler.log(LogLevel.INFO,"process started");
        handler.log(LogLevel.ERROR,"call stack failed");
        handler.log(LogLevel.WARN,"line is not here");

    }
}