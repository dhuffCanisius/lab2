package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    // Method to reverse a string and ensure uppercase output
    public String method1(String parameter1) {
        if (parameter1 == null) {
            return ""; // Handle null input safely
        }

        // Convert to uppercase, then reverse
        return new StringBuilder(parameter1.toUpperCase()).reverse().toString();
    }

    // Method to prepend (length-1) copies of the first character
    public String method2(String parameter) {
        if (parameter == null || parameter.isEmpty()) {
            return ""; // Return as is if null or empty
        }

        char firstChar = parameter.charAt(0); // Get the first character
        int repeatCount = parameter.length() ; // Number of times to repeat

        // Manually build the repeated character string
        StringBuilder repeatedChars = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            repeatedChars.append(firstChar);
        }

        return repeatedChars.append(parameter).toString(); // Prepend repeated char and return result
    }

    // Method to reverse the order of words in a sentence
    public String method3(String parameter) {
        if (parameter == null || parameter.isEmpty()) {
            return ""; // Return as is if null or empty
        }

        String[] words = parameter.split("\\s+"); // Split by spaces
        StringBuilder reversedSentence = new StringBuilder();

        // Loop backwards through the words array
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]); // Append word
            if (i != 0) {
                reversedSentence.append(" "); // Add space between words
            }
        }

        return reversedSentence.toString();
    }

}