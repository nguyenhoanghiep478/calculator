package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import model.model_Calculator;
import view.viewCalculator;

public class controllerCalculator implements ActionListener {
	private viewCalculator c_vc;
	private model_Calculator c_mc=new model_Calculator();
	private String s_number ="";
		public controllerCalculator(viewCalculator vc) {
			this.c_vc=vc;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			long parse_long;
			String calculate="";
				if(this.c_vc.isIntNumberic(e.getActionCommand())) {
					s_number+=e.getActionCommand();
					this.c_vc.input(e.getActionCommand());
				}else{
					parse_long=Long.parseLong(s_number);
					this.c_mc.setCurrentNumbers(parse_long);
					if(this.c_mc.getKetqua()==0){
						this.c_mc.pushNumber();
					}
					s_number="";
					if(this.c_mc.getCurrentNumbers()!=0) {
						switch (this.c_mc.getCalculate()) {
							case "+": {
								this.c_mc.plus();
								break;
							}	
							case "-":{
								this.c_mc.subtract();
								break;
							}
						}
					}
					if(e.getActionCommand()=="=") {
						this.c_vc.input(this.c_mc.getKetqua());
						s_number=String.valueOf(this.c_mc.getKetqua());
					}else this.c_vc.input(e.getActionCommand());
					this.c_mc.setCalculate(e.getActionCommand());
				}
			}
		}
