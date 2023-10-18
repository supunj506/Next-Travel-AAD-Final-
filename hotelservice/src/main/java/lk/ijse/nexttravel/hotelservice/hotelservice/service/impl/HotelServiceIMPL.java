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
import lk.ijse.nexttravel.hotelservice.hotelservice.entity.Hotel;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelService;
import lk.ijse.nexttravel.hotelservice.hotelservice.util.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
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

            hotelDTO.setH_id(UUID.randomUUID().toString());
            return convertor.getHotelDTO(hotelDAO.save(convertor.getHotelEntity(hotelDTO)));

    }

    @Override
    public HotelDTO getSelectHotel(String id) {
        Optional<Hotel> byId = hotelDAO.findById(id);
        if(byId.isPresent()){
            return convertor.getHotelDTO(hotelDAO.getReferenceById(id));
        }else {
            throw new RuntimeException("not found");
        }

    }

    @Override
    public void updateHotel(HotelDTO hotelDTO) {
        Optional<Hotel> byId = hotelDAO.findById(hotelDTO.getH_id());
        if(byId.isPresent()){
            byId.get().setH_name(hotelDTO.getH_name());
            byId.get().setH_starRate(hotelDTO.getH_starRate());
            byId.get().setH_location(hotelDTO.getH_location());
            byId.get().setH_map(hotelDTO.getH_map());
            byId.get().setH_email(hotelDTO.getH_email());
            byId.get().setH_contact01(hotelDTO.getH_contact01());
            byId.get().setH_contact02(hotelDTO.getH_contact02());
            byId.get().setH_cancellation(hotelDTO.getH_cancellation());
            byId.get().setH_petStatus(hotelDTO.getH_petStatus());
        }else {
            throw new RuntimeException("Not Found");
        }


    }

    @Override
    public void deleteHotel(String id) {

        Optional<Hotel> byId = hotelDAO.findById(id);
        if(byId.isPresent()){
            hotelDAO.delete(hotelDAO.getReferenceById(id));
        }else {
            throw new RuntimeException("Not Found");
        }

    }


}
