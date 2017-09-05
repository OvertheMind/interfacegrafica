package Aula;

import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{//Classe calculador a ganha as funções de JFrame(interface)
		Metodos fun = new Metodos();
		double a, b;
		char z;
		
		JTextField txtVisor = new JTextField();
		JButton btnMc = new JButton("MC");
		JButton btnMr = new JButton("MR");
		JButton btnMs = new JButton("MS");
		JButton btnMmais = new JButton("M+");
		JButton btnMmenos = new JButton("M-");
		JButton btnseta = new JButton("←");
		JButton btnCE = new JButton("CE");
		JButton btnC = new JButton("C");
		JButton btnmaisemenos = new JButton("±");
		JButton btnraiz = new JButton("√");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnbarra = new JButton("/");
		JButton btnpc = new JButton("%");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btnX = new JButton("*");
		JButton btn1barra = new JButton("1/x");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btnmenos = new JButton("-");
		JButton btnigual = new JButton("=");
		JButton btn0 = new JButton("0");
		JButton btnvir = new JButton(",");
		JButton btnmais = new JButton("+");
		
	public Calculadora(){//Contrutor
		super("Calculadora");//Responsavel pelo título
		
		Container paine = this.getContentPane();//Atribui a variaavel paine os tributos de conatiner
		paine.add(txtVisor);
		txtVisor.setBounds(10, 20 , 321, 30);
		
		paine.add(btnMc);
		btnMc.setBounds(10, 60, 60, 30);
		paine.add(btnMr);
		btnMr.setBounds(75, 60, 60, 30);
		paine.add(btnMs);
		btnMs.setBounds(140, 60, 60, 30);
		paine.add(btnMmais);
		btnMmais.setBounds(205, 60, 60, 30);
		paine.add(btnMmenos);
		btnMmenos.setBounds(270, 60, 60, 30);
		
		paine.add(btnseta);
		btnseta.setBounds(10, 95, 60, 30);
		paine.add(btnCE);
		btnCE.setBounds(75, 95, 60, 30);
		paine.add(btnC);
		btnC.setBounds(140, 95, 60, 30);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("");
			}
		});
				
		paine.add(btnmaisemenos);
		btnmaisemenos.setBounds(205, 95, 60, 30);
		paine.add(btnraiz);
		btnraiz.setBounds(270, 95, 60, 30);
		
		paine.add(btn7);
		btn7.setBounds(10, 130, 60, 30);
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		paine.add(btn8);
		btn8.setBounds(75, 130, 60, 30);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		paine.add(btn9);
		btn9.setBounds(140, 130, 60, 30);
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		paine.add(btnbarra);
		btnbarra.setBounds(205, 130, 60, 30);
		btnbarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				z = 'd';
				txtVisor.setText("");
			}
		});
		
		paine.add(btnpc);
		btnpc.setBounds(270, 130, 60, 30);
		
		paine.add(btn4);
		btn4.setBounds(10, 165, 60, 30);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		paine.add(btn5);
		btn5.setBounds(75, 165, 60, 30);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		paine.add(btn6);
		btn6.setBounds(140, 165, 60, 30);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		paine.add(btnX);
		btnX.setBounds(205, 165, 60, 30);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				z = 'm';
				txtVisor.setText("");
			}
		});
		paine.add(btn1barra);
		btn1barra.setBounds(270, 165, 60, 30);
		
		paine.add(btn1);
		btn1.setBounds(10, 200, 60, 30);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		paine.add(btn2);
		btn2.setBounds(75, 200, 60, 30);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		paine.add(btn3);
		btn3.setBounds(140, 200, 60, 30);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		paine.add(btnmenos);
		btnmenos.setBounds(205, 200, 60, 30);
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				z = 'c';
				txtVisor.setText("");
			}
		});
		paine.add(btnigual);
		btnigual.setBounds(270, 200, 60, 65);
		btnigual.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if (z == 's'){
						txtVisor.setText(""+fun.adição(a, Double.parseDouble(txtVisor.getText())));
					}
					else if (z == 'c'){
						txtVisor.setText(""+fun.subtração(a, Double.parseDouble(txtVisor.getText())));
					}
					else if (z == 'm'){
						txtVisor.setText(""+fun.multiplicação(a, Double.parseDouble(txtVisor.getText())));
					}
					else txtVisor.setText(""+fun.divisão(a, Double.parseDouble(txtVisor.getText())));
					}
				}
				);
		
		paine.add(btn0);
		btn0.setBounds(10, 235, 125, 30);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		paine.add(btnvir);
		btnvir.setBounds(140, 235, 60, 30);
		paine.add(btnmais);
		btnmais.setBounds(205, 235, 60, 30);
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				z = 's';
				txtVisor.setText("");
			}
		});
		
		paine.setLayout(null);//Define o posicionamento dos objetos na tela
		this.setVisible(true);//Define a tela como visível
		this.setSize(355,325);//Define o tamanho o tamanho da janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Calculadora calc = new Calculadora();
	}
}
