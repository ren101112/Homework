public class loops {
    public static void main(String[] args) {
        new loops();

    }

    public loops() {
        countUp();
        countByThree();
        countDown();
        nestedLoop();

    }

    public void countUp() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }

    public void countByThree() {
        for (int x = 3; x < 16; x = x + 3) {
            System.out.print(x + " ");

        }


    }

    public void countDown() {
        System.out.println();
        for (int y = 10; y > 0; y--) {
            System.out.print(y+", ");

        }
        System.out.println("happy new year!");


    }
    public void nestedLoop(){
        for (int z=1;z<6;z++){
            for (int n=1;n<=z;n++){
                System.out.print(z);

            }
            System.out.println();
        }


    }


}