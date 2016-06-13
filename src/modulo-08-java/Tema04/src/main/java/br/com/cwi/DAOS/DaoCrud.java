/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.DAOS;

import java.util.List;

/**
 *
 * @author FERNANDO
 */
public interface DaoCrud {
    void add(Object o);
    void update(Object o);
    void delete(Object o);
    List<Object> listAll();
}
