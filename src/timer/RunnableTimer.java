package timer;

public class RunnableTimer implements Runnable {
  private final GameTimer time;
  private boolean finished = false;

  public RunnableTimer(GameTimer time) {
    this.time = time;
  }

  @Override
  public void run() {
    while (!finished) {
      try {
        Thread.sleep(1000);
        time.setTime(time.getTime() - 1);
        if (time.getTime() == 0) {
          finished = true;
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
