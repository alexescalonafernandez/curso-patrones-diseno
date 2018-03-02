/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.datys.patterns.gof.behavioral.visitor.component;

/**
 *
 * @author alexander.escalona
 */
public interface IComposite extends IComponent {
    boolean add(IComponent child);
    boolean remove(IComponent child);
}
