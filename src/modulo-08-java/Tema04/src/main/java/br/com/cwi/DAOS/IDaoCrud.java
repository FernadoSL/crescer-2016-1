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
public interface IDaoCrud<G>  {
    void add(G g);
    void update(G g);
    void delete(G g);
    List<G> listAll();
}
