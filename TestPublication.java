package Lab06;

public class TestPublication {
    public static void main(String[] args) {
        Publication[] publications = new Publication[10] ;

        publications[0] = new Magazine("Mavel comic" , "Spiderman" , 30 , 3.0 , "Monthly");
        publications[1] = new Magazine();
        publications[2] = new Magazine("DC comic" , "Aquaman" , 30 , 3.0 ,"weekly");
        publications[3] = new Book();
        publications[4] = new Book("null" , "null" , 0 , 0 , "J.R.R Tolkein");

        for(Publication p : publications) {
            System.out.println();
            p.print();
        }


        
    }
}
