### To run the program, do the following:

1. Download the Apache Commons Codec library from the official website: https://commons.apache.org/proper/commons-codec/download_codec.cgi

2. Extract the downloaded archive and locate the commons-codec-x.x.jar file.

3. Open a command prompt or terminal window and navigate to the directory where the Hashing.java and commons-codec-x.x.jar files are located.

4. Compile the Hashing.java file using the javac command, including the path to the commons-codec-x.x.jar file in the classpath:
    ```shell
    javac -cp commons-codec-x.x.jar Hashing.java
    ```
5. Run the Hashing class using the java command, including the path to the commons-codec-x.x.jar file in the classpath:
    ```shell
    java -cp .:commons-codec-x.x.jar Hashing
    ```