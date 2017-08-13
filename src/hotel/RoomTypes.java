package hotel;

public class RoomTypes {
    String name;
    int regPrice, salePrice, maxOccup, NoOfRooms, NoOfVacancies; 
     RoomTypes(String Name, int RegularPrice, int SalePrice,  int MaximumOccupancy, int NumberOfRooms,  int NumberOfVacancies){
         name=Name;
         regPrice=RegularPrice;
         salePrice=SalePrice; 
         maxOccup=MaximumOccupancy; 
         NoOfRooms=NumberOfRooms; 
         NoOfVacancies=NumberOfVacancies;
     } 
    String  getName(){
        return name;
    }
    int getRegularPrice(){
        return regPrice;
    } 
    int getSalePrice(){
        return salePrice;
    }
    void setSalePrice(int newPrice){
        salePrice=newPrice;
    } 
    int getMaximumOccupancy(){
        return maxOccup;
    }
    int getNumberOfRooms(){
        return NoOfRooms;
    }
    int getNumberofVacancies(){
        return NoOfVacancies;
    } 
    
    public String toString(){
        return this.getName();
    } 
}
