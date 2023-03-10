package uniconteam.magicworld;
import uniconteam.magicworld.MwPlayHomeActivity;

public class MwTutorial {
    
    // Block of tutorial
    public void mwTutorial(){
        if(MwPlayHomeActivity.mwTutorialLevel.equals("1")){
            MwPlayHomeActivity.mwTutorialBoxText.setText("«Tutorial level 1»\n\nFor next step click on tutorial box");
        }
    }
}