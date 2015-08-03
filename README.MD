Dependencies

/jars 

 +cucmber-java.1.2.2.jar 
 +cucumber-core-1.2.2.jar 
 +cucumber-jvm-deps-1.0.3.jar 
 +gherkin-2.12.2.jar

Compile 

	alias compile='javac -cp "jars/*" steps_definitions/CheckoutSteps.java'

Run 

	alias cucumber='java -cp "jars/*" cucumber.api.cli.Main -p pretty --snippets camelcasalias cucumber='java -cp "jars/*:." cucumber.api.cli.Main -p pretty --snippets camelcase -g step_definitions features'
e .'
	cucumber
