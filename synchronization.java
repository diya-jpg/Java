class BookTheaterSeat{
    int total_seats=10;
   synchronized void bookSeat(int seats){
        if(seats<=total_seats){
            System.out.println(seats+" seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println("Remaining seats: "+total_seats);
    }
    else{
        System.out.println("Sorry, not enough seats available");
        System.out.println("seats left: "+total_seats);
    }
}}
public class synchronization extends Thread {
    static BookTheaterSeat b; 
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
        public static void main(String[]args){
b=new BookTheaterSeat();
synchronization s1=new synchronization();
s1.seats=7;
s1.start();
synchronization s2=new synchronization();
s2.seats=6;
s2.start();
    }
}
