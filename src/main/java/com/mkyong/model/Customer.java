package com.mkyong.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "customer")
public class Customer {

    //http://www.oracle.com/technetwork/middleware/ias/id-generation-083058.html
    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_GENERATOR")
    // @SequenceGenerator(sequenceName = "seq_customer", initialValue = 1, allocationSize = 1, name = "CUST_GENERATOR")
    Long id;

    String name;
    // String email;
    //
    // //@Temporal(TemporalType.DATE)
    // @Column(name = "CREATED_DATE")
    // Date date;

    // public Customer(String name, String email, Date date) {
    //     this.name = name;
    //     this.email = email;
    //     this.date = date;
    // }
    //
    // public Customer() {
    // }
    //
    // @Override
    // public String toString() {
    //     return "Customer{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             ", email='" + email + '\'' +
    //             ", date=" + date +
    //             '}';
    // }


}
