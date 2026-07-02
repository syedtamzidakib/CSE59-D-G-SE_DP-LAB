interface Printer{
    void printdoc();
}

interface Scanner{
    void scandoc();
}
interface Faxmachine{
    void faxdoc();
}
class Multifunctioncopier implements Printer, Scanner , Faxmachine{
    @Override
    public void printdoc(){
        System.out.println("Printing...");
    
}
    @Override
    public void scandoc(){
        System.out.println("Scanning...");
    
}
    @Override
    public void faxdoc(){
        System.out.println("Faxing...");
    
}
}
class Basicprinter implements Printer{
    @Override
    public void printdoc(){
        System.out.println("Printing...");
    
}
}
public class Main2 {
    public static void main(String[] args) {
        Multifunctioncopier copier = new Multifunctioncopier();
        
        copier.printdoc();
        copier.scandoc();
        copier.faxdoc();
        System.out.println();
        
        Basicprinter printer = new Basicprinter();
        printer.printdoc();
        
    }
    
}

