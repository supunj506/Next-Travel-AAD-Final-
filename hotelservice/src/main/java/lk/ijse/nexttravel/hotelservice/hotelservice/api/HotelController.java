/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:27 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.api;

import lk.ijse.nexttravel.hotelservice.hotelservice.dto.HotelDTO;
import lk.ijse.nexttravel.hotelservice.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotel")
@CrossOrigin("*")
public class HotelController {

    @Autowired
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    HotelDTO saveHotel(@RequestBody HotelDTO hotelDTO){
        return  hotelService.saveHotel(hotelDTO);
    }

    @GetMapping(value = "{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    HotelDTO getHotel(@PathVariable String id){
        return hotelService.getSelectHotel(id);
    }

    @DeleteMapping(value =  "{id}")
    void deleteHotel(@PathVariable String id){
        hotelService.deleteHotel(id);
    }

    @PatchMapping(consumes = "application/json")
    void updateHotel(@RequestBody HotelDTO hotelDTO){hotelService.updateHotel(hotelDTO);
    }





}
