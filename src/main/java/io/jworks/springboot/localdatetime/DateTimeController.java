package io.jworks.springboot.localdatetime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateTimeController {

    @GetMapping("/time")
    public DateTimeDto timeMapping() {
        return new DateTimeDto();
    }

    @GetMapping("/formatted")
    public DateTimeDto formattedTimeMapping() {
        return new FormattedDateTimeDto();
    }
}
