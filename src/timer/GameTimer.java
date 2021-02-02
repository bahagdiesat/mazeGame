package timer;

import java.util.Observable;

//singleton
public class GameTimer extends Observable {
  private long time;

  public GameTimer(long time) {
    this.time = time;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
    setChanged();
    notifyObservers(time);
  }
}
