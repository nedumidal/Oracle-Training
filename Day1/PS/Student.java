record  StudentRecord(String name ,String rollno,int marks)
{
    String getGrade()
    {

        switch(marks)
        {
            case (marks > 95) : return "O";

            case (marks <=95 && marks >85) : return "A";

            case (marks <= 75 && marks >65) : return "B";

            case (marks <= 65 && marks > 55) : return "C";

            default : return "U";
                
        }
    }
}

public class Student
{
    public static void main(String args[])
    {
        StudentRecord s1 = new StudentRecord("Nishanth","23ALR060",70);

        StudentRecord s2 = new StudentRecord("Gopi","23ALR027",90);

        System.out.printf("Name : %s%nRoll No: %s%nMark : %d%nGrade : %s", s1.name(), s1.rollno(), s1.marks(),s1.getGrade());
    }
}