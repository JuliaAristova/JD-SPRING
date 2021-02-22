/*
Coupling - how objects interact with each other
Tightly coupling is not good for development - difficult to make changes.
Bad practice for frameworks
If some changes - new type of Mentor:
- you need to create a new class
- you need to add object in this class
- you need to update constructor
- in method (manageAccount) you also need to add an action
 */

public class CybertekApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor parttime = new PartTimeMentor();

        //mentor has dependencies to fullTime and partTIme objects
        Mentor mentor = new Mentor(fullTime, parttime);
        mentor.manageAccount();
    }
}
