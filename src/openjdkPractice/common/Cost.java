package openjdkPractice.common;

public class Cost {
  private Runtime instance;
  private long startTime;
  private int timer;

  public Cost() {
    this.instance = Runtime.getRuntime();
    this.startTime = System.currentTimeMillis();
    this.timer = Unit.TENTENTHOUSAND.time();
  }

  public int getTimer() {
    return timer;
  }

  public void finish(String name) {
    CostData data = new CostData(name ,  
                                 (System.currentTimeMillis() - startTime) , 
                                 (instance.totalMemory() - instance.freeMemory()) / Unit.MB.mbSize());
    try {
      this.instance.gc();
      DataManger.un.addCostData(name, data);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
