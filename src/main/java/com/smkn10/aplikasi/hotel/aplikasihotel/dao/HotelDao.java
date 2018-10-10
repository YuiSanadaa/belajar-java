/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn10.aplikasi.hotel.aplikasihotel.dao;
import com.smkn10.aplikasi.hotel.aplikasihotel.entity.Hotel;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author XIGNZhefir
 */
@Repository
public interface HotelDao extends PagingAndSortingRepository<Hotel, String> {
    
}
