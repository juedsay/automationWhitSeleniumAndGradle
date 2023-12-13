# Goal of this repository

**Template framework to start Automating with Selenium and Cucumber both on UI and API (Java).**

## Index

- Technologies
- Setup
- Page Object Model
- Features and Cucumber
- Base Page
- Running the tests
- Reports

## Technologies

#### This project was created with:

- Selenium WebDriver: To interact with WebElements on the Webpage.
- Java: As the programming language.
- Cucumber: To write test scenarios as Behaviour Driven Development features and collaborate with Business Analysts.
- Extent Reports: To generate HTML reports.
- Gradle: as building tool.

### Setup

1. Install JDK (latest stable version).
2. Download the WebDrivers you will use in your project.
3.
- If using Windows, specify the path to the driver in BasePage.java like System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
- If you are on MacOS:
	1. Open up Terminal
	2. Run sudo nano /etc/paths
	3. Enter your password
	4. Go to the bottom of the file and enter the path you wish to add (My PATH looks like: /Users/myname/Documents/WebDriver)
	5. Control-x to quit
	6. Y to save
	1. Press enter to confirm
4. To double check, quit Terminal and relaunch it. Run echo $PATH. You should see your newly added path in the stream of other paths already there.
5. Finally, update your tests to run using Chrome and run your tests!
6. Install the Cucumber plugin on your IDE of choice.
7. Build the project to download the dependencies specified on Gradle.build.

## Page Object Model:

This Framework uses the Page Object Model, with a BasePage taking care of creating the instance of the Driver and inheriting methods to interact with the WebElements on the classes within the Pages directory.

## Features and Cucumber

The features with the scenarios containing the actual tests should act as a Live Documentation. 
Avoid using the scenarios to describe vaguely what they are trying to achieve. Crosscheck or get a peer to review the scenario, preferably a Business Analyst (even better if they can write the scenarios and provide them to you, the Test Engineer). 
The features with the scenarios containing the actual tests should act as a Live Documentation.
Avoid using the scenarios to describe vaguely what they are trying to achieve. Crosscheck or get a peer to review the scenario, preferably a Business Analyst (even better if they can write the scenarios and provide them to you, the Test Engineer).

## Base Page

The BasePage.java is the class where the driver and the methods to interact with the webpages live. The wait is set once in here and used smart, proceeding with the actions in case the element is found and waiting until the treshold set in this class. You can change this to fit your needs. The BasePage.java is the class where the driver and the methods to interact with the webpages live. The wait is set once in here and used smart, proceeding with the actions in case the element is found and waiting until the treshold set in this class. You can change this to fit your needs.

## Running the tests To run the tests, you have two options:

1. Running from a Runner.java , specifying which tag to run (you set the tags in the Scenarios).
2. Running from the command line and using:
 gradle test -Dcucumber.options="--tags @CucumberTag"
 Observe that the "test" task is created in the Gradle.Build file.

## Reports

Once executed, you will find the reports inside the Test-output directory, containing an HTML file that you can open with any browser and access the report with the results.
