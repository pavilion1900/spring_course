package ru.clevertec.english;

import java.io.*;
import java.util.*;

public class Training {
    private Properties properties;

    public Training(Properties properties) {
        this.properties = properties;
    }

    public List<String> getText(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            in.lines().forEach(list::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void run() {
        List<String> textRus = getText(properties.getProperty("textRus"));
        List<String> textEng = getText(properties.getProperty("textEng"));
        List<Integer> randomIndex = new ArrayList<>();
        for (int i = 0; i < textRus.size(); i++) {
            randomIndex.add(i);
        }
        Collections.shuffle(randomIndex);
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < randomIndex.size(); i++) {
            if (" ".equals(scanner.nextLine())) {
                break;
            }
            System.out.println(randomIndex.size() - i + " " + textRus.get(randomIndex.get(i)));
            if (" ".equals(scanner.nextLine())) {
                break;
            }
            System.out.println(randomIndex.size() - i + " " + textEng.get(randomIndex.get(i)));
        }
    }

    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream in =
                     new FileInputStream("src/main/resources/english/app.properties")) {
            properties.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Training training = new Training(properties);
        training.run();
    }
}