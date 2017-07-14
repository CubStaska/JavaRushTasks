package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        while ((file = reader.readLine()) != null){
            if (file.equals("exit")){
                return;
            }
            new ReadThread(file).start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        FileInputStream filename;
        String file;
        int readbyte = 0;
        int max=0;
        int key = 0;
        Map<Integer,Integer> map = new HashMap<>();

        public ReadThread(String fileName) throws FileNotFoundException {
            this.file = fileName;
            filename = new FileInputStream(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                while (filename.available() > 0){
                   readbyte = filename.read();
                    if(map.containsKey(readbyte)){
                        map.put(readbyte,map.get(readbyte)+1);
                    }else {
                        map.put(readbyte,1);
                    }
                }

                for (Map.Entry<Integer,Integer> m: map.entrySet()) {
                    if (max < m.getValue()){
                        max = m.getValue();
                        key = m.getKey();
                    }


                }
                resultMap.put(file,key);


            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    filename.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
