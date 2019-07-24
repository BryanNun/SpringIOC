package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "You shall not pass";
    } 
    @Override
    public String changeDress(){
        return myOutfit.wizardDress();
    }

    public void setOutfit(Outfit theOutfit){
        myOutfit = theOutfit;
    }
}