import java.text.DecimalFormat;
import java.util.ArrayList;
class Exercise {

    String excerciseName;
    String Description;
    int Duration;
    String Position;

    //Constructor
    public Exercise(String excerciseName, String Description, int Duration, String Position) {
        this.excerciseName = excerciseName;
        this.Description = Description;
        this.Duration = Duration;
        this.Position = Position;

    }

        //creating Printing Method
        public void printExercise() {
            System.out.println(excerciseName + "                  " + "DURATION: " + Duration +"secs");
            //create pattern to format description
            String pattern = "---------------------------------------------------------";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            //apply Format
            String format = decimalFormat.format(Duration);

            // Question for Trainer : How can i put pattern on the string?? Decimalformating only work on decimals??


            System.out.println(format);
            System.out.println("DESCRIPTION:" + Description);
        }

    @Override
    public String toString() {
        return "Exercise{" +
                "excerciseName='" + excerciseName + '\'' +
                ", Description='" + Description + '\'' +
                ", Duration=" + Duration +
                ", Position='" + Position + '\'' +
                '}';
    }

    // Create Six objects
        public static void main(String[] args) {
            Exercise Pushups = new Exercise("Pushups", "Place Your Hands on the Floor. Raise up onto your toes so that all your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to the starting position.", 30, "Floor");
            Exercise Squats = new Exercise("Squats", "Stand with the feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, "Standup");
            Exercise Planks = new Exercise("Planks", "Start on the Floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "Floor");
            Exercise BlackwardKlick = new Exercise("Backward Klick", "Get in an all-fours position with your knees and hands on the floor. your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "Floor");
            Exercise LegCurl = new Exercise("Leg Curl", "Stand up on, shift your weight to one feet and pull another heel toward your buttocks. Stayfor 15 seconds, then repeat with your other leg.", 90, "Standup");
            Exercise Sidewards = new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, "Standup");

            //Putting the objects into an arrayList
            ArrayList<Exercise> Exercises = new ArrayList<>();
            Exercises.add(Pushups);
            Exercises.add(Squats);
            Exercises.add(Planks);
            Exercises.add(BlackwardKlick);
            Exercises.add(LegCurl);
            Exercises.add(Sidewards);

            for (Exercise elements : Exercises) {
                elements.printExercise(); //Calling Printing Method
            }

            //Created a new loop and print only Exercises on that are the floor
            System.out.println("\nExercises which have position on Floor");
            for (Exercise elements : Exercises) {
                if (elements.Position == "Floor") {
                    System.out.println(elements);
                }
            }
         // New loop For printing Exercises which are on Floor as well as duration time more than a minute
            System.out.println("\nExercises which are on floor as well as duration time more than a minute.");
            for (Exercise elements : Exercises) {
                if (elements.Position == "Floor" && elements.Duration>60) {
                    System.out.println(elements);
                }
            }

        }
}










