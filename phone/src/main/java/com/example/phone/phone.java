package com.example.phone;

public class phone {
   private String Brand;
   private String Model;
   private String Makeyear;
   private String Price;
   private int Number;

   public phone(int number,String brandin,String modelin,String makeyearin,String pricein) {
      Number = number;
      Brand = brandin;
      Model = modelin;
      Makeyear = makeyearin;
      Price = pricein;
   }
      public void dataprint(){
         System.out.println("���"+Number+" �~�P:"+Brand+" ����:"+Model+" ����:"+Makeyear+" ���:"+Price);
      }
   }


