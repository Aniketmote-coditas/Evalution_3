package Evalution_3;
class Student{
    private int sid;
    private String sname;
    private String saddress;
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }



}
class Teacher{
    private int tid;
    private String tname;
    private String taddress;
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }


}
public class Student_techer_Q5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSid(12);
        s.setSname("aniket");
        s.setSaddress("pune");
        System.out.println(s.getSid());
        System.out.println(s.getSname());
        System.out.println(s.getSaddress());
        System.out.println();


        Teacher t = new Teacher();
        t.setTid(123);
        t.setTname("aarthi");
        t.setTaddress("mumbai");

        System.out.println(t.getTid());
        System.out.println(t.getTname());
        System.out.println(t.getTaddress());

    }
}

/*
12
aniket
pune

123
aarthi
mumbai

 */
