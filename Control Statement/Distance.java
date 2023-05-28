public class Distance {
    // Given the coordinates of two points (x1,y1) and (x2,y2). 
    //Write a program to find the distance between these two points?
    public static void main(String[] args) {
        int x1=4,y1=2;
        int x2=6,y2=3;
        double dist=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("the distance is:  "+dist);

        
    }
    
}
