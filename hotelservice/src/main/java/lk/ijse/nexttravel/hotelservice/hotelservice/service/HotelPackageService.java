/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 5:03 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.service;

import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelPackageDTO;

public interface HotelPackageService {
    HotelPackageDTO saveHotelPackage(HotelPackageDTO hotelPackageDTO);
    HotelPackageDTO getHotelPackage(String id);
    void deleteHotelPackage(String id);
    void updateHotelPackage(String id);
}
