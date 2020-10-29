package exersice1;

public class Singers {

    // five fields
     int id;
     String name;
     String address;
     String dateOfBirth;
     short numberOfAlbums;

    // six constructors
    public Singers(){

    }
    public Singers(String name){
        setName(name);
    }
    public Singers(String name, int id){
        setName(name);
        setId(id);
    }
    public Singers(String name, int id, String address){
        setName(name);
        setId(id);
        setAddress(address);
    }
    public Singers(String name, int id, String address, String dateOfBirth){
        setName(name);
        setId(id);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
    }
    public Singers(String name, int id, String address, String dateOfBirth, short numberOfAlbums){
        setAllSingerData(id, name, address, dateOfBirth, numberOfAlbums);
    }

    // five setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setNumberOfAlbums(short numberOfAlbums){
        this.numberOfAlbums = numberOfAlbums;
    }
    // one setter to set all the values
    public void setAllSingerData(int id, String name, String address, String dateOfBirth, short numberOfAlbums){
      this.id = id;
      this.name = name;
      this.address = address;
      this.dateOfBirth = dateOfBirth;
      this.numberOfAlbums = numberOfAlbums;
    }
    // six getters
    public int getId(int id){
        return id;
    }
    public String getName(String name){
        return name;
    }
    public String getAddress(String address){
        return address;
    }
    public String getDateOfBirth(String dateOfBirth){
        return dateOfBirth;
    }
    public short getNumberOfAlbums(short numberOfAlbums){
        return numberOfAlbums;
    }

    // toString method
    public String toString(){
        return "\nID: " + id + "\nName: " + name + "\nAddress: " + address + "\nDOB: " + dateOfBirth + "\nNumber of albums: " + numberOfAlbums;
    }


}
