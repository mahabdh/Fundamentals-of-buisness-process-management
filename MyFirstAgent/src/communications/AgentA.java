package communications;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgentA extends Agent{
    String nom;
    String prenom;
    String login;
    String mot_de_passe;
    protected void setup() {
    addBehaviour(new CyclicBehaviour(){
        public void action(){
            ACLMessage message = new ACLMessage (ACLMessage.INFORM);
            message.addReceiver(new AID ("agentB",AID.ISLOCALNAME));
            message.setContent ("bonjour mon ami ");
            send (message);
        }








    });
    }}