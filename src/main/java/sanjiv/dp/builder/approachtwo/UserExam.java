package sanjiv.dp.builder.approachtwo;

import java.security.InvalidParameterException;



/*
* This class is being created using Builder design pattern.
*/
public class UserExam {
    private int english_mark;
    private int maths_mark;
    private int science_mark;

    private UserExam(){

    }

    public static UserExamBuilder newBuilder(){
        return new UserExamBuilder();
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


    public static class UserExamBuilder {
        private int english_mark;
        private int maths_mark;
        private int science_mark;

        public UserExamBuilder setEnglish_mark(int english_mark) {

            this.english_mark = english_mark;
            return this;
        }

        public UserExamBuilder setMaths_mark(int maths_mark) {

            this.maths_mark = maths_mark;
            return this;
        }

        public UserExamBuilder setScience_mark(int science_mark) {

            this.science_mark = science_mark;
            return this;
        }

        public UserExam build(){
            //Step 1 : do attribute validation if any before creating object
            if(this.english_mark > 100 || this.maths_mark >100 || this.science_mark >100){
                throw new InvalidParameterException("Marks can not be more than 100");
            }

            UserExam ue = new UserExam();
            ue.english_mark = this.english_mark;
            ue.maths_mark = this.maths_mark;
            ue.science_mark = this.science_mark;
            return ue;
        }
    }
}
