package top

import org.scalatest.{MustMatchers, FunSuite}

class HotelDbTest extends FunSuite with MustMatchers {

  val hotelDb = HotelDb(
    Hotel("Lakewood", 3, Map(
      Booking(Regular, Weekday) -> 110,
      Booking(Rewards, Weekday) -> 80,
      Booking(Regular, Weekend) -> 90,
      Booking(Rewards, Weekend) -> 80
    )),
    Hotel("Bridgewood", 4, Map(
      Booking(Regular, Weekday) -> 160,
      Booking(Rewards, Weekday) -> 110,
      Booking(Regular, Weekend) -> 60,
      Booking(Rewards, Weekend) -> 50
    )),
    Hotel("Ridgewood", 5, Map(
      Booking(Regular, Weekday) -> 220,
      Booking(Rewards, Weekday) -> 100,
      Booking(Regular, Weekend) -> 150,
      Booking(Rewards, Weekend) -> 40
    ))
  )

  test("1") {
    hotelDb.findBestHotel(
      BookingRequest(Regular, Seq(Weekday, Weekday, Weekday))
    ) mustEqual "Lakewood"
  }

  test("2") {
    hotelDb.findBestHotel(BookingRequest(Regular, Seq(Weekday, Weekend, Weekend))) mustEqual "Bridgewood"
  }

  test("3") {
    hotelDb.findBestHotel(BookingRequest(Rewards, Seq(Weekday, Weekday, Weekend))) mustEqual "Ridgewood"
  }

}
