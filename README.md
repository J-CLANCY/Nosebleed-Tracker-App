# Nosebleed Tracker

This repository contains the Android Studio project for a nosebleed tracker app that I made during the COVID-19 pandemic. During that time, for some unknown reason, I began to very easily get nose bleeds, especially when exercising. Spending many minutes with my head over the sink left me wondering if I could predict when the nosebleed would finally clot, by clicking a button to record each drop of blood that leaves my nose. I was inspired by [this video](https://www.youtube.com/watch?v=k7q0Y2W0Rn4) from Steve Mould, where he performed a time-series analysis of his wife's contractions during labour and almost exactly predicted his daughter's time of birth.

## Project Structure

```
├── ""docs"" => Contains documentation for this project.  
│    ├── ""images"" => Pictures of the physical breadboard verison of this processor
│    ├── ""modules"" => Contains ODT documents detailing each module in the processor.
│    ├── ""schematics"" => Functional diagrams/schematics for the processor and its modules. 
│    ├── ""Specification.odt/.odt.docx"" => Document details the specifications for this processor.  
│    ├── ""Notes.odt"" => Minor document contains a couple of notes that I forgot why I wrote, but am too scared to delete. 
├── ""rtl"" => Contains the Verilog source code for the processor
├── ""verify"" => Contains a series of testbenches for each of the modules and the processor.
```
