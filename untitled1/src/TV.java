public class TV {

    public int setChannel;
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 13) {
            channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 10) {
            volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp() {
        if (on && channel < 13) {
            channel++;
        }
    }
    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }
    public void volumeUp() {
        if (on && volumeLevel < 10) {
            volumeLevel++;
        }
    }
    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}