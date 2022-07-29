public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public int energyReport() {
    return batteryLevel;
  }

  public static void main(String[] args) {
    Droid droid1 = new Droid("Codey");
    System.out.println(droid1.toString());
    droid1.performTask("dancing");
    System.out.println(droid1.name + "'s battery level is " + droid1.energyReport());
  }
}