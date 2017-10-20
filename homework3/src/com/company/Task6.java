package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task6 implements Task {
    public enum RandomEnum {
        BlackSabbath, FPG, Elysium, Tarakany, Sum41,
        BringMeTheHorizon, Aerosmith, AliceCooper, BonJovi, BulletForMyValentine,
        DieArzte, GunsNroses, MotleyCrue, RiseAgainst, StoneSour
    }


    @Override
    public void makeWork() {
        RandomEnum randomEnum = RandomEnum.StoneSour;
        testElseIf(randomEnum);
        testSwitchCase(randomEnum);
        testArray();
    }

    private void testElseIf(RandomEnum value) {
        long startTime = System.nanoTime();

        if (value == RandomEnum.BlackSabbath) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.FPG) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.Elysium) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.Tarakany) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.Sum41) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.BringMeTheHorizon) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.Aerosmith) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.AliceCooper) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.BonJovi) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.BulletForMyValentine) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.DieArzte) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.GunsNroses) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.MotleyCrue) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.RiseAgainst) {
            System.out.println("simple console output");
        } else if (value == RandomEnum.StoneSour) {
            System.out.println("simple console output");
        }
        long elseIfTestTime = System.nanoTime() - startTime;
        System.out.println("ElseIF test time:" + elseIfTestTime);
    }

    private void testSwitchCase(RandomEnum value) {
        long startTime = System.nanoTime();

        switch (value) {
            case BlackSabbath:
                System.out.println("simple console output");
                break;
            case FPG:
                System.out.println("simple console output");
                break;
            case Elysium:
                System.out.println("simple console output");
                break;
            case Tarakany:
                System.out.println("simple console output");
                break;
            case Sum41:
                System.out.println("simple console output");
                break;
            case BringMeTheHorizon:
                System.out.println("simple console output");
                break;
            case Aerosmith:
                System.out.println("simple console output");
                break;
            case AliceCooper:
                System.out.println("simple console output");
                break;
            case BonJovi:
                System.out.println("simple console output");
                break;
            case BulletForMyValentine:
                System.out.println("simple console output");
                break;
            case DieArzte:
                System.out.println("simple console output");
                break;
            case GunsNroses:
                System.out.println("simple console output");
                break;
            case MotleyCrue:
                System.out.println("simple console output");
                break;
            case RiseAgainst:
                System.out.println("simple console output");
                break;
            case StoneSour:
                System.out.println("simple console output");
                break;
        }
        long switchCaseTestTime = System.nanoTime() - startTime;
        System.out.println("SwitchCase test time:" + switchCaseTestTime);
    }

    private void testArray() {
        int[] array = new int[50];
        int bound = 11;//верхняя граница ограничения диапазона генератора.сама граница не входит в генерируемые числа
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(bound);
        }
        System.out.println(Arrays.toString(array));
        int[] counterArray = new int[bound];

        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("simple console output");
                counterArray[0] += 1;
            } else if (array[i] == 1) {
                System.out.println("simple console output");
                counterArray[1] += 1;
            } else if (array[i] == 2) {
                System.out.println("simple console output");
                counterArray[2] += 1;
            } else if (array[i] == 3) {
                System.out.println("simple console output");
                counterArray[3] += 1;
            } else if (array[i] == 4) {
                System.out.println("simple console output");
                counterArray[4] += 1;
            } else if (array[i] == 5) {
                System.out.println("simple console output");
                counterArray[5] += 1;
            } else if (array[i] == 6) {
                System.out.println("simple console output");
                counterArray[6] += 1;
            } else if (array[i] == 7) {
                System.out.println("simple console output");
                counterArray[7] += 1;
            } else if (array[i] == 8) {
                System.out.println("simple console output");
                counterArray[8] += 1;
            } else if (array[i] == 9) {
                System.out.println("simple console output");
                counterArray[9] += 1;
            } else if (array[i] == 10) {
                System.out.println("simple console output");
                counterArray[10] += 1;
            }
        }

        long arrayTestTime = System.nanoTime() - startTime;
        System.out.println("array test time:" + arrayTestTime);

        for (int iii = 0; iii < counterArray.length; iii++) {
            System.out.println("elem: " + iii + ". count: " + counterArray[iii]);
        }


    }
}
