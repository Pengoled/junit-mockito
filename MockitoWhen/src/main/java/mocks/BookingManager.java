package mocks;

import java.util.List;

public class BookingManager {
    
    private HotelDao dao;

    public BookingManager(HotelDao dao) {
        this.dao = dao;
    }

    public boolean checkRoomAvailability(String roomName) {
        List<String> availableRooms = dao.fetchAvailableRooms();
        return availableRooms.contains(roomName);
    }
}
