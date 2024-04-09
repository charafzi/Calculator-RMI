# RMI Java Project

This Java project demonstrates Remote Method Invocation (RMI) for interprocess communication between a client and a server. The server provides mathematical operations as remote services, and the client invokes these services over the network.

## Components

### Server
The server component provides the implementation of the remote services. It consists of the following files:

- `ImplServiceDistant.java`: Implementation of the remote interface `InterfaceServiceDistant`. This class extends `UnicastRemoteObject` and implements methods for mathematical operations such as sum, subtraction, multiplication, and division.
- `InterfaceServiceDistant.java`: Remote interface defining the methods that can be invoked remotely by the client.

### Client
The client component consumes the remote services provided by the server. It typically consists of a separate Java application that communicates with the server to perform remote method invocations.

## How to Run

1. Add the "InterfaceServiceDistant.jar" jar file located in "CLIENT_RMI" folder to module path of the Client project.
2. Compile the server and client components separately using the Java compiler (`javac`).
3. Run the server application (`java service.ServerRMI`) to start the server and bind the remote services to the RMI registry.
4. Run the client application (`java client.ClientRMI`) to connect to the server and invoke remote methods.

## Usage

- Modify the server implementation (`ImplServiceDistant.java`) to add more remote services or customize existing ones.
- Modify the client application (`Client.java`) to consume the remote services according to your requirements.
- Handle exceptions properly in both client and server components, especially `RemoteException` which can occur during remote method
