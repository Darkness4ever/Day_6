import java.util.*;

/**
 * Created by mahapata on 7/11/2017.
 */

class Address {
    private String streetName;
    private String city;
    private String zipCode;

    Address(String streetName,String city,String zipCode){
        this.streetName=streetName;
        this.city=city;
        this.zipCode=zipCode;

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString(){
        return  streetName + city+ zipCode;
    }
}
public class TreeAssg1 {

    public static void main(String[] agrs) {
        MyComp o=new MyComp();
        Address ob=new Address("Hitech City ","Hyd","60192");
        Address ob1=new Address("Kondapur","Hyd","09087");
        Address ob2=new Address("Gachibowli","Hyd","0990090");
        TreeMap<Address,String> t=new TreeMap<>(o);
        t.put(ob,"Rudra");
        t.put(ob1,"Ansh");
        t.put(ob2,"Sunny");

        Set s=t.entrySet();
        Iterator i=s.iterator();
        while (i.hasNext()) {
            Map.Entry m=(Map.Entry)i.next();
            System.out.println("Key " +m.getKey() + " Value: " + m.getValue());
        }
    }
}

class MyComp implements Comparator<Address> {
    public int compare(Address str1, Address str2) {
        return str1.getStreetName().compareTo(str2.getStreetName());
        //return str2.compareTo(str1);
       // return str1.length()-str2.length();
    }
}

