
public class Calculations {
	TravianMain objectMain = new TravianMain();
	public int woodSum, titSum, stoneSum, cropSum;
	//Romans
	public int LegionnaireCw, LegionnaireCt, LegionnaireCs, LegionnaireCc;
	public int PraetorianCw, PraetorianCt, PraetorianCs, PraetorianCc;
	public int ImperianCw, ImperianCt, ImperianCs, ImperianCc;
	public int Equites_LegatiCw, Equites_LegatiCt, Equites_LegatiCs, Equites_LegatiCc;
	public int Equites_ImperatorisCw, Equites_ImperatorisCt, Equites_ImperatorisCs, Equites_ImperatorisCc;
	public int Equites_CaesarisCw, Equites_CaesarisCt, Equites_CaesarisCs, Equites_CaesarisCc;
	public int Battering_RamCw, Battering_RamCt, Battering_RamCs, Battering_RamCc;
	public int Fire_CatapultCw, Fire_CatapultCt, Fire_CatapultCs, Fire_CatapultCc;
	public void CalculateR(){
		LegionnaireCw = objectMain.Legionnaire*120; LegionnaireCt = objectMain.Legionnaire*100; LegionnaireCs = objectMain.Legionnaire*150; LegionnaireCc = objectMain.Legionnaire*30;
		PraetorianCw = objectMain.Praetorian*100; PraetorianCt = objectMain.Praetorian*130; PraetorianCs = objectMain.Praetorian*160; PraetorianCc = objectMain.Praetorian*70;
		ImperianCw = objectMain.Imperian*150; ImperianCt = objectMain.Imperian*160; ImperianCs = objectMain.Imperian*210; ImperianCc = objectMain.Imperian*80;
		Equites_LegatiCw = objectMain.Equites_Legati*140; Equites_LegatiCt = objectMain.Equites_Legati*160; Equites_LegatiCs = objectMain.Equites_Legati*20; Equites_LegatiCc = objectMain.Equites_Legati*40;
		Equites_ImperatorisCw = objectMain.Equites_Imperatoris*550; Equites_ImperatorisCt = objectMain.Equites_Imperatoris*440; Equites_ImperatorisCs = objectMain.Equites_Imperatoris*320; Equites_ImperatorisCc = objectMain.Equites_Imperatoris*100;
		Equites_CaesarisCw = objectMain.Equites_Caesaris*550; Equites_CaesarisCt = objectMain.Equites_Caesaris*640; Equites_CaesarisCs = objectMain.Equites_Caesaris*800; Equites_CaesarisCc = objectMain.Equites_Caesaris*180;
		Battering_RamCw = objectMain.Battering_Ram*900; Battering_RamCt = objectMain.Battering_Ram*360; Battering_RamCs = objectMain.Battering_Ram*500; Battering_RamCc = objectMain.Battering_Ram*70;
		Fire_CatapultCw = objectMain.Fire_Catapult*950; Fire_CatapultCt = objectMain.Fire_Catapult*1350; Fire_CatapultCs = objectMain.Fire_Catapult*600; Fire_CatapultCc = objectMain.Fire_Catapult*90;
		woodSum = LegionnaireCw + PraetorianCw + ImperianCw + Equites_LegatiCw + Equites_ImperatorisCw + Equites_CaesarisCw + Battering_RamCw + Fire_CatapultCw;
		titSum = LegionnaireCt + PraetorianCt + ImperianCt + Equites_LegatiCt + Equites_ImperatorisCt + Equites_CaesarisCt + Battering_RamCt + Fire_CatapultCt;
		stoneSum = LegionnaireCs + PraetorianCs + ImperianCs + Equites_LegatiCs + Equites_ImperatorisCs + Equites_CaesarisCs + Battering_RamCs + Fire_CatapultCs;
		cropSum = LegionnaireCc + PraetorianCc + ImperianCc + Equites_LegatiCc + Equites_ImperatorisCc + Equites_CaesarisCc + Battering_RamCc + Fire_CatapultCc;
	}
	//Teutons
	public int MacemanCw, MacemanCt, MacemanCs, MacemanCc;
	public int SpearmanCw, SpearmanCt, SpearmanCs, SpearmanCc;
	public int AxemanCw, AxemanCt, AxemanCs, AxemanCc;
	public int ScountCw, ScountCt, ScountCs, ScountCc;
	public int PaladinCw, PaladinCt, PaladinCs, PaladinCc;
	public int Teutonic_KnightCw, Teutonic_KnightCt, Teutonic_KnightCs, Teutonic_KnightCc;
	public int RamCw, RamCt, RamCs, RamCc;
	public int CatapultCw, CatapultCt, CatapultCs, CatapultCc;
	public void CalculateT(){
		MacemanCw = objectMain.Maceman*95; MacemanCt = objectMain.Maceman*75; MacemanCs = objectMain.Maceman*40; MacemanCc = objectMain.Maceman*40;
		SpearmanCw = objectMain.Spearman*145; SpearmanCt = objectMain.Spearman*70; SpearmanCs = objectMain.Spearman*85; SpearmanCc = objectMain.Spearman*40;
		AxemanCw = objectMain.Axeman*130; AxemanCt = objectMain.Axeman*120; AxemanCs = objectMain.Axeman*170; AxemanCc = objectMain.Axeman*70;
		ScountCw = objectMain.Scount*160; ScountCt = objectMain.Scount*100; ScountCs = objectMain.Scount*50; ScountCc = objectMain.Scount*50;
		PaladinCw = objectMain.Paladin*370; PaladinCt = objectMain.Paladin*270; PaladinCs = objectMain.Paladin*290; PaladinCc = objectMain.Paladin*75;
		Teutonic_KnightCw = objectMain.Teutonic_Knight*450; Teutonic_KnightCt = objectMain.Teutonic_Knight*515; Teutonic_KnightCs = objectMain.Teutonic_Knight*480; Teutonic_KnightCc = objectMain.Teutonic_Knight*80;
		RamCw = objectMain.Ram*1000; RamCt = objectMain.Ram*300; RamCs = objectMain.Ram*350; RamCc = objectMain.Ram*70;
		CatapultCw = objectMain.Catapult*900; CatapultCt = objectMain.Catapult*1200; CatapultCs = objectMain.Catapult*600; CatapultCc = objectMain.Catapult*60;
		woodSum = MacemanCw + SpearmanCw + AxemanCw + ScountCw + PaladinCw + Teutonic_KnightCw + RamCw + CatapultCw;
		titSum = MacemanCt + SpearmanCt + AxemanCt + ScountCt + PaladinCt + Teutonic_KnightCt + RamCt + CatapultCt;
		stoneSum = MacemanCs + SpearmanCs + AxemanCs + ScountCs + PaladinCs + Teutonic_KnightCs + RamCs + CatapultCs;
		cropSum = MacemanCc + SpearmanCc + AxemanCc + ScountCc + PaladinCc + Teutonic_KnightCc + RamCc + CatapultCc;
	}
	//Galics
	public int PhalanxCw, PhalanxCt, PhalanxCs, PhalanxCc;
	public int SwordmanCw, SwordmanCt, SwordmanCs, SwordmanCc;
	public int PathfinderCw, PathfinderCt, PathfinderCs, PathfinderCc;
	public int Theutates_ThunderCw, Theutates_ThunderCt, Theutates_ThunderCs, Theutates_ThunderCc;
	public int DruidriderCw, DruidriderCt, DruidriderCs, DruidriderCc;
	public int HaeduanCw, HaeduanCt, HaeduanCs, HaeduanCc;
	public int gRamCw, gRamCt, gRamCs, gRamCc;
	public int TrebuchetCw, TrebuchetCt, TrebuchetCs, TrebuchetCc;
	public void CalculateG(){
		PhalanxCw = objectMain.Phalanx*100; PhalanxCt = objectMain.Phalanx*130; PhalanxCs = objectMain.Phalanx*55; PhalanxCc = objectMain.Phalanx*30;
		SwordmanCw = objectMain.Swordman*140; SwordmanCt = objectMain.Swordman*150; SwordmanCs = objectMain.Swordman*185; SwordmanCc = objectMain.Swordman*60;
		PathfinderCw = objectMain.Pathfinder*170; PathfinderCt = objectMain.Pathfinder*150; PathfinderCs = objectMain.Pathfinder*20; PathfinderCc = objectMain.Pathfinder*40;
		Theutates_ThunderCw = objectMain.Theutates_Thunder*350; Theutates_ThunderCt = objectMain.Theutates_Thunder*450; Theutates_ThunderCs = objectMain.Theutates_Thunder*230; Theutates_ThunderCc = objectMain.Theutates_Thunder*60;
		DruidriderCw = objectMain.Druidrider*360; DruidriderCt = objectMain.Druidrider*330; DruidriderCs = objectMain.Druidrider*280; DruidriderCc = objectMain.Druidrider*120;
		HaeduanCw = objectMain.Haeduan*500; HaeduanCt = objectMain.Haeduan*620; HaeduanCs = objectMain.Haeduan*675; HaeduanCc = objectMain.Haeduan*170;
		gRamCw = objectMain.gRam*950; gRamCt = objectMain.gRam*555; gRamCs = objectMain.gRam*330; gRamCc = objectMain.gRam*75;
		TrebuchetCw = objectMain.Trebuchet*960; TrebuchetCt = objectMain.Trebuchet*1450; TrebuchetCs = objectMain.Trebuchet*630; TrebuchetCc = objectMain.Trebuchet*90;
		woodSum = PhalanxCw + SwordmanCw + PathfinderCw + Theutates_ThunderCw + DruidriderCw + HaeduanCw + gRamCw + TrebuchetCw;
		titSum = PhalanxCt + SwordmanCt + PathfinderCt + Theutates_ThunderCt + DruidriderCt + HaeduanCt + gRamCt + TrebuchetCt;
		stoneSum = PhalanxCs + SwordmanCs + PathfinderCs + Theutates_ThunderCs + DruidriderCs + HaeduanCs + gRamCs + TrebuchetCs;
		cropSum = PhalanxCc + SwordmanCc + PathfinderCc + Theutates_ThunderCc + DruidriderCc + HaeduanCc + gRamCc + TrebuchetCc;
	}
}