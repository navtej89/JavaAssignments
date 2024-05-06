public class compile {
    public static void main(String[] args) {
        int[][] arr = {{3, 2, 1}, {8, 9, 10}};
        int[][] p = new int[2][];

        p[0] = arr[0];
        p[1] = arr[1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j]);
            }
            System.out.println();
        }
    }
}
