class Student{
    String name;
    int engGrade;
    int mathGrade;

    Student(){
        this("null", 0, 0);
    }

    Student(String name){
        this(name, 0, 0);
    }

    Student(String name, int engGrade, int mathGrade){
        this.name = name;
        this.engGrade = engGrade;
        this.mathGrade = mathGrade;
    }

    // 인스턴스의 복사를 위한 생성자를 만들어보자!
    Student(Student student){
        name = student.name;
        engGrade = student.engGrade;
        mathGrade = student.mathGrade;
    }

}

public class prClass1 {
    public static void main(String[] args) {
        Student st1 = new Student("Gildong", 90, 95);
        Student st2 = new Student(st1);

        System.out.println(st1.name + " " +  st1.engGrade + " " + st1.mathGrade);
        System.out.println(st2.name + " " +  st2.engGrade + " " + st2.mathGrade); // 윗줄과 같은 값 출력, 왜냐면 st1를 복사한 게 st2
    }
}
