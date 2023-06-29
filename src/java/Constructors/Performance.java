package Constructors;

public class Performance {
    public int marks = 590;
    public double psp = 98.45;

    /*default constructor should be decalred if it is being called and we have already
    implemented a constructor then it is needed to declare a default as the defalut one
    will be gone  after you created any constructor method*/

    public Performance (){
        this.marks = 50;
        this.psp = 80;
    }

    public Performance (Performance performance) {
        this.marks = performance.marks;
    }
}
