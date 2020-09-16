package com.vacatime.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "booking")
public class Booking {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "booking")
    private String booking;

    @Column(name= "customer_id")
    private int customerid;

    @Column(name =  "package_id")
    private int packageid;

    public Booking() {
        super() ;
    }

    Booking(String booking, int customerid, int packageid){
        super();
        this.booking = booking;
        this.customerid = customerid;
        this.packageid = packageid;
    }     


    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getPackageid() {
        return packageid;
    }

    public void setPackageid(int packageid) {
		this.packageid = packageid;
    }
}
