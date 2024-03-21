package edu.tucn.ispse.lecture5.ex3anonymous.ex31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Radu Miron
 * @version 1
 */
public class ButtonClickHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new Win();
    }
}
