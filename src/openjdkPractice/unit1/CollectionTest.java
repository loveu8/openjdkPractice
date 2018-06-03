package openjdkPractice.unit1;

import openjdkPractice.common.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
  public static void main(String[] args) {
    DataManger dataManger = DataManger.un;
    for(int index = 0 ; index < 100 ; index ++) {
      // ArrayList test
      new OldArrayList().test();
      new NewArrayList().test();
      // LinkedList test
      new OldLinkedList().test();
      new NewLinkedList().test();
      // HashMap test
      new OldHashMap().test();
      new NewHashMap().test();
      // LinkedHashMap test
      new OldLinkedHashMap().test();
      new NewLinkedHashMap().test();
      // HashSet test
      new OldHashSet().test();
      new NewHashSet().test();
      // LinkedHashSet test
      new OldLinkedHashSet().test();
      new NewLinkedHashSet().test();
    }
    dataManger.getAvgCostTime();
  }
}

class OldArrayList extends Cost {
  public void test() {
    List<Integer> list = new ArrayList<Integer>();
    for(int index = 0 ; index < super.getTimer() ; index++) {
      list.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewArrayList extends Cost {
  public void test() {
    var list = new ArrayList<Integer>();
    for(var index = 0 ; index < super.getTimer() ; index++) {
      list.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldLinkedList extends Cost {
  public void test() {
    List<Integer> list = new LinkedList<Integer>();
    for(int index = 0 ; index < super.getTimer() ; index++) {
      list.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewLinkedList extends Cost {
  public void test() {
    var list = new LinkedList<Integer>();
    for(var index = 0 ; index < super.getTimer() ; index++) {
      list.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldHashMap extends Cost {
  public void test() {
    Map<Integer , Integer> map = new HashMap<Integer , Integer>();
    for(int index = 0 ; index < super.getTimer() ; index++) {
      map.put(index, index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewHashMap extends Cost {
  public void test() {
    var map = new HashMap<Integer , Integer>();
    for(var index = 0 ; index < super.getTimer() ; index++) {
      map.put(index, index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldLinkedHashMap extends Cost {
  public void test() {
    Map<Integer , Integer> map = new LinkedHashMap<Integer , Integer>();
    for(int index = 0 ; index < super.getTimer() ; index++) {
      map.put(index, index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewLinkedHashMap extends Cost {
  public void test() {
    var map = new LinkedHashMap<Integer , Integer>();
    for(var index = 0 ; index < super.getTimer() ; index++) {
      map.put(index, index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldHashSet extends Cost {
  public void test() {
    Set<Integer> set = new HashSet <Integer>();
    for(int index = 0 ; index < super.getTimer() ; index++) {
      set.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewHashSet extends Cost {
  public void test() {
    var set = new HashSet <Integer>();
    for(var index = 0 ; index < super.getTimer() ; index++) {
      set.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class OldLinkedHashSet extends Cost {
  public void test() {
    Set<Integer> set = new LinkedHashSet <Integer>();
    for(int index = 0 ; index < super.getTimer() ; index++) {
      set.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}

class NewLinkedHashSet extends Cost {
  public void test() {
    var set = new LinkedHashSet <Integer>();
    for(var index = 0 ; index < super.getTimer() ; index++) {
      set.add(index);
    }
    super.finish(this.getClass().getSimpleName());
  }
}
