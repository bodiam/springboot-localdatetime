package io.jworks.springboot.localdatetime;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormattedDateTimeDto extends DateTimeDto {

    public FormattedDateTimeDto(Clock clock) {
        super(clock);
    }

    @Override
    @JsonFormat(pattern="dd-MM-yyyy")
    public LocalDate getLocalDate() {
        return super.getLocalDate();
    }

    @Override
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    public LocalDateTime getLocalDateTime() {
        return super.getLocalDateTime();
    }

    @JsonFormat(pattern="yyyy-MM-dd")
    public LocalDateTime getLocalDateTimeFormatted() {
        return super.getLocalDateTime();
    }

    @Override
    @JsonFormat(pattern="HH:mm")
    public LocalTime getLocalTime() {
        return super.getLocalTime();
    }
}
