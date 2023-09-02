package PrototypeAndRegistry;

public class TopperStudent extends Student {

    private float cgpa;

    public TopperStudent(){}

    public TopperStudent(TopperStudent ts){
        super(ts);
        this.cgpa = ts.cgpa;
    }

    @Override
    public Student clone() {
        return new TopperStudent(this);
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}

