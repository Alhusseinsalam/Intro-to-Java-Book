package ch18.recursion;

public class TowerOfHanoi {
    static final char DISK_A = 'A';
    static final char DISK_B = 'B';
    static final char DISK_C = 'C';

    public static void main(String[] args) {
        moveDisks(10, DISK_A, DISK_B, DISK_C);
    }

    public static void moveDisks (int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Moving disk " + n + " from " + fromTower + " to " + toTower);
        } else {
            moveDisks(n-1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n-1, auxTower, toTower, fromTower);
        }
    }


}
