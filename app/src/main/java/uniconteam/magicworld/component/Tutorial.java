package uniconteam.magicworld;

import uniconteam.magicworld.HomeActivity;

public class Tutorial {
    
    // Block of tutorial
    public void tutorialData(){
        if(HomeActivity.tutorialLevel == 1){
            HomeActivity.tutorialBoxText.setText("For start tutorial or next step click on this box");
        }
        if(HomeActivity.tutorialLevel == 2){
            HomeActivity.tutorialBoxText.setText("In your item you have coinhouse — put house in land");
        }
    }
}