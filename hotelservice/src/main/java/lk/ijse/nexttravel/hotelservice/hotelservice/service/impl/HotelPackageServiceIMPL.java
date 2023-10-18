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
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelPackageService;
import lk.ijse.nexttravel.hotelservice.hotelservice.util.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return convertor.getHotelPackageDTO(hotelPackageDAO.save(convertor.getHotelPackageEntity(hotelPackageDTO)));
    }

    @Override
    public HotelPackageDTO getHotelPackage(String id) {
        return null;
    }

    @Override
    public void deleteHotelPackage(String id) {

    }

    @Override
    public void updateHotelPackage(String id) {

    }
}
