/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:09 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.service.impl;

import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HotelServiceIMPL implements HotelService {
    @Override
    public HotelDTO saveHotel(HotelDTO hotelDTO) {

        return null;
    }

    @Override
    public HotelDTO getSelectHotel(String id) {
        return null;
    }

    @Override
    public void updateHotel(HotelDTO hotelDTO) {

    }

    @Override
    public void deleteHotel(String id) {

    }
}
