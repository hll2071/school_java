public class array {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;

        //2
        int[] array2;
        array2 = new int[3];
        array2[0] = 10;
        array2[1] = 20;
        array2[2] = 30;

        //3
        int[] array3 = new int[]{3,4,5};

        //3-1
        int[] array4;
        array4 = new int[]{3,4,5};

        //4
        int[] array5 = {3,4,5};
        //5 불가능
        int[] array6;
        //array6={3,4,5};

        int[][] score = new int[5][];
        score[0] = new int[]{100,100,100,100};
        score[1] = new int[]{20,20,20};
        score[2] = new int[]{30,30};
        score[3] = new int[]{40,40};
        score[4] = new int[]{50,50,50};
        System.out.println(score.length);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
