public class Lamp implements Light {
    private Bulb bulb;
    private Colors colors;

    public Lamp(Bulb bulb, Colors colors) {
        this.bulb = bulb;
        this.colors = colors;
    }

    @Override
    public void light() {
        if (bulb.isWork) {
            switch (colors) {
                case REDLIGHT:
                    System.out.println("Горит зеленый");
                    break;
                case YELLOWLIGHT:
                    System.out.println("Горит желтый");
                    break;
                case GREENLIGHT:
                    System.out.println("Горит зеленый");
                    break;
            }
        } else {
            System.out.println("Лампочка не работает");
        }

    }
}
