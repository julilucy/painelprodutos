package view;

import view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal {
	public static void main(String[] args) {

		JFrame janela = new JFrame("Syscom - Sistema de Cadastro de Equipamentos");
		TelaPrincipal tela = new TelaPrincipal();
		
		janela.add(tela);
		
		JMenuBar menuTopo = new JMenuBar();
		JMenu menuCadastro = new JMenu("Cadastrar");
		JMenu menuVenda = new JMenu("Buscar");
		JMenu menuRelatorio = new JMenu("Listar");
		JMenuItem item1 = new JMenuItem("Gabinete");
		item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	TelaPrincipal tela = new TelaPrincipal();
            	tela.adicionarCliente();
            }
        });
		JMenuItem item2 = new JMenuItem("Processador");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event){
				TelaPrincipalProcessador tela = new TelaPrincipalProcessador();
				tela.adicionarProcessador();
			
			}
		});
				
		JMenuItem item3 = new JMenuItem("Memoria");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalMemoria tela = new TelaPrincipalMemoria();
			tela.adicionarMemoria();
							
			}
		});
		JMenuItem item4 = new JMenuItem("HD");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalHD tela = new TelaPrincipalHD();
			tela.adicionarHD();
						
			}
		});
		JMenuItem item5 = new JMenuItem("Teclado");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalTeclado tela = new TelaPrincipalTeclado();
			tela.adicionarTeclado1();
			}
		});
		JMenuItem item6 = new JMenuItem("Mouse");
		JMenuItem item7 = new JMenuItem("Equipamentos");
		JMenuItem item8 = new JMenuItem("Equipamentos");
		
		janela.setJMenuBar(menuTopo);
		menuTopo.add(menuCadastro);
		menuTopo.add(menuVenda);
		menuTopo.add(menuRelatorio);
		menuCadastro.add(item1);
		menuCadastro.add(item2);
		menuCadastro.add(item3);
		menuCadastro.add(item4);
		menuCadastro.add(item5);
		menuCadastro.add(item6);
		menuVenda.add(item7);
		menuRelatorio.add(item8);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setLocation(500, 200);
		janela.setSize(500,500);
	}
	
}
