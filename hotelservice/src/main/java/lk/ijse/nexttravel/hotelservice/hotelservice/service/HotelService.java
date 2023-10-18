/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:07 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.service;


import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelDTO;

public interface HotelService {
    HotelDTO saveHotel (HotelDTO hotelDTO);
    HotelDTO getSelectHotel(String id);
    void updateHotel(HotelDTO hotelDTO);
    void deleteHotel(String id);
}
