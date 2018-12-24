# CS111CProjectD
Linked Nodes Implementation
Implement the list interface described in Project B: Interfaces using linked nodes. As a reminder, that interface described a list that works like this:

entries can only be added to and removed from the beginning or end of the list
entries can be accessed in any position
entries begin at index 0
Your class header and instance data variables will be:

public class LinkedHeadTailList<T> implements HeadTailListInterface<T> 

private Node head, tail;
Note: You must use a head and tail reference!

Use the same nested Node class that is used in LList.

You can add additional variables if you choose.

You must implement every method from the interface. Make sure to account for special conditions such as empty lists and singleton lists.

Use the interface file provided. I have also provided a tester file that displays the expected output.


ProjectDFiles.zip

Your implementation must contain these implemented methods. Follow the API descriptions from the interface file and the additional characteristics listed below.

constructor (4 points)
addFront (15 points)
addBack (15 points)
clear (4 points)
contains (8 points)
display (8 points)
see the tester program for the format of the output
the output should list the contents plus the value of head and tail (when the list is not empty)
getEntry (8 points)
isEmpty (4 points)
removeFront (15 points)
removeBack (15 points)
size (4 points)
Extra Credit (10 points)

Write a second class to implement HeadTailListInterface. (You still must complete the first class, above!)

Instead of using linked nodes, use a List object as your instance data variable. (List from the Java standard library- not ListInterface!) Inside the methods of this class, invoke methods on the List object to accomplish the task. Note: some methods might look very, very simple... this does not mean they are wrong! 

Make sure the driver doesn't crash with any exceptions!

The class header and instance data will be:

public class ListHeadTailList<T> implements HeadTailListInterface<T>

List<T> list; // initialize to type ArrayList or LinkedList
Submitting

Remove any named package statements. Then zip together all .java files, even those that were not modified:

HeadTailListInterface (not modified)
LinkedHeadTailList
ListHeadTailList (if completing extra credit)
ProjectDTester (not modified)
If submitting as a group, submit one assignment only through one group member's Canvas account. Put the names of all group members in Canvas comment box on the submission page.
