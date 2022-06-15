package sanjiv.dp.builder.approachtwo;
/*
 * Client code to create object using builder pattern.
 */
public class ExamAdmin {

    public static void main(String[] args) {
        UserExam ue = UserExam.newBuilder()
                        .setEnglish_mark(20)
                        .setMaths_mark(70)
                        .setScience_mark(40)
                        .build();

        System.out.println("English Mark :"+ue.getEnglish_mark());
        System.out.println("Maths Mark :"+ue.getMaths_mark());
        System.out.println("Science Mark :"+ue.getScience_mark());
    }
}
