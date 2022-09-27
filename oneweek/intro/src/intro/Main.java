package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
// değişken isimlendirmeleri javada camelCase yazılır.
		String ortaMetin = "ilginizi çekebilir";
	   String altMetin = "vade süresi"; 
	  System.out.println(ortaMetin);
	  //integer
	  int vade = 12 ;
	  double dolarDun = 18.10;
	  double dolarBugun = 18.10; 
	  
	  boolean dolarDustuMu = false;
	  
	  String okYonu = "";
	  
	  if (dolarBugun<dolarDun) {//false
		  okYonu = "down.svg";
		System.out.println(okYonu);
	} else if (dolarBugun>dolarDun) { 
		okYonu = "up.svg";
		System.out.println(okYonu);
	}
	
	 else { okYonu = "equal.svg";
		System.out.println(okYonu);
		   
	}
	  String[] krediler = {"Hızlı Kredimmm","Maaşını Halkbanktan","Mutlu Emekli"}; 
	  
	 
	  
	  
	  for (int i = 0; i < krediler.length; i++) {
		  System.out.println(krediler[i]);
		  
	}
	   
	   
	}
}
