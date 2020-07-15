
import java.util.Scanner;

public class TravianMain {

	public static int Legionnaire, Praetorian, Imperian, Equites_Legati, Equites_Imperatoris, Equites_Caesaris, Battering_Ram, Fire_Catapult;
	public static int Maceman, Spearman, Axeman, Scount, Paladin, Teutonic_Knight, Ram, Catapult;
	public static int Phalanx, Swordman, Pathfinder, Theutates_Thunder, Druidrider, Haeduan, gRam, Trebuchet;

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String spc = System.lineSeparator();
		boolean x = true, y = true;
		byte unitType, tribe;
		do {
			System.out.println("________________________________________________________________________________________________________________________________________________");
			System.out.println("Select tribe?" + spc + "Romans = 1" + spc + "Teutons = 2" + spc + "Gauls = 3");
			tribe = input.nextByte();
			x = true;
			switch(tribe) {
			case 1:
				System.out.println("@@@@@Romans@@@@@");
				do {
					System.out.println("________________________________________________");
					System.out.print(Legionnaire > 0 ? Legionnaire + " Legionnaire" + spc: "");
					System.out.print(Praetorian > 0 ? Praetorian + " Praetorian" + spc: "");
					System.out.print(Imperian > 0 ? Imperian + " Imperian" + spc: "");
					System.out.print(Equites_Legati > 0 ? Equites_Legati + " Equites Legati" + spc: "");
					System.out.print(Equites_Imperatoris > 0 ? Equites_Imperatoris + " Equites Imperatoris" + spc: "");
					System.out.print(Equites_Caesaris > 0 ? Equites_Caesaris + " Equites Caesaris" + spc: "");
					System.out.print(Battering_Ram > 0 ? Battering_Ram + " Battering Ram" + spc: "");
					System.out.print(Fire_Catapult > 0 ? Fire_Catapult + " Fire Catapult" + spc: "");
					System.out.println("Choose a desired unit");
					System.out.println("Legionnaire = 1, Praetorian = 2, Imperian = 3, Equites Legati = 4" + spc + "Equites Imperatoris = 5, Equites Caesaris = 6, Battering Ram = 7, Fire Catapult = 8");
					System.out.println("Calculate costs = 0");
					unitType = input.nextByte();
					switch(unitType) {
					case 1:
						System.out.println("Enter the desired amount of Legionnaire");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Legionnaire >= 0) {
						Legionnaire = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 2:
						System.out.println("Enter the desired amount of Praetorian");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Praetorian >= 0) {
							Praetorian = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 3:
						System.out.println("Enter the desired amount of Imperian");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Imperian >= 0) {
							Imperian = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 4:
						System.out.println("Enter the desired amount of Equites Legati ");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Equites_Legati >= 0) {
							Equites_Legati = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 5:
						System.out.println("Enter the desired amount of Equites Imperatoris ");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Equites_Imperatoris >= 0) {
							Equites_Imperatoris = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 6:
						System.out.println("Enter the desired amount of Equites Caesaris");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Equites_Caesaris >= 0) {
							Equites_Caesaris = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 7:
						System.out.println("Enter the desired amount of Battering Ram");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Battering_Ram >= 0) {
							Battering_Ram = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 8:
						System.out.println("Enter the desired amount of Fire Catapult");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Fire_Catapult >= 0) {
							Fire_Catapult = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 0:
						x = false;
						Calculations objectCal = new Calculations();
						objectCal.CalculateR();
						System.out.println("________________________________________________" + spc + "________________________________________________");
						System.out.print(Legionnaire > 0 ? Legionnaire + " Legionnaire" + spc: "");
						System.out.print(Praetorian > 0 ? Praetorian + " Praetorian" + spc: "");
						System.out.print(Imperian > 0 ? Imperian + " Imperian" + spc: "");
						System.out.print(Equites_Legati > 0 ? Equites_Legati + " Equites Legati" + spc: "");
						System.out.print(Equites_Imperatoris > 0 ? Equites_Imperatoris + " Equites Imperatoris" + spc: "");
						System.out.print(Equites_Caesaris > 0 ? Equites_Caesaris + " Equites Caesaris" + spc: "");
						System.out.print(Battering_Ram > 0 ? Battering_Ram + " Battering Ram" + spc: "");
						System.out.print(Fire_Catapult > 0 ? Fire_Catapult + " Fire Catapult" + spc: "");
						System.out.println("Wood: " + objectCal.woodSum);
						System.out.println("Clay: " + objectCal.titSum);
						System.out.println("Stone: " + objectCal.stoneSum);
						System.out.println("Crops: " + objectCal.cropSum);
						System.out.println("@@@@@Romans@@@@@" + spc + "Again? Y/(Anything else)");
						input.nextLine();
						if("Y".equals(input.nextLine().toUpperCase())) {
							y = true;
							Legionnaire = 0; Praetorian = 0; Imperian = 0; Equites_Legati = 0; Equites_Imperatoris = 0; Equites_Caesaris = 0; Battering_Ram = 0; Fire_Catapult = 0;
							objectCal.woodSum = 0; objectCal.titSum = 0; objectCal.stoneSum = 0; objectCal.cropSum = 0;
							break;
						}else {
							y = false;
							input.close();
							break;
						}
					default:
						System.out.println("Invalid input! 0-8");
						break;
					}
				}while(x == true);
				break;
			case 2:
				System.out.println("@@@@@Teutons@@@@@");
				do {
					System.out.println("________________________________________________");
					System.out.print(Maceman > 0 ? Maceman + " Maceman" + spc: "");
					System.out.print(Spearman > 0 ? Spearman + " Spearman" + spc: "");
					System.out.print(Axeman > 0 ? Axeman + " Axeman" + spc: "");
					System.out.print(Scount > 0 ? Scount + " Scount" + spc: "");
					System.out.print(Paladin > 0 ? Paladin + " Paladin" + spc: "");
					System.out.print(Teutonic_Knight > 0 ? Teutonic_Knight + " Teutonic Knight" + spc: "");
					System.out.print(Ram > 0 ? Ram + " Ram" + spc: "");
					System.out.print(Catapult > 0 ? Catapult + " Catapult" + spc: "");
					System.out.println("Choose a desired unit");
					System.out.println("Maceman = 1, Spearman = 2, Axeman = 3, Scount = 4" + spc + "Paladin = 5, Teutonic Knight = 6, Ram = 7, Catapult = 8");
					System.out.println("Calculate costs = 0");
					unitType = input.nextByte();
					switch(unitType) {
					case 1:
						System.out.println("Enter the desired amount of Maceman");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Maceman >= 0) {
							Maceman = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 2:
						System.out.println("Enter the desired amount of Spearman");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Spearman >= 0) {
							Spearman = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 3:
						System.out.println("Enter the desired amount of Axeman");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Axeman >= 0) {
							Axeman = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 4:
						System.out.println("Enter the desired amount of Scount ");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Scount >= 0) {
							Scount = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 5:
						System.out.println("Enter the desired amount of Paladin ");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Paladin >= 0) {
							Paladin = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 6:
						System.out.println("Enter the desired amount of Teutonic Knight");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Teutonic_Knight >= 0) {
							Teutonic_Knight = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 7:
						System.out.println("Enter the desired amount of Ram");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Ram >= 0) {
							Ram = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 8:
						System.out.println("Enter the desired amount of Catapult");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Catapult >= 0) {
							Catapult = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 0:
						x = false;
						Calculations objectCal = new Calculations();
						objectCal.CalculateT();
						System.out.println("________________________________________________" + spc + "________________________________________________");
						System.out.print(Maceman > 0 ? Maceman + " Maceman" + spc: "");
						System.out.print(Spearman > 0 ? Spearman + " Spearman" + spc: "");
						System.out.print(Axeman > 0 ? Axeman + " Axeman" + spc: "");
						System.out.print(Scount > 0 ? Scount + " Scount" + spc: "");
						System.out.print(Paladin > 0 ? Paladin + " Paladin" + spc: "");
						System.out.print(Teutonic_Knight > 0 ? Teutonic_Knight + " Teutonic Knight" + spc: "");
						System.out.print(Ram > 0 ? Ram + " Ram" + spc: "");
						System.out.print(Catapult > 0 ? Catapult + " Catapult" + spc: "");
						System.out.println("Wood: " + objectCal.woodSum);
						System.out.println("Clay: " + objectCal.titSum);
						System.out.println("Stone: " + objectCal.stoneSum);
						System.out.println("Crops: " + objectCal.cropSum);
						System.out.println("@@@@@טאוטוניפ@@@@@" + spc + "Again? Y/(Anything else)");
						input.nextLine();
						if("Y".equals(input.nextLine().toUpperCase())) {
							y = true;
							Maceman = 0; Spearman = 0; Axeman = 0; Scount = 0; Paladin = 0; Teutonic_Knight = 0; Ram = 0; Catapult = 0;
							objectCal.woodSum = 0; objectCal.titSum = 0; objectCal.stoneSum = 0; objectCal.cropSum = 0;
							break;
						}else {
							y = false;
							input.close();
							break;
						}
					default:
						System.out.println("Invalid input! 0-8");
						break;
					}
				}while(x == true);
				break;
			case 3:
				System.out.println("@@@@@Gauls@@@@@");
				do {
					System.out.println("________________________________________________");
					System.out.print(Phalanx > 0 ? Phalanx + " Phalanx" + spc: "");
					System.out.print(Swordman > 0 ? Swordman + " Swordman" + spc: "");
					System.out.print(Pathfinder > 0 ? Pathfinder + " Pathfinder" + spc: "");
					System.out.print(Theutates_Thunder > 0 ? Theutates_Thunder + " Theutates Thunder" + spc: "");
					System.out.print(Druidrider > 0 ? Druidrider + " Druidrider" + spc: "");
					System.out.print(Haeduan > 0 ? Haeduan + " Haeduan" + spc: "");
					System.out.print(gRam > 0 ? gRam + " Ram" + spc: "");
					System.out.print(Trebuchet > 0 ? Trebuchet + " Trebuchet" + spc: "");
					System.out.println("Choose a desired unit");
					System.out.println("Phalanx = 1, Swordman = 2, Pathfinder = 3, Theutates Thunder = 4" + spc + "Druidrider = 5, Haeduan = 6, Ram = 7, Trebuchet = 8");
					System.out.println("Calculate costs = 0");
					unitType = input.nextByte();
					switch(unitType) {
					case 1:
						System.out.println("Enter the desired amount of Legionnaire");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Phalanx >= 0) {
							Phalanx = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 2:
						System.out.println("Enter the desired amount of Swordman");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Swordman >= 0) {
							Swordman = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 3:
						System.out.println("Enter the desired amount of Pathfinder");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Pathfinder >= 0) {
							Pathfinder = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 4:
						System.out.println("Enter the desired amount of Theutates Thunder ");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Theutates_Thunder >= 0) {
							Theutates_Thunder = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 5:
						System.out.println("Enter the desired amount of Druidrider ");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Druidrider >= 0) {
							Druidrider = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 6:
						System.out.println("Enter the desired amount of Haeduan");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Haeduan >= 0) {
							Haeduan = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 7:
						System.out.println("Enter the desired amount of Ram");
						System.out.println("Setting to zero will calculate no units from this type");
						if(gRam >= 0) {
							gRam = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 8:
						System.out.println("Enter the desired amount of Trebuchet");
						System.out.println("Setting to zero will calculate no units from this type");
						if(Trebuchet >= 0) {
							Trebuchet = input.nextInt();
						}else {
							System.out.println("Invalid input, did not change");
						}
						break;
					case 0:
						x = false;
						Calculations objectCal = new Calculations();
						objectCal.CalculateG();
						System.out.println("________________________________________________" + spc + "________________________________________________");
						System.out.print(Phalanx > 0 ? Phalanx + " Phalanx" + spc: "");
						System.out.print(Swordman > 0 ? Swordman + " Swordman" + spc: "");
						System.out.print(Pathfinder > 0 ? Pathfinder + " Pathfinder" + spc: "");
						System.out.print(Theutates_Thunder > 0 ? Theutates_Thunder + " Theutates Thunder" + spc: "");
						System.out.print(Druidrider > 0 ? Druidrider + " Druidrider" + spc: "");
						System.out.print(Haeduan > 0 ? Haeduan + " Haeduan" + spc: "");
						System.out.print(gRam > 0 ? gRam + " Ram" + spc: "");
						System.out.print(Trebuchet > 0 ? Trebuchet + " Trebuchet" + spc: "");
						System.out.println("Wood: " + objectCal.woodSum);
						System.out.println("Clay: " + objectCal.titSum);
						System.out.println("Stone: " + objectCal.stoneSum);
						System.out.println("Crops: " + objectCal.cropSum);
						System.out.println("@@@@@Gauls@@@@@" + spc + "Again? Y/(Anything else)");
						input.nextLine();
						if("Y".equals(input.nextLine().toUpperCase())) {
							y = true;
							Phalanx = 0; Swordman = 0; Pathfinder = 0; Theutates_Thunder = 0; Druidrider = 0; Haeduan = 0; gRam = 0; Trebuchet = 0;
							objectCal.woodSum = 0; objectCal.titSum = 0; objectCal.stoneSum = 0; objectCal.cropSum = 0;
							break;
						}else {
							y = false;
							input.close();
							break;
						}
					default:
						System.out.println("Invalid input! 0-8");
						break;
					}
				}while(x == true);
				break;
			default:
				System.out.println("Invalid input! 1-3");
				break;
			}
		}while(y == true);
	}
}
