package sanjiv.dp.builder.approachone;

public class UserExam {
    private int english_mark;
    private int maths_mark;
    private int science_mark;

    public UserExam(UserExamParameter uep){
        this.english_mark = uep.getEnglish_mark();
        this.maths_mark = uep.getMaths_mark();
        this.science_mark = uep.getScience_mark();

    }

    public int getEnglish_mark() {
        return english_mark;
    }

    public int getMaths_mark() {
        return maths_mark;
    }

    public int getScience_mark() {
        return science_mark;
    }
}
