package sanjiv.dp.builder.approachone;

public class ExamAdmin {

    public static void main(String[] args) {
        UserExamParameter uep = new UserExamParameter();
        uep.setEnglish_mark(20);
        uep.setMaths_mark(50);
        uep.setScience_mark(70);

        UserExam ue = new UserExam(uep);
        System.out.println("English Mark :"+ue.getEnglish_mark());
        System.out.println("Maths Mark :"+ue.getMaths_mark());
        System.out.println("Science Mark :"+ue.getScience_mark());
    }
}
