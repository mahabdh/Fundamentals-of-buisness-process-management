
package firstAgent;
import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class HelloWorldAgent extends Agent {
	
	 /* protected void inscription() {
		  DFAgentDescription dfd = new DFAgentDescription();
	      dfd.setName(getAID());
	      ServiceDescription sd = new ServiceDescription();
	      sd.setType("document");
	       sd.setName(getLocalName() + "nassira");
	       dfd.addServices(sd);
	      
	     // System.out.println("Hello World! My name is "+getLocalName());
	  } */
	
	    protected void setup()  {
	    	DFAgentDescription dfd = new DFAgentDescription();
		    dfd.setName(getAID()); 
		    ServiceDescription sd = new ServiceDescription();
	    	System.out.println("Hello World! My name is "+getLocalName());
	    }
   
	}
	
	 
	