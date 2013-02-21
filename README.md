# Android Chronometer V2 #

![](https://github.com/yvelabs/chronometer2/blob/master/yvelabs_chro_v2.png?raw=true)

You can easily integrate it into your project. <br>
Just Import the [yvelabs-chronometer-v2.0.jar](https://github.com/yvelabs/chronometer2/blob/master/yvelabs-chronometer-v2.0.jar "yvelabs-chronometer-v2.0.jar")

## usage ##

### Layout
``` xml
  
	<com.yvelabs.chronometer2.Chronometer
	        android:id="@+id/chronometer1" >
	</com.yvelabs.chronometer2.Chronometer>
```
### Java

- Function:


``` java

chro.reset();
chro.start();
chro.pause();
chro.stop();
chro.duringTime();
chro.getState();

```


- Optional settings:


``` java
chro.setPlayPauseAlphaAnimation(true);
chro.setTypeFace(Chronometer.getTypeface_FONT_DUPLEX(this));
chro.setTextSize(50);
chro.setTextBold(false);
chro.setTextColor();
chro.setStartingTime();

```
