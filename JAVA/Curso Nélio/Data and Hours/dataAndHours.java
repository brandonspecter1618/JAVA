//DATA AND HOURS

package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();

        Instant date3 = Instant.now();

        System.out.println("Data: " + date1.toString());
        System.out.println("Data and Hours: " + date2.toString());
        System.out.println("Data 3: " + date3.toString());
    }
}