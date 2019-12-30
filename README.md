# ReadCSV
## Tools to read values from a CSV file 

Thanks to @r-o-b-o-t-o, this project is finally working. 

### Dependencies used in this project
* JUnit
* JUnitParams
* Selenium
* opencsv

### ReadCSV.java 
**ReadCSV.java** class in main is where we define all methods. 

**ReadCSV(String filePath)** is here to initialize all variables and get the CSV file. 
The for loop in **line 30** is here to set our Map so we can retrieve our values

**nextLine()** purpose's to change line after we finished to use all data's line

**getValue(String itemName)** can get you a specific value in your CSV file with an item name (ie : a header's name)

### Test_Parametre_JUnitParams_CSV.java
This test class is a simple test to show how to use ReadCSV.java. It's using **test.csv** in **src/test/resources/**

First you need to use the @RunWith annotation to use JUnitParamsRunner.
Don't forget to declare a ReadCSV object.
Then you need to annotate a method with @BeforeClass. In this method you initialize your reader and give it your filepath

Finally, in your @Test method, you need to use @FileParameters with, again, your filepath, and the CsvWithHeaderMapper.class in mapper.
In the method you have to precise all your parameters (ie : all your columns in your CSV file).

### Test_Realcase.java
This test class is strictly the same as before but with a sign-in form in a practice website. It's using **realcase.csv** in **src/test/resources**
In the @Before method, you have to change the path of your web driver to make it work.
