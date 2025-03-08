# JSON Query Language

# How to use?

This build is for Windows, in the future we will fix it to works on Linux systems.

## Run the JFlex

It will generate the JQLLexer.java in lexic package.

```bash
flex.bat
```

## Build the project

It will build the project and generate a jar in the target directory.

```bash
mvn clean package
```

## Test the JQL tradutor

It will execute the jql on the query.jql file.

```bash
jqlexec.bat
```