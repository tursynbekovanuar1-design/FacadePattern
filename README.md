# Assignment #4 — Home Theater Facade Pattern Implementation

**Course:** Software Design Patterns (ShP-2216)  
**Institution:** Astana IT University  
**Author:** Anuar Tursynbekov  

---

## 📌 Description
This project demonstrates the implementation of the **Facade Structural Design Pattern** in Java 17. The system simplifies the interaction with a complex Home Theater Subsystem consisting of multiple devices (Amplifier, DVD Player, Projector, Screen, Theater Lights, Popcorn Popper) behind a unified, simple facade interface.

## 📁 Project Structure
```text
src/
 ├── subsystem/
 │    ├── Amplifier.java
 │    ├── DvdPlayer.java
 │    ├── PopcornPopper.java
 │    ├── Projector.java
 │    ├── Screen.java
 │    └── TheaterLights.java
 ├── facade/
 │    └── HomeTheaterFacade.java
 └── Main.java
