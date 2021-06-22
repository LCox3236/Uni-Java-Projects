package randomaccess;
import java.io.* ;

  public class RandomAccess {

      public static void main(String [] args) throws Exception {

          RandomAccessFile rand = new RandomAccessFile("N:/cosine/tweedle-dum.txt", "rw");
        
          byte buffer [] = new byte [100] ;

          String text = "Shoes and ships and sealing wax." ;
          
          rand.seek(100);

          byte buffer2 [] = text.getBytes();
          
          int numBytesRead = rand.read(buffer) ;
          
          System.out.println(new String(buffer)) ;
          
          rand.write(buffer2);
      }
  }
