package Week11;

public class TV {

    public int channel = 1;// default channel is 1
    public int volumeLevel = 1;// default volume is 1
    public boolean on = false;

    public TV() {
        //no paramaters
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel > 01 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {

        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }

    }

    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumedown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}