package ch11_classes.ex05_bank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankUtil {

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
