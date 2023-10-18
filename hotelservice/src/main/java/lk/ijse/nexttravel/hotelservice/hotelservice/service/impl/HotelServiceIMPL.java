/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:09 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.service.impl;

import lk.ijse.nexttravel.hotelservice.hotelservice.dao.HotelDAO;
import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelService;
import lk.ijse.nexttravel.hotelservice.hotelservice.util.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class HotelServiceIMPL implements HotelService {
    @Autowired
    private HotelDAO hotelDAO;

    @Autowired
    private Convertor convertor;

    @Override
    public HotelDTO saveHotel(HotelDTO hotelDTO) {
        if(hotelDAO.existsById(hotelDTO.getH_id())){
            throw new RuntimeException("Already in System");
        }else {
            hotelDTO.setH_id(UUID.randomUUID().toString());
            return convertor.getHotelDTO(hotelDAO.save(convertor.getHotelEntity(hotelDTO)));
        }
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
