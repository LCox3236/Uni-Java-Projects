package createfiles;
 import java.io.*;

  public class CreateFiles {

      public static void main(String args []) throws Exception {

          File dum = new File("N:/cosine/tweedle-dum.txt");

          File dee = new File("tweedle-dee.txt");

          dum.createNewFile();

          dee.createNewFile();
      }
  }