/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 5:08 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.service.impl;

import lk.ijse.nexttravel.hotelservice.hotelservice.dao.HotelPackageDAO;
import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelPackageDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.entity.HotelPackage;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelPackageService;
import lk.ijse.nexttravel.hotelservice.hotelservice.util.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class HotelPackageServiceIMPL implements HotelPackageService {
    @Autowired
    private HotelPackageDAO hotelPackageDAO;

    @Autowired
    private Convertor convertor;

    @Override
    public HotelPackageDTO saveHotelPackage(HotelPackageDTO hotelPackageDTO) {
        hotelPackageDTO.setHp_id(UUID.randomUUID().toString());
        return setHotelIdToHotelPackageDTO(hotelPackageDAO.save(convertor.getHotelPackageEntity(hotelPackageDTO)));
    }

    @Override
    public HotelPackageDTO getHotelPackage(String id) {
        Optional<HotelPackage> byId = hotelPackageDAO.findById(id);
        if(byId.isPresent()){
            return setHotelIdToHotelPackageDTO(hotelPackageDAO.getReferenceById(id));
        }else {
            throw new RuntimeException("not Found");
        }
    }

    @Override
    public void deleteHotelPackage(String id) {
        Optional<HotelPackage> byId = hotelPackageDAO.findById(id);
        if(byId.isPresent()){
            hotelPackageDAO.delete(hotelPackageDAO.getReferenceById(id));
        }else {
            throw new RuntimeException("Not Found");
        }
    }

    @Override
    public void updateHotelPackage(HotelPackageDTO hotelPackageDTO) {
        Optional<HotelPackage> byId = hotelPackageDAO.findById(hotelPackageDTO.getHp_id());
        if(byId.isPresent()){
            byId.get().setHp_price(hotelPackageDTO.getHp_price());
        }else {
            throw new RuntimeException("not found");
        }
    }

    private HotelPackageDTO setHotelIdToHotelPackageDTO(HotelPackage hotelPackage){
        HotelPackageDTO hotelPackageDTO = convertor.getHotelPackageDTO(hotelPackage);
        hotelPackageDTO.setH_id(hotelPackage.getHotel().getH_id());
        return hotelPackageDTO;
    }
}
