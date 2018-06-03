package openjdkPractice.unit1;

import java.util.ArrayList;
import java.util.List;
import openjdkPractice.common.Cost;
import openjdkPractice.common.DataManger;
import openjdkPractice.common.Unit;

public class ThreadTest {
  public static void main(String[] args) {
    // thread test
    DataManger dataManger = DataManger.un;
    for(int index = 0 ; index < 100 ; index ++) {
      new OldThread().test();
      new NewThread().test();
    }
    dataManger.getAvgCostTime();
  }
}

class CommonThread implements Runnable{

  @Override
  public void run() {
    int value = 1;
    value = value + 1;
  }
  
}

class OldThread extends Cost {
  public void test() {
    List<Thread> threads = new ArrayList<Thread>();
    for (int index = 0; index < Unit.TENTHOUSAND.time(); index++) {
      threads.add(new Thread(new CommonThread()));
    }
    for (int index = 0; index < Unit.TENTHOUSAND.time(); index++) {
      threads.get(index).start();
    }
    super.finish(this.getClass().getSimpleName());
  }
}


class NewThread extends Cost {
  public void test() {
    var threads = new ArrayList<Thread>();
    for (int index = 0; index < Unit.TENTHOUSAND.time(); index++) {
      threads.add(new Thread(new CommonThread()));
    }
    for (int index = 0; index < Unit.TENTHOUSAND.time(); index++) {
      threads.get(index).start();
    }
    super.finish(this.getClass().getSimpleName());
  }
}
