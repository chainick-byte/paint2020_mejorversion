/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * @author xp
 */
public class Pentagono extends Forma{
    
    public Pentagono(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, 5, _color, _relleno);
    }
    // hay que decir que cuando creamos el pentagono en _lados es 5
}
