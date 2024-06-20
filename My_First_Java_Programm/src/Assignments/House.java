package Assignments;

public class House {

    public static void main(String[] args)
    {
        Room r = new Room();

        addRooms("Room1", 50);
        addRooms("Room2", 100);
        addRooms("Room3", 150);
    }

   public static class Room {
        int area = 2000;
        String name = "room1";
    }

    public static void addRooms(String n, int a) {
        Room room = new Room();
        room.name = n;
        room.area = a;
        System.out.println( n + " has area " + a);
    }
}
