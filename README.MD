Dependencies

/jars 

 +cucmber-java.1.2.2.jar 
 +cucumber-core-1.2.2.jar 
 +cucumber-jvm-deps-1.0.3.jar 
 +gherkin-2.12.2.jar


Run 

	alias cucumber='java -cp "jars/*" cucumber.api.cli.Main -p pretty --snippets camelcase .'
	cucumber
