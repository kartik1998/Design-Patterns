package Factory;

public class GetPlanFactory {

  public Plan getPlan(String planType) {
    if (planType.equalsIgnoreCase("DOMESTIC")) {
      return new DomesticPlan();
    }
    if (planType.equalsIgnoreCase("COMMERCIAL")) {
      return new CommercialPlan();
    }
    if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
      return new InstitutionalPlan();
    }
    throw new RuntimeException("Invalid planType");
  }
}
