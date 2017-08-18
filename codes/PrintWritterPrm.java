///home/bridgeit/eclipse-workspace/Demo

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class PrintWritterPrm {

  public static void main(String[] args) throws IOException {

    File file = new File ("C:/home/bridgeit/eclipse-workspace/Demo/file.txt");
    PrintWriter printWriter = new PrintWriter ("file.txt");
    printWriter.println ("hello");
    printWriter.close ();       
  }
}