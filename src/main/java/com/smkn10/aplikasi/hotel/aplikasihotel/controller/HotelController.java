/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn10.aplikasi.hotel.aplikasihotel.controller;
import com.smkn10.aplikasi.hotel.aplikasihotel.dao.HotelDao;
import com.smkn10.aplikasi.hotel.aplikasihotel.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/**
 *
 * @author XIGNZhefir
 */
@Controller
@RequestMapping(value = "/hotel")
public class HotelController {

    @Autowired
    private HotelDao hotelDao;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("listHotel", hotelDao.findAll());
        return "list";
    }

    @PostMapping("/saveForm")
    public String saveForm(Hotel hotel) {
        hotelDao.save(hotel);
        return "redirect:/hotel/list";
    }

    @GetMapping("/deleteHotel")
    public String deleteHotel(@RequestParam("id") String id) {
        Optional<Hotel> opHotel = hotelDao.findById(id);
        if (opHotel.isPresent()) {
            hotelDao.delete(opHotel.get());
        }
        return "redirect:/hotel/list";
    }

    @GetMapping("/form")
    public String showForm(Model model, @RequestParam(required = false) String id) {
        Hotel m = new Hotel();
        if (id != null) {
            Optional<Hotel> opHotel = hotelDao.findById(id);
            if (opHotel.isPresent()) {
                m = opHotel.get();
            }
        }
        model.addAttribute("hotel", m);
        return "form";
    }
}

