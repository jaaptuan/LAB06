
package Lab06;

public class Book extends Publication{
    private String author ;

public Book() {

}

public Book(String publisher , String title , int page , double price , String author) {
    super(publisher , title , page , price);
    this.author = author ;
}

public String getAuthor() {
    return author ;
}

public void setAuthor() {
    this.author = author ;
}

@Override
public void print(){
    super.print();
    System.out.println("This bbok has written by " + this.author );
}
    
}
