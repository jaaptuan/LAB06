package Lab06;

public class Magazine extends Publication {
    private String unit ;

public Magazine() {

}

public Magazine(String publisher , String title , int page , double price , String unit) {
    super(publisher , title , page , price);
    this.unit = unit ;
}

public String getUnit() {
    return unit ;
}

public void setUnit() {
    this.unit = unit ;
}

@Override
public void print() {
    super.print();
    System.out.println("This magazine is " + this.unit + " Print");
}

    
}
