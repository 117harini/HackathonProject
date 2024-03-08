***************************************************** PROJECT DESCRIPTION *****************************************************************

Problem Statement : Find the insurance plans

1. Open PolicyBazaar and display three lowest international  travel insurance plan with amount and insurance provider company for any European country.
2. In car insurance capture the error message.
3. In health insurance display all the menu items.

Detailed Description: Hackathon Project

1. Open PolicyBazaar website and select travel insurance.
2. In travel insurance select the location -> choose travel date -> choose no.of travellers and their age -> pass mobile number.
3. Select student plan and sort them.
4. Display first three travel plans for students and store the same in excel.
5. In car insurance select Buy a new car.
6. Select city -> select vehicle number -> select brand -> select model -> select fuel.
7. Fill the details like name, mobile number and pass invalid email.
8. Capture the error message.
9. In health insurance display all the menu items and store the same in excel.

Key Automation Scope:

1. Handling alerts, search option
2. Validation of date controls
3. Filling simple form, Capture warning message
4. Extract menu items & store in collections
5. Navigating back to home page



********************************************************** STEPS TO EXECUTE *************************************************************

-unzip the folder
-On eclipse, go to file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute in TestNG and we get the expected output as shown below.
-Now go to TestRunner.java file and run as JUnit test.
-Now the file will Execute in Cucumber and we get the expected output as shown below.


******************************************************* FILES DESCRIPTION **************************************************************

1. src/test/java - There are seven packages present in this folder.

-> Factory			: In this package we have CucumberBaseClass.java file in which we invoke the browser initialization, we also added logger 				  and properties method to include logs and access config.properties file.
  	
-> PageObjects   		: In this Package there are four files
    	1) BasePage     	: In this file we have implemeted pagefactory which has a Factory class to make using Page Objects simpler and easier and 				  also used WebDriver constructor.
  	2) CarInsurance 	: In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and 					  methods to perform required actions in car insurance page.
  	3) HealthInsurance      : In this file we extends basePage.java and we included required action methods and Webelements to get the desired result.
  	4) TravelInsurance      : In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and 					  methods to perform required actions in travel insurance page. 

-> StepDefinitions   		: In this package there are four files
  	1) Car			: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in car insurance page
  	2) Health  		: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in health insurance page
  	3) Hooks  		: In this file we have invoked browser setup, closing the browser and also included the screenshot method.
  	4) Travel  		: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in travel insurance page

-> TestBase  			: In this Package we have BaseClass.java file in which we Firstly invoke the selected browser and we add steps like Opening 				  the PolicyBazaar page (https://www.policybazaar.com/) and closing the browser ,We also added screenshot method
     
-> TestCases  			: In this package we have three files 
  	1) TC_01_Travel.java    : This file extends BaseClass.java where the methods are present which will choose location, select travel date, choose 				  no.of travellers, fill mobile number, print first three travel plans and store in excel.
  	2) TC_02_Car.java	: This file extends BaseClass.java where the methods will choose city, vehicle number, brand, model, fuel, fill the required 				  details and capture the error message.
  	3) TC_03_Health.java	: This file extends BaseClass.java where the methods will select health insurance, display all the menu items and store in 				  excel. 

-> TestRunner  			: In this package we have TestRunner.java file where we include features file path and add cucumber plugins to generate 				  cucumber report.	  

-> Utilities   			: In this package we have ExcelUtils.java and ExtendreportManager.java file.

2. src/test/resources - In this folder, there are three files 

-> config.properties  		: This file is used to store the reusable values such as apprl,browser name and os name.

-> log4j2.xml  			: This file is used to generate log informations about the execution of test cases.

-> extent.properties  		: This file is used to generate the extentReport for the execution in cucumber framework.

3. JRE System Library		: In this File we have all dependencies of JAR.files.         

4. Maven Dependencies		: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven 				  build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this 					  directory is named.

5. Feature Files 		: In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project 				  in cucumber framework.

6. Logs 				: In this folder logs are present which is generated while executing the project.

7. Reports 			: In this folder the Test-Report-YYYY.MM.DD.html and CucumberReport.html are present which is the reports of the project

8. ScreenShot			: In this folder all the screenshots are captured while executing the project.

9. src				: In this, there are two folders
				     -main:It is an empty folder
				     -test:It is an empty folder

10. target			: It is an empty folder

11. TestData 			: In this folder we have two files

