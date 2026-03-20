// https://exercism.org/tracks/java/exercises/booking-up-for-beauty

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "M/d/yyyy HH:mm:ss"
        );
        LocalDateTime dateTime = LocalDateTime.parse(
            appointmentDateDescription,
            formatter
        );
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "EEEE, MMMM d, yyyy, 'at' h:mm a"
        );

        String formatted = appointmentDate.format(formatter);
        return "You have an appointment on " + formatted + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
