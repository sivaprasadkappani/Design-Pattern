package com.edlumens.msc.pattern.abstractfactory;

//Client code
public class Main {
 public static void main(String[] args) {
     GUIFactory windowsFactory = new WindowsFactory();
     Button windowsButton = windowsFactory.createButton();
     Checkbox windowsCheckbox = windowsFactory.createCheckbox();

     GUIFactory macOsFactory = new MacOSFactory();
     Button macOsButton = macOsFactory.createButton();
     Checkbox macOsCheckbox = macOsFactory.createCheckbox();

     windowsButton.click();
     windowsCheckbox.check();

     macOsButton.click();
     macOsCheckbox.check();
     
      
 }
}