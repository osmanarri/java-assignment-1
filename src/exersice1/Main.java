package exersice1;

public class Main {

    public static void main(String[] args) {

        // singer1 object
        Singers singer1 = new Singers();
        singer1.id = 123;
        singer1.name = "Michael";
        singer1.address = "10 Pharmacy ave";
        singer1.dateOfBirth = "1992-10-04";
        singer1.numberOfAlbums = 12;
        System.out.println("=========================");
        System.out.println("Singer #1\nID: "+singer1.id+ "\nName: "+singer1.name+
                "\nAddress: "+singer1.address+ "\nDOB: "+singer1.dateOfBirth+
                "\nNumber of albums: "+singer1.numberOfAlbums);
        System.out.println("=========================");

        Singers singer2 = new Singers("John",219, "231 Jarvis St.");
        System.out.println("Singer #2" + singer2);
        System.out.println("=========================");
    }
}
