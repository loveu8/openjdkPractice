package openjdkPractice.common;

public enum Unit {
  MB(1024 * 1024),
  TEN(10),
  HUNDRED(100),
  THOUSAND(1000),
  TENTHOUSAND(10000),
  TENTENTHOUSAND(100000),
  MILLION(1000000);
  private int size;
  
  Unit (int size){
    this.size = size;
  }
  public int mbSize() {
    return MB.size;
  }
  public int time() {
    return this.size;
  }
}
