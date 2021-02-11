/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peoplecert.entity.Size1;
import peoplecert.repository.Size1Repo;

/**
 *
 * @author tzortziskapellas
 */
@Transactional
@Service
public class Size1Service {
    
    @Autowired
    private Size1Repo size1Repo;
    

    public List<Size1> getSize1s() {
        List<Size1> size1s = size1Repo.findall();
        return size1s;
    }

    public void addSize1(Size1 size1) {
        size1Repo.save(size1);
    }

    public void deleteSize1(int id) {
        size1Repo.delete(Size1.class, id);
    }

    public Size1 getSize1ById(int ccode) {
        return size1Repo.find(ccode);
    }

    public Size1 updateSize1(Size1 size1) {//size1 argument contains the new data from the form
        return size1Repo.save(size1);
    }
}
