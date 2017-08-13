package hotel;

public class Hotel {
    ID1234567 id;
    String Hname,address;
    int starRating,numRoomTypes;
    
    Hotel(String Name,String Address,int StarRating,int NumRoomTypes){
        Hname=Name;
        address=Address;
        starRating=StarRating;
        numRoomTypes=NumRoomTypes;
        
    }
    
    RoomTypes[] Rooms=new RoomTypes[5];
    int cnt=0;
    String getName(){
        return Hname;
    }
    
    String getAddress(){
        return address;
    }
    
    int getStarRating(){
        return starRating;
    }
    
    int  getNumRoomTypes(){
        return numRoomTypes;
    }
    
    RoomTypes getRoomType(int RoomTypeNo){
        return Rooms[RoomTypeNo];
    }
    
    Boolean setRoomType(RoomTypes room){
    try{   
        Rooms[cnt]=room;
        cnt++;
    }catch(NullPointerException npe){
        
    }
        return true;
    }
    
    public String toString(){
         RoomTypes room = null;
         return room.getName();
     }        
    
}



