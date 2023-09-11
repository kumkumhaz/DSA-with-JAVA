public class Student{
    int rollNo;
    String studentName;
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo = 3;
        obj1.studentName = "raj";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2 = new Student();
        obj2.rollNo = 30;
        obj2.studentName = "manav";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);

    }
}