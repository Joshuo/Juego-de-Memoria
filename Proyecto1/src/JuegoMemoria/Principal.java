/*
Clase: Principal
Responsabilidad: Inicia el programa y crea un objeto Vista de GuiMemoria
Colaboracion: Ninguna
*/

package JuegoMemoria;

import javax.swing.JFrame;

public class Principal 
{
	public static void main(String[] args) 
	{
		MemoriaGUI vista = new MemoriaGUI();
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
