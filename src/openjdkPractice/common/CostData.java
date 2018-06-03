package openjdkPractice.common;

public class CostData {
  private String name;
  private Long time;
  private long memory;
  
  public CostData(String name , long time , long memory) {
    this.name = name;
    this.time = time;
    this.memory = memory;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public long getMemory() {
    return memory;
  }

  public void setMemory(long memory) {
    this.memory = memory;
  }
}
