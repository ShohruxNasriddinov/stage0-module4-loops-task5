package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i, j, k;

        for (i = 1; i <= height; i+=2) {
            for (j = 1; j < i; j+=2) {
                System.out.print(' ');
            }

            for (k = i; k <= height; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
        for (i = height - 1; i >= 1; i-=2) {
            for (j = 1; j < i; j+=2) {
                System.out.print(' ');
            }
            for (k = i; k <= height; k++) {
                System.out.print("8");
            }

            System.out.println();
        }
    }
}
