package holaServer;

import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.util.HashMap;
import java.util.Map;

public class HolaImpl implements Hola, HolaRegistro {
   private Map<String,String> listado=null;

   public HolaImpl() throws RemoteException {
       super();
       listado = new HashMap<String,String>();
   }

   public String saluda(String nombre) {
       String ip = null;
       try {
           ip = this.getClientHost();
       } catch (ServerNotActiveException snae) {
           snae.printStackTrace(System.err);
       }
       listado.put(ip, nombre);
       return "Hola, "+nombre+" !";
   }

   public Map<String,String> lista() {
       return listado;
   }
}