-> Read  			: In this excel file all the data which need to be passed to required WebElements are stored.

-> Write  			: After the execution of project the result will be stored. 

12. pom.xml			: The pom.xml file contains information of project and configuration information for the maven to build the project such as 				  dependencies, build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, 				  then executes the goal.

 
****************************************************** OUTPUT ON CONSOLE *********************************************************************************

******************************************************************** TESTNG OUTPUT ***********************************************************************

[RemoteTestNG] detected TestNG version 7.4.0
Reliance
₹1,514
Bajaj Allianz
₹1,628
Niva Bupa (formerly known as Max Bupa)
₹2,089

Please enter a valid e-mail ID.

Health insurance menu items are:

Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim



===============================================
Suite
Total tests run: 20, Passes: 20, Failures: 0, Skips: 0
===============================================

**************************************************************** CUCUMBER OUTPUT ************************************************************************

@sanity @regression
Scenario: Travel insurance                                    # featureFiles/a_travel.feature:4
  Given User opens the browser and navigates to the home page # stepDefinitions.Travel.user_opens_the_browser_and_navigates_to_the_home_page()

    Embedding Travel insurance [image/png 186702 bytes]

  When User clicks on the travel insurance                    # stepDefinitions.Travel.user_clicks_on_the_travel_insurance()

    Embedding Travel insurance [image/png 196053 bytes]

  And User selects the location and choose the date           # stepDefinitions.Travel.user_selects_the_location_and_choose_the_date()

    Embedding Travel insurance [image/png 204298 bytes]

  And User selects the no.of travellers and their age         # stepDefinitions.Travel.user_selects_the_no_of_travellers_and_their_age()

    Embedding Travel insurance [image/png 159788 bytes]

  And User selects no and enters the mobile number            # stepDefinitions.Travel.user_selects_no_and_enters_the_mobile_number()

    Embedding Travel insurance [image/png 160577 bytes]

  And User selects the student plan and choose travellers     # stepDefinitions.Travel.user_selects_the_student_plan_and_choose_travellers()

    Embedding Travel insurance [image/png 195399 bytes]

Reliance
₹1,514
Bajaj Allianz
₹1,628
Niva Bupa (formerly known as Max Bupa)
₹2,089

  Then First three travel plans are displayed                 # stepDefinitions.Travel.first_three_travel_plans_are_displayed()

    Embedding Travel insurance [image/png 272862 bytes]


@sanity @regression
Scenario: Car insurance                 # featureFiles/b_car.feature:4
  Given User navigates to the home page # stepDefinitions.Car.user_navigates_to_the_home_page()

    Embedding Car insurance [image/png 272862 bytes]

  When User clicks on the car insurance # stepDefinitions.Car.user_clicks_on_the_car_insurance()

    Embedding Car insurance [image/png 241808 bytes]

  And User clicks on buy a new car      # stepDefinitions.Car.user_clicks_on_buy_a_new_car()

    Embedding Car insurance [image/png 196199 bytes]

  And User selects all the car details  # stepDefinitions.Car.user_selects_all_the_car_details()

    Embedding Car insurance [image/png 161758 bytes]

  And User enters the name              # stepDefinitions.Car.user_enters_the_name()

    Embedding Car insurance [image/png 179721 bytes]

  And User enters invalid email         # stepDefinitions.Car.user_enters_invalid_email()

    Embedding Car insurance [image/png 182189 bytes]

  And User enters the mobile number     # stepDefinitions.Car.user_enters_the_mobile_number()

    Embedding Car insurance [image/png 185298 bytes]

Please enter a valid e-mail ID.

  Then Error message is displayed       # stepDefinitions.Car.error_message_is_displayed()

    Embedding Car insurance [image/png 272862 bytes]


@sanity @regression
Scenario: Health insurance                           # featureFiles/c_health.feature:4
  Given User navigates to home page                  # stepDefinitions.Health.user_navigates_to_home_page()

    Embedding Health insurance [image/png 172513 bytes]

  When User hovers on Insurance products             # stepDefinitions.Health.user_hovers_on_insurance_products()

    Embedding Health insurance [image/png 155343 bytes]

Health insurance menu items are:

Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim


  Then All health insurance menu items are displayed # stepDefinitions.Health.all_health_insurance_menu_items_are_displayed()

    Embedding Health insurance [image/png 155343 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/3373259b-f102-40cb-9724-8ece1d6affc8 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘






