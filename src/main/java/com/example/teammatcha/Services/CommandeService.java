package com.example.teammatcha.Services;

import com.example.teammatcha.Beans.CommandeBean;
import com.example.teammatcha.repository.ProductsRepository;

public class CommandeService {
    private ProductsRepository commandeRep;

    public ProductsRepository getCommandeRep() {
        return commandeRep;
    }

    public void setCommandeRep(ProductsRepository commandeRep) {
        this.commandeRep = commandeRep;
    }

    public CommandeService(ProductsRepository commandeRep) {
        this.commandeRep = commandeRep;
    }

    public CommandeService() {
    }

    //MÉTHODE GET ALL()

    /*public static ProductsRepository getAll(){
        return
    }*/

    //METHODE ADDCOMMAND()
    /*public static CommandeBean addCommand(CommandeBean commande){
        return
    }*/


    //MÉTHODE SAVE()
    public static void save(){

    }
}
