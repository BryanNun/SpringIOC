package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {

    private Outfit myOutfit;
    @Autowired
    public Gandalf(Outfit theOutfit){
        myOutfit = theOutfit;
    }
    @Override
    public String giveAdvice() {
        return "You shall not pass";
    } 
    @Override
    public String changeDress(){
        return this.myOutfit.wizardDress();
    }
}