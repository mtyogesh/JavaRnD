package com.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

  public static void main(String[] args) throws Exception {
    String src = "D:/ignite/master/ignite-firstrain-orion";
    String target = "D:/poms";

    File srcDir = new File(src);

    for (File pf : srcDir.listFiles()) {
      if (pf.isDirectory()) {
        for (File f : pf.listFiles()) {
          if (f.getName().endsWith("pom.xml")) {
            InputStream in = new FileInputStream(f);
            OutputStream out = new FileOutputStream(target + "/pom" + pf.getName() + ".xml");
            // Copy the bits from instream to outstream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
              out.write(buf, 0, len);
            }
            in.close();
            out.close();

          }
        }
      }
    }
  }
}
