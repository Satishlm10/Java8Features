package DateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesProvider;
import java.util.stream.Collectors;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dateTime = ZonedDateTime.now(losAngeles);
        System.out.println(dateTime);

        System.out.println(ZoneId.getAvailableZoneIds().stream().filter(str->str.contains("Asia/K")).collect(Collectors.toList()));
    }
}
