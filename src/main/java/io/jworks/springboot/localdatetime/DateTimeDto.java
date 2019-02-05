package io.jworks.springboot.localdatetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDto {

    private LocalDate localDate;
    private LocalDateTime localDateTime;
    private LocalTime localTime;

    public DateTimeDto(Clock clock) {
        localDate = LocalDate.now(clock);
        localDateTime = LocalDateTime.now(clock);
        localTime = LocalTime.now(clock);
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }
}
