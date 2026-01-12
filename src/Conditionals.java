public class Conditionals {


    public Conditionals() {


        String question = "Will I pass my CS class?";
        System.out.println(question);


        int randomInt = (int)(Math.random() * 11);

        //else if chain for each possible response
        if (randomInt == 0) {
            System.out.println("Without a doubt.");
        } else if (randomInt == 1) {
            System.out.println("Ask again later.");
        } else if (randomInt == 2) {
            System.out.println("Very doubtful.");
        } else if (randomInt == 3) {
            System.out.println("As I see it yes.");
        } else if (randomInt == 4) {
            System.out.println("Better not tell you.");
        } else if (randomInt == 5) {
            System.out.println("Signs point to yes.");
        } else if (randomInt == 6) {
            System.out.println("Dont count on it.");
        } else if (randomInt == 7) {
            System.out.println("outlook good.");
        } else if (randomInt == 8) {
            System.out.println("try again.");
        } else {
            System.out.println("Absolute not.");
        }
    }

//psvm
    public static void main(String[] args) {
        new Conditionals();
    }
}
