 import java.rmi.*;
 import java.rmi.server.*;
 class RMIServer extends UnicastRemoteObject implements myinterface
 {
 public RMIServer()throws
 RemoteException{ System.out.println("Remote Server is running Now.!!");
 }
 public static void main(String arg[]){
 System.out.println("This program is done by SURESH S 221211101143"); try{
 RMIServer p=new RMIServer();Naming.rebind("rmiInterface",p);
 }catch(Exception e)
 { System.out.println("Exception occurred : "+e.getMessage());
 }}
 public String countInput(String input) throws
 RemoteException{ System.out.println("Received your input "+input+" at server!!"); String reply;
 reply="You have typed "+ input.length() +" letters!!";return reply;
 }
 }