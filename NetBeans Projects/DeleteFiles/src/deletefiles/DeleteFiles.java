package deletefiles;
import java.io.*;

  public class DeleteFiles {

      public static void main(String args []) throws Exception {

          File dum = new File("N:/cosine/tweedle-dum.txt");

          File dee = new File("tweedle-dee.txt");

          dum.delete();

          dee.delete();
      }
  }