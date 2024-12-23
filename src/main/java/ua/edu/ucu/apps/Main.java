package ua.edu.ucu.apps;

import java.util.List;

import ua.edu.ucu.apps.task1.Student;
// import ua.edu.ucu.apps.task2.BirthdayMailCode;
// import ua.edu.ucu.apps.task2.Client;
// import ua.edu.ucu.apps.task2.MailInfo;
// import ua.edu.ucu.apps.task2.MailSender;
// import ua.edu.ucu.apps.task2.MailCode;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder().firstName("Mia")
                                            .lastName("Shopiak")
                                            .gender("female")
                                            .courses(List.of("Mat analiz"))
                                            .course("P&S")
                                            .build();

        System.out.println(student);

        // Client client = Client.builder()
        //                             .name("Mia")
        //                             .age(19)
        //                             .email("shopiak.pn@ucu.edu.ua")
        //                             .build();

        // MailCode mailCode = new BirthdayMailCode();

        // MailInfo mailInfo = new MailInfo(client, client1 -> "Just a random mail!");

        // MailSender mailSender = new MailSender();
        // mailSender.sendMail(mailInfo);
    }
    
}