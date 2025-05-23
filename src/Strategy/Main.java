package Strategy;

interface PaymentStrategy {
  void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
  private String cardNumber;

  public CreditCardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
  }
}

class PayPalPayment implements PaymentStrategy {
  private String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid $" + amount + " using PayPal: " + email);
  }
}

class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  // Set payment method dynamically
  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(int amount) {
    if (paymentStrategy == null) {
      throw new IllegalStateException("Payment strategy not set.");
    }
    paymentStrategy.pay(amount);
  }
}

public class Main {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
    cart.checkout(100);

    cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
    cart.checkout(250);
  }
}
