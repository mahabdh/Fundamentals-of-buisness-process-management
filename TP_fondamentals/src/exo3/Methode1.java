package exo3;

public class Methode1 {
	//ecrire les noms
	public static String nom(int n) {
		String m="";
		switch(n) {
		case 0 : m = "Anfel"; break;
		case 1 : m = "Besma";break;
		case 2 : m = "Ali";break;
		case 3 : m = "Dounia";break;
		case 4 : m = "Esmaa";break;
		case 5 : m = "Feryel";break;
		case 6 : m = "Narimane";break;
		case 7 : m = "Amine";break;
		case 8 : m = "Adem";break;
		}
		return m;
	}
	
	//afficher nb followers de chaque etudiant
	public static void methode1(int [][] m) {
		double t1= System.nanoTime();
		float somme =0;int i=0;int j=0;float max = 0;int jmax=0; double p=0; double pmax=0;
		while(j<m.length) {
			for(i=0;i<m.length;i++) {
				somme = somme + m[i][j];
			}
			p= somme/9;
			System.out.println("nb followers de "+j+" = "+somme+"\t (pourcentage = "+p+")");
			if(somme>max) {max = somme; jmax=j; pmax=p;}
			somme = 0;
			j++;
		}
		System.out.println("le leader qui a le max de followers est : "+jmax+ ", avec "+max+" followers"+"\t (pourcentage = "+pmax+")");
		String leader = nom(jmax);
		System.out.println(leader);
		double t2 = System.nanoTime();
		double t = t2-t1;
		System.out.println("le temps d'execution = "+t);
				
		
		}
			
		
	
//=================================================================================================
//=============================================================================================
	
	// methode 2
	public static void methode2(int [][] m) {
		double t1= System.nanoTime();
		float max=0,p=0,pmax=0;float somme =0;int i,jmax=0;
	for (i=0;i<m.length;i++) {
		somme=0;
		for(int j=0;j<m[i].length;j++) {
			somme = somme +m[i][j];
			p= somme/9;
			if(somme>max) {max=somme;jmax=i; pmax=p;}
		}
		System.out.println("la personne "+i+" follow "+somme+" personnes. \t (pourcentage = "+p+")");
	}
	System.out.println("le leader qui follow le max de persones est "+jmax+" avec "+max+" personnes. \t (pourcentage = "+pmax+")");
	String leader = nom(jmax);
	System.out.println(leader);
	double t2 = System.nanoTime();
	double t = t2-t1;
	System.out.println("le temps d'execution = "+t);
	}
	
//=================================================================================================
//=============================================================================================
		
	// afficher la matrice
	
	  public static void afficher(int [][] m){
			for (int i=0;i<m.length;i++) {
				System.out.print("[");
				for(int j=0;j<m.length;j++) {
					System.out.print(" "+m[i][j]+" ");
				}
				System.out.print("]");
				System.out.println("");
			}
			}
	  
	//======================================================================================
	 //===================================================================================
	
	  //methode 3
	 public static void methode3(int [][] m) {
		 double t1= System.nanoTime();
		 int i,j=0,s=0,max=0,jmax=0,k; 
		 while(j<m.length) {
			 for(i=0;i<m.length;i++) {
				 s = s + m[i][j];
				 int var = m[i][j];
				 if(var == 1){
					 for(k=0;k<m.length;k++) {
						 s = s + m[k][i];
					 }
				 }
			 }
			 System.out.println("somme totale de "+j+" = "+s);
			 if(s > max) {max = s; jmax=j;}
			 s=0;
			 j++;
		 }
		 System.out.println("la personne la plus influente est : "+jmax);
		 String leader = nom(jmax);
			System.out.println(leader);
		 double t2 = System.nanoTime();
			double t = t2-t1;
			System.out.println("le temps d'execution = "+t);
	 }
	  
	  
	  
	
	public static void main(String[] args) {
		int [][] matrice = {{0,1,1,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,1},{0,0,0,0,1,0,0,0,1},{0,0,0,0,1,0,0,0,1},{0,0,0,0,0,0,0,0,0}};
		methode1(matrice);
		methode2(matrice);
		methode3(matrice);
		
		
	}

}
