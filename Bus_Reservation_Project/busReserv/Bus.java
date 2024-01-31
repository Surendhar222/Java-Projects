package busReserv;

public class Bus {
	private int Busno;
	private boolean AC;
	private int Capacity;
	
	
    Bus(int no,boolean Ac,int cap) {
		this.Busno=no;
		this.AC=Ac;
		this.Capacity=cap;
		
	}
    
    public int getBusno() {
    	return Busno;
    }
    
    public boolean isAc() {
    	return AC;
    }
   public void setAc(boolean val) {
	   AC=val;
   }
    
    public int getCapacity(){ //Acceser
    	return Capacity;
    }
    
    public void setCapacity(int cap) { //Mutator
    	Capacity = cap;
    }
	
    public void getBusInfo(){
    	System.out.println("BusNo : " + Busno +"    " +  "AC  : "  + AC +"    " + "Total Capacity" +"    "+ Capacity);
    }

}
