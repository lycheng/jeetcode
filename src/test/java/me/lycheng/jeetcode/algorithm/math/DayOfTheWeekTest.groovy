package me.lycheng.jeetcode.algorithm.math

class DayOfTheWeekTest extends GroovyTestCase {

    def solution = new DayOfTheWeek()

    void testIsLeapYear() {
        def cases = [
                1972: true,
                100: false,
                400: true,
                2000: true,
                2004: true,
                2016: true
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.isLeapYear(input))
        }
    }

    void testDayOfTheWeek() {
        def day = 2, month = 1, year = 1971
        def expected = "Saturday"
        assertEquals(expected, solution.dayOfTheWeek(day, month, year))

        day = 1
        month = 1
        year = 1971
        expected = "Friday"
        assertEquals(expected, solution.dayOfTheWeek(day, month, year))

        day = 18
        month = 7
        year = 1999
        expected = "Sunday"
        assertEquals(expected, solution.dayOfTheWeek(day, month, year))

        day = 29
        month = 2
        year = 2016
        expected = "Monday"
        assertEquals(expected, solution.dayOfTheWeek(day, month, year))
    }
}
