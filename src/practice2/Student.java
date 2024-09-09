package practice2;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    public Student(String name, int ban, int no, int kor, int eng , int mat){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = mat;
    }
    public Student() {}
    public String info() {
        double avg = (kor+eng+math)/3.0;
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+","+ (kor+eng+math) + ","+String.format("%.1f",avg);
    }
    public int getTotal() {
        return kor+eng+math;
    }
    public String getAverage() {
        return String.format("%.1f",(kor+eng+math)/3.0);
    }
}
