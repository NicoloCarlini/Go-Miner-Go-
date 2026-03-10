package main;

public class Risoluzione {

	Gioco gm;
	
	int width, height;
	
	public Risoluzione(Gioco gm) {
		this.gm = gm;
		width = gm.toolkit.getScreenSize().width;
		height = gm.toolkit.getScreenSize().height;
		System.out.print(height);
		setRisoluzione();
	}
	
	//coordinate e grandezza LabelResource
	int xLabelResource, yLabelResource, wLabelResource, hLabelResource;
	//coordinate e grandezza GemmeContatori e aumento y
	int xGem, yGem, wGem, hGem, yGemPiu;
	//grandezza NumeriContatori
	int wNumber, hNumber;
	//coordinate NumeriContatori
	int xNgem123, xNgem123Piu, yNgem1, yNgem2, yNgem3;
	//coordinate e grandezza Titolo
	int xTitolo, yTitolo, wTitolo, hTitolo;
	//coordinate e grandezza NewGame
	int xNewGame, yNewGame, wNewGame, hNewGame;
	//coordinate e grandezza Load
	int xLoad, yLoad, wLoad, hLoad;
	//coordinate e grandezza Options
	int xOptions, yOptions, wOptions, hOptions;
	//coordinate e grandezza Crediti
	int xCrediti, yCrediti, wCrediti, hCrediti;
	//coordinate e grandezza CiccioGhe
	int xCiccioGhe, yCiccioGhe, wCiccioGhe, hCiccioGhe;
	//coordinate e grandezza TornaMenu
	int xTornaMenu, yTornaMenu, wTornaMenu, hTornaMenu;
	//coordinate e grandezza StartRound
	int xStartRound, yStartRound, wStartRound, hStartRound;
	//coordinate e grandezza Caselle
	int xCaselle, yCaselle, wCaselle, hCaselle;
	//coordinate e grandezza Caselle
	int xTree, yTree, wTree, hTree;
	//coordinate primo minerle primo gruppo (7)
	int xCreaMinerali1, yCreaMinerali1;
	//coordinate //coordinate primo minerle secondo gruppo (6)
	int xCreaMinerali2, yCreaMinerali2;
	//da sommare alle cordinate qua sopra
	int xCreaMinerali12Piu, yCreaMinerali12Piu;
	//grandezze minerali
	int wBottoneMinerale, hBottoneMinerale;
	
	public void setRisoluzione() {
		switch(height) {
		case 1080:
			//1920, 1080
			xLabelResource = 0;
			yLabelResource = 0;
			wLabelResource = 290;
			hLabelResource = 372;
			xGem = 20;
			yGem = 20;
			wGem = 100;
			hGem = 103;
			yGemPiu = 118;
			wNumber = 29;
			hNumber = 92;
			xNgem123 = 130;
			xNgem123Piu = 30;
			yNgem1 = 25;
			yNgem2 = 143;
			yNgem3 = 261;
			xTitolo = 505;
			yTitolo = 83;
			wTitolo = 910;
			hTitolo = 245;
			xNewGame = 700;
			yNewGame = 473;
			wNewGame = 520;
			hNewGame = 135;
			xLoad = 700;
			yLoad = 647;
			wLoad = 520;
			hLoad = 135;
			xOptions = 700;
			yOptions = 821;
			wOptions = 520;
			hOptions = 135;
			xCrediti = 1750;
			yCrediti = 910;
			wCrediti = 120;
			hCrediti = 120;
			xCiccioGhe = 0;
			yCiccioGhe = 500;
			wCiccioGhe = 225;
			hCiccioGhe = 225;
			xTornaMenu = 1800;
			yTornaMenu = 0;
			wTornaMenu = 120;
			hTornaMenu = 120;
			xStartRound = 665;
			yStartRound = 60;
			wStartRound = 590;
			hStartRound = 155;
			xCaselle = 565;
			yCaselle = 296;
			wCaselle = 790;
			hCaselle = 720;
			xTree = 0;
			yTree = 900;
			wTree = 120;
			hTree = 120;
			xCreaMinerali1 = 575;
			yCreaMinerali1 = 300;
			xCreaMinerali2 = 631;
			yCreaMinerali2 = 398;
			xCreaMinerali12Piu = 113;
			yCreaMinerali12Piu = 196;
			wBottoneMinerale = 94;
			hBottoneMinerale = 97;
			break;
		case 768:
			//1366, 768
			xLabelResource = 0;
			yLabelResource = 0;
			wLabelResource = 206;
			hLabelResource = 265;
			xGem = 14;
			yGem = 14;
			wGem = 71;
			hGem = 73;
			yGemPiu = 84;
			wNumber = 21;
			hNumber = 65;
			xNgem123 = 93;
			xNgem123Piu = 21;
			yNgem1 = 18;
			yNgem2 = 102;
			yNgem3 = 186;
			xTitolo = 360;
			yTitolo = 51;
			wTitolo = 647;
			hTitolo = 174;
			xNewGame = 498;
			yNewGame = 336;
			wNewGame = 370;
			hNewGame = 96;
			xLoad = 498;
			yLoad = 460;
			wLoad = 370;
			hLoad = 96;
			xOptions = 498;
			yOptions = 584;
			wOptions = 370;
			hOptions = 96;
			xCrediti = 1244;
			yCrediti = 646;
			wCrediti = 85;
			hCrediti = 85;
			xCiccioGhe = 0;
			yCiccioGhe = 355;
			wCiccioGhe = 160;
			hCiccioGhe = 160;
			xTornaMenu = 1281;
			yTornaMenu = 0;
			wTornaMenu = 85;
			hTornaMenu = 85;
			xStartRound = 473;
			yStartRound = 43;
			wStartRound = 420;
			hStartRound = 110;
			xCaselle = 402;
			yCaselle = 211;
			wCaselle = 562;
			hCaselle = 512;
			xTree = 0;
			yTree = 600;
			wTree = 85;
			hTree = 85;
			xCreaMinerali1 = 409;
			yCreaMinerali1 = 213;
			xCreaMinerali2 = 449;
			yCreaMinerali2 = 283;
			xCreaMinerali12Piu = 80;
			yCreaMinerali12Piu = 140;
			wBottoneMinerale = 67;
			hBottoneMinerale = 69;
			break;
		}
	}
	
