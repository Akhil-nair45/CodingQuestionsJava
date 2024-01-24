package ToStringHashcode;
// this is an example to know what is the usage of tostring and hashcode as we know if we dont override hascode and tostring method in the class where we have assign the variable then it will give output like Laptop@7a81197d so in order to get the proper output we have to override tostring and hascode methods in clsas where we have decalare the variables

class Laptop{
    String brand;
    int price;

    // this is why we r doing this as we have written above
    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }


    // for hashcode and eqauls method

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    

    
}
public class toStringhashcode1 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand="Dells";  //change it to dell and this will change to true from false 
        l.price=18922;
        System.out.println(l);

        //  now we want to know the usage of hashcode so we have to now let us create a second object and let the name be same and lets compare both the ojects so we can do it lije this 
        Laptop l2 = new Laptop();
        l2.brand="Dell";
        l2.price=18922;
        System.out.println(l2);
        
        // now we r comapring both objects
        boolean result = l==l2;  //or u can also use .eqauls method 
        boolean result1 = l.equals(l2);
        System.out.println(result);
        System.out.println(result1);
}
}
