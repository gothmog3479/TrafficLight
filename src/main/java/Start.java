public class Start {
    public static void main(String[] args) {
     // TrafficLight trafficLight = new TrafficLight(new Lamp(new Bulb(), Colors.REDLIGHT), new Lamp(new Bulb(), Colors.YELLOWLIGHT), new Lamp(new Bulb(), Colors.GREENLIGHT));
        Bulb bulb = new Bulb();
        Lamp lampRed = new Lamp(bulb, Colors.REDLIGHT);
        Lamp lampYellow = new Lamp(bulb, Colors.YELLOWLIGHT);
        Lamp lampGreen = new Lamp(bulb, Colors.GREENLIGHT);
        TrafficLight traffColor = new TrafficLight(lampRed, lampYellow, lampGreen);
        traffColor.getColor(Timer.getHoursNumber());
        traffColor.light();
    }
}
