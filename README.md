# Nosebleed Tracker

This repository contains the Android Studio project for a nosebleed tracker app that I made during the COVID-19 pandemic. During that time, for some unknown reason, I began to very easily get nose bleeds, especially when exercising. Spending many minutes with my head over the sink left me wondering if I could predict when the nosebleed would finally clot, by clicking a button to record each drop of blood that leaves my nose. I was inspired by [this video](https://www.youtube.com/watch?v=k7q0Y2W0Rn4) from Steve Mould, where he performed a time-series analysis of his wife's contractions during labour and almost exactly predicted his daughter's time of birth.

The first version of this tracker simply displayed a guess that the nosebleed would likely stop soon if the inter-drip time was greater than or equal to 5 seconds. I think shortly after I tried it a couple of times, the nosebleeds stopped, and I got bored. At some stage I'll come back and implement a proper time-series forecasting algorithm.

<TO-DO - Insert screenshots of app >

## Project Structure

```
├── "".gradle"" => Contains gradle configuration for the app.
├── "".idea"" => Contains IDE configuration for this project.  
├── ""app"" => Contains the source code for the app.
├── ""gradle"" => Contains the gradle wrapper for the app.
├── ""build.gradle"" => Top level build configuration file for the gradle.
├── ""gradle.properties"" => Project-wide gradle configuration.
├── ""gradlew"" => Gradle start up script for UniX.
├── ""gradew.bat"" => Gradle startup script for Windows.
├── ""local.properties" => Automatically generated file.
├── ""settings.gradle" => User-defined global variables for gradle.
```
