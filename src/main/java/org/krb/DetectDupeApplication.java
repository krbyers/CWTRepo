package org.krb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application class for spring boot.
 */
@SpringBootApplication
@ComponentScan("org.krb")
public class DetectDupeApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DetectDupeApplication.class, args);
    }
}
