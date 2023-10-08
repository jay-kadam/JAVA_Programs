class Student
{
    int rollNo;
    String StudentName;
    static int objC=0;
    Student(int rno, String name)
    {
        this();
        this.rollNo =rno;
        this.StudentName=name;
    }

    public String toString()
    {
        return ("\nStudent Roll No: "+rollNo+"\nStudentName: "+StudentName);
    }

    Student()
    {
        objC++;
        System.out.println("Count: "+objC);
    }
}
class tstringmethod
{
    public static void main(String[] args)
    {
        Student s1 = new Student(101," AAA");
        Student s2 = new Student(102," BBB");
        Student s3 = new Student(103," CCC");
        Student s4 = new Student(104," DDD");
        Student s5 = new Student(105," EEE");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
    }
}