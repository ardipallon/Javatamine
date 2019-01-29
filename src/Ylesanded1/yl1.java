package Ylesanded1;

public class yl1 {
    public static void main(String[] args) {
        int suurus = 10;
        for(int x = 0; x < suurus; x++){
            for(int y = 0; y < suurus; y++){
                System.out.format("%2d", suurus - 1 - Math.max(x, y));
            }
            System.out.println();
        }
    }
}