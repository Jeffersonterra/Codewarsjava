/*FROM CODE WARS*/
public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        name = name.toUpperCase();

        String[] names = name.split(" ");

        return names[0].charAt(0) + "." + names[1].charAt(0);
    }
}
/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
*/
