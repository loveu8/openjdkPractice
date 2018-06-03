package openjdkPractice.common;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public enum DataManger {
  
  un;
  
  private LinkedHashMap<String , LinkedList<CostData>> datas; 
  
  public void addCostData(String name , CostData data) {
    if(datas == null) {
      datas = new LinkedHashMap<String , LinkedList<CostData>>();
    }
    if(datas.get(name) == null) {
      datas.put(name, new LinkedList<CostData>());
    }
    datas.get(name).add(data);
  }
  
  public void getAvgCostTime() {
    for(String key : datas.keySet()) {
      long totalCostTime = 0;
      long totalMemory = 0;
      for(CostData data : datas.get(key)) {
        totalCostTime = totalCostTime + data.getTime();
        totalMemory = totalMemory + data.getMemory();
      }
      // normal
//      System.out.println("type : " + key + 
//                         "\t, avgCostTime : " + (totalCostTime / datas.get(key).size()) + 
//                         "\t, avgMemory : " + (totalMemory / datas.get(key).size()) );
      // table td
      System.out.println("<tr><td>" + key + 
                         "</td><td>" + (totalCostTime / datas.get(key).size()) + 
                         "</td><td>" + (totalMemory / datas.get(key).size())+"</td></tr>" );
    }
  }
}
