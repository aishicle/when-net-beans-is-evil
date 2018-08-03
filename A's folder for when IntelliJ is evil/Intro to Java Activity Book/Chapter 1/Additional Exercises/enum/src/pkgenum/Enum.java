
package pkgenum;

    enum directions{East,West,north,south};
    public class Enum {
   
    public static void main(String[] args) {
        System.out.println();
     for(directions dir:directions.values())
        System.out.print(dir);
        
    }
    
}

