public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(4, 1, 2, 3);
    }

    static void toh(int n, int sor, int help, int dest) {

        if(n == 1) {
            System.out.printf("Move disk %d from %d to %d.", n, sor, dest);
            System.out.println();
            return;
        }

        // Move n - 1 disks from source to helper
        toh(n - 1, sor, dest, help);
        System.out.printf("Move disk %d from %d to %d.", n, sor, dest);
        System.out.println();

        // Move n - 1 disks from helper to destination
        toh(n - 1, help, sor, dest);
    }
}
