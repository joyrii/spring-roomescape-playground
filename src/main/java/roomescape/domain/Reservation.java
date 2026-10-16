package roomescape.domain;

import roomescape.exception.InvalidReservationException;

public class Reservation {
    private final Long id;
    private final String name;
    private final String date;
    private final String time;

    public Reservation(
            Long id,
            String name,
            String date,
            String time
    ) {
        validate(name, date, time);
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    private void validate(
            String name,
            String date,
            String time
    ) {
        if (name == null || name.isBlank()) {
            throw new InvalidReservationException("이름은 비어 있을 수 없습니다.");
        }
        if (date == null || date.isBlank()) {
            throw new InvalidReservationException("날짜는 비어 있을 수 없습니다.");
        }
        if (time == null || time.isBlank()) {
            throw new InvalidReservationException("시간은 비어 있을 수 없습니다.");
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
