package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat informat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outformat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        String name = "";
        String sex = "";
        Date date = null;
        int id = 0;

            if (args[0].equals("-c")){
                name = args[1];
                sex = args[2];
                try {
                    date = informat.parse(args[3]);
                    if (sex.equals("м")){
                        allPeople.add(Person.createMale(name,date));
                        id = allPeople.size()-1;
                    }
                    if (sex.equals("ж")){
                        allPeople.add(Person.createFemale(name,date));
                        id = allPeople.size()-1;

                    }
                    System.out.println(id);
                } catch (ParseException e) {
                    e.printStackTrace();
                }


            }

            if (args[0].equals("-u")){

                id = Integer.parseInt(args[1]);
                name = args[2];
                sex = args[3];
                try {
                    date = informat.parse(args[4]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                Person person = allPeople.get(id);

                    if (sex.equals("м")){
                        person.setName(name);
                        person.setSex(Sex.MALE);
                        person.setBirthDay(date);
                    }else if (sex.equals("ж")){
                        person.setName(name);
                        person.setSex(Sex.FEMALE);
                        person.setBirthDay(date);
                    }


            }

            if (args[0].equals("-d")){
                id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);
                person.setSex(null);
                person.setBirthDay(null);
                person.setName(null);
            }


            if (args[0].equals("-i")){
                id = Integer.parseInt(args[1]);
                String dateout = outformat.format(allPeople.get(id).getBirthDay());
                if (allPeople.get(id).getSex().equals(Sex.MALE)) {
                    System.out.println(allPeople.get(id).getName() + " м "  + dateout);
                }
                if (allPeople.get(id).getSex().equals(Sex.FEMALE)) {
                    System.out.println(allPeople.get(id).getName() + " ж "  + dateout);
                }
            }




      //  for (int i = 0; i < allPeople.size(); i++) {
      //      System.out.println(allPeople.get(i));
      //  }
    //    System.out.println(name);
   //     System.out.println(sex);
  //      System.out.println(date);
    }
}
