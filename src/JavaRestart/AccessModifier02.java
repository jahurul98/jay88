package JavaRestart;

public class AccessModifier02 {

    //Now create an object for AccessModifier01 to Access what's in that class
    public static void main(String[] args) {

        AccessModifier01  a1 = new AccessModifier01();
        System.out.println(a1.hours);
        System.out.println(a1.Minutes);
        System.out.println(a1.Name);
    }


}
