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
         System.out.println("手機"+Number+" 品牌:"+Brand+" 型號:"+Model+" 型號:"+Makeyear+" 售價:"+Price);
      }
   }


