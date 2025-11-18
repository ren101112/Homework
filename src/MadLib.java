// new class called madlib
public class MadLib {

    // main method
    public static void main(String[] args) {
        new MadLib();   // runs the constructor
    }


    public MadLib() {//constructor



        String classmate = "Gabe";
        String city = "Chicago";
        String noun = "Chair";
        String adjective = "complex";
        String pluralNoun = "jackets";
        String pluralAnimal = "frogs";
        boolean trueOrFalse = false;
        double decimalBiggerThan1 = 1.5;
        int number1 = 14;
        int number2 = 3;
        int wholeNumberBetween1And4 = 2;
        String miltonTeacher = "Dr Bachelor";
        String miltonDean = "Dr Calen";
        char letterGrade = 'F';
        String season = "fall";


        String story = "This weekend I am going camping with " + classmate + ". We are going to a campsite in "
                + city + ". I packed my " + noun + " and " + pluralNoun + ". The forecast is calling for a high of "
                + decimalBiggerThan1 + " degrees fahrenheit. So it should be a " + adjective + " day! This year, the park rangers have seen "
                + number1 + " " + pluralAnimal + " which seems kind of dangerous. "
                + miltonTeacher + " said it's " + trueOrFalse + " that " + pluralAnimal + " eat class "
                + wholeNumberBetween1And4 + " students in the " + season + ". But, "
                + miltonDean + " said it actually has only happened "
                + number2 + " times. Wish us luck! If we survive, we will earn a "
                + letterGrade + "- in P.E. class.";


        System.out.println(story);
    }
}
