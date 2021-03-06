package State;

public interface Connection {
  void open();
  void close();
  void log();
  void update();
}
