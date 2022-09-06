package JavaRestart;

class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}
class Robin extends Bird{
    public void sing(String sing){
        System.out.println("twiddle twiddle");
    }

}



public class polymorphism {
    public static void main(String[] args) {
        Robin r =  new Robin();
        r.sing();

    }


}
