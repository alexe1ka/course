package com.company;

public class Task3 implements Task {

    @Override
    public void makeWork() {
        paintSharpRectangle();
        System.out.println();
        paintTriangleA();
        System.out.println();
        paintTriangleB();
        System.out.println();
        paintTriangleC();
        System.out.println();
        paintTriangleD();
        System.out.println();
        paintQuadrateE();
        System.out.println();
        paintInvertZF();
        System.out.println();
        paintZG();
        System.out.println();
        paintXH();
        System.out.println();
        paintXinQuadrateI();

    }

    private void paintSharpRectangle() {
        int size = 8;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private void paintTriangleA() {
        int size = 8;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private void paintTriangleB() {
        int size = 8;
        for (int row = 1; row <= size; ++row) {
            for (int col = row; col <= size; col++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private void paintTriangleC() {
        int size = 8;
        for (int row = 0; row <= size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = 1; col <= size; col++) {
                if (col <= row) {
                    stringBuilder.append(" ");
                    continue;
                }
                stringBuilder.append("#");
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }

    private void paintTriangleD() {
        int size = 8;
        for (int row = 0; row <= size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = size; col > 0; col--) {
                if (col > row) {
                    stringBuilder.append(" ");
                    continue;
                }
                stringBuilder.append("#");
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }

    private void paintQuadrateE() {
        int size = 4;
        for (int row = 0; row < size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    stringBuilder.append("#");
                } else {
                    if (col == 0 || col == size - 1) {
                        stringBuilder.append("#");
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }

    private void paintInvertZF() {
        int size = 8;
        for (int row = 0; row < size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    stringBuilder.append("#");
                } else {
                    if (col == row) {
                        stringBuilder.append("#");
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }

    private void paintZG() {
        int size = 8;
        for (int row = 0; row < size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    stringBuilder.append("#");
                } else {
                    if (col == size - 1 - row) {
                        stringBuilder.append("#");
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }

    private void paintXH() {
        int size = 7;
        for (int row = 0; row < size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    stringBuilder.append("#");
                } else {
                    if (col == row || col == size - 1 - row) {
                        stringBuilder.append("#");
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }

    private void paintXinQuadrateI() {
        int size = 7;
        for (int row = 0; row < size; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    stringBuilder.append("#");
                } else {
                    if (col == 0 || col == row || col == size - 1 - row || col == size - 1) {
                        stringBuilder.append("#");
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }
            System.out.print(stringBuilder);
            System.out.print("\n");
        }
    }


}
