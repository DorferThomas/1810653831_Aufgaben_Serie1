package Uebung1_Package2;

public class Aufgabe6 {
    public static void main(String[] args)
    {
        //Mit \ kann man doppelte und einzelne Anführungszeichen ausgeben lassen.
        System.out.println("Java verwendet für Strings \"doppelte Anführungszeichen\"" +
                " und einzelne Anführungszeichen wie \'c\' um einzelne Zeichen zu definieren.");

        // Mit diesen shortcuts kann man diese Befehle ausführen: \b Backspace; \n Newline; \t Tabulator
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator.");

        // Mit diesen shortcuts kann man diese Befehle ausführen: \r überscheibt; \npfeil anch oben; \f erzwing einen Seitenumbruch
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt\n" +
                "diebestehendeZeile.\fist in der Konsole nicht bemerkbar,da es einen Seitenumbruch erzwingt.");
    }
}
