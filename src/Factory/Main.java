package Factory;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    GetPlanFactory planFactory = new GetPlanFactory();
    Scanner sc = new Scanner(System.in);
    int tests = 5;
    while (tests-- > 0) {
      System.out.print("Enter your plan type: ");
      String planType = sc.next();
      System.out.print("Enter units consumed: ");
      int units = sc.nextInt();
      Plan plan = planFactory.getPlan(planType);
      System.out.println(
        "Billing amount for " + planType + " of units " + units
      );
      plan.getRate();
      plan.calculateBill(units);
    }
  }
}
