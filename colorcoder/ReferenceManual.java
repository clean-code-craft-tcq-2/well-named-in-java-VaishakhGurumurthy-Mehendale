package colorcoder;

public class ReferenceManual {

 public static void printReference(){

     int pairNumber = 0;
     System.out.println("\n********************* Reference Manual ************************");
     for(MajorColors majorColor : MajorColors.values()){
         for(MinorColors minorColor : MinorColors.values()){
             pairNumber++;
             System.out.println("Pair-"+pairNumber+" --> ("+majorColor.toString()+","+minorColor.toString()+")");

         }

     }

 }

}
