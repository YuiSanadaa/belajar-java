/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn10.aplikasi.hotel.aplikasihotel.entity;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;


/**
 *
 * @author XIGNZhefir
 */
@Entity
public class Hotel {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid2")
    @Column(columnDefinition = "Varchar(36)")
    private String id;

    @Column(nullable = false)
    private String nama_hotel;

    @Lob
    @Type(type = "text")
    @Column(columnDefinition = "TEXT",nullable = false)
    private String alamat;

    @Column(nullable = false)
    private String hotel_bintang;

    @Column(nullable = false)
    private String no_telp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_hotel() {
        return nama_hotel;
    }

    public void setNama_hotel(String nama_hotel) {
        this.nama_hotel = nama_hotel;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHotel_bintang() {
        return hotel_bintang;
    }

    public void setHotel_bintang(String hotel_bintang) {
        this.hotel_bintang = hotel_bintang;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
}
