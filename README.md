# lejos-ev3-example
Example for a [Gradle](http://gradle.org/) project for LEGO Mindstorm EV3 and [Lejos](http://www.lejos.org/). This projects demonstrate how to use professional build tools together with Lejos and the LEGO Mindstorms EV3 robot. You can integrate automated unit testing and deployment into your Lejos project.

## Build 
You need to:
* Install gradle and have it in your path
* Set the environment variable EV3_HOME to the directory where you extracted the Lejos distribution

Afterwards, you need to run:

gradle clean build

By executing this command you build and test your Lejos Application. If everything runs successfully then you find the application JAR in the subfolder "build/libs".
You can deploy this JAR on the robot.


## Deploy 
You can deploy your application on a Lego Mindstorm EV3 robot running Lejos by executing the following command:

gradle deployev3

If your robot is not connected via USB, but via WiFi then you must update the gradle.properties file to point to the correct IP and use the correct username/password.
