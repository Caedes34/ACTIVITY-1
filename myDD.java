
public class myDD {
    
    public static void main(String[] args) {
        

        int cents = 0;
        int dollars = 0;
        int increment_cent = 86400;
        int day_count = 0; 
        int days_total = 365;
        

        // we want to know how many we will earn in every second of years 
        // increment cent and dollar for every 100 cents 
        for(; day_count < days_total; day_count++){
                cents += increment_cent;

                while (cents >= 100) {

                    dollars++;
                    cents -= 100;
                    
                }

                }

                System.out.println("cent count ;" + cents);
                System.out.println("Dollar count: " + dollars);
                System.out.println("Day: " + day_count);
                


        }

            




    }
