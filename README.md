Java Inheritance and Polymorphism Exercise

Description
This project is an exercise in object-oriented programming, specifically focusing on inheritance and polymorphism in Java. The goal is to create a class hierarchy for musical instruments and demonstrate polymorphic behavior through method overriding.
Project Structure
The project consists of the following classes:
-  Instrument (abstract class):
    Instrument class have two atritubtes ( name and price). Both will be inherited by the suclasses.
    This class Ddfines an abstract method playInstrument() which will be implemented by its subclasses.

WindInstrument (subclass of Instrument):

Implements playInstrument(), returning a string indicating that a wind instrument is being played.

PercussionInstrument (subclass of Instrument):

Implements playInstrument(), returning a string indicating that a percussion instrument is being played.

StringInstrument (subclass of Instrument):

Implements playInstrument(), returning a string indicating that a string instrument is being played.

Main Class:

Creates instances of each instrument type.

Calls the playInstrument() method on each instance to demonstrate polymorphism.
