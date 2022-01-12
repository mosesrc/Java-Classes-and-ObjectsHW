public class Phone {

//  Minimum 3 private instance variables
	private int phn;
	private int battPower;
	private String scrSaver;
	private String conTact;
	private String wiFi;

//  An empty constructor

	public Phone() {
		System.out.println("Phn1 is the Empty Constructor");
	}

//  A constructor that uses only 2 of your 3 variables

	public Phone(int phn, String conTact) {
		this.phn = phn;
		this.conTact = conTact;
		System.out.println("\nPhn2 is the Two Variable Constructor");
		System.out.println("New Contact:" + "\nNAME: " + conTact 
							+ "\nPHONE NUMB: " + phn );
	}

//  A constructor that uses all 3 of your instance variables

	public Phone(int battPower, String scrSaver, String wiFi) {
		this.battPower = battPower;
		this.scrSaver = scrSaver;
		this.wiFi = wiFi;
		System.out.println("\nPhn3 is the Three Variable Constructor");
		System.out.println("Phone Statistics:\n" + "BATTERY POWER: " + battPower + "%" 
				+ "\nWIFI: " + wiFi + "\nSCREENSAVER: " + scrSaver );
	}

//	Get methods for all 3 of your instance variables

	public long getPhn() {
		return this.phn;
	}

	public int getBatt() {
		return this.battPower;
	}

	public String getScr() {
		return this.scrSaver;
	}

	public String getCont() {
		return this.conTact;
	}

	public String getWifi() {
		return this.wiFi;
	}

// Set methods for all 3 of your instance variables	

	public void setPhn(int phn) {
		this.phn = phn;
	}

	public void setBatt(int battPower) {
		 this.battPower = battPower;
	}

	public void setScr(String scrSaver) {
		 this.scrSaver = scrSaver;
	}

	public void setCont(String conTact) {
		this.conTact = conTact;
	}

	public void setWifi(String wiFi) {
		this.wiFi = wiFi;
	}

//	A method that returns a Boolean
	static boolean battLife(boolean x) {	
		boolean x1 = true;
		x = x1;
		System.out.println("\nBoolean Method: " + x);
		return x;
	}

//	A method that returns a String
	static String newContact(String str1, String str2) {
		String name = str1 + " " + str2;
		System.out.println("\nString Method: " + name);
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// CONSTRUCTORS
		Phone phn1 = new Phone();
		Phone phn2 = new Phone(9874321, "Roscoe P. Jergins");
		Phone phn3 = new Phone(95, "2021 BMW S1000RR", "Connected");

// SET AND GET METHODS
		phn2.setPhn(4651349);
		phn3.setBatt(42);
		phn3.setScr("Moonight Blue Defualt");
		phn2.setCont("Mary B. Jones");
		phn3.setWifi("Lost Connection. Please Re-connect!");
		System.out.println("\nSET AND GET METHODS for phn2 and phn 3\n");
		System.out.println("PHN2 New Contact:" + "\nNAME: " + phn2.getCont() 
				+ "\nPHONE NUMB: " + phn2.getPhn() );
		System.out.println("\nPHN3 Phone Statistics:\n" + "BATTERY POWER: " + phn3.getBatt() + "%" 
				+ "\nWIFI: " + phn3.getWifi() + "\nSCREENSAVER: " + phn3.getScr());

// BOOLEAN METHOD	

		battLife(false);
		newContact("Russell", "Simmons");

	}
}