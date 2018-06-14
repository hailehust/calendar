/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.time.LocalDate;

/**
 *
 * @author hai
 */
public class Calendar {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();//khai bao + khoi tao 1 bien doi tuong, sdung class  LocalDate co san cua java.lang
		//date luu thong tin ve thoi gian hien tai
		
		int m = date.getMonthValue();//luu lai gia tri so cua thang hien tai
		int td = date.getDayOfMonth();//luu lai gia tri so cua ngay hien tai
		
		date = date.minusDays(date.getDayOfMonth()-1);//cho date luu thong tin ve ngay mong 1 cua thang nay
		System.out.println("Mong 1 la thu: "+date.getDayOfWeek()+" tuong ung voi ngay thu: "+
				date.getDayOfWeek().getValue()+" trong tuan");
		
		System.out.println("mon tue wed thu fri sat sun");
		for (int i = 0; i < date.getDayOfWeek().getValue() -1 ; i++) {
			System.out.print("    ");
		}
		while(date.getMonthValue() == m ){
			System.out.printf("%3d", date.getDayOfMonth());
					
			if(date.getDayOfMonth() == td){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		
			date = date.plusDays(1);//tang ngay len 1 de hien thi ra
		
			if(date.getDayOfWeek().getValue() == 1){//neu la MONDAY
				System.out.println("");
			}
		}
		System.out.println("");
//		System.out.println("a");
		
		
	}
	
}
