import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

/*
if some changes - you create a new class (MIMentor), in implements interface and you override the method
Here you create an object and call for method
Loosely Coupled

BUT you need to create an object and pass it  --> not convinient
Spring gives a solution
 */
public class CybertekApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);
        mentor.manageAccount();     //Full Time Mentor account is created.

        PartTimeMentor partTime = new PartTimeMentor();
        MentorAccount mentor2 = new MentorAccount(partTime);
        mentor2.manageAccount();    //Part Time Mentor account is created.
    }
}
