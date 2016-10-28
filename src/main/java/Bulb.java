public class Bulb implements Light {
    boolean isWork;

    public Bulb() {
        isWork = true;
    }

    @Override
    public void light() {
        if (isWork)
            System.out.println("Лампочка работает");
    }
}
