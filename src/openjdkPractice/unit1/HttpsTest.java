package openjdkPractice.unit1;

import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import openjdkPractice.common.Cost;
import openjdkPractice.common.DataManger;
import openjdkPractice.common.Unit;

/**
 * <pre>
 * Java Https Crt import
 * 
 * File : resource\googlecomtw.crt
 * 
 * # password : changeit
 * cd C:\project\java\openjdk\bin
 * keytool -import -trustcacerts -keystore C:\project\java\openjdk\lib\security\cacerts -file C:\project\java\openjdk\googlecomtw.crt -alias googleTwServer
 * </pre>
 */
public class HttpsTest {
  public static void main(String[] args) {
    // https test
    DataManger dataManger = DataManger.un;
    for(int index = 0 ; index < 10 ; index ++) {
      new OldHttps().test();
      new NewHttps().test();
    }
    dataManger.getAvgCostTime();
  }
}


class OldHttps extends Cost {
  public void test() {
    try {
      SSLContext ssl = SSLContext.getInstance("TLSv1.2");
      ssl.init(null, null, new SecureRandom());
      for (int index = 0; index < Unit.TEN.time(); index++) {
        URL url = new URL("https://www.google.com.tw");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setSSLSocketFactory(ssl.getSocketFactory());
        conn.connect();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    super.finish(this.getClass().getSimpleName());
  }
}


class NewHttps extends Cost {
  public void test() {
    try {
      var ssl = SSLContext.getInstance("TLSv1.2");
      ssl.init(null, null, new SecureRandom());
      for (var index = 0; index < Unit.TEN.time(); index++) {
        var url = new URL("https://www.google.com.tw");
        var conn = (HttpsURLConnection) url.openConnection();
        conn.setSSLSocketFactory(ssl.getSocketFactory());
        conn.connect();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    super.finish(this.getClass().getSimpleName());
  }
}
