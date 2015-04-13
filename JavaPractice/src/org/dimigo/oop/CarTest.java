package org.dimigo.oop;

public class CarTest {

   public static void main(String[] args) {
      Car car = new Car();
      Car car2 = new Car();
      Car car3 = new Car();
      System.out.println("<<자동차 목록>>");
      System.out.println("제조사명 : " + car.getCompany());
      System.out.println("모델명 : " + car.getModel());
      System.out.println("색상 : " + car.getColor());
      System.out.println("최대속도 : " + car.getMaxSpeed()+"km");
      System.out.println("가격 : " + String.format("%,d",  car.getPrice()) + "원");
      System.out.println();
      
      car.setCompany("기아자동차");
      car.setModel("K7");
      car.setColor("흰색");
      car.setMaxSpeed(246);
      car.setPrice(40000000);
      
      System.out.println("제조사명 : " + car.getCompany());
      System.out.println("모델명 : " + car.getModel());
      System.out.println("색상 : " + car.getColor());
      System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
      System.out.println("가격 : " + String.format("%,d",  car.getPrice()) + "원");
      System.out.println();
      
      car.setCompany("삼성자동차");
      car.setModel("SM7");
      car.setColor("회색");
      car.setMaxSpeed(200);
      car.setPrice(38000000);
      
      System.out.println("제조사명 : " + car.getCompany());
      System.out.println("모델명 : " + car.getModel());
      System.out.println("색상 : " + car.getColor());
      System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
      System.out.println("가격 : " + String.format("%,d",  car.getPrice()) + "원");
      System.out.println();

   }

}