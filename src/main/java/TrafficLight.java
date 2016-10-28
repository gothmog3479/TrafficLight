public class TrafficLight implements Light {
    private Lamp[] lamps;
    private Lamp currentLamp;

    public TrafficLight(Lamp red, Lamp yellow, Lamp green) {
        lamps = new Lamp[3];
        lamps[0] = red;
        lamps[1] = yellow;
        lamps[2] = green;
    }

    @Override
    public void light() {
        currentLamp.light();
    }

    /**
     * Метод определяет цвет светофора в зависимости от переданного параметра minuteNumber
     * в цикле: две минуты горит красный, три минуты горит - желтый, четыре - зеленый
     *
     * @param minuteNumber - время прошедшее с начала работы светофора
     */

    public void getColor(double minuteNumber) {
        if ((minuteNumber % 9 >= 0) && (minuteNumber % 9 < 2)) {
            currentLamp = lamps[0];
        } else if ((minuteNumber % 9 >= 2) && (minuteNumber % 9 < 5)) {
            currentLamp = lamps[1];
        } else if ((minuteNumber % 9 >= 5) && (minuteNumber % 9 < 9)) {
            currentLamp = lamps[2];
        }
    }
}
