package org.dimigo.oop;

public class CarTest {
   public static void main(String[] args) {
      Car3 car = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000); 
      System.out.println("<< 자동차 목록 >>"); 
      System.out.println("제조사명 : "+ car.getCompany()); 
      System.out.println("모델명 : "+ car.getModel()); 
      System.out.println("색상 : "+ car.getColor()); 
      System.out.println("최대속도 : "+ car.getMaxSpeed()); 
      System.out.println("가격 : "+ String.format("%,d", car.getPrice())); 
      System.out.println("");
   
      Car3 car2 = new Car3("기아자동차", "k7", "흰색", 246); 
      System.out.println("제조사명 : " + car2.getCompany()); 
      System.out.println("모델명 : " + car2.getModel()); 
      System.out.println("색상 : " + car2.getColor()); 
      System.out.println("최대속도 : " + car2.getMaxSpeed()); 
      System.out.println("가격 : "+ String.format("%,d", car2.getPrice())); 
      System.out.println("");

      Car3 car3 = new Car3("삼성자동차", "SM7", "회색"); 
      System.out.println("제조사명 : " + car3.getCompany()); 
      System.out.println("모델명 : " + car3.getModel()); 
      System.out.println("색상 : " + car3.getColor()); 
      System.out.println("최대속도 : " + car3.getMaxSpeed()); 
      System.out.println("가격 : "+ String.format("%,d", car3.getPrice()));
   } 
}