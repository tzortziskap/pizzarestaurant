/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import peoplecert.entity.Orders;

/**
 *
 * @author tzortziskapellas
 */
public class OrdersRepo extends HibernateUtil<Orders> implements CrudInt<Orders>{

    @Override
    public Orders find(int id) {
        return super.find(Orders.class, id);
    }

    @Override
    public List<Orders> findall() {
        return findAll("Orders.findAll");
    }
    public Orders save(Orders orders){
        return super.save(orders);
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Orders.class, id);
    }
    
}
