/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

/**
 *
 * @author tzortziskapellas
 * @param <E>
 */
public interface CrudInt<E> {
    
    E save( E e);
    E find(int id);
    
    
}
