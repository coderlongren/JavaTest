package com.coderlong;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyCar  extends JFrame{
	
	public MyCar(){
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		system();
		
		Van van = new Van();
		this.add(van);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(){
				MyCar.this.setVisible(false);
			}
		});
	}
	
	private void system(){
		if(SystemTray.isSupported()){
			PopupMenu p = new PopupMenu();
			
			MenuItem item = new MenuItem("退出程序");
			item.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			p.add(item);
			
			ImageIcon icon = new ImageIcon("托盘图片的地址");
			TrayIcon tray = new TrayIcon(icon.getImage(), "继续运行小车",p);
			tray.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					MyCar.this.setVisible(true);
				}
			});
			
			try {
				SystemTray.getSystemTray().add(tray);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new MyCar();
	}
}

class Van extends JPanel{
	private int x = -5;
	private int delay = 2;
	Timer timer = null;
	public Van(){
		timer = new Timer(50,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		
		setLayout(null);
		JButton buttonStart = new JButton("启动");
		buttonStart.setBounds(200,400,60,25);
		buttonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!timer.isRunning()) {
					timer.start();
				}
			}
		});
		this.add(buttonStart);
		
		JButton buttonPause = new JButton("暂停");
		buttonPause.setBounds(300, 400, 60, 25);
		buttonPause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (timer.isRunning()) {
					timer.stop();
				}
			}
		});
		this.add(buttonPause);
		
		JButton buttonLowRate = new JButton("慢速");
		buttonLowRate.setBounds(400, 400, 60, 25);
		buttonLowRate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!timer.isRunning()) {
					timer.start();
				}
				timer.setDelay(100);
			}
		});
		this.add(buttonLowRate);
		
		JButton buttonHighRate = new JButton("高速");
		buttonHighRate.setBounds(500, 400, 60, 25);
		buttonHighRate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!timer.isRunning()) {
					timer.start();
				}
				timer.setDelay(20);
			}
		});
		this.add(buttonHighRate);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		x += delay;
		int[] m = {x + 10,x + 40, x + 30,x + 20};
		int[] n = {getHeight() - 540 + x , getHeight() - 540 + x,getHeight() - 550 + x,getHeight() - 550 + x};
		
		g.setColor(Color.black);
		g.fillOval(x+10, getHeight()-530 +x, 10, 10);
		g.fillOval(x+30, getHeight()-530 +x, 10, 10);
		
		g.setColor(Color.black);
		g.fillRect(x, getHeight() - 540 + x, 50, 10);
		
		g.setColor(Color.black);
		g.fillPolygon(m, n, 4);
		
	}
	
}
