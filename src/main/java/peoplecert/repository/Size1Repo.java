/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import peoplecert.entity.Size1;

/**
 *
 * @author tzortziskapellas
 */
@Repository
public class Size1Repo extends HibernateUtil<Size1> implements CrudInt<Size1>{

    @Override
    public Size1 find(int id) {
        return super.find(Size1.class, id);
    }

    @Override
    public List<Size1> findall() {
        return super.findAll("Size1.findAll");
    }
    
    @Override
    public Size1 save(Size1 size1){
        return super.save(size1);
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Size1.class, id);
    }
}
