package service;

/*
mantor - is it fullTime or partTime - ?  Can be any
Loosely coupled
If any changes - it does not matter (we just create a class)
 */
import implementation.Mentor;

public class MentorAccount {

    Mentor mentor;  //composition

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void manageAccount() {
        this.mentor.createAccount();
    }
}
