//**************************************************************************************************
// CLASS: Student
//
// DESCRIPTION
// Student is an abstract class and is the superclass for the OnCampusStudent and OnlineStudent
// classes. Remember that in a class hierarchy, the superclass declares data and methods that are
// common to all types of students.
//
// GROUP: G
// AUTHOR 1: Addison Corey, tjcorey, addison.corey@asu.edu
// AUTHOR 2: Keatyn Garton, kgarton, kgarton@asu.edu
// AUTHOR 3: Jonathan Kilgore, jpkilgor, jpkilgor@asu.edu
//**************************************************************************************************
public abstract class Student implements Comparable<Student> {

    String Id;
    String FirstName;
    String LastName;
    double Tuition;
    int Credits;
    /**
     * Student constructor that initializes the mId, mFirstName, and mLastName instance
     * variables.
     */
    public Student(String pId, String pFirstName, String pLastName) {
        this.Id = pId;
        this.FirstName = pFirstName;
        this.LastName = pLastName;
    }

    /**
     * Abstract method of calcTuition
     */
    public void calcTuition(){

    }

    /**
     * Overrides compareTo method from Comparable Interface
     */
    @Override
    public int compareTo(Student pStudent) {
        return getId().compareTo(pStudent.getId());
    }

    public String getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getTuition() {
        return Tuition;
    }

    public int getCredits() {
        return Credits;
    }

    public void setId(String pId) {
        this.Id = pId;
    }

    public void setFirstName(String pFirstName) {
        this.FirstName = pFirstName;
    }

    public void setLastName(String pLastName) {
        this.LastName = pLastName;
    }

    public void setTuition(double pTuition) {
        this.Tuition = pTuition;
    }

    public void setCredits(int pCredits) {
        this.Credits = pCredits;
    }
}

