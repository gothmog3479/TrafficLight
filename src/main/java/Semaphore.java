import java.util.Scanner;

public class Semaphore {
    private enum SemaphoreStates{
        GREEN("Зеленый"), YELLOW("Желтый"), RED("Красный");

        SemaphoreStates(String state) {
            this.state = state;
        }
        private String state;

        @Override
        public String toString() {
            return  state;
        }

    }
    private SemaphoreStates states;

    Semaphore(int time) {
        setState(time%5);
    }

    private void setState(int time) {
        switch (time) {
            case 3:
                states = SemaphoreStates.YELLOW;
                break;
            case 4:
                states = SemaphoreStates.RED;
                break;
            default:
                states = SemaphoreStates.GREEN;
        }
    }

    @Override
    public String toString() {
        return states.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Semaphore semaphore = new Semaphore(scanner.nextInt());
        System.out.println(semaphore);
    }
}
