public class Q29_SurviveMonkey {
    /* Task->
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas =30, survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("maymun gunde 4 muz yer..");
        do {
            numberOfBananas = numberOfBananas - 4;
            System.out.println("kalan muz sayisi->" + numberOfBananas);
            survivalDays++;
            if (numberOfBananas <= 0){
                monkeyAlive= false;
                System.out.println(survivalDays+ ". gün,maymun öldü");
            }else {
                System.out.println(survivalDays+ ".gün,maymun hala hayatta");
            }

        }while (monkeyAlive);


    }
}

