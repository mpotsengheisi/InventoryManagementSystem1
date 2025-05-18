package za.ac.cput.Util;
import java.util.UUID;

public class Helper {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
     
    
}

