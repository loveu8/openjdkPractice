package openjdkPractice.unit1;

import java.math.BigDecimal;
import openjdkPractice.common.Cost;
import openjdkPractice.common.DataManger;
import openjdkPractice.common.Unit;

public class NormalTest {
  public static void main(String[] args) {
    DataManger dataManger = DataManger.un;
    for(int index = 0 ; index < 100 ; index ++) {
      // Int test
      new OldIntAdd().test();
      new NewIntAdd().test();
      // BigDecimal test
      new OldBigDecimalAdd().test();
      new NewBigDecimalAdd().test();
      // String test
      new OldString().test();
      new NewString().test();
      // StringBuilder test
      new OldStringBuilder().test();
      new NewStringBuilder().test();
    }
    dataManger.getAvgCostTime();
  }
}

class OldIntAdd extends Cost {
  public void test() {
    int number = 0;
    for(int index = 0 ; index < super.getTimer() ; index++) {
      number = number +1;
    }
    super.finish(this.getClass().getSimpleName());
  }
}


class NewIntAdd extends Cost {
  public void test() {
    var number = 0;
    for(var index = 0 ; index < super.getTimer() ; index++) {
      number = number +1;
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldBigDecimalAdd extends Cost {
  public void test() {
    BigDecimal intValue = new BigDecimal(0);
    for(int index = 0 ; index < super.getTimer() ; index++) {
      intValue = intValue.add(new BigDecimal(index));
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewBigDecimalAdd extends Cost {
  public void test() {
    var intValue = new BigDecimal(0);
    for(var index = 0 ; index < super.getTimer() ; index++) {
      intValue = intValue.add(new BigDecimal(index));
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldDoubleAdd extends Cost {
  public void test() {
    double number = 0;
    for(int index = 0 ; index < super.getTimer() ; index++) {
      number = number +1;
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewDoubleAdd extends Cost {
  public void test() {
    var number = 0.0;
    for(var index = 0 ; index < super.getTimer() ; index++) {
      number = number +1;
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldString extends Cost {
  public void test() {
    String str = "";
    for(int index = 0 ; index < Unit.TENTHOUSAND.time() ; index++) {
      str = str + index;
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewString extends Cost {
  public void test() {
    var str = "";
    for(var index = 0 ; index < Unit.TENTHOUSAND.time() ; index++) {
      str = str + index;
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldStringBuilder extends Cost {
  public void test() {
    StringBuilder builder = new StringBuilder("");
    for(int index = 0 ; index < super.getTimer() ; index++) {
      builder.append(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewStringBuilder extends Cost {
  public void test() {
    var builder = new StringBuilder("");
    for(var index = 0 ; index < super.getTimer() ; index++) {
      builder.append(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}
