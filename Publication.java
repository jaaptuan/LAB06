package Lab06;

public class Publication {
    private String publisher ;
    private String title ;
    private int page ;
    private double price ;

public Publication() {

}

public Publication(String publisher , String title , int page , double price) {
    this.publisher = publisher ;
    this.title = title ;
    this.page = page ;
    this.price = price ;
}

public void print() {
    System.out.println("The " + this.publisher + " publisher " + this.title + " , " + this.page + " page , " + this.price + " Bahts.");
}
    
}
