package fr.wildcodeschool.thewizardproject.models;


public class Dumbledore implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "Harry Potter is a god";
    } 
    @Override
    public String changeDress(){
        return myOutfit.wizardDress();
    }

    public void setOutfit(Outfit theOutfit){
        myOutfit = theOutfit;
    }
}