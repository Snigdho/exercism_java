// https://exercism.org/tracks/java/exercises/booking-up-for-beauty

import java.time.LocalDate;
import java.time.LocalDateTime;

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
        throw new UnsupportedOperationException(
            "Please implement the AppointmentScheduler.isAfternoonAppointment() method"
        );
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException(
            "Please implement the AppointmentScheduler.getDescription() method"
        );
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException(
            "Please implement the AppointmentScheduler.getAnniversaryDate() method"
        );
    }
}
