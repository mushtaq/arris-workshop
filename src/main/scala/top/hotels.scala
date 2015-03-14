package top

sealed trait Day
case object Weekday extends Day
case object Weekend extends Day

sealed trait Customer
case object Regular extends Customer
case object Rewards extends Customer

case class Booking(customer: Customer, day: Day)

case class BookingRequest(customer: Customer, days: Seq[Day]) {
  def bookings = days.map(day => Booking(customer, day))
}

case class Hotel(name: String, rating: Int, rates: Map[Booking, Int]) {
  def costOf(bookingRequest: BookingRequest) = {
    bookingRequest.bookings.foldLeft(0)((sum, booking) ⇒ sum + rates(booking))
    bookingRequest.bookings.map(rates).sum
  }
}

case class HotelDb(hotels: Hotel*) {
  def findBestHotel(bookingRequest: BookingRequest) = {
    hotels.minBy(hotel => (hotel.costOf(bookingRequest), -hotel.rating)).name
  }
}
