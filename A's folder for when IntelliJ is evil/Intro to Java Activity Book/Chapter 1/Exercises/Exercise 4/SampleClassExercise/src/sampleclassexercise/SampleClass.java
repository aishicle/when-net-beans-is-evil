
package sampleclassexercise;

/*
 * @author Aish
 */
public class SampleClass {
    public int counter = 1;
    
   public void display() {
       System.out.println(counter);
   }
   
    public static void main(String[] args) {
        SampleClass counter = new SampleClass();
        counter.display();
    }
   
}
