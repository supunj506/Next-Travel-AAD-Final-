/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 5:21 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.api;

import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelPackageDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotelPackage")
@CrossOrigin("*")
public class HotelPackageController {
    @Autowired
    private final HotelPackageService hotelPackageService;

    public HotelPackageController(HotelPackageService hotelPackageService) {
        this.hotelPackageService = hotelPackageService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    HotelPackageDTO saveHotel(@RequestBody HotelPackageDTO hotelPackageDTO){
        return hotelPackageService.saveHotelPackage(hotelPackageDTO);
    }
    @GetMapping(value = "{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    HotelPackageDTO getHotelPackage(@PathVariable String id){
        return hotelPackageService.getHotelPackage(id);
    }
    @DeleteMapping(value =  "{id}")
    void deleteHotelPackage(@PathVariable String id){
        hotelPackageService.deleteHotelPackage(id);
    }





}
