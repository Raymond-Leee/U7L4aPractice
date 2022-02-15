import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<LogMessage> list = new ArrayList<LogMessage>();
        LogMessage str = new LogMessage("CLIENT3:security alert – repeated login failures");
        LogMessage str2 = new LogMessage("Webserver:disk offline");
        LogMessage str3 = new LogMessage("SERVER1:file not found");
        LogMessage str4 = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage str5 = new LogMessage("SERVER1:write error on disk DSK2");
        LogMessage str6 = new LogMessage("Webserver:error on /dev/disk");
        list.add(str);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        list.add(str6);

        System.out.println(list.removeMessages("disk"));
    }
}
