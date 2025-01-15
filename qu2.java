class Teacher {
    private String tname;
    private String subject;
    private int exp;

  
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int yrexp) {
        this.yrexp = yrexp;
    }
}

class Student {
    private String sname;
    private String degree;
    private String college;


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

class Relationship {   

    
    public static void setTeacherDetails(Teacher t, String tname, String subject, int yrexp) {
        t.setTname(tname);
        t.setSubject(subject);
        t.setYrsOfExp(yrexp);
    }

   
    public static void setStudentDetails(Student s, String sname, String degree, String college) {
        s.setSname(sname);
        s.setDegree(degree);
        s.setCollege(college);
    }

    public static void TeacherStudent(Teacher t, Student s) {
        System.out.println(s.getSname() + " takes " + s.getDegree() + " class under " + t.getTname() + " Sir");
    }

    public static void TeacherStudentDetails(Teacher t, Student s) {
        System.out.println(t.getTname() + " Sir teaches " + t.getSubject() + " to " + s.getSname() +
            " reading as " + s.getDegree() + " in " + s.getCollege() + " college");
    }

    public static void main(String[] args) { 
        Teacher t = new Teacher();
        setTeacherDetails(tea, "Amitava", "OOPS DESIGN", 10);  

        Student s1 = new Student();
        setStudentDetails(stud1, "Ankan", "Java", "UEM");  

        Student s2 = new Student();
        setStudentDetails(stud2, "Madhu", "Btech", "UEM");  

        
        TeacherStudent(t, s1);
        TeacherStudentDetails(t, s2);
    }
}