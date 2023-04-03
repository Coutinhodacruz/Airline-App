package airline;

public class DacruzAir {
    private  boolean [] seats;
    private final int firstClassTicketBooking = 1;
    public DacruzAir(){
        int numberOfSeatsOnPlane = 10;
        this.seats = new boolean[numberOfSeatsOnPlane];
    }
    public boolean[] getSeats() {
        return seats;
    }

    public void bookTicket(int bookingCategory) {
        if (bookingCategory == firstClassTicketBooking ){
            for (int counter = 0; counter < seats.length-5; counter++) {
                boolean isOccupiedSeat = seats[counter];
                if (!isOccupiedSeat) {
                    seats[counter] = true;
                    break;
                }

            }
        }else {
            for (int counter = 5; counter <seats.length ; counter++) {
                boolean isOccupiedSeat = seats[counter];
                if (!isOccupiedSeat){
                    seats[counter] = true;
                    break;
                }

            }
        }

    }
}
