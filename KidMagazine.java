package Lab06;

public class KidMagazine extends Publication {
    private int age ;

public KidMagazine() {

}
    
public KidMagazine(String publisher , String title , int page , double price , int age) {
    super(publisher , title , page , price);
    this.age = age ;
}

public int getAge() {
    return age ;
}

public void setAge() {
    this.age = age ;
}

@Override
public void print() {
    super.print();
    System.out.println("The rate ages to read This KidsMagazine is " + this.age + " Years");
}
}
