/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon
 */
public class ShopMenuView extends View
{
    private final String foodText;
    private final String ammoText;
    private final String medText;
    private final String pistolText;
    private final String rNUMenuText;
    private final String quit2MainText;
    private final String pistolSupplyText;
    
    public int getPistolSupply()
    {
        String pistols[] = {"RedPistol", "FlintPistol", "BBPistol"}; //placeholder until we've got the inventory set up
        int pistolSupply = 0;
        int count = 0;
        
        for (int i = 0; i < pistols.length - 1; i++)
        {
            count++;
        }
        pistolSupply = count;
            
        
        return pistolSupply;
    }
    
    public ShopMenuView() 
    {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Shop Menu                                                  |"
            + "\n1 - Food                                                 *50 |"
            + "\n2 - Ammunition                                           *20 |"
            + "\n3 - Medical Supplies                                     *35 |"
            + "\n4 - Flintlock Pistol                                    *100 |"
            + "\n5 - Check Pistol Supply                                      |"   
            + "\nR - Repair and upgrades menu                                 |"   
            + "\nQ - Quit to game menu                                        |"
            + "\n--------------------------------------------------------------");

        this.foodText = "\nPurchase Food has been called";
        this.ammoText = "\nPurchase ammo has been called";
        this.medText = "\nPurchase medical supplies has been called";
        this.pistolText = "\nPurchase of Flintlock Pistol has been called";
        this.rNUMenuText = "\nRepair and upgrades menu has been called";
        this.quit2MainText = "\nQuit to main menu has been called";
        this.pistolSupplyText = "\nThe quantity of pistols in the supply is: " 
                                + this.getPistolSupply();
    }

    
    @Override
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "1":
                this.displayInfo(foodText);
                break;
            case "2":
                this.displayInfo(ammoText);
                break;
            case "3":
                this.displayInfo(medText);
                break;
            case "4":
                this.displayInfo(pistolText);
                break;
            case "5":
                this.displayInfo(pistolSupplyText);
                break;
            case "R":
                this.displayInfo(rNUMenuText);
                break;
            case "Q":
                this.displayInfo(quit2MainText);
                return true;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
    private void displayInfo(String text) 
    {
        this.console.println(text);
        this.console.println("\n\nPress Enter to go back to the save menu");
        
        try {
            keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ShopMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
