
public class Main {

    private static int i;
    private static int j;
    static int channel = 13;

    public static void Main(int[]args) {

        TV tv = new TV();

        tv.turnOn();
        tv.turnOff();
        tv.setChannel(0);
        tv.channelUp();
        tv.channelDown();
        tv.setVolume(0);
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOn();



        System.out.println("Change the channel to " + tv.setChannel);

        System.out.println("The TV is on channel "+ tv.channel +" and the volume is " + tv.volumeLevel);
        tv.turnOff();
    }

}