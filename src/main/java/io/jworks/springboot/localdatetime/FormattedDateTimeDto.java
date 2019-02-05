package io.jworks.springboot.localdatetime;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormattedDateTimeDto extends DateTimeDto {

    @Override
    @JsonFormat(pattern="dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    public LocalDate getLocalDate() {
        return super.getLocalDate();
    }

    @Override
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    public LocalDateTime getLocalDateTime() {
        return super.getLocalDateTime();
    }

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    public LocalDateTime getLocalDateTimeFormatted() {
        return super.getLocalDateTime();
    }

    @Override
    @JsonFormat(pattern="HH:mm")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    public LocalTime getLocalTime() {
        return super.getLocalTime();
    }
}
