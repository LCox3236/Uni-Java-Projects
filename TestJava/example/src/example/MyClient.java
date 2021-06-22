package example;
 import java.rmi.registry.*;

  public class MyClient {

      public static void main(String [] args) throws Exception {

          Registry reg = LocateRegistry.getRegistry("148.197.117.215", 1234) ;
          MyRemoteInterface handle =
                  (MyRemoteInterface) reg.lookup("myrmiserver");

          handle.printMessage("Wassup!");
      }
  }