package Acesspacl;

import JavaRestart.AccessModifier01;
// this mean  if Accessmod03 is a sublcass of the orignal means they're related

public class AccessModifier03 extends AccessModifier01 {

    public static void main(String[] args) {
        AccessModifier03 a3 = new AccessModifier03();              // has to be Access through the subclass
        System.out.println(a3.hours);
        System.out.println(a3.Minutes);
        System.out.println(a3.Name);
    }
}
