public class Shapes {
    public static void main(String[] args) {
      Turtle Joe = new Turtle();
        // Task 1: Draw a regular shape
        for(int i =1; i<= 5; i++) {
         Joe.forward(22);
         Joe.left(72);
         }
         Joe.up();
         Joe.left(180);
         Joe.forward(128);
         Joe.down();


        // Task 2: Draw a regular shape many times
        for(int i=1; i<=10; i++) {
            for(int m = 1; m<=5; m++){
            Joe.forward(22);
            Joe.left(72);
            }
            Joe.up();
            Joe.right(9);
            Joe.forward(50);
            Joe.down();
            }
           

        // Task 3: How many times does Turtle turn!
        Joe.up();
        Joe.right(90);
        Joe.forward(135);
        Joe.down();
        int sum = 0;
        for(int i=1; i<=5; i++){
            for(int m=1; m<=5; m++){
            Joe.forward(22);
            Joe.left(72);
            sum++;
            }
            Joe.up();
            Joe.right(9);
            Joe.forward(50);
            Joe.down();
            sum++;
            
            }
            System.out.println("Joe turned " + sum + " times"); 


        // Extension 1:


        // Extension 2:

    }
}
