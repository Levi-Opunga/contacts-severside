package dev.levi.webclient.constants;


import dev.levi.webclient.models.TripleDes;

public class C {
  public static TripleDes tripleDes;

    static {
        try {
            tripleDes = new TripleDes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
