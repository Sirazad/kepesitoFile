package hu.nive.ujratervezes.io.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {


     public void exportPhonebook(Map<String, String> contacts, String output) throws IOException {
         if (contacts == null || output == null) throw new IllegalArgumentException();

         try( BufferedWriter writer = new BufferedWriter(new FileWriter(output))){
             writer.write("");
         }

         try(BufferedWriter writer = new BufferedWriter(new FileWriter(output, true))) {
             for (Map.Entry line :  contacts.entrySet()) {
                 writer.append(line.getKey()+": "+line.getValue()+"\n");
             }
         }
     }
}