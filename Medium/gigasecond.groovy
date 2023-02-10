import java.time.LocalDateTime
import java.time.LocalDate
class Gigasecond {

    // YOUR CODE HERE
    // HINT: methods that don't change the state of an object can be 'static'
    static add(LocalDate now) {
        add now.atStartOfDay()
    }
    static add(LocalDateTime Gig) {
        Gig + 1000000000
    }
}
