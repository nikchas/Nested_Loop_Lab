package NestedLoopLab;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String command = scanner.nextLine();

        int totalTickets = 0;
        int student = 0;
        int standard = 0;
        int kids = 0;


        while (true){
            String movie = scanner.nextLine();
            if (movie.equals("Finish")){
                break;
            }

            int capacity = Integer.parseInt(scanner.nextLine());

            int countTicketOneMovie = 0;
            int countFreeSeats = capacity;

            while (countFreeSeats > 0){
                String type = scanner.nextLine(); //"student", "standard", "kid", "End"

                if (type.equals("End")){
                    break;
                }

                switch (type){
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }

                countFreeSeats--;
                countTicketOneMovie++;
            }

            totalTickets = totalTickets + countTicketOneMovie;

            double percentTakenSeats = (countTicketOneMovie * 1.0) / capacity * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentTakenSeats);

        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets *100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets *100);
        System.out.printf("%.2f%% kids tickets.%n", kids * 1.0 / totalTickets *100);

    }
}