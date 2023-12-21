package methodoverloading;

public class Calculations {
    public void add(int a, int b){
      //code

    }
    public void add(int a, int b, int c){
       //code
    }

    public static void main(String[] args) {
        Calculations calculations=new Calculations();
        calculations.add(1,2);
        calculations.add(1,2,3);
    }
}
