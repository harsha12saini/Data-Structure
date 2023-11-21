public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }
          //harsha 22csu081
    public static void main(String[] args) {
        int numDisks = 3; 
        towerOfHanoi(numDisks, 'A', 'B', 'C');
    }
}
