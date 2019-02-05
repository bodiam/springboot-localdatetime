package io.jworks.springboot.localdatetime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

@RestController
public class DateTimeController {

    private Clock clock = Clock.fixed(Instant.parse("2019-02-05T16:45:42.01Z"), ZoneId.of("Australia/Sydney"));

    @GetMapping("/time")
    public DateTimeDto timeMapping() {
        return new DateTimeDto(clock);
    }

    @GetMapping("/formatted")
    public DateTimeDto formattedTimeMapping() {
        return new FormattedDateTimeDto(clock);
    }
}
