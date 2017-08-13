package hotel;

import java.util.Scanner;

public class ID1234567 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        int choose = 0;
        Hotel[] HotelArr = new Hotel[4];
        RoomTypes[] RoomType = new RoomTypes[11];

        HotelArr[0] = new Hotel("El Grando", "Lakeside Drive, San Diego", 3, 3);
        HotelArr[1] = new Hotel("Ivory Tower", "Pinehill Road, Boston", 4, 3);
        HotelArr[2] = new Hotel("Elite", "Federation Drive, Washington DC", 5, 4);
        HotelArr[3] = new Hotel("Fleabox Motel", "Wrong Side of the Tracks Road, Cleveland", 1, 1);

        RoomType[0] = new RoomTypes("Executive studio", 210, 210, 2, 20, 17);
        RoomType[1] = new RoomTypes("Standard studio", 180, 180, 2, 30, 10);
        RoomType[2] = new RoomTypes("Family room", 220, 200, 4, 10, 2);
        RoomType[3] = new RoomTypes("Executive studio", 235, 235, 2, 5, 3);
        RoomType[4] = new RoomTypes("Standard studio", 205, 205, 2, 12, 0);
        RoomType[5] = new RoomTypes("Super-sized family room", 350, 350, 6, 4, 1);
        RoomType[6] = new RoomTypes("Ultra-luxury suite", 210, 210, 2, 20, 17);
        RoomType[7] = new RoomTypes("Elitist Studio", 210, 210, 2, 20, 17);
        RoomType[8] = new RoomTypes("Penthouse Apartment", 210, 210, 2, 20, 17);
        RoomType[9] = new RoomTypes("Gold-plated Luxury", 210, 210, 2, 20, 17);
        RoomType[10] = new RoomTypes("Sardine Room", 210, 210, 2, 20, 17);

        HotelArr[0].setRoomType(RoomType[0]);
        HotelArr[0].setRoomType(RoomType[1]);
        HotelArr[0].setRoomType(RoomType[2]);
        HotelArr[1].setRoomType(RoomType[3]);
        HotelArr[1].setRoomType(RoomType[4]);
        HotelArr[1].setRoomType(RoomType[5]);
        HotelArr[2].setRoomType(RoomType[6]);
        HotelArr[2].setRoomType(RoomType[7]);
        HotelArr[2].setRoomType(RoomType[8]);
        HotelArr[2].setRoomType(RoomType[9]);
        HotelArr[3].setRoomType(RoomType[10]);

        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.print("\nWelcome to the Hotel Recommendation System Developed by Student Name, Student ID 12346578 for ITECH1000 Semester 1 2017\n ");
        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        while (true) {
            System.out.println("\n******** Main Menu ********* "
                    + "\n Please select an option from the menu:"
                    + "\n 1. Display all hotels "
                    + "\n2. Find cheapest room "
                    + "\n3. Set a sale price "
                    + "\n4. Find rooms matching criteria "
                    + "\n5. Exit System \n");
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    for (int h = 0; h < 4; h++) {
                        for (int i = 0; i < 20; i++) {
                            System.out.print("=");
                        }

                        System.out.print("\n" + HotelArr[h].getName() + "  "+HotelArr[h].getAddress());
                        for (int r = 0; r < HotelArr[h].getStarRating(); r++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                        for (int i = 0; i < 20; i++) {
                            System.out.print("=");
                        }
                        System.out.print("\n");
                        try {
                            for (int t = 0; t < RoomType.length; t++) {
                                System.out.print("\nRoom Type: " + HotelArr[h].getRoomType(t).getName());
                                System.out.print("\nMaximum occupancy: " + HotelArr[h].getRoomType(t).getMaximumOccupancy());
                                System.out.print("\nRegular price: " + HotelArr[h].getRoomType(t).getRegularPrice() + "\n");
                            }
                        } catch (NullPointerException npe) {

                        }
                        System.out.print("\n");
                    }

                    break;
                case 2:
                    System.out.print("\nThe Cheapest rate of Room is available at : ");
                    int LowestSale = 1800;
                    int LowestHotel = 0,
                     LowestRoom = 0;
                    for (int h = 0; h < 4; h++) {
                        for (int r = 0; r < HotelArr[h].getNumRoomTypes(); r++) {
                            if (HotelArr[h].Rooms[r].getSalePrice() <= LowestSale) {
                                LowestSale = HotelArr[h].Rooms[r].getSalePrice();
                                LowestHotel = h;
                                LowestRoom = r;
                            }
                        }
                    }

                    System.out.print(HotelArr[LowestHotel].getName() + "  "+HotelArr[LowestHotel].getAddress());
                    for (int r = 0; r < HotelArr[LowestHotel].getStarRating(); r++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");

                    System.out.print("\nRoom Type: " + HotelArr[LowestHotel].getRoomType(LowestRoom).getName());
                    System.out.print("\nMaximum occupancy: " + HotelArr[LowestHotel].getRoomType(LowestRoom).getMaximumOccupancy());
                    System.out.print("\nRegular price: " + HotelArr[LowestHotel].getRoomType(LowestRoom).getRegularPrice() + "\n");
                    System.out.print("\nSale price: " + HotelArr[LowestHotel].getRoomType(LowestRoom).getSalePrice() + "\n");

                    break;
                case 3:
                    int i;
                    System.out.print("\nSet Your Sale Price: ");
                    String NameOfHotel = null;
                    int NumOfHotel = -1;
                    while (NumOfHotel == -1) {

                        System.out.print("\nEnter the name of the hotel:");
                        NameOfHotel = in.nextLine();

                        for (i = 0; i < 4; i++) {
                            if (NameOfHotel.equals(HotelArr[i].getName())) {
                                NumOfHotel = i;
                            }
                        }
                    }
                    System.out.print("\nTypes of Room available are: ");
                    int type = 0;
                    while (true) {
                        for (int h = 0; h < HotelArr[NumOfHotel].getNumRoomTypes(); h++) {
                            System.out.print("\n" + (h + 1) + ")" + HotelArr[NumOfHotel].Rooms[h].getName());
                        }
                        System.out.print("\nSelect one from Room Types: ");
                        type = in.nextInt() - 1;
                        if (type >= 0 && type <= HotelArr[NumOfHotel].getNumRoomTypes()) {
                            break;
                        }
                    }
                    int GET_SALE = HotelArr[NumOfHotel].getRoomType(type).getSalePrice();

                    System.out.print("\nType of Room: " + HotelArr[NumOfHotel].getRoomType(type).getName());
                    System.out.print("\nMaximum occupancy: " + HotelArr[NumOfHotel].getRoomType(type).getMaximumOccupancy());
                    System.out.print("\nSale price $" + GET_SALE);
                    System.out.print("\nEnter your Sale Price:");
                    int SET_SALE = in.nextInt();
                    if (SET_SALE >= (GET_SALE * 0.5) && SET_SALE <= (GET_SALE)) {
                        HotelArr[NumOfHotel].getRoomType(type).setSalePrice(SET_SALE);
                        System.out.print("\nUpdate Sale Price is: " + HotelArr[NumOfHotel].getRoomType(type).getSalePrice());
                    } else {
                        System.out.print("The Sale Price should be between " + SET_SALE * 0.5 + " and " + SET_SALE);
                    }

                    break;
                case 4:
                    System.out.print("Please enter the criteria which you require. "
                            + "\nMinimum occupancy required: ");
                    int Occupancy = in.nextInt();
                    System.out.print("Minimum star rating required:  ");
                    int Star_Ratings = in.nextInt();
                    System.out.print("Maximum daily price you are willing to pay:");
                    int Room_Price = in.nextInt();
                    int Occupancy_avail,
                     Ratings_avail,
                     Price_avail;
                    System.out.print("\nResults maching the following criteria are shown below:\n");
                    for (i = 0; i < 4; i++) {
                        for (int j = 0; j < HotelArr[i].numRoomTypes; j++) {
                            Occupancy_avail = HotelArr[i].Rooms[j].getMaximumOccupancy();
                            Price_avail = HotelArr[i].Rooms[j].getSalePrice();
                            Ratings_avail = HotelArr[i].getStarRating();

                            if (Occupancy_avail >= Occupancy && Price_avail <= Room_Price && Ratings_avail >= Star_Ratings) {
                                for (int e = 0; e < 20; e++) {
                                    System.out.print("=");
                                }
                                System.out.print("\n" + HotelArr[i].getName() + "  "+HotelArr[i].getAddress());
                                for (int r = 0; r < HotelArr[i].getStarRating(); r++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                                for (int e = 0; e < 20; e++) {
                                    System.out.print("=");
                                }
                                System.out.print("\n");
                                try {
                                    for (int t = 0; t < RoomType.length; t++) {
                                        System.out.print("\nRoom Type: " + HotelArr[i].getRoomType(t).getName());
                                        System.out.print("\nMaximumOccupancy: " + HotelArr[i].getRoomType(t).getMaximumOccupancy());
                                        System.out.print("\nSale Price: " + HotelArr[i].getRoomType(t).getSalePrice() + "\n");
                                    }
                                } catch (NullPointerException npe) {

                                }
                            }
                        }
                    }
                    break;
                case 5:                    
                    System.exit(0);
                    break;
            }
        }
    }
}
