package room;

public class Room {
    private boolean dark;
    private boolean switchLightExists;

    public boolean isDark() {
        return dark;
    }
    public void setDark(boolean dark) {
        this.dark = dark;
    }
    public boolean isSwitchLightExists() {
        return switchLightExists;
    }
    public void setSwitchLightExists(boolean switchLightExists) {
        this.switchLightExists = switchLightExists;
    }
    public void turnLightOn(){if (isSwitchLightExists()) setDark(false);}
    public void turnLightOff(){if (isSwitchLightExists()) setDark(true);}
}
