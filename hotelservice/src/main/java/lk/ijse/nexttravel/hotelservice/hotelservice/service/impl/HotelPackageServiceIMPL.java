/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 5:08 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.service.impl;

import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelPackageDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelPackageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HotelPackageServiceIMPL implements HotelPackageService {
    @Override
    public HotelPackageDTO saveHotelPackage(HotelPackageDTO hotelPackageDTO) {
        return null;
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
