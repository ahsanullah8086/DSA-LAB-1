class Courier{
 // declaring variables
int poids=0;
boolean aExpress;
String address=null;
boolean isNotValid;

//Operations
Courier(int poids, boolean aExpress, String address)
{

}


public boolean isExpress(){
    return aExpress;
}

public double affranchirCourier(){
  return 1.0;
}
public void affcher(){}
}
      // child class
class Publicit extends Courier {

double prix=0;


Publicit(int poids ,int isExpress, String adress){

}

double getPrix(){
 return poids;
}

void affcher(){

}
double affranchirCourier(){
 return 1.0;
}


}


class Lettre extends Courier{
 String format=null;
 double prix=0;
 Lettre(int poids,boolean isExpress,String address,String format){
 }
double getPrix(){
	return 1.0;
}
void affcher(){
	
}
double affranchirCourier(){
 return 1.0;
}

}
//colis
class Colis extends Courier{
double volume=0;
double prix=0;

Colis(int poids,boolean isExpress,String address,int Volume){}
double getPrix(){
	return poids;
	
}
void affcher(){}
double affranchirCourier(){
	return 1.0;
}


}