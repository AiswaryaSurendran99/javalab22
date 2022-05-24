class CPU{
int price =25000;
	class Processor{
		int core_no =8;
		String manfa = "INTEL";
	void processor(){
	System.out.println(manfa +" "+core_no+" Core Processor");
	}
	}
	
	void Ram(){
		int size=8;
		String Ramanfa ="GIGABYTE";
		System.out.println(size+" GB Ram of\t" +Ramanfa);
	}
}
class CPU1{

public static void main(String args[]){

CPU cpu=new CPU();
CPU.Processor pr =  cpu.new Processor();
cpu.Ram();
pr.processor();
}
}