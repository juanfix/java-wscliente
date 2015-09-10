/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
/**
 *
 * @author JuanJo
 */
public class FechaHora extends JLabel{
    
    java.util.Calendar calendario; 
    int dia, mes, año, hora, minutos, segundos; 
    
    public void fecha(final JLabel nombreLabel) 
    { 
    calendario = new java.util.GregorianCalendar(); 
    segundos = calendario.get(Calendar.SECOND); 
    javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() { 
    @ Override 
    public void actionPerformed(java.awt.event.ActionEvent ae) { 
    java.util.Date actual = new java.util.Date(); 
    calendario.setTime(actual); 
    dia = calendario.get(Calendar.DAY_OF_MONTH); 
    mes = (calendario.get(Calendar.MONTH) + 1); 
    año = calendario.get(Calendar.YEAR);  
    String date = String.format("%02d / %02d / %02d", dia, mes, año); 
    nombreLabel.setText("<html><center>" + date); 
       } 
    }); 
    timer.start(); 
    } 
    
    public void hora(final JLabel nombreLabel) 
    { 
    calendario = new java.util.GregorianCalendar(); 
    segundos = calendario.get(Calendar.SECOND); 
    javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() { 
    @ Override 
    public void actionPerformed(java.awt.event.ActionEvent ae) { 
    java.util.Date actual = new java.util.Date(); 
    calendario.setTime(actual); 
    hora = calendario.get(Calendar.HOUR_OF_DAY); 
    minutos = calendario.get(Calendar.MINUTE); 
    segundos = calendario.get(Calendar.SECOND); 
    String hour = String.format("%02d : %02d : %02d", hora, minutos, segundos); 
    nombreLabel.setText("<html><center>" + hour); 
       } 
    }); 
    timer.start(); 
    }
    
}
