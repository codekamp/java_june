package codekamp;

// Think of interface like a set of criteria

// when you define a new class you define a new datatype
// So if we define a class named XYZ, we can create object and variables of
// ...type XYZ

// Defining a new interface also adds a new datatype
// But dataype added by interface can be used only for
// ...defining variables, not for creating object.
// So if we define an interface XYZ, we can now create
// ...variables of type XYZ but not objects of type XYZ.


// But then what do we store in variable of XYZ interface
// Object of ANY class as long as that class implements
// ...XYZ interface.

// A class can extend only one Super class. But it can
// ...implement multiple interfaces.

public interface Educated {
    public void read();
    public void write();
}