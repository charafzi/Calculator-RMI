package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServiceDistant extends Remote {
	public int somme(int a,int b) throws RemoteException;
	public int soustraction(int a, int b) throws RemoteException;
	public int multiplication(int a,int b)throws RemoteException;
	public double division(int a,int b) throws RemoteException;

}
