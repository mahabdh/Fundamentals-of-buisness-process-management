package communications;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgentB extends Agent{
    String nom;
    String prenom;
    String login;
    String mot_de_passe;
    protected void setup() {
    addBehaviour(new CyclicBehaviour(){
        public void action(){
            ACLMessage messagerecu = receive();
        }
    });
    }
}
   // -gui jade.Boot nom_de_lagent(A):nom_du_package.nomdelaClasse nom_de_lagent(B):nom_du_package.nomdelaClasse