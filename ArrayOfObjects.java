class Student {
    int rollNo;
    String name;
    int marks;
}

class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 20;
        s1.name = "Sada";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 21;
        s2.name = "Rahul";
        s2.marks = 70;

        Student s3 = new Student();
        s3.rollNo = 22;
        s3.name = "Shyam";
        s3.marks = 97;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }
    }
}