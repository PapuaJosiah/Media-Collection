# Media-Collection
Creates a basic media collection where each object has certain attributes. Used to learn Java.

# Notes
## Objective
This first set of activities will give you the chance to create some basic classes and implement some
object-oriented programming concepts.
##Description
This activity set consists of several related parts. While you can get credit for any one activity listed
below without completing the others, I would recommend completing them in the order they are given.
##Domain Description
For these activities, you are creating a system to track my digital entertainment media collection. My
digital collection consists of two types of items: music albums and movies. All items have a title, a
unique identifier, a genre, a URL, a run length, and a count of the number of times I've watched or
listened to them. Music albums also contain an artist and a count of the number of songs/tracks on the
album. Movies contain a producer and a list of the main actors/actresses. I can ask these objects for
this information at any time. Most of this information is set when the object is created, and only the
count of the times watched/listened can be incremented (and only by 1).

When created, a digital entertainment media collection starts out without any items. I can add both
music albums and movies to the collection. I can also get a count of the number of items in the
collection, and a list of all the items in the collection. I can also request the entertainment collection
play a particular item by specifying the identifier, and the collection will print the title to standard
output (to simulate the playing of our digital media) and increment the count for the number of plays.

Finally, I can also ask a digital media collection to provide me a sorted list of titles which are sorted
based upon a given Comparator:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html
