
public final class Singleton
{
  private Singleton connectionProtocol;
  private Singleton
{
  public static Singleton getInstance(String connetionProtocol){
   if(connectionProtocol==null )
   connectionProtocol = new Singleton();
    else
     return connectionProtocol;
} 

public static void release(){
connectionProtocol=null;
}
public static Singleton getCurrentConnetions(){
return connectionProtocol;
} 

public static void send(String message){
message= "Connection performed";
  System.out.println(message);
} 

} 

*************************************
pubic class Main{
Singleton connection;
public static void main(String[] args)
{ 

Singleton.getInstance(connection);
Singleton.release();
Singleton.getCurrentConnections();
Singleton.send("All connections perfomed");
}
}