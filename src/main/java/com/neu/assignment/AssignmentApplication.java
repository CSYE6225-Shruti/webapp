package com.neu.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AssignmentApplication {

    public static void main(String[] args) {

        SpringApplication.run(AssignmentApplication.class, args);

        /* code use to generate salt */
//        final Random r = new SecureRandom();
//        byte[] salt = new byte[32];
//        r.nextBytes(salt);
//
//        String encodedKey = Base64.getEncoder().encodeToString(salt);
//        System.out.println(encodedKey);
//
//        System.out.println("salt:");
//        for (byte s: salt) {
//            System.out.print(s);
//        }
    }


//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public void getResponse(){
//        return ;
//    }

}
