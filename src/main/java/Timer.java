import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timer {
    public static double getHoursNumber() {
        boolean TrueTime = false;
        String getTime;
        double numberOfHours = 0;

        while (!TrueTime) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите минуту: ");
                getTime = reader.readLine();
                numberOfHours = Double.parseDouble(getTime);

                if (numberOfHours < 0) {
                    throw new NumberFormatException();
                }

                TrueTime = true;
            } catch (NumberFormatException | IOException ex) {
                ex.printStackTrace();
            }
        }
        return numberOfHours;
    }
}
