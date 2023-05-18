import java.util.Scanner;

public class Stadium {

   private final String nameStadium ;
    Scanner scanner = new Scanner(System.in);

    public  Stadium(String name){
        this.nameStadium = name;
    }

    public void  getNameStadium() {
        System.out.println(nameStadium);

    }
    public void choice() {
        Helpers.choiseHelper();
        int input = scanner.nextInt();

        if(input == 1){
            System.out.println("1");
            BuyTickets.freePlaces();

        }
        if(input == 2){
            System.out.println("2");
        }
        if(input == 3){
            System.out.println("3");
        }
        if(input == 4){
            System.out.println("4");
        }































    }















































}
