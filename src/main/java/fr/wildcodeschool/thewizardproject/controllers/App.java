package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.Outfit;

public class App {
    public void start() {
        Dumbledore WizardInterface = new Dumbledore();

        System.out.println("******************");
        System.out.println(WizardInterface.giveAdvice());
        System.out.println("******************");
        Outfit myOutfit = new Outfit();
        WizardInterface.setOutfit(myOutfit);
        System.out.println(WizardInterface.changeDress());

    }
}