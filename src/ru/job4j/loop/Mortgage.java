package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double percentX = percent / 100;
        while (amount > 0) {
            amount += amount * percentX;
            amount -= salary;
            year++;

            }
            return year;
        }
    }