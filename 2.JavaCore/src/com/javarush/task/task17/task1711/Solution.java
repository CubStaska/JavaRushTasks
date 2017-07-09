package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String name = "";
        String sex = "";
        String date;
        int id = 0;
        SimpleDateFormat informat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outformat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        name = args[i];
                        sex = args[++i];
                        date = args[++i];
                        id = allPeople.size();
                        if (sex.equals("м")) {
                            allPeople.add(Person.createMale(name, informat.parse(date)));
                        }
                        if (sex.equals("ж")) {
                            allPeople.add(Person.createFemale(name, informat.parse(date)));
                        }
                        System.out.println(id);
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        name = args[++i];
                        sex = args[++i];
                        date = args[++i];
                        Person person = allPeople.get(id);
                        person.setName(name);
                        person.setBirthDay(informat.parse(date));

                        if (sex.equals("м")) {
                            person.setSex(Sex.MALE);
                        }
                        if (sex.equals("ж")) {
                            person.setSex(Sex.FEMALE);

                        }

                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);

                        if (person.getSex().equals(Sex.MALE)) {
                            System.out.println(person.getName() + " м " + outformat.format(person.getBirthDay()));
                        }
                        if (person.getSex().equals(Sex.FEMALE)) {
                            System.out.println(person.getName() + " ж " + outformat.format(person.getBirthDay()));
                        }

                    }
                }
                break;

        }


    }
}
