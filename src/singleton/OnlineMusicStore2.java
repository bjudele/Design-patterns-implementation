package singleton;

public enum OnlineMusicStore2 {
  INSTANCE, ANOTHER_INSTANCE;

  public void play() {
    System.out.println("Playing in enum");
  }

}