	/*xLabelResource = 
			yLabelResource = 
			wLabelResource = 
			hLabelResource = 
			xGem = 
			yGem =
			wGem =
			hGem =
			wNumber =
			hNumber =
			xNgem123 =
			xNgem123Piu = 
			yNgem1 =
			yNgem2 =
			yNgem3 =
			xTitolo = 
			yTitolo = 
			wTitolo = 
			hTitolo = 
			xNewGame = 
			yNewGame = 
			wNewGame = 
			hNewGame = 
			xLoad = 
			yLoad = 
			wLoad = 
			hLoad = 
			xOptions = 
			yOptions = 
			wOptions = 
			hOptions = 
			xCrediti = 
			yCrediti = 
			wCrediti = 
			hCrediti = 
			xCiccioGhe = 
			yCiccioGhe = 
			wCiccioGhe = 
			hCiccioGhe = 
			xTornaMenu = 
			yTornaMenu = 
			wTornaMenu = 
			hTornaMenu = 
			xStartRound = 
			yStartRound = 
			wStartRound = 
			hStartRound = 
			xCaselle = 
			yCaselle = 
			wCaselle = 
			hCaselle = 
			xCreaMinerali1 = 
			yCreaMinerali1 = 
			xCreaMinerali2 = 
			yCreaMinerali2 = 
			wBottoneMinerale = 
			hBottoneMinerale ;
			
			//coordinate e grandezza LabelResource
gm.risoluzione.xLabelResource, gm.risoluzione.yLabelResource, gm.risoluzione.wLabelResource, gm.risoluzione.hLabelResource
//coordinate e grandezza GemmeContatori
gm.risoluzione.xGem, gm.risoluzione.yGem, gm.risoluzione.wGem, gm.risoluzione.hGem
//grandezza numeri
gm.risoluzione.wNumber, gm.risoluzione.hNumber
//coordinate e grandezza NumeriContatori
gm.risoluzione.xNgem123, gm.risoluzione.xNgem123Piu, gm.risoluzione.yNgem1, gm.risoluzione.yNgem2, gm.risoluzione.yNgem3
//coordinate e grandezza Titolo
gm.risoluzione.xTitolo, gm.risoluzione.yTitolo, gm.risoluzione.wTitolo, gm.risoluzione.hTitolo
//coordinate e grandezza NewGame
gm.risoluzione.xNewGame, gm.risoluzione.yNewGame, gm.risoluzione.wNewGame, gm.risoluzione.hNewGame
//coordinate e grandezza Load
gm.risoluzione.xLoad, gm.risoluzione.yLoad, gm.risoluzione.wLoad, gm.risoluzione.hLoad
//coordinate e grandezza Options
gm.risoluzione.xOptions, gm.risoluzione.yOptions, gm.risoluzione.wOptions, gm.risoluzione.hOptions
//coordinate e grandezza Crediti
gm.risoluzione.xCrediti, gm.risoluzione.yCrediti, gm.risoluzione.wCrediti, gm.risoluzione.hCrediti
//coordinate e grandezza CiccioGhe
gm.risoluzione.xCiccioGhe, gm.risoluzione.yCiccioGhe, gm.risoluzione.wCiccioGhe, gm.risoluzione.hCiccioGhe
//coordinate e grandezza TornaMenu
gm.risoluzione.xTornaMenu, gm.risoluzione.yTornaMenu, gm.risoluzione.wTornaMenu, gm.risoluzione.hTornaMenu
//coordinate e grandezza StartRound
gm.risoluzione.xStartRound, gm.risoluzione.yStartRound, gm.risoluzione.wStartRound, gm.risoluzione.hStartRound
//coordinate e grandezza Caselle
gm.risoluzione.xCaselle, gm.risoluzione.yCaselle, gm.risoluzione.wCaselle, gm.risoluzione.hCaselle
//coordinate primo minerle primo gruppo (7)
gm.risoluzione.xCreaMinerali1, gm.risoluzione.yCreaMinerali1
//coordinate primo minerle secondo gruppo (6)
gm.risoluzione.xCreaMinerali2, gm.risoluzione.yCreaMinerali2
//grandezze minerali
gm.risoluzione.wBottoneMinerale, gm.risoluzione.hBottoneMinerale
*/

}
