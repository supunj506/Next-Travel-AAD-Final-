/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:13 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.util;

import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelPackageDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.entity.Hotel;
import lk.ijse.nexttravel.hotelservice.hotelservice.entity.HotelPackage;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Convertor {
    private final ModelMapper modelMapper;

    public Convertor(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public HotelDTO getHotelDTO(Hotel hotel){
        return modelMapper.map(hotel, HotelDTO.class);
    }

    public Hotel getHotelEntity(HotelDTO hotelDTO){
        return modelMapper.map(hotelDTO, Hotel.class);
    }

    public HotelPackageDTO getHotelPackageDTO(HotelPackage hotelPackage){
        return modelMapper.map(hotelPackage, HotelPackageDTO.class);
    }

    public HotelPackage getHotelPackageEntity(HotelPackageDTO hotelPackageDTO){
        return modelMapper.map(hotelPackageDTO, HotelPackage.class);
    }
}
