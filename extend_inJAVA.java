class grade{
    int engGrade;
    int mathGrade;
    int koreanGrade;

    void setEngGrade(int engGrade) { this.engGrade = engGrade; }
    void setMathGrade(int mathGrade) { this.mathGrade = mathGrade; }
    void setKoreanGrade(int koreanGrade) { this.koreanGrade = koreanGrade; }

    void printGrade(){
        System.out.println("engGrade : " + engGrade);
        System.out.println("mathGrade : " + mathGrade);
        System.out.println("koreanGrade : " + koreanGrade);
    }
}

class student extends grade{
    String name;
    void setName(String name) { this.name = name; }
    void printGradeWithName(){
        System.out.println("name : " + name);
        printGrade();
    }
}

public class extend_inJAVA {
    public static void main(String[] args) {
        student student1 = new student();
        student1.setName("Gildong");
        student1.setEngGrade(100);
        student1.setKoreanGrade(90);
        student1.setMathGrade(80);
        student1.printGradeWithName();
    }
}