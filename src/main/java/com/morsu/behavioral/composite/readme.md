
# Composite Pattern

Composite design patten allows you to have a tree structure and ask each node in the tree structure to perform a task.You can take real life example of a organization.It have general managers and under general managers, there can be managers and  under managers there can be developers.Now you can set a tree structure and ask each node to perform common operation like getSalary().

# As described by Gof:

"Compose objects into tree structure to represent part-whole hierarchies.Composite lets client treat individual objects and compositions of objects uniformly".

Composite design pattern treats each node in two ways-Composite or leaf.Composite means it can have other objects below it.leaf means it has no objects below it.

# Tree structure:
![Image of CompositeGenericHeirarchy](https://github.com/handsonprogram/designpatterns/blob/master/images/CompositeDesignPatternGenericHierarchy.gif)

# UML Diagram for Composite design pattern:
![Image of CompositeGenericUML](https://github.com/handsonprogram/designpatterns/blob/master/images/CompositeDesignPatternGeneric.gif)


**Elements:**

 * __Component__
    
    Declares interface for objects in composition.
implements deafault behaviour for the interface common to all classes as appropriate.
declares an interface for accessing and managing its child components.

* __Leaf__
    
    Represents leaf objects in the composition.A leaf has no children.
defines behaviour for primitive objects in the composition.

* __Composite__
    
    defines behaviour for components having children.
stores child components.
implements child related operations in the component interface.

* __Client__
    
    manipulates objects in the composition through the component interface.

# When to use it:
you want to represent part-whole hierachies of objects.
you want client to be able to ignore difference between compositions of objects and individual objects.Clients will treat all objects in the composite structure uniformly.
