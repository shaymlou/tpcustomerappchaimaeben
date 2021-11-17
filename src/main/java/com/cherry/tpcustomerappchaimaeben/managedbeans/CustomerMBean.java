/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.cherry.tpcustomerappchaimaeben.managedbeans;

import com.cherry.tpcustomerappchaimaeben.entities.Customer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import com.cherry.tpcustomerappchaimaeben.session.CustomerManager;
import static java.time.Clock.system;

/**
 *
 * @author HP
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {

    private List<Customer> customers;

    @EJB
    private CustomerManager customerManager;

    public CustomerMBean() {
    }

    public List<Customer> getCustomers() {
       
        if (customers == null) {
            customers = customerManager.getAllCustomers();
        }
        return customers;
    }

}
