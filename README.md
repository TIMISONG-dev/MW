<h1>MW</h1>

```java
class GameProperties {
   String name = "Magic World";
   String creator = "Timisong";
   String engine = "MwConsortium";
}
```
<h1>MwConsortium</h1>
<p>Engine for MW and it animates all the animations in the game

The game uses 3 threads: </p>

```java
if(MenuActivity.animRuleThrX){
// code of thread X (1-3)
}
```
<p>To prevent different animations from overlapping each other for each object created <a href="https://developer.android.com/reference/android/animation/ObjectAnimator">ObjectAnimator</a></p>
<p>Example:</p>

```java
ObjectAnimator objScaleX = new ObjectAnimator();
ObjectAnimator objScaleY = new ObjectAnimator();
```
