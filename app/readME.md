Test 1:
1. What set of commands are executed to push a repo on Github?
	git push origin master
2. Where the strings.xml in the project structure?
	The strings.xml is in the res/values folder.
3. What is the difference between SP and DP?
    SP is scale independent and DP is density independent, you should use SP for text size and DP for actual Views
4. How can you support multiple languages in your app? Explain step by step process.
	The first Step is not to have any hard-coded strings in the xml layouts and files. This means that all your strings are stored in the strings.xml file. Next step is to add another strings.xml file with different language for the values but same for the keys. So this means that when the language of the device is changed your app will look in the appropriate strings.xml file, and thus show different language.
5. What is the difference between match_parent and wrap_content?
	match_parent – is when a layout or a widget is stretches the entire size of the parent. So for example, lets say we have a Linearlayout with height of 100dp, and an EditeText inside this layout with height set to match parent, this means that the height of this EditText is 100dp also, it matches the size of parent.
	wrap_content- means that the height or width of a Layout or a widget is based on the content inside the layout or the widget.
6. How can you setup a method for a button click without binding the view?
	You can setup a method for a button click inside the xml file and just simply implement that method inside the .java file, which means you do not have to bind the button.
7. How can you define a button click method with binding the button view?
	When binding the button view you can define button click inside the onCreate method but simply doing referenceName.setOnClickListener(new OnClickListener{some code})
8. How can you change the color of the TextView?
	You can do that inside the xml layout with property textColor, or inside the java code.
9. Where are all the colors in the android architecture saved?
	The colors are saved inside the res/values folder.
10. How would you add a different layout for a landscape and a language? Name the qualifiers.
	You can create a different layout for landscape by clicking a button above the preview of the xml called create landscape variation(land). For creating a layout for another language you would use locale and chose an appropriate language.
11. How would you make the keyboard hide for EditText when the activity is created?
	To hide the keyboard you have to disable it in the java code when launching the Activity.
12. What are ViewGroups and Views?
	ViewGroups are basically a group of Views that are related so you place them in the Group. Views are anything you see on the Screen, like buttons, edit text, and so on.
13. What attribute is necessary in a linear layout if there are more than one child views?
	Orientation is necessary in a linear layout if there are more than one child views.
14. In which case you would use a Linear layout and a Relative layout?
	You would use linear layout if you wanted your Views to appear one after another in a vertical or horizontal fashion. You would use Relative layout if you wanted to arrange your views in any way you like related to each other.
15. How would you load an image in a ImageView from xml and programmatically?
	To set image in xml you would use (app:srcCompat=”loaction”). To set image programmatically you would use setImageBitmap or some other method like setResource, basically there are more than one way.
16. List all the states in an activity lifecycle.
	onCreate()
	onStart()
	onResume()
	onPause()
onStop()
onRestart()
onDestroy()
17. What is the lifecycle of activity one and activity two when we go to activity one from two?
	So I’m assuming that the activity two is already on the screen and went through all the onCreate stuff. And I’m assuming that we already have been in the activity one and left to two.
	Activity two – onPause() , onStop(),
	Activity one – onCreate(), onStart(), onResume();
18. How to restrict an activity from changing the orientation?
    you can go to the manifest file and declare the orientation of an activity to what ever you like. For instance, portrait.
19. Which method is called to persist the data before the activity is destroyed?
onSaveInstanceState or you can save data onStop
20. What is the argument of that method?
Bundle
21. How do we save the data in the method?
You can save it using shared preferences or database or server, or put data in the bundle
22. How to get that data back? What is the name of the method?
Also you can use shared preferences to get it back, or if you used bundle just get it out from there
23. What is a bundle? What can a bundle contain?
	Bundle is a data structure that can contain Intents or another bundles or strings or anything
24. What is the difference between onPause and onStop?
onStop() the activity is no longer seen while onPause it is in the background still slightly visible
25. How to start an activity for getting a result back?
startActivityForResult(Intent);
26. Which callback is used get the result back in the above case?
onActivityResult. Something like that
27. What are difference types of Intent? What are the difference between them? When do we use each of them?
There are explicit and implicit intents. Explicit is when you know the exact destination where you going, so moving from one activity to another inside your app. Implicit is when you need some work done but you are not sure what can do this work for you, so make an implicit intent and ask the operating system to get to you what you need if it has anything. For instance to start the camera.
28. How to communicate data between activities?
You can use Intents and pass data around.
29. How to add data to an intent?
Just call any of the methods to addExtra. addStringExtra(key, value), addIntExtra(key, value);
30. What kind of data can be added to an intent?
	You can add strings, integers, Objects that implement the Serializable interface, or Parcilable
31. How to get the data sent from activity one in activity two?
	You can retrieve that data in the second activity by getting the intent (getIntent) and getting the extras out from that intent
32. What is context?
	Context is the Activity it self or the application
33. Name different kinds of layouts in Android?
	Linear layout, Relative layout, Constraint layout, Grid Layout
34. How to send an object through an Intent?
Make the Objects class implement the Serializable interface or Parcelable
35. What is Serializable?
36. What is Parcelable?
37. Which is better and why?
Parcelable is better for memory because it does not make a copy
38. How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?

39. Can we avoid implementing methods using Parcelable?
40. What are launch modes? Explain each one of them in detail.
Launch modes is the way an activity behaves, or simply how activities are stored on the stack.
 	One type of launch mode is SingleTop – means that there can only be one instance of this activity on top of the stack, but could be other instances anywhere else deeper in the stack.
SingleInstance – means there can only be one instance of this activity in the entire stack.
Single Task – means only one task
Default – any number of activity instances can be in the stack
41. What is back stack?
Where instances of activities go in order for the back button to go back to previous activity
42. How to we create a .apk file?
43. How to create and signed .apk file
