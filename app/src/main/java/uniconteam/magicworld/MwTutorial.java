package uniconteam.magicworld;

import uniconteam.magicworld.MwPlayHomeActivity;

public class MwTutorial {
    
    // Block of tutorial
    public void mwTutorialData(){
        if(MwPlayHomeActivity.mwTutorialLevel == 1){
            MwPlayHomeActivity.mwTutorialBoxText.setText("For start tutorial or next step click on this box");
        }
        if(MwPlayHomeActivity.mwTutorialLevel == 2){
            MwPlayHomeActivity.mwTutorialBoxText.setText("In your item you have coinhouse — put house in land");
        }
    }
}