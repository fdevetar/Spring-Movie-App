package com.spring.boot.movie.app.model;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)
    private Long addressId;

    @Basic
    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Basic
    @Column(name = "address2", length = 50)
    private String address2;

    @Basic
    @Column(name = "district", nullable = false, length = 20)
    private String district;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Basic
    @Column(name = "postal_code", nullable = false, length = 10)
    private String postalCode;

    @Basic
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Basic
    @Lob
    @Column(name = "location", columnDefinition = "Geometry")
    private Blob location;

    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public Address() {

    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Blob getLocation() {
        return location;
    }

    public void setLocation(Blob location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", district='" + district + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}