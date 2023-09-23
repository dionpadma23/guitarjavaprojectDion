import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	int choice = 0,choice2 = 0, baseprice = 0, kode,total,inputjmlstr,hargatambahan;
	String tipe, inputmodel,inputbrand,inputtambahan ,nama;
	
	ArrayList<Gitar> gitarlist = new ArrayList<>();

	public Main(){
		menuAwal();
	}
	
	private void menuAwal() {
		
		do {
			System.out.println("1. Insert Guitar");
			System.out.println("2. View Guitar Catalogue");
			System.out.println("3. Delete Guitar");
			System.out.println("4. Exit");
			System.out.println("Input Menu : ");
			choice = scan.nextInt();
			scan.nextLine();
		
		
			if (choice == 1) {
				insertGuitar();
			}
			else if (choice == 2) {
				viewGuitar();
			}
			else if (choice == 3) {
				deleteGuitar();
			}
			else {
				System.exit(1);
			}
		
		}while (choice != 4);
	}
	
	private void deleteGuitar() {
		// TODO Auto-generated method stub
		
	}

	private void insertGuitar() {
		baseprice = 0;
		hargatambahan = 0;

		// TODO Auto-generated method stub
		do{
				System.out.println("Input Guitar Type : ");
			
			System.out.println("1. Electric");
			System.out.println("2. Accoustic");
			System.out.println("3. Cancel");
			System.out.println("Input : ");
			choice2 = scan.nextInt();
			scan.nextLine();
		} while (choice2 > 3);
		
		if(choice2 == 3) {
			menuAwal();
		}
		
		System.out.println("-- INSERT GUITAR --");
		
		do {
			System.out.print("Input Model [5-10 Character] : ");
			inputmodel = scan.nextLine();
		} while (inputmodel.length()<5 || inputmodel.length()>10);
		
		do {
			System.out.print("Input Brand [Yamaha | Fender | Cort] [Case Sensitive] : ");
			inputbrand = scan.nextLine();
		} while (!inputbrand.equals("Yamaha") && !inputbrand.equals("Fender") && !inputbrand.equals("Cort"));
		
		if(inputbrand.equals("Yamaha")) {
			baseprice = 1500000;
		}
		else if(inputbrand.equals("Fender")) {
			baseprice = 2000000;
		}
		else {
			baseprice = 1000000;
		}
		
		
		do {
			System.out.print("Input Number of Strings [6-8] : ");
			inputjmlstr = scan.nextInt();
			scan.nextLine();
		} while (inputjmlstr < 6 || inputjmlstr > 8);
		
		if (choice2 == 1) {
			nama = "electric";
			do {
				System.out.println("Includes AMP? [Yes | No] (Case insensitive) : ");
				inputtambahan = scan.nextLine();
			}while (!inputtambahan.equalsIgnoreCase("Yes") && !inputtambahan.equalsIgnoreCase("No"));
			if (inputtambahan.equalsIgnoreCase("Yes")){
				hargatambahan = 1000000;
				kode = 1;
			}
			Electric electric = new Electric();
			
			electric.setModel(inputmodel);
			electric.setBrand(inputbrand);
			electric.setNumberstr(inputjmlstr);
			electric.setIncludeAmp(inputtambahan);
			
			gitarlist.add(electric);
		}
		
		else {
			nama = "acoustic";
			do {
				System.out.println("Is the guitar hybrid? [Yes | No] (Case insensitive) : ");
				inputtambahan = scan.nextLine();
			}while (!inputtambahan.equalsIgnoreCase("Yes") && !inputtambahan.equalsIgnoreCase("No"));
			if (inputtambahan.equalsIgnoreCase("Yes")){
				hargatambahan = 500000;
				kode = 2;
			}
			Acoustic gitar = new Acoustic();
			
			gitar.setModel(inputmodel);
			gitar.setBrand(inputbrand);
			gitar.setNumberstr(inputjmlstr);
			gitar.setIsHybrid(inputtambahan);
			
			gitarlist.add(gitar);
		}}
		
		
		
	private void viewGuitar() {
		if (gitarlist.size() == 0) {
			System.out.println("There are no guitars in the catalog yet!");
		}
		else { //VIEWING
			for (int i = 0 ; i<gitarlist.size();i++) {
				System.out.println(i + 1);
				gitarlist.get(i).melihat();
			}
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
}