package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.Outfit;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
    public void start() {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizardInterface myWizardInterface = context.getBean("Wizard", WizardInterface.class);

        context.close();

        Gandalf WizardInterface = new Gandalf();
        System.out.println("******************");
        System.out.println(WizardInterface.giveAdvice());
        System.out.println("******************");
        Outfit myOutfit = new Outfit();
        WizardInterface.setOutfit(myOutfit);
        System.out.println(WizardInterface.changeDress());
    }
}