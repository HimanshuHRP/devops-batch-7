import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Print Hello Docker
        System.out.println("Hello Docker !");
        
        // Get current date and time
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = sdf.format(new Date());
        
        // Print current date and time
        System.out.println("Current Date and Time: " + currentDate);
    }
}

