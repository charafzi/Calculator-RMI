package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplServiceDistant extends UnicastRemoteObject implements InterfaceServiceDistant{
	
	public ImplServiceDistant() throws RemoteException
	{
		
	}

	@Override
	public int somme(int a, int b) throws RemoteException {
		return (a + b);
	}

	@Override
	public int soustraction(int a, int b) throws RemoteException {
		return (a - b);
	}

	@Override
	public int multiplication(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return (a * b);
	}

	@Override
	public double division(int a, int b) throws RemoteException {
		return (double) a / b;
	}

}
