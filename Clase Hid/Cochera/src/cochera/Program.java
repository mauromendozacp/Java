package cochera;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Program {
	public static Estacionamiento est[] = new Estacionamiento[3];
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int opc;
		InsertarEstacionamiento();
		do {
                        System.out.println("\n\n\n\n\n");
			System.out.println("Menu Principal!\n\n1- Entrada Auto\n2- Salida Auto\n3- Salir\n\ningrese opcion: ");
			opc = a.nextInt();
			switch(opc) {
			case 1:
				EntradaAuto();
				break;
			case 2:
				SalidaAuto();
				break;
			default:
				break;
			}
                        
		} while(opc > 0 && opc < 3);
               
	}
	
	//ENTRADA AUTO
	public static void EntradaAuto(){
		if(!BuscarLugar()){
			System.out.print("\nYa no hay lugar en el estacionamiento!");
		}
		else{
			System.out.print("\nAuto ingresado correctamente!");
		}
	}
	public static Boolean BuscarLugar(){
		for(int i = 0; i < est.length; i++){
			if(est[i].getCapacidad() < 5){
				for(int j = 0; j < est[i].getLugar().length; j++){
					if(est[i].getLugar()[j] == "libre"){
						IngresoAuto(i,j);
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void IngresoAuto(int i, int j){
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		String matr;
		int hora;
		System.out.print("Matrícula: ");
		matr = a.nextLine();
		System.out.print("Hora inicio: ");
		hora = b.nextInt();
		
		est[i].getLugar()[j]=matr;
		est[i].getHora()[j]=hora;
		int cap = est[i].getCapacidad();
		est[i].setCapacidad(cap++);
	}
	
	
	//SALIDA AUTO
	public static void SalidaAuto(){
		Scanner a = new Scanner(System.in);
		String matr;
		System.out.print("Matrícula: ");
		matr = a.nextLine();
		if(!BuscarAuto(matr)){
			System.out.print("\nMatrícula desconocida!");
		}
		else{
			System.out.print("\nAuto retirado correctamente!");
		}
	}
	public static Boolean BuscarAuto(String matr){
		for(int i = 0; i < est.length; i++){
			if(est[i].getCapacidad() < 5){
				for(int j = 0; j < est[i].getLugar().length; j++){
					if(est[i].getLugar()[j].equals(matr)){
						RetirarAuto(i, j);
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void RetirarAuto(int i, int j){
		Scanner b = new Scanner(System.in);
		int hora, imp;
		System.out.print("Hora fin: ");
		hora = b.nextInt();
		imp = CalcularImporte(est[i].getHora()[j], hora);
		System.out.print("\nImporte: " + imp);
		LiberarLugar(i, j);
	}
	public static int CalcularImporte(int hi, int hf){
		int hr = hf - hi;
		int valhor = 0;
		if(hr>=0&&hr<=2){
			valhor = 70;
		}
		if(hr>=3&&hr<=5){
			valhor = 100;
		}
		if(hr>=5&&hr<=8){
			valhor = 120;
		}
		if(hr>=8&&hr<=12){
			valhor = 150;
		}
		if(hr>=12&&hr<=15){
			valhor = 200;
		}
		if(hr>=15&&hr<=23){
			valhor = 300;
		}
		return (valhor * hr);
	}
	public static void LiberarLugar(int i, int j){
		est[i].setLugar(j, "libre");
		est[i].setHora(j, 0);
		int cap = est[i].getCapacidad();
		est[i].setCapacidad(cap--);
	}
	
	
	public static void InsertarEstacionamiento(){
		for(int i = 0; i < est.length; i++){
			est[i] = new Estacionamiento(i);
		}
	}
}
