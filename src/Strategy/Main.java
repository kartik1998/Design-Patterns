package Strategy;

public class Main {

  public static void main(String[] args) {
    Strategy addition = new Addition();
    Strategy subtraction = new Subtraction();
    Strategy multiplication = new Multiplication();
    Context add = new Context(addition);
    float ref = add.executeStrategy(1, 2);
    System.out.println(ref);
  }
}
