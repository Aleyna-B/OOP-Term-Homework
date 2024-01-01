/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooptermhw;

/**
 * @author benza
 */
public class OOPTermHw {

    public static void main(String[] args) {
    	MainMenu menu  = new MainMenu(1);
    	while(menu.getController() ==1) {
    	menu.Menu();
    	}
    	menu.es.scan.close();	//releasing the scanner resources
}
}